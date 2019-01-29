package com.pokenshin.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokenshin.model.DiscordMessage;
import com.pokenshin.model.DiscordMessageEmbed;
import com.pokenshin.model.DiscordMessageFooter;

import java.io.IOException;

public class JsonMapper {
    private ObjectMapper mapper;
    private final String jiraBaseUrl = "YOUR_JIRA_BASE_URL_HERE";

    public DiscordMessage jiraToDiscord(String json) throws IOException {
        mapper = new ObjectMapper();
        DiscordMessage message = new DiscordMessage();
        DiscordMessageEmbed messageEmbed = new DiscordMessageEmbed();
        DiscordMessageFooter messageFooter = new DiscordMessageFooter();
        JsonNode root = mapper.readTree(json);
        JsonNode issue = root.get("issue");
        JsonNode issueFields = issue.get("fields");
        JsonNode issueStatus = issueFields.get("status");

        message.setContent("Issue transitioned to " + issueStatus.get("name").asText());
        messageEmbed.setTitle(issue.get("key").asText());
        messageEmbed.setDescription(issueFields.get("summary").asText());
        messageEmbed.setUrl(jiraBaseUrl + messageEmbed.getTitle());
        messageEmbed.setColor(111);
        messageFooter.setText(issueFields.get("description").asText());
        messageEmbed.setFooter(messageFooter);
        message.getEmbeds().add(messageEmbed);

        return message;
    }

    public String toJson(Object obj) throws JsonProcessingException {
        mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);
    }
}