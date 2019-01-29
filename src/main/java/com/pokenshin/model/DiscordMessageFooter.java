package com.pokenshin.model;

import java.io.Serializable;

public class DiscordMessageFooter implements Serializable {
    private String text;

    public DiscordMessageFooter(String text) {
        this.text = text;
    }

    public DiscordMessageFooter(){

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
