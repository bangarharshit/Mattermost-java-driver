package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Body34;
import io.swagger.client.model.Body35;
import io.swagger.client.model.Body36;
import io.swagger.client.model.Body37;
import io.swagger.client.model.IncomingWebhook;
import io.swagger.client.model.OutgoingWebhook;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WebhooksApi {
  /**
   * List incoming webhooks
   * Get a page of a list of incoming webhooks. Optionally filter for a specific team using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team. 
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of hooks per page. (optional, default to 60)
   * @param teamId The ID of the team to get hooks for. (optional)
   * @return Call&lt;List&lt;IncomingWebhook&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("hooks/incoming")
  Observable<List<IncomingWebhook>> hooksIncomingGet(
    @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage, @retrofit2.http.Query("team_id") String teamId
  );

  /**
   * Get an incoming webhook
   * Get an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
   * @param hookId Incoming Webhook GUID (required)
   * @return Call&lt;IncomingWebhook&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("hooks/incoming/{hook_id}")
  Observable<IncomingWebhook> hooksIncomingHookIdGet(
    @retrofit2.http.Path("hook_id") String hookId
  );

  /**
   * Update an incoming webhook
   * Update an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
   * @param hookId Incoming Webhook GUID (required)
   * @param body Incoming webhook to be updated (required)
   * @return Call&lt;IncomingWebhook&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("hooks/incoming/{hook_id}")
  Observable<IncomingWebhook> hooksIncomingHookIdPut(
    @retrofit2.http.Path("hook_id") String hookId, @retrofit2.http.Body Body35 body
  );

  /**
   * Create an incoming webhook
   * Create an incoming webhook for a channel. ##### Permissions &#x60;manage_webhooks&#x60; for the channel the webhook is in. 
   * @param body Incoming webhook to be created (required)
   * @return Call&lt;IncomingWebhook&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("hooks/incoming")
  Observable<IncomingWebhook> hooksIncomingPost(
    @retrofit2.http.Body Body34 body
  );

  /**
   * List outgoing webhooks
   * Get a page of a list of outgoing webhooks. Optionally filter for a specific team or channel using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team/channel. 
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of hooks per page. (optional, default to 60)
   * @param teamId The ID of the team to get hooks for. (optional)
   * @param channelId The ID of the channel to get hooks for. (optional)
   * @return Call&lt;List&lt;OutgoingWebhook&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("hooks/outgoing")
  Observable<List<OutgoingWebhook>> hooksOutgoingGet(
    @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage, @retrofit2.http.Query("team_id") String teamId, @retrofit2.http.Query("channel_id") String channelId
  );

  /**
   * Delete an outgoing webhook
   * Delete an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
   * @param hookId Outgoing webhook GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("hooks/outgoing/{hook_id}")
  Observable<StatusOK> hooksOutgoingHookIdDelete(
    @retrofit2.http.Path("hook_id") String hookId
  );

  /**
   * Get an outgoing webhook
   * Get an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
   * @param hookId Outgoing webhook GUID (required)
   * @return Call&lt;OutgoingWebhook&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("hooks/outgoing/{hook_id}")
  Observable<OutgoingWebhook> hooksOutgoingHookIdGet(
    @retrofit2.http.Path("hook_id") String hookId
  );

  /**
   * Update an outgoing webhook
   * Update an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
   * @param hookId outgoing Webhook GUID (required)
   * @param body Outgoing webhook to be updated (required)
   * @return Call&lt;OutgoingWebhook&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("hooks/outgoing/{hook_id}")
  Observable<OutgoingWebhook> hooksOutgoingHookIdPut(
    @retrofit2.http.Path("hook_id") String hookId, @retrofit2.http.Body Body37 body
  );

  /**
   * Regenerate the token for the outgoing webhook.
   * Regenerate the token for the outgoing webhook. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
   * @param hookId Outgoing webhook GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("hooks/outgoing/{hook_id}/regen_token")
  Observable<StatusOK> hooksOutgoingHookIdRegenTokenPost(
    @retrofit2.http.Path("hook_id") String hookId
  );

  /**
   * Create an outgoing webhook
   * Create an outgoing webhook for a team. ##### Permissions &#x60;manage_webhooks&#x60; for the team the webhook is in. 
   * @param body Outgoing webhook to be created (required)
   * @return Call&lt;OutgoingWebhook&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("hooks/outgoing")
  Observable<OutgoingWebhook> hooksOutgoingPost(
    @retrofit2.http.Body Body36 body
  );

}
