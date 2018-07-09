package io.swagger.client.api;

import io.swagger.client.ApiClient;
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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersApi.class);
    }

    /**
     * Autocomplete users
     *
     * Get a list of users for the purpose of autocompleting based on the provided search term. Specify a combination of &#x60;team_id&#x60; and &#x60;channel_id&#x60; to filter results further. ##### Permissions Requires an active session and &#x60;view_team&#x60; and &#x60;read_channel&#x60; on any teams or channels used to filter the results further. 
     */
    @Test
    public void usersAutocompleteGetTest() {
        String name = null;
        String teamId = null;
        String channelId = null;
        // UserAutocomplete response = api.usersAutocompleteGet(name, teamId, channelId);

        // TODO: test validations
    }
    /**
     * Get a user by email
     *
     * Get a user object by providing a user email. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 
     */
    @Test
    public void usersEmailEmailGetTest() {
        String email = null;
        // User response = api.usersEmailEmailGet(email);

        // TODO: test validations
    }
    /**
     * Verify user email
     *
     * Verify the email used by a user to sign-up their account with. ##### Permissions No permissions required. 
     */
    @Test
    public void usersEmailVerifyPostTest() {
        Body12 body = null;
        // StatusOK response = api.usersEmailVerifyPost(body);

        // TODO: test validations
    }
    /**
     * Send verification email
     *
     * Send an email with a verification link to a user that has an email matching the one in the request body. This endpoint will return success even if the email does not match any users on the system. ##### Permissions No permissions required. 
     */
    @Test
    public void usersEmailVerifySendPostTest() {
        Body13 body = null;
        // StatusOK response = api.usersEmailVerifySendPost(body);

        // TODO: test validations
    }
    /**
     * Get users
     *
     * Get a page of a list of users. Based on query string parameters, select users from a team, channel, or select users not in a specific channel.  Since server version 4.0, some basic sorting is available using the &#x60;sort&#x60; query parameter. Sorting is currently only supported when selecting users on a team. ##### Permissions Requires an active session and (if specified) membership to the channel or team being selected from. 
     */
    @Test
    public void usersGetTest() {
        String page = null;
        String perPage = null;
        String inTeam = null;
        String notInTeam = null;
        String inChannel = null;
        String notInChannel = null;
        Boolean withoutTeam = null;
        String sort = null;
        // List<User> response = api.usersGet(page, perPage, inTeam, notInTeam, inChannel, notInChannel, withoutTeam, sort);

        // TODO: test validations
    }
    /**
     * Get users by ids
     *
     * Get a list of users based on a provided list of user ids. ##### Permissions Requires an active session but no other permissions. 
     */
    @Test
    public void usersIdsPostTest() {
        List<String> body = null;
        // List<User> response = api.usersIdsPost(body);

        // TODO: test validations
    }
    /**
     * Switch login method
     *
     * Switch a user&#39;s login method from using email to OAuth2/SAML/LDAP or back to email. When switching to OAuth2/SAML, account switching is not complete until the user follows the returned link and completes any steps on the OAuth2/SAML service provider.  To switch from email to OAuth2/SAML, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;email&#x60; and &#x60;password&#x60;.  To switch from OAuth2/SAML to email, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;email&#x60; and &#x60;new_password&#x60;.  To switch from email to LDAP/AD, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;email&#x60;, &#x60;password&#x60;, &#x60;ldap_ip&#x60; and &#x60;new_password&#x60; (this is the user&#39;s LDAP password).  To switch from LDAP/AD to email, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;ldap_ip&#x60;, &#x60;password&#x60; (this is the user&#39;s LDAP password), &#x60;email&#x60;  and &#x60;new_password&#x60;.  Additionally, specify &#x60;mfa_code&#x60; when trying to switch an account on LDAP/AD or email that has MFA activated.  ##### Permissions No current authentication required except when switching from OAuth2/SAML to email. 
     */
    @Test
    public void usersLoginSwitchPostTest() {
        Body14 body = null;
        // InlineResponse2002 response = api.usersLoginSwitchPost(body);

        // TODO: test validations
    }
    /**
     * Check MFA
     *
     * Check if a user has multi-factor authentication active on their account by providing a login id. Used to check whether an MFA code needs to be provided when logging in. ##### Permissions No permission required. 
     */
    @Test
    public void usersMfaPostTest() {
        Body7 body = null;
        // InlineResponse2001 response = api.usersMfaPost(body);

        // TODO: test validations
    }
    /**
     * Reset password
     *
     * Update the password for a user using a one-use, timed recovery code tied to the user&#39;s account. Only works for non-SSO users. ##### Permissions No permissions required. 
     */
    @Test
    public void usersPasswordResetPostTest() {
        Body5 body = null;
        // StatusOK response = api.usersPasswordResetPost(body);

        // TODO: test validations
    }
    /**
     * Send password reset email
     *
     * Send an email containing a link for resetting the user&#39;s password. The link will contain a one-use, timed recovery code tied to the user&#39;s account. Only works for non-SSO users. ##### Permissions No permissions required. 
     */
    @Test
    public void usersPasswordResetSendPostTest() {
        Body9 body = null;
        // StatusOK response = api.usersPasswordResetSendPost(body);

        // TODO: test validations
    }
    /**
     * Create a user
     *
     * Create a new user on the system. ##### Permissions No permission required but user creation can be controlled by server configuration. 
     */
    @Test
    public void usersPostTest() {
        Body body = null;
        // User response = api.usersPost(body);

        // TODO: test validations
    }
    /**
     * Search users
     *
     * Get a list of users based on search criteria provided in the request body. Searches are typically done against username, full name, nickname and email unless otherwise configured by the server. ##### Permissions Requires an active session and &#x60;read_channel&#x60; and/or &#x60;view_team&#x60; permissions for any channels or teams specified in the request body. 
     */
    @Test
    public void usersSearchPostTest() {
        Body1 body = null;
        // List<User> response = api.usersSearchPost(body);

        // TODO: test validations
    }
    /**
     * Attach mobile device
     *
     * Attach a mobile device id to the currently logged in session. This will enable push notiofications for a user, if configured by the server. ##### Permissions Must be authenticated. 
     */
    @Test
    public void usersSessionsDevicePutTest() {
        Body11 body = null;
        // StatusOK response = api.usersSessionsDevicePut(body);

        // TODO: test validations
    }
    /**
     * Disable personal access token
     *
     * Disable a personal access token and delete any sessions using the token. The token can be re-enabled using &#x60;/users/tokens/enable&#x60;.  __Minimum server version__: 4.4  ##### Permissions Must have &#x60;revoke_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersTokensDisablePostTest() {
        Token2 token = null;
        // StatusOK response = api.usersTokensDisablePost(token);

        // TODO: test validations
    }
    /**
     * Enable personal access token
     *
     * Re-enable a personal access token that has been disabled.  __Minimum server version__: 4.4  ##### Permissions Must have &#x60;create_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersTokensEnablePostTest() {
        Token3 token = null;
        // StatusOK response = api.usersTokensEnablePost(token);

        // TODO: test validations
    }
    /**
     * Get user access tokens
     *
     * Get a page of user access tokens for users on the system. Does not include the actual authentication tokens. Use query parameters for paging.  __Minimum server version__: 4.7  ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void usersTokensGetTest() {
        String page = null;
        String perPage = null;
        // List<UserAccessTokenSanitized> response = api.usersTokensGet(page, perPage);

        // TODO: test validations
    }
    /**
     * Revoke a user access token
     *
     * Revoke a user access token and delete any sessions using the token.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;revoke_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersTokensRevokePostTest() {
        Token1 token = null;
        // StatusOK response = api.usersTokensRevokePost(token);

        // TODO: test validations
    }
    /**
     * Search tokens
     *
     * Get a list of tokens based on search criteria provided in the request body. Searches are done against the token id, user id and username.  __Minimum server version__: 4.7  ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void usersTokensSearchPostTest() {
        Body15 body = null;
        // List<UserAccessTokenSanitized> response = api.usersTokensSearchPost(body);

        // TODO: test validations
    }
    /**
     * Get a user access token
     *
     * Get a user access token. Does not include the actual authentication token.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;read_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersTokensTokenIdGetTest() {
        String tokenId = null;
        // UserAccessTokenSanitized response = api.usersTokensTokenIdGet(tokenId);

        // TODO: test validations
    }
    /**
     * Update user active status
     *
     * Update user active or inactive status.  __Since server version 4.6, users using a SSO provider to login can be activated or deactivated with this endpoint. However, if their activation status in Mattermost does not reflect their status in the SSO provider, the next synchronization or login by that user will reset the activation status to that of their account in the SSO provider. Server versions 4.5 and before do not allow activation or deactivation of SSO users from this endpoint.__ ##### Permissions User can deactivate themself. User with &#x60;manage_system&#x60; permission can activate or deactivate a user. 
     */
    @Test
    public void usersUserIdActivePutTest() {
        String userId = null;
        Body4 body = null;
        // StatusOK response = api.usersUserIdActivePut(userId, body);

        // TODO: test validations
    }
    /**
     * Get user&#39;s audits
     *
     * Get a list of audit by providing the user GUID. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdAuditsGetTest() {
        String userId = null;
        // List<Audit> response = api.usersUserIdAuditsGet(userId);

        // TODO: test validations
    }
    /**
     * Update a user&#39;s authentication method
     *
     * Updates a user&#39;s authentication method. This can be used to change them to/from LDAP authentication for example.  __Minimum server version__: 4.6 ##### Permissions Must have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdAuthPutTest() {
        String userId = null;
        UserAuthData body = null;
        // UserAuthData response = api.usersUserIdAuthPut(userId, body);

        // TODO: test validations
    }
    /**
     * Deactivate a user account.
     *
     * Deactivates the user by archiving its user object. ##### Permissions Must be logged in as the user being deactivated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdDeleteTest() {
        String userId = null;
        // StatusOK response = api.usersUserIdDelete(userId);

        // TODO: test validations
    }
    /**
     * Get a user
     *
     * Get a user a object. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 
     */
    @Test
    public void usersUserIdGetTest() {
        String userId = null;
        // User response = api.usersUserIdGet(userId);

        // TODO: test validations
    }
    /**
     * Get user&#39;s profile image
     *
     * Get a user&#39;s profile image based on user_id string parameter. ##### Permissions Must be logged in. 
     */
    @Test
    public void usersUserIdImageGetTest() {
        String userId = null;
        // Void response = api.usersUserIdImageGet(userId);

        // TODO: test validations
    }
    /**
     * Set user&#39;s profile image
     *
     * Set a user&#39;s profile image based on user_id string parameter. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdImagePostTest() {
        File image = null;
        String userId = null;
        // StatusOK response = api.usersUserIdImagePost(image, userId);

        // TODO: test validations
    }
    /**
     * Generate MFA secret
     *
     * Generates an multi-factor authentication secret for a user and returns it as a string and as base64 encoded QR code image. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdMfaGeneratePostTest() {
        String userId = null;
        // InlineResponse200 response = api.usersUserIdMfaGeneratePost(userId);

        // TODO: test validations
    }
    /**
     * Update a user&#39;s MFA
     *
     * Activates multi-factor authentication for the user if &#x60;activate&#x60; is true and a valid &#x60;code&#x60; is provided. If activate is false, then &#x60;code&#x60; is not required and multi-factor authentication is disabled for the user. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdMfaPutTest() {
        String userId = null;
        Body6 body = null;
        // StatusOK response = api.usersUserIdMfaPut(userId, body);

        // TODO: test validations
    }
    /**
     * Update a user&#39;s password
     *
     * Update a user&#39;s password. New password must meet password policy set by server configuration. Current password is required if you&#39;re updating your own password. ##### Permissions Must be logged in as the user the password is being changed for or have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void usersUserIdPasswordPutTest() {
        String userId = null;
        Body8 body = null;
        // StatusOK response = api.usersUserIdPasswordPut(userId, body);

        // TODO: test validations
    }
    /**
     * Patch a user
     *
     * Partially update a user by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdPatchPutTest() {
        String userId = null;
        Body3 body = null;
        // User response = api.usersUserIdPatchPut(userId, body);

        // TODO: test validations
    }
    /**
     * Update a user
     *
     * Update a user by providing the user object. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdPutTest() {
        String userId = null;
        Body2 body = null;
        // User response = api.usersUserIdPut(userId, body);

        // TODO: test validations
    }
    /**
     * Update a user&#39;s roles
     *
     * Update a user&#39;s system-level roles. Valid user roles are \&quot;system_user\&quot;, \&quot;system_admin\&quot; or both of them. Overwrites any previously assigned system-level roles. ##### Permissions Must have the &#x60;manage_roles&#x60; permission. 
     */
    @Test
    public void usersUserIdRolesPutTest() {
        String userId = null;
        Roles roles = null;
        // StatusOK response = api.usersUserIdRolesPut(userId, roles);

        // TODO: test validations
    }
    /**
     * Get user&#39;s sessions
     *
     * Get a list of sessions by providing the user GUID. Sensitive information will be sanitized out. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdSessionsGetTest() {
        String userId = null;
        // List<Session> response = api.usersUserIdSessionsGet(userId);

        // TODO: test validations
    }
    /**
     * Revoke all active sessions for a user
     *
     * Revokes all user sessions from the provided user id and session id strings. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. __Minimum server version__: 4.4 
     */
    @Test
    public void usersUserIdSessionsRevokeAllPostTest() {
        String userId = null;
        // StatusOK response = api.usersUserIdSessionsRevokeAllPost(userId);

        // TODO: test validations
    }
    /**
     * Revoke a user session
     *
     * Revokes a user session from the provided user id and session id strings. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdSessionsRevokePostTest() {
        String userId = null;
        Body10 body = null;
        // StatusOK response = api.usersUserIdSessionsRevokePost(userId, body);

        // TODO: test validations
    }
    /**
     * Get user access tokens
     *
     * Get a list of user access tokens for a user. Does not include the actual authentication tokens. Use query paremeters for paging.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;read_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdTokensGetTest() {
        String userId = null;
        String page = null;
        String perPage = null;
        // List<UserAccessTokenSanitized> response = api.usersUserIdTokensGet(userId, page, perPage);

        // TODO: test validations
    }
    /**
     * Create a user access token
     *
     * Generate a user access token that can be used to authenticate with the Mattermost REST API.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;create_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdTokensPostTest() {
        String userId = null;
        Token token = null;
        // UserAccessToken response = api.usersUserIdTokensPost(userId, token);

        // TODO: test validations
    }
    /**
     * Get a user by username
     *
     * Get a user object by providing a username. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 
     */
    @Test
    public void usersUsernameUsernameGetTest() {
        String username = null;
        // User response = api.usersUsernameUsernameGet(username);

        // TODO: test validations
    }
    /**
     * Get users by usernames
     *
     * Get a list of users based on a provided list of usernames. ##### Permissions Requires an active session but no other permissions. 
     */
    @Test
    public void usersUsernamesPostTest() {
        List<String> body = null;
        // List<User> response = api.usersUsernamesPost(body);

        // TODO: test validations
    }
}
