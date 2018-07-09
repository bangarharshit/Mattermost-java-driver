package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.Body40;
import io.swagger.client.model.Body41;
import io.swagger.client.model.OAuthApp;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuthApi
 */
public class OAuthApiTest {

    private OAuthApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(OAuthApi.class);
    }

    /**
     * Delete an OAuth app
     *
     * Delete and unregister an OAuth 2.0 client application  ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 
     */
    @Test
    public void oauthAppsAppIdDeleteTest() {
        String appId = null;
        // StatusOK response = api.oauthAppsAppIdDelete(appId);

        // TODO: test validations
    }
    /**
     * Get an OAuth app
     *
     * Get an OAuth 2.0 client application registered with Mattermost. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 
     */
    @Test
    public void oauthAppsAppIdGetTest() {
        String appId = null;
        // OAuthApp response = api.oauthAppsAppIdGet(appId);

        // TODO: test validations
    }
    /**
     * Get info on an OAuth app
     *
     * Get public information about an OAuth 2.0 client application registered with Mattermost. The application&#39;s client secret will be blanked out. ##### Permissions Must be authenticated. 
     */
    @Test
    public void oauthAppsAppIdInfoGetTest() {
        String appId = null;
        // OAuthApp response = api.oauthAppsAppIdInfoGet(appId);

        // TODO: test validations
    }
    /**
     * Update an OAuth app
     *
     * Update an OAuth 2.0 client application based on OAuth struct. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 
     */
    @Test
    public void oauthAppsAppIdPutTest() {
        String appId = null;
        Body41 body = null;
        // OAuthApp response = api.oauthAppsAppIdPut(appId, body);

        // TODO: test validations
    }
    /**
     * Regenerate OAuth app secret
     *
     * Regenerate the client secret for an OAuth 2.0 client application registered with Mattermost. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 
     */
    @Test
    public void oauthAppsAppIdRegenSecretPostTest() {
        String appId = null;
        // OAuthApp response = api.oauthAppsAppIdRegenSecretPost(appId);

        // TODO: test validations
    }
    /**
     * Get OAuth apps
     *
     * Get a page of OAuth 2.0 client applications registered with Mattermost. ##### Permissions With &#x60;manage_oauth&#x60; permission, the apps registered by the logged in user are returned. With &#x60;manage_system_wide_oauth&#x60; permission, all apps regardless of creator are returned. 
     */
    @Test
    public void oauthAppsGetTest() {
        String page = null;
        String perPage = null;
        // List<OAuthApp> response = api.oauthAppsGet(page, perPage);

        // TODO: test validations
    }
    /**
     * Register OAuth app
     *
     * Register an OAuth 2.0 client application with Mattermost as the service provider. ##### Permissions Must have &#x60;manage_oauth&#x60; permission. 
     */
    @Test
    public void oauthAppsPostTest() {
        Body40 body = null;
        // OAuthApp response = api.oauthAppsPost(body);

        // TODO: test validations
    }
    /**
     * Get authorized OAuth apps
     *
     * Get a page of OAuth 2.0 client applications authorized to access a user&#39;s account. ##### Permissions Must be authenticated as the user or have &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdOauthAppsAuthorizedGetTest() {
        String userId = null;
        String page = null;
        String perPage = null;
        // List<OAuthApp> response = api.usersUserIdOauthAppsAuthorizedGet(userId, page, perPage);

        // TODO: test validations
    }
}
