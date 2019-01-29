package com.pokenshin.connector;

import com.pokenshin.model.DiscordMessage;
import com.pokenshin.util.JsonMapper;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DiscordConnector {
    private final String webhookUrl = "YOUR_DISCORD_WEBHOOK_URL";

    public DiscordConnector(){
    }

    public boolean postRequest(DiscordMessage message) throws IOException {
        JsonMapper mapper = new JsonMapper();
        String json = mapper.toJson(message);
        URL url = new URL(webhookUrl);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("User-Agent", "discord-adapter-aws");
        connection.setRequestProperty("Content-Type", "application/json;");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-length", String.valueOf(json.length()));
        OutputStream outputStream;
        try {
            outputStream = connection.getOutputStream();
            outputStream.write(json.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (IOException ex) {
            return (false);
        }
        try {
            connection.getInputStream().close();
            connection.disconnect();
        } catch (IOException ex) {
            return (false);
        }
        return (true);
    }
}
