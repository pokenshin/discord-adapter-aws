package com.pokenshin.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DiscordMessage implements Serializable {
    private String content;
    List<DiscordMessageEmbed> embeds;

    public DiscordMessage() {
        this.content = "";
        this.embeds = new ArrayList<>();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<DiscordMessageEmbed> getEmbeds() {
        return embeds;
    }

    public void setEmbeds(List<DiscordMessageEmbed> embeds) {
        this.embeds = embeds;
    }
}
