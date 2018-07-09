package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Body40;
import io.swagger.client.model.Body41;
import io.swagger.client.model.OAuthApp;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OAuthApi {
  /**
   * Delete an OAuth app
   * Delete and unregister an OAuth 2.0 client application  ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 
   * @param appId Application client id (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("oauth/apps/{app_id}")
  Observable<StatusOK> oauthAppsAppIdDelete(
    @retrofit2.http.Path("app_id") String appId
  );

  /**
   * Get an OAuth app
   * Get an OAuth 2.0 client application registered with Mattermost. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 
   * @param appId Application client id (required)
   * @return Call&lt;OAuthApp&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("oauth/apps/{app_id}")
  Observable<OAuthApp> oauthAppsAppIdGet(
    @retrofit2.http.Path("app_id") String appId
  );

  /**
   * Get info on an OAuth app
   * Get public information about an OAuth 2.0 client application registered with Mattermost. The application&#39;s client secret will be blanked out. ##### Permissions Must be authenticated. 
   * @param appId Application client id (required)
   * @return Call&lt;OAuthApp&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("oauth/apps/{app_id}/info")
  Observable<OAuthApp> oauthAppsAppIdInfoGet(
    @retrofit2.http.Path("app_id") String appId
  );

  /**
   * Update an OAuth app
   * Update an OAuth 2.0 client application based on OAuth struct. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 
   * @param appId Application client id (required)
   * @param body OAuth application to update (required)
   * @return Call&lt;OAuthApp&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("oauth/apps/{app_id}")
  Observable<OAuthApp> oauthAppsAppIdPut(
    @retrofit2.http.Path("app_id") String appId, @retrofit2.http.Body Body41 body
  );

  /**
   * Regenerate OAuth app secret
   * Regenerate the client secret for an OAuth 2.0 client application registered with Mattermost. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 
   * @param appId Application client id (required)
   * @return Call&lt;OAuthApp&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("oauth/apps/{app_id}/regen_secret")
  Observable<OAuthApp> oauthAppsAppIdRegenSecretPost(
    @retrofit2.http.Path("app_id") String appId
  );

  /**
   * Get OAuth apps
   * Get a page of OAuth 2.0 client applications registered with Mattermost. ##### Permissions With &#x60;manage_oauth&#x60; permission, the apps registered by the logged in user are returned. With &#x60;manage_system_wide_oauth&#x60; permission, all apps regardless of creator are returned. 
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of apps per page. (optional, default to 60)
   * @return Call&lt;List&lt;OAuthApp&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("oauth/apps")
  Observable<List<OAuthApp>> oauthAppsGet(
    @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

  /**
   * Register OAuth app
   * Register an OAuth 2.0 client application with Mattermost as the service provider. ##### Permissions Must have &#x60;manage_oauth&#x60; permission. 
   * @param body OAuth application to register (required)
   * @return Call&lt;OAuthApp&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("oauth/apps")
  Observable<OAuthApp> oauthAppsPost(
    @retrofit2.http.Body Body40 body
  );

  /**
   * Get authorized OAuth apps
   * Get a page of OAuth 2.0 client applications authorized to access a user&#39;s account. ##### Permissions Must be authenticated as the user or have &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of apps per page. (optional, default to 60)
   * @return Call&lt;List&lt;OAuthApp&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/oauth/apps/authorized")
  Observable<List<OAuthApp>> usersUserIdOauthAppsAuthorizedGet(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

}
