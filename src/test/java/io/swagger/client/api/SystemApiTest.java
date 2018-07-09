package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.Audit;
import io.swagger.client.model.Body32;
import io.swagger.client.model.Config;
import java.io.File;
import io.swagger.client.model.InlineResponse2007;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemApi
 */
public class SystemApiTest {

    private SystemApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SystemApi.class);
    }

    /**
     * Get analytics
     *
     * Get some analytics data about the system. This endpoint uses the old format, the &#x60;/analytics&#x60; route is reserved for the new format when it gets implemented.  The returned JSON changes based on the &#x60;name&#x60; query parameter but is always key/value pairs.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void analyticsOldGetTest() {
        String name = null;
        String teamId = null;
        // Void response = api.analyticsOldGet(name, teamId);

        // TODO: test validations
    }
    /**
     * Get audits
     *
     * Get a page of audits for all users on the system, selected with &#x60;page&#x60; and &#x60;per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void auditsGetTest() {
        String page = null;
        String perPage = null;
        // List<Audit> response = api.auditsGet(page, perPage);

        // TODO: test validations
    }
    /**
     * Invalidate all the caches
     *
     * Purge all the in-memory caches for the Mattermost server. This can have a temporary negative effect on performance while the caches are re-populated. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void cachesInvalidatePostTest() {
        // StatusOK response = api.cachesInvalidatePost();

        // TODO: test validations
    }
    /**
     * Get client configuration
     *
     * Get a subset of the server configuration needed by the client. ##### Permissions No permission required. 
     */
    @Test
    public void configClientGetTest() {
        String format = null;
        // Void response = api.configClientGet(format);

        // TODO: test validations
    }
    /**
     * Get configuration
     *
     * Retrieve the current server configuration ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void configGetTest() {
        // Config response = api.configGet();

        // TODO: test validations
    }
    /**
     * Update configuration
     *
     * Submit a new configuration for the server to use. As of server version 4.8, the &#x60;PluginSettings.EnableUploads&#x60; setting cannot be modified by this endpoint. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void configPutTest() {
        Config body = null;
        // Config response = api.configPut(body);

        // TODO: test validations
    }
    /**
     * Reload configuration
     *
     * Reload the configuration file to pick up on any changes made to it. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void configReloadPostTest() {
        // StatusOK response = api.configReloadPost();

        // TODO: test validations
    }
    /**
     * Recycle database connections
     *
     * Recycle database connections by closing and reconnecting all connections to master and read replica databases. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void databaseRecyclePostTest() {
        // StatusOK response = api.databaseRecyclePost();

        // TODO: test validations
    }
    /**
     * Send a test email
     *
     * Send a test email to make sure you have your email settings configured correctly. Optionally provide a configuration in the request body to test. If no valid configuration is present in the request body the current server configuration will be tested. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void emailTestPostTest() {
        // StatusOK response = api.emailTestPost();

        // TODO: test validations
    }
    /**
     * Get client license
     *
     * Get a subset of the server license needed by the client. ##### Permissions No permission required but having the &#x60;manage_system&#x60; permission returns more information. 
     */
    @Test
    public void licenseClientGetTest() {
        String format = null;
        // Void response = api.licenseClientGet(format);

        // TODO: test validations
    }
    /**
     * Remove license file
     *
     * Remove the license file from the server. This will disable all enterprise features.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void licenseDeleteTest() {
        // Void response = api.licenseDelete();

        // TODO: test validations
    }
    /**
     * Upload license file
     *
     * Upload a license to enable enterprise features.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void licensePostTest() {
        File license = null;
        // StatusOK response = api.licensePost(license);

        // TODO: test validations
    }
    /**
     * Get logs
     *
     * Get a page of server logs, selected with &#x60;page&#x60; and &#x60;logs_per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void logsGetTest() {
        String page = null;
        String logsPerPage = null;
        // List<String> response = api.logsGet(page, logsPerPage);

        // TODO: test validations
    }
    /**
     * Add log message
     *
     * Add log messages to the server logs. ##### Permissions Users with &#x60;manage_system&#x60; permission can log ERROR or DEBUG messages. Logged in users can log ERROR or DEBUG messages when &#x60;ServiceSettings.EnableDeveloper&#x60; is &#x60;true&#x60; or just DEBUG messages when &#x60;false&#x60;. Non-logged in users can log ERROR or DEBUG messages when &#x60;ServiceSettings.EnableDeveloper&#x60; is &#x60;true&#x60; and cannot log when &#x60;false&#x60;. 
     */
    @Test
    public void logsPostTest() {
        Body32 body = null;
        // Object response = api.logsPost(body);

        // TODO: test validations
    }
    /**
     * Check system health
     *
     * Check if the server is up and healthy based on the configuration setting &#x60;GoRoutineHealthThreshold&#x60;. If &#x60;GoRoutineHealthThreshold&#x60; and the number of goroutines on the server exceeds that threshold the server is considered unhealthy. If &#x60;GoRoutineHealthThreshold&#x60; is not set or the number of goroutines is below the threshold the server is considered healthy. __Minimum server version__: 3.10 ##### Permissions Must be logged in. 
     */
    @Test
    public void systemPingGetTest() {
        // Object response = api.systemPingGet();

        // TODO: test validations
    }
    /**
     * Get WebRTC token
     *
     * Get a valid WebRTC token, STUN and TURN server URLs along with TURN credentials to use with the Mattermost WebRTC service. See https://docs.mattermost.com/administration/config-settings.html#webrtc-beta for WebRTC configutation settings. The token returned is for the current user&#39;s session. ##### Permissions Must be authenticated. 
     */
    @Test
    public void webrtcTokenGetTest() {
        // InlineResponse2007 response = api.webrtcTokenGet();

        // TODO: test validations
    }
}
