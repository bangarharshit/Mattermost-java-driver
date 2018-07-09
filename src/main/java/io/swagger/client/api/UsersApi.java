package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Audit;
import io.swagger.client.model.Body;
import io.swagger.client.model.Body1;
import io.swagger.client.model.Body10;
import io.swagger.client.model.Body11;
import io.swagger.client.model.Body12;
import io.swagger.client.model.Body13;
import io.swagger.client.model.Body14;
import io.swagger.client.model.Body15;
import io.swagger.client.model.Body2;
import io.swagger.client.model.Body3;
import io.swagger.client.model.Body4;
import io.swagger.client.model.Body5;
import io.swagger.client.model.Body6;
import io.swagger.client.model.Body7;
import io.swagger.client.model.Body8;
import io.swagger.client.model.Body9;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.Roles;
import io.swagger.client.model.Session;
import io.swagger.client.model.StatusOK;
import io.swagger.client.model.Token;
import io.swagger.client.model.Token1;
import io.swagger.client.model.Token2;
import io.swagger.client.model.Token3;
import io.swagger.client.model.User;
import io.swagger.client.model.UserAccessToken;
import io.swagger.client.model.UserAccessTokenSanitized;
import io.swagger.client.model.UserAuthData;
import io.swagger.client.model.UserAutocomplete;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UsersApi {
  /**
   * Autocomplete users
   * Get a list of users for the purpose of autocompleting based on the provided search term. Specify a combination of &#x60;team_id&#x60; and &#x60;channel_id&#x60; to filter results further. ##### Permissions Requires an active session and &#x60;view_team&#x60; and &#x60;read_channel&#x60; on any teams or channels used to filter the results further. 
   * @param name Username, nickname first name or last name (required)
   * @param teamId Team ID (optional)
   * @param channelId Channel ID (optional)
   * @return Call&lt;UserAutocomplete&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/autocomplete")
  Observable<UserAutocomplete> usersAutocompleteGet(
    @retrofit2.http.Query("name") String name, @retrofit2.http.Query("team_id") String teamId, @retrofit2.http.Query("channel_id") String channelId
  );

  /**
   * Get a user by email
   * Get a user object by providing a user email. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 
   * @param email User Email (required)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/email/{email}")
  Observable<User> usersEmailEmailGet(
    @retrofit2.http.Path("email") String email
  );

  /**
   * Verify user email
   * Verify the email used by a user to sign-up their account with. ##### Permissions No permissions required. 
   * @param body  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/email/verify")
  Observable<StatusOK> usersEmailVerifyPost(
    @retrofit2.http.Body Body12 body
  );

  /**
   * Send verification email
   * Send an email with a verification link to a user that has an email matching the one in the request body. This endpoint will return success even if the email does not match any users on the system. ##### Permissions No permissions required. 
   * @param body  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/email/verify/send")
  Observable<StatusOK> usersEmailVerifySendPost(
    @retrofit2.http.Body Body13 body
  );

  /**
   * Get users
   * Get a page of a list of users. Based on query string parameters, select users from a team, channel, or select users not in a specific channel.  Since server version 4.0, some basic sorting is available using the &#x60;sort&#x60; query parameter. Sorting is currently only supported when selecting users on a team. ##### Permissions Requires an active session and (if specified) membership to the channel or team being selected from. 
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of users per page. There is a maximum limit of 200 users per page. (optional, default to 60)
   * @param inTeam The ID of the team to get users for. (optional)
   * @param notInTeam The ID of the team to exclude users for. Must not be used with \&quot;in_team\&quot; query parameter. (optional)
   * @param inChannel The ID of the channel to get users for. (optional)
   * @param notInChannel The ID of the channel to exclude users for. Must be used with \&quot;in_channel\&quot; query parameter. (optional)
   * @param withoutTeam Whether or not to list users that are not on any team. This option takes precendence over &#x60;in_team&#x60;, &#x60;in_channel&#x60;, and &#x60;not_in_channel&#x60;. (optional)
   * @param sort Can be \&quot;\&quot;, \&quot;last_activity_at\&quot; or \&quot;create_at\&quot;. When left blank sorting is done by username. Must be used in conjunction with &#x60;in_team&#x60; and no other query parameters (exlcuding the paging parameters). **Minimum server version: 4.0**  (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users")
  Observable<List<User>> usersGet(
    @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage, @retrofit2.http.Query("in_team") String inTeam, @retrofit2.http.Query("not_in_team") String notInTeam, @retrofit2.http.Query("in_channel") String inChannel, @retrofit2.http.Query("not_in_channel") String notInChannel, @retrofit2.http.Query("without_team") Boolean withoutTeam, @retrofit2.http.Query("sort") String sort
  );

  /**
   * Get users by ids
   * Get a list of users based on a provided list of user ids. ##### Permissions Requires an active session but no other permissions. 
   * @param body List of user ids (required)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/ids")
  Observable<List<User>> usersIdsPost(
    @retrofit2.http.Body List<String> body
  );

  /**
   * Switch login method
   * Switch a user&#39;s login method from using email to OAuth2/SAML/LDAP or back to email. When switching to OAuth2/SAML, account switching is not complete until the user follows the returned link and completes any steps on the OAuth2/SAML service provider.  To switch from email to OAuth2/SAML, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;email&#x60; and &#x60;password&#x60;.  To switch from OAuth2/SAML to email, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;email&#x60; and &#x60;new_password&#x60;.  To switch from email to LDAP/AD, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;email&#x60;, &#x60;password&#x60;, &#x60;ldap_ip&#x60; and &#x60;new_password&#x60; (this is the user&#39;s LDAP password).  To switch from LDAP/AD to email, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;ldap_ip&#x60;, &#x60;password&#x60; (this is the user&#39;s LDAP password), &#x60;email&#x60;  and &#x60;new_password&#x60;.  Additionally, specify &#x60;mfa_code&#x60; when trying to switch an account on LDAP/AD or email that has MFA activated.  ##### Permissions No current authentication required except when switching from OAuth2/SAML to email. 
   * @param body  (required)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/login/switch")
  Observable<InlineResponse2002> usersLoginSwitchPost(
    @retrofit2.http.Body Body14 body
  );

  /**
   * Check MFA
   * Check if a user has multi-factor authentication active on their account by providing a login id. Used to check whether an MFA code needs to be provided when logging in. ##### Permissions No permission required. 
   * @param body  (required)
   * @return Call&lt;InlineResponse2001&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/mfa")
  Observable<InlineResponse2001> usersMfaPost(
    @retrofit2.http.Body Body7 body
  );

  /**
   * Reset password
   * Update the password for a user using a one-use, timed recovery code tied to the user&#39;s account. Only works for non-SSO users. ##### Permissions No permissions required. 
   * @param body  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/password/reset")
  Observable<StatusOK> usersPasswordResetPost(
    @retrofit2.http.Body Body5 body
  );

  /**
   * Send password reset email
   * Send an email containing a link for resetting the user&#39;s password. The link will contain a one-use, timed recovery code tied to the user&#39;s account. Only works for non-SSO users. ##### Permissions No permissions required. 
   * @param body  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/password/reset/send")
  Observable<StatusOK> usersPasswordResetSendPost(
    @retrofit2.http.Body Body9 body
  );

  /**
   * Create a user
   * Create a new user on the system. ##### Permissions No permission required but user creation can be controlled by server configuration. 
   * @param body User object to be created (required)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users")
  Observable<User> usersPost(
    @retrofit2.http.Body Body body
  );

  /**
   * Search users
   * Get a list of users based on search criteria provided in the request body. Searches are typically done against username, full name, nickname and email unless otherwise configured by the server. ##### Permissions Requires an active session and &#x60;read_channel&#x60; and/or &#x60;view_team&#x60; permissions for any channels or teams specified in the request body. 
   * @param body Search criteria (required)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/search")
  Observable<List<User>> usersSearchPost(
    @retrofit2.http.Body Body1 body
  );

  /**
   * Attach mobile device
   * Attach a mobile device id to the currently logged in session. This will enable push notiofications for a user, if configured by the server. ##### Permissions Must be authenticated. 
   * @param body  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/sessions/device")
  Observable<StatusOK> usersSessionsDevicePut(
    @retrofit2.http.Body Body11 body
  );

  /**
   * Disable personal access token
   * Disable a personal access token and delete any sessions using the token. The token can be re-enabled using &#x60;/users/tokens/enable&#x60;.  __Minimum server version__: 4.4  ##### Permissions Must have &#x60;revoke_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
   * @param token  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/tokens/disable")
  Observable<StatusOK> usersTokensDisablePost(
    @retrofit2.http.Body Token2 token
  );

  /**
   * Enable personal access token
   * Re-enable a personal access token that has been disabled.  __Minimum server version__: 4.4  ##### Permissions Must have &#x60;create_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
   * @param token  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/tokens/enable")
  Observable<StatusOK> usersTokensEnablePost(
    @retrofit2.http.Body Token3 token
  );

  /**
   * Get user access tokens
   * Get a page of user access tokens for users on the system. Does not include the actual authentication tokens. Use query parameters for paging.  __Minimum server version__: 4.7  ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of tokens per page. (optional, default to 60)
   * @return Call&lt;List&lt;UserAccessTokenSanitized&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/tokens")
  Observable<List<UserAccessTokenSanitized>> usersTokensGet(
    @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

  /**
   * Revoke a user access token
   * Revoke a user access token and delete any sessions using the token.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;revoke_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
   * @param token  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/tokens/revoke")
  Observable<StatusOK> usersTokensRevokePost(
    @retrofit2.http.Body Token1 token
  );

  /**
   * Search tokens
   * Get a list of tokens based on search criteria provided in the request body. Searches are done against the token id, user id and username.  __Minimum server version__: 4.7  ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param body Search criteria (required)
   * @return Call&lt;List&lt;UserAccessTokenSanitized&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/tokens/search")
  Observable<List<UserAccessTokenSanitized>> usersTokensSearchPost(
    @retrofit2.http.Body Body15 body
  );

  /**
   * Get a user access token
   * Get a user access token. Does not include the actual authentication token.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;read_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
   * @param tokenId User access token GUID (required)
   * @return Call&lt;UserAccessTokenSanitized&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/tokens/{token_id}")
  Observable<UserAccessTokenSanitized> usersTokensTokenIdGet(
    @retrofit2.http.Path("token_id") String tokenId
  );

  /**
   * Update user active status
   * Update user active or inactive status.  __Since server version 4.6, users using a SSO provider to login can be activated or deactivated with this endpoint. However, if their activation status in Mattermost does not reflect their status in the SSO provider, the next synchronization or login by that user will reset the activation status to that of their account in the SSO provider. Server versions 4.5 and before do not allow activation or deactivation of SSO users from this endpoint.__ ##### Permissions User can deactivate themself. User with &#x60;manage_system&#x60; permission can activate or deactivate a user. 
   * @param userId User GUID (required)
   * @param body Use &#x60;true&#x60; to set the user active, &#x60;false&#x60; for inactive (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/active")
  Observable<StatusOK> usersUserIdActivePut(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Body4 body
  );

  /**
   * Get user&#39;s audits
   * Get a list of audit by providing the user GUID. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @return Call&lt;List&lt;Audit&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/audits")
  Observable<List<Audit>> usersUserIdAuditsGet(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Update a user&#39;s authentication method
   * Updates a user&#39;s authentication method. This can be used to change them to/from LDAP authentication for example.  __Minimum server version__: 4.6 ##### Permissions Must have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param body  (required)
   * @return Call&lt;UserAuthData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/auth")
  Observable<UserAuthData> usersUserIdAuthPut(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body UserAuthData body
  );

  /**
   * Deactivate a user account.
   * Deactivates the user by archiving its user object. ##### Permissions Must be logged in as the user being deactivated or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("users/{user_id}")
  Observable<StatusOK> usersUserIdDelete(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Get a user
   * Get a user a object. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 
   * @param userId User GUID (required)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}")
  Observable<User> usersUserIdGet(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Get user&#39;s profile image
   * Get a user&#39;s profile image based on user_id string parameter. ##### Permissions Must be logged in. 
   * @param userId User GUID (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/image")
  Observable<Void> usersUserIdImageGet(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Set user&#39;s profile image
   * Set a user&#39;s profile image based on user_id string parameter. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
   * @param image The image to be uploaded (required)
   * @param userId User GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @retrofit2.http.Multipart
  @POST("users/{user_id}/image")
  Observable<StatusOK> usersUserIdImagePost(
    @retrofit2.http.Part("image\"; filename=\"image") RequestBody image, @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Generate MFA secret
   * Generates an multi-factor authentication secret for a user and returns it as a string and as base64 encoded QR code image. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @return Call&lt;InlineResponse200&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/mfa/generate")
  Observable<InlineResponse200> usersUserIdMfaGeneratePost(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Update a user&#39;s MFA
   * Activates multi-factor authentication for the user if &#x60;activate&#x60; is true and a valid &#x60;code&#x60; is provided. If activate is false, then &#x60;code&#x60; is not required and multi-factor authentication is disabled for the user. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param body  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/mfa")
  Observable<StatusOK> usersUserIdMfaPut(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Body6 body
  );

  /**
   * Update a user&#39;s password
   * Update a user&#39;s password. New password must meet password policy set by server configuration. Current password is required if you&#39;re updating your own password. ##### Permissions Must be logged in as the user the password is being changed for or have &#x60;manage_system&#x60; permission. 
   * @param userId User GUID (required)
   * @param body  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/password")
  Observable<StatusOK> usersUserIdPasswordPut(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Body8 body
  );

  /**
   * Patch a user
   * Partially update a user by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param body User object that is to be updated (required)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/patch")
  Observable<User> usersUserIdPatchPut(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Body3 body
  );

  /**
   * Update a user
   * Update a user by providing the user object. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param body User object that is to be updated (required)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}")
  Observable<User> usersUserIdPut(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Body2 body
  );

  /**
   * Update a user&#39;s roles
   * Update a user&#39;s system-level roles. Valid user roles are \&quot;system_user\&quot;, \&quot;system_admin\&quot; or both of them. Overwrites any previously assigned system-level roles. ##### Permissions Must have the &#x60;manage_roles&#x60; permission. 
   * @param userId User GUID (required)
   * @param roles Space-delimited system roles to assign to the user (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/roles")
  Observable<StatusOK> usersUserIdRolesPut(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Roles roles
  );

  /**
   * Get user&#39;s sessions
   * Get a list of sessions by providing the user GUID. Sensitive information will be sanitized out. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @return Call&lt;List&lt;Session&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/sessions")
  Observable<List<Session>> usersUserIdSessionsGet(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Revoke all active sessions for a user
   * Revokes all user sessions from the provided user id and session id strings. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. __Minimum server version__: 4.4 
   * @param userId User GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/sessions/revoke/all")
  Observable<StatusOK> usersUserIdSessionsRevokeAllPost(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Revoke a user session
   * Revokes a user session from the provided user id and session id strings. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param body  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/sessions/revoke")
  Observable<StatusOK> usersUserIdSessionsRevokePost(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Body10 body
  );

  /**
   * Get user access tokens
   * Get a list of user access tokens for a user. Does not include the actual authentication tokens. Use query paremeters for paging.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;read_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of tokens per page. (optional, default to 60)
   * @return Call&lt;List&lt;UserAccessTokenSanitized&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/tokens")
  Observable<List<UserAccessTokenSanitized>> usersUserIdTokensGet(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

  /**
   * Create a user access token
   * Generate a user access token that can be used to authenticate with the Mattermost REST API.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;create_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param token  (required)
   * @return Call&lt;UserAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/tokens")
  Observable<UserAccessToken> usersUserIdTokensPost(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Token token
  );

  /**
   * Get a user by username
   * Get a user object by providing a username. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 
   * @param username Username (required)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/username/{username}")
  Observable<User> usersUsernameUsernameGet(
    @retrofit2.http.Path("username") String username
  );

  /**
   * Get users by usernames
   * Get a list of users based on a provided list of usernames. ##### Permissions Requires an active session but no other permissions. 
   * @param body List of usernames (required)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/usernames")
  Observable<List<User>> usersUsernamesPost(
    @retrofit2.http.Body List<String> body
  );

}
