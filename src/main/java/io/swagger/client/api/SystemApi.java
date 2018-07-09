package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Audit;
import io.swagger.client.model.Body32;
import io.swagger.client.model.Config;
import java.io.File;
import io.swagger.client.model.InlineResponse2007;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SystemApi {
  /**
   * Get analytics
   * Get some analytics data about the system. This endpoint uses the old format, the &#x60;/analytics&#x60; route is reserved for the new format when it gets implemented.  The returned JSON changes based on the &#x60;name&#x60; query parameter but is always key/value pairs.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param name Possible values are \&quot;standard\&quot;, \&quot;post_counts_day\&quot;, \&quot;user_counts_with_posts_day\&quot; or \&quot;extra_counts\&quot; (optional, default to standard)
   * @param teamId The team ID to filter the data by (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("analytics/old")
  Observable<Void> analyticsOldGet(
    @retrofit2.http.Query("name") String name, @retrofit2.http.Query("team_id") String teamId
  );

  /**
   * Get audits
   * Get a page of audits for all users on the system, selected with &#x60;page&#x60; and &#x60;per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of audits per page. (optional, default to 60)
   * @return Call&lt;List&lt;Audit&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("audits")
  Observable<List<Audit>> auditsGet(
    @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

  /**
   * Invalidate all the caches
   * Purge all the in-memory caches for the Mattermost server. This can have a temporary negative effect on performance while the caches are re-populated. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("caches/invalidate")
  Observable<StatusOK> cachesInvalidatePost();
    

  /**
   * Get client configuration
   * Get a subset of the server configuration needed by the client. ##### Permissions No permission required. 
   * @param format Must be &#x60;old&#x60;, other formats not implemented yet (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("config/client")
  Observable<Void> configClientGet(
    @retrofit2.http.Query("format") String format
  );

  /**
   * Get configuration
   * Retrieve the current server configuration ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;Config&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("config")
  Observable<Config> configGet();
    

  /**
   * Update configuration
   * Submit a new configuration for the server to use. As of server version 4.8, the &#x60;PluginSettings.EnableUploads&#x60; setting cannot be modified by this endpoint. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param body Mattermost configuration (required)
   * @return Call&lt;Config&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("config")
  Observable<Config> configPut(
    @retrofit2.http.Body Config body
  );

  /**
   * Reload configuration
   * Reload the configuration file to pick up on any changes made to it. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("config/reload")
  Observable<StatusOK> configReloadPost();
    

  /**
   * Recycle database connections
   * Recycle database connections by closing and reconnecting all connections to master and read replica databases. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("database/recycle")
  Observable<StatusOK> databaseRecyclePost();
    

  /**
   * Send a test email
   * Send a test email to make sure you have your email settings configured correctly. Optionally provide a configuration in the request body to test. If no valid configuration is present in the request body the current server configuration will be tested. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("email/test")
  Observable<StatusOK> emailTestPost();
    

  /**
   * Get client license
   * Get a subset of the server license needed by the client. ##### Permissions No permission required but having the &#x60;manage_system&#x60; permission returns more information. 
   * @param format Must be &#x60;old&#x60;, other formats not implemented yet (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("license/client")
  Observable<Void> licenseClientGet(
    @retrofit2.http.Query("format") String format
  );

  /**
   * Remove license file
   * Remove the license file from the server. This will disable all enterprise features.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("license")
  Observable<Void> licenseDelete();
    

  /**
   * Upload license file
   * Upload a license to enable enterprise features.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param license The license to be uploaded (required)
   * @return Call&lt;StatusOK&gt;
   */
  @retrofit2.http.Multipart
  @POST("license")
  Observable<StatusOK> licensePost(
    @retrofit2.http.Part("license\"; filename=\"license") RequestBody license
  );

  /**
   * Get logs
   * Get a page of server logs, selected with &#x60;page&#x60; and &#x60;logs_per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param page The page to select. (optional, default to 0)
   * @param logsPerPage The number of logs per page. There is a maximum limit of 10000 logs per page. (optional, default to 10000)
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("logs")
  Observable<List<String>> logsGet(
    @retrofit2.http.Query("page") String page, @retrofit2.http.Query("logs_per_page") String logsPerPage
  );

  /**
   * Add log message
   * Add log messages to the server logs. ##### Permissions Users with &#x60;manage_system&#x60; permission can log ERROR or DEBUG messages. Logged in users can log ERROR or DEBUG messages when &#x60;ServiceSettings.EnableDeveloper&#x60; is &#x60;true&#x60; or just DEBUG messages when &#x60;false&#x60;. Non-logged in users can log ERROR or DEBUG messages when &#x60;ServiceSettings.EnableDeveloper&#x60; is &#x60;true&#x60; and cannot log when &#x60;false&#x60;. 
   * @param body  (required)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("logs")
  Observable<Object> logsPost(
    @retrofit2.http.Body Body32 body
  );

  /**
   * Check system health
   * Check if the server is up and healthy based on the configuration setting &#x60;GoRoutineHealthThreshold&#x60;. If &#x60;GoRoutineHealthThreshold&#x60; and the number of goroutines on the server exceeds that threshold the server is considered unhealthy. If &#x60;GoRoutineHealthThreshold&#x60; is not set or the number of goroutines is below the threshold the server is considered healthy. __Minimum server version__: 3.10 ##### Permissions Must be logged in. 
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("system/ping")
  Observable<Object> systemPingGet();
    

  /**
   * Get WebRTC token
   * Get a valid WebRTC token, STUN and TURN server URLs along with TURN credentials to use with the Mattermost WebRTC service. See https://docs.mattermost.com/administration/config-settings.html#webrtc-beta for WebRTC configutation settings. The token returned is for the current user&#39;s session. ##### Permissions Must be authenticated. 
   * @return Call&lt;InlineResponse2007&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("webrtc/token")
  Observable<InlineResponse2007> webrtcTokenGet();
    

}
