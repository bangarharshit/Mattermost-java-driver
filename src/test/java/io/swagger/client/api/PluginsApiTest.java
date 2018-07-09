package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import java.io.File;
import io.swagger.client.model.InlineResponse2009;
import io.swagger.client.model.PluginManifestWebapp;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PluginsApi
 */
public class PluginsApiTest {

    private PluginsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PluginsApi.class);
    }

    /**
     * Get plugins
     *
     * Get a list of inactive and a list of active plugin manifests. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 
     */
    @Test
    public void pluginsGetTest() {
        // InlineResponse2009 response = api.pluginsGet();

        // TODO: test validations
    }
    /**
     * Activate plugin
     *
     * Activate a previously uploaded plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 
     */
    @Test
    public void pluginsPluginIdActivatePostTest() {
        String pluginId = null;
        // StatusOK response = api.pluginsPluginIdActivatePost(pluginId);

        // TODO: test validations
    }
    /**
     * Deactivate plugin
     *
     * Deactivate a previously activated plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 
     */
    @Test
    public void pluginsPluginIdDeactivatePostTest() {
        String pluginId = null;
        // StatusOK response = api.pluginsPluginIdDeactivatePost(pluginId);

        // TODO: test validations
    }
    /**
     * Remove plugin
     *
     * Remove the plugin with the provided ID from the server. All plugin files are deleted. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 
     */
    @Test
    public void pluginsPluginIdDeleteTest() {
        String pluginId = null;
        // StatusOK response = api.pluginsPluginIdDelete(pluginId);

        // TODO: test validations
    }
    /**
     * Upload plugin
     *
     * Upload a plugin compressed in a .tar.gz file. Plugins and plugin uploads must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 
     */
    @Test
    public void pluginsPostTest() {
        File plugin = null;
        // StatusOK response = api.pluginsPost(plugin);

        // TODO: test validations
    }
    /**
     * Get webapp plugins
     *
     * Deactivate a previously activated plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions No permissions required.  __Minimum server version__: 4.4 
     */
    @Test
    public void pluginsWebappGetTest() {
        // List<PluginManifestWebapp> response = api.pluginsWebappGet();

        // TODO: test validations
    }
}
