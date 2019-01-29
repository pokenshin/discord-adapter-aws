package com.pokenshin.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.pokenshin.connector.DiscordConnector;
import com.pokenshin.model.DiscordMessage;
import com.pokenshin.util.JsonMapper;

import java.io.*;
import java.nio.charset.Charset;
import java.util.stream.Collectors;

public class AwsHandler implements RequestStreamHandler{
    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        JsonMapper mapper = new JsonMapper();
        String json = this.convertInputStream(inputStream);
        DiscordMessage message = mapper.jiraToDiscord(json);
        DiscordConnector connector = new DiscordConnector();
        connector.postRequest(message);
    }

    private String convertInputStream(InputStream inputStream) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")))) {
            return br.lines().collect(Collectors.joining(System.lineSeparator()));
        }
    }
}
