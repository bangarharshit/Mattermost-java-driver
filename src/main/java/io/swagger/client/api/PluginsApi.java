package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import java.io.File;
import io.swagger.client.model.InlineResponse2009;
import io.swagger.client.model.PluginManifestWebapp;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PluginsApi {
  /**
   * Get plugins
   * Get a list of inactive and a list of active plugin manifests. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 
   * @return Call&lt;InlineResponse2009&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("plugins")
  Observable<InlineResponse2009> pluginsGet();
    

  /**
   * Activate plugin
   * Activate a previously uploaded plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 
   * @param pluginId  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("plugins/{plugin_id}/activate")
  Observable<StatusOK> pluginsPluginIdActivatePost(
    @retrofit2.http.Path("plugin_id") String pluginId
  );

  /**
   * Deactivate plugin
   * Deactivate a previously activated plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 
   * @param pluginId  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("plugins/{plugin_id}/deactivate")
  Observable<StatusOK> pluginsPluginIdDeactivatePost(
    @retrofit2.http.Path("plugin_id") String pluginId
  );

  /**
   * Remove plugin
   * Remove the plugin with the provided ID from the server. All plugin files are deleted. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 
   * @param pluginId  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("plugins/{plugin_id}")
  Observable<StatusOK> pluginsPluginIdDelete(
    @retrofit2.http.Path("plugin_id") String pluginId
  );

  /**
   * Upload plugin
   * Upload a plugin compressed in a .tar.gz file. Plugins and plugin uploads must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 
   * @param plugin The plugin image to be uploaded (required)
   * @return Call&lt;StatusOK&gt;
   */
  @retrofit2.http.Multipart
  @POST("plugins")
  Observable<StatusOK> pluginsPost(
    @retrofit2.http.Part("plugin\"; filename=\"plugin") RequestBody plugin
  );

  /**
   * Get webapp plugins
   * Deactivate a previously activated plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions No permissions required.  __Minimum server version__: 4.4 
   * @return Call&lt;List&lt;PluginManifestWebapp&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("plugins/webapp")
  Observable<List<PluginManifestWebapp>> pluginsWebappGet();
    

}
