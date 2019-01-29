package com.pokenshin.model;

import java.io.Serializable;

public class DiscordMessageEmbed implements Serializable {
    private String title;
    private String description;
    private String url;
    private int color;
    private DiscordMessageFooter footer;

    public DiscordMessageEmbed() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public DiscordMessageFooter getFooter() {
        return footer;
    }

    public void setFooter(DiscordMessageFooter footer) {
        this.footer = footer;
    }
}
