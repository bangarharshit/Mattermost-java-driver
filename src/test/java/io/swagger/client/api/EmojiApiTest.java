package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.Body33;
import io.swagger.client.model.Emoji;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmojiApi
 */
public class EmojiApiTest {

    private EmojiApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(EmojiApi.class);
    }

    /**
     * Autocomplete custom emoji
     *
     * Get a list of custom emoji with names starting with or matching the provided name. Returns a maximum of 100 results. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 
     */
    @Test
    public void emojiAutocompleteGetTest() {
        String name = null;
        // Emoji response = api.emojiAutocompleteGet(name);

        // TODO: test validations
    }
    /**
     * Delete a custom emoji
     *
     * Delete a custom emoji. ##### Permissions Must have the &#x60;manage_team&#x60; or &#x60;manage_system&#x60; permissions or be the user who created the emoji. 
     */
    @Test
    public void emojiEmojiIdDeleteTest() {
        String emojiId = null;
        // Emoji response = api.emojiEmojiIdDelete(emojiId);

        // TODO: test validations
    }
    /**
     * Get a custom emoji
     *
     * Get some metadata for a custom emoji. ##### Permissions Must be authenticated. 
     */
    @Test
    public void emojiEmojiIdGetTest() {
        String emojiId = null;
        // Emoji response = api.emojiEmojiIdGet(emojiId);

        // TODO: test validations
    }
    /**
     * Get custom emoji image
     *
     * Get the image for a custom emoji. ##### Permissions Must be authenticated. 
     */
    @Test
    public void emojiEmojiIdImageGetTest() {
        String emojiId = null;
        // Void response = api.emojiEmojiIdImageGet(emojiId);

        // TODO: test validations
    }
    /**
     * Get a list of custom emoji
     *
     * Get a page of metadata for custom emoji on the system. Since server version 4.7, sort using the &#x60;sort&#x60; query parameter. ##### Permissions Must be authenticated. 
     */
    @Test
    public void emojiGetTest() {
        String page = null;
        String perPage = null;
        String sort = null;
        // Emoji response = api.emojiGet(page, perPage, sort);

        // TODO: test validations
    }
    /**
     * Get a custom emoji by name
     *
     * Get some metadata for a custom emoji using its name. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 
     */
    @Test
    public void emojiNameEmojiNameGetTest() {
        String emojiName = null;
        // Emoji response = api.emojiNameEmojiNameGet(emojiName);

        // TODO: test validations
    }
    /**
     * Create a custom emoji
     *
     * Create a custom emoji for the team. ##### Permissions Must be authenticated. 
     */
    @Test
    public void emojiPostTest() {
        File image = null;
        String emoji = null;
        // Emoji response = api.emojiPost(image, emoji);

        // TODO: test validations
    }
    /**
     * Search custom emoji
     *
     * Search for custom emoji by name based on search criteria provided in the request body. A maximum of 200 results are returned. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 
     */
    @Test
    public void emojiSearchPostTest() {
        Body33 body = null;
        // List<Emoji> response = api.emojiSearchPost(body);

        // TODO: test validations
    }
}
