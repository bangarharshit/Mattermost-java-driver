package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.Body34;
import io.swagger.client.model.Body35;
import io.swagger.client.model.Body36;
import io.swagger.client.model.Body37;
import io.swagger.client.model.IncomingWebhook;
import io.swagger.client.model.OutgoingWebhook;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
public class WebhooksApiTest {

    private WebhooksApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WebhooksApi.class);
    }

    /**
     * List incoming webhooks
     *
     * Get a page of a list of incoming webhooks. Optionally filter for a specific team using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team. 
     */
    @Test
    public void hooksIncomingGetTest() {
        String page = null;
        String perPage = null;
        String teamId = null;
        // List<IncomingWebhook> response = api.hooksIncomingGet(page, perPage, teamId);

        // TODO: test validations
    }
    /**
     * Get an incoming webhook
     *
     * Get an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     */
    @Test
    public void hooksIncomingHookIdGetTest() {
        String hookId = null;
        // IncomingWebhook response = api.hooksIncomingHookIdGet(hookId);

        // TODO: test validations
    }
    /**
     * Update an incoming webhook
     *
     * Update an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     */
    @Test
    public void hooksIncomingHookIdPutTest() {
        String hookId = null;
        Body35 body = null;
        // IncomingWebhook response = api.hooksIncomingHookIdPut(hookId, body);

        // TODO: test validations
    }
    /**
     * Create an incoming webhook
     *
     * Create an incoming webhook for a channel. ##### Permissions &#x60;manage_webhooks&#x60; for the channel the webhook is in. 
     */
    @Test
    public void hooksIncomingPostTest() {
        Body34 body = null;
        // IncomingWebhook response = api.hooksIncomingPost(body);

        // TODO: test validations
    }
    /**
     * List outgoing webhooks
     *
     * Get a page of a list of outgoing webhooks. Optionally filter for a specific team or channel using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team/channel. 
     */
    @Test
    public void hooksOutgoingGetTest() {
        String page = null;
        String perPage = null;
        String teamId = null;
        String channelId = null;
        // List<OutgoingWebhook> response = api.hooksOutgoingGet(page, perPage, teamId, channelId);

        // TODO: test validations
    }
    /**
     * Delete an outgoing webhook
     *
     * Delete an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     */
    @Test
    public void hooksOutgoingHookIdDeleteTest() {
        String hookId = null;
        // StatusOK response = api.hooksOutgoingHookIdDelete(hookId);

        // TODO: test validations
    }
    /**
     * Get an outgoing webhook
     *
     * Get an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     */
    @Test
    public void hooksOutgoingHookIdGetTest() {
        String hookId = null;
        // OutgoingWebhook response = api.hooksOutgoingHookIdGet(hookId);

        // TODO: test validations
    }
    /**
     * Update an outgoing webhook
     *
     * Update an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     */
    @Test
    public void hooksOutgoingHookIdPutTest() {
        String hookId = null;
        Body37 body = null;
        // OutgoingWebhook response = api.hooksOutgoingHookIdPut(hookId, body);

        // TODO: test validations
    }
    /**
     * Regenerate the token for the outgoing webhook.
     *
     * Regenerate the token for the outgoing webhook. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     */
    @Test
    public void hooksOutgoingHookIdRegenTokenPostTest() {
        String hookId = null;
        // StatusOK response = api.hooksOutgoingHookIdRegenTokenPost(hookId);

        // TODO: test validations
    }
    /**
     * Create an outgoing webhook
     *
     * Create an outgoing webhook for a team. ##### Permissions &#x60;manage_webhooks&#x60; for the team the webhook is in. 
     */
    @Test
    public void hooksOutgoingPostTest() {
        Body36 body = null;
        // OutgoingWebhook response = api.hooksOutgoingPost(body);

        // TODO: test validations
    }
}
