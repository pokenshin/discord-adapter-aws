package pokenshin.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pokenshin.model.DiscordMessage;
import com.pokenshin.model.DiscordMessageEmbed;
import com.pokenshin.model.DiscordMessageFooter;
import com.pokenshin.util.JsonMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JsonMapperTest {
    JsonMapper mapper;

    @BeforeEach
    void init(){
        mapper = new JsonMapper();
    }

    @Test
    void toDiscord() throws IOException {
        String json = "{\"issue\":{\"key\":\"ABC-1234\",\"fields\":{\"status\":{\"name\":\"Ready to QA\",},\"summary\":\"Test Summary\",\"description\":\"Test description\"}}}";
        DiscordMessage result = mapper.jiraToDiscord(json);
        assertEquals("Issue transitioned to Ready to QA", result.getContent());
        assertEquals("ABC-1234", result.getEmbeds().get(0).getTitle());
        assertEquals("Test Summary", result.getEmbeds().get(0).getDescription());
        assertNotNull(result.getEmbeds().get(0).getFooter());
        assertEquals(111, result.getEmbeds().get(0).getColor());
    }

    @Test
    void toJson() throws JsonProcessingException {
        DiscordMessage message = new DiscordMessage();
        List<DiscordMessageEmbed> embeds = new ArrayList<>();
        DiscordMessageEmbed embed = new DiscordMessageEmbed();
        DiscordMessageFooter footer = new DiscordMessageFooter("Footer");
        message.setContent("Content");
        embed.setFooter(footer);
        embed.setColor(111);
        embed.setUrl("URL");
        embed.setDescription("Description");
        embed.setTitle("Title");
        embeds.add(embed);
        message.setEmbeds(embeds);
        assertEquals("{\"content\":\"Content\",\"embeds\":[{\"title\":\"Title\",\"description\":\"Description\",\"url\":\"URL\",\"color\":111,\"footer\":{\"text\":\"Footer\"}}]}", mapper.toJson(message));
    }
}