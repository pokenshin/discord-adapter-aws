package pokenshin.connector;

import com.pokenshin.connector.DiscordConnector;
import com.pokenshin.model.DiscordMessage;
import com.pokenshin.model.DiscordMessageEmbed;
import com.pokenshin.model.DiscordMessageFooter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DiscordConnectorTest {
    DiscordConnector conn;

    @BeforeEach
    void setUp() {
        conn = new DiscordConnector();
    }

    @Test
    void postRequest() throws IOException {
        DiscordMessage message = new DiscordMessage();
        DiscordMessageEmbed embed = new DiscordMessageEmbed();
        DiscordMessageFooter footer = new DiscordMessageFooter();
        message.setContent("Content");
        footer.setText("Footer");
        embed.setFooter(footer);
        embed.setColor(111);
        embed.setUrl("http://www.google.com");
        embed.setDescription("Description Code");
        embed.setTitle("Title");
        message.getEmbeds().add(embed);
        assertTrue(conn.postRequest(message));
    }
}