# UsersApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersAutocompleteGet**](UsersApi.md#usersAutocompleteGet) | **GET** users/autocomplete | Autocomplete users
[**usersEmailEmailGet**](UsersApi.md#usersEmailEmailGet) | **GET** users/email/{email} | Get a user by email
[**usersEmailVerifyPost**](UsersApi.md#usersEmailVerifyPost) | **POST** users/email/verify | Verify user email
[**usersEmailVerifySendPost**](UsersApi.md#usersEmailVerifySendPost) | **POST** users/email/verify/send | Send verification email
[**usersGet**](UsersApi.md#usersGet) | **GET** users | Get users
[**usersIdsPost**](UsersApi.md#usersIdsPost) | **POST** users/ids | Get users by ids
[**usersLoginSwitchPost**](UsersApi.md#usersLoginSwitchPost) | **POST** users/login/switch | Switch login method
[**usersMfaPost**](UsersApi.md#usersMfaPost) | **POST** users/mfa | Check MFA
[**usersPasswordResetPost**](UsersApi.md#usersPasswordResetPost) | **POST** users/password/reset | Reset password
[**usersPasswordResetSendPost**](UsersApi.md#usersPasswordResetSendPost) | **POST** users/password/reset/send | Send password reset email
[**usersPost**](UsersApi.md#usersPost) | **POST** users | Create a user
[**usersSearchPost**](UsersApi.md#usersSearchPost) | **POST** users/search | Search users
[**usersSessionsDevicePut**](UsersApi.md#usersSessionsDevicePut) | **PUT** users/sessions/device | Attach mobile device
[**usersTokensDisablePost**](UsersApi.md#usersTokensDisablePost) | **POST** users/tokens/disable | Disable personal access token
[**usersTokensEnablePost**](UsersApi.md#usersTokensEnablePost) | **POST** users/tokens/enable | Enable personal access token
[**usersTokensGet**](UsersApi.md#usersTokensGet) | **GET** users/tokens | Get user access tokens
[**usersTokensRevokePost**](UsersApi.md#usersTokensRevokePost) | **POST** users/tokens/revoke | Revoke a user access token
[**usersTokensSearchPost**](UsersApi.md#usersTokensSearchPost) | **POST** users/tokens/search | Search tokens
[**usersTokensTokenIdGet**](UsersApi.md#usersTokensTokenIdGet) | **GET** users/tokens/{token_id} | Get a user access token
[**usersUserIdActivePut**](UsersApi.md#usersUserIdActivePut) | **PUT** users/{user_id}/active | Update user active status
[**usersUserIdAuditsGet**](UsersApi.md#usersUserIdAuditsGet) | **GET** users/{user_id}/audits | Get user&#39;s audits
[**usersUserIdAuthPut**](UsersApi.md#usersUserIdAuthPut) | **PUT** users/{user_id}/auth | Update a user&#39;s authentication method
[**usersUserIdDelete**](UsersApi.md#usersUserIdDelete) | **DELETE** users/{user_id} | Deactivate a user account.
[**usersUserIdGet**](UsersApi.md#usersUserIdGet) | **GET** users/{user_id} | Get a user
[**usersUserIdImageGet**](UsersApi.md#usersUserIdImageGet) | **GET** users/{user_id}/image | Get user&#39;s profile image
[**usersUserIdImagePost**](UsersApi.md#usersUserIdImagePost) | **POST** users/{user_id}/image | Set user&#39;s profile image
[**usersUserIdMfaGeneratePost**](UsersApi.md#usersUserIdMfaGeneratePost) | **POST** users/{user_id}/mfa/generate | Generate MFA secret
[**usersUserIdMfaPut**](UsersApi.md#usersUserIdMfaPut) | **PUT** users/{user_id}/mfa | Update a user&#39;s MFA
[**usersUserIdPasswordPut**](UsersApi.md#usersUserIdPasswordPut) | **PUT** users/{user_id}/password | Update a user&#39;s password
[**usersUserIdPatchPut**](UsersApi.md#usersUserIdPatchPut) | **PUT** users/{user_id}/patch | Patch a user
[**usersUserIdPut**](UsersApi.md#usersUserIdPut) | **PUT** users/{user_id} | Update a user
[**usersUserIdRolesPut**](UsersApi.md#usersUserIdRolesPut) | **PUT** users/{user_id}/roles | Update a user&#39;s roles
[**usersUserIdSessionsGet**](UsersApi.md#usersUserIdSessionsGet) | **GET** users/{user_id}/sessions | Get user&#39;s sessions
[**usersUserIdSessionsRevokeAllPost**](UsersApi.md#usersUserIdSessionsRevokeAllPost) | **POST** users/{user_id}/sessions/revoke/all | Revoke all active sessions for a user
[**usersUserIdSessionsRevokePost**](UsersApi.md#usersUserIdSessionsRevokePost) | **POST** users/{user_id}/sessions/revoke | Revoke a user session
[**usersUserIdTokensGet**](UsersApi.md#usersUserIdTokensGet) | **GET** users/{user_id}/tokens | Get user access tokens
[**usersUserIdTokensPost**](UsersApi.md#usersUserIdTokensPost) | **POST** users/{user_id}/tokens | Create a user access token
[**usersUsernameUsernameGet**](UsersApi.md#usersUsernameUsernameGet) | **GET** users/username/{username} | Get a user by username
[**usersUsernamesPost**](UsersApi.md#usersUsernamesPost) | **POST** users/usernames | Get users by usernames


<a name="usersAutocompleteGet"></a>
# **usersAutocompleteGet**
> UserAutocomplete usersAutocompleteGet(name, teamId, channelId)

Autocomplete users

Get a list of users for the purpose of autocompleting based on the provided search term. Specify a combination of &#x60;team_id&#x60; and &#x60;channel_id&#x60; to filter results further. ##### Permissions Requires an active session and &#x60;view_team&#x60; and &#x60;read_channel&#x60; on any teams or channels used to filter the results further. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String name = "name_example"; // String | Username, nickname first name or last name
String teamId = "teamId_example"; // String | Team ID
String channelId = "channelId_example"; // String | Channel ID
try {
    UserAutocomplete result = apiInstance.usersAutocompleteGet(name, teamId, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersAutocompleteGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Username, nickname first name or last name |
 **teamId** | **String**| Team ID | [optional]
 **channelId** | **String**| Channel ID | [optional]

### Return type

[**UserAutocomplete**](UserAutocomplete.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersEmailEmailGet"></a>
# **usersEmailEmailGet**
> User usersEmailEmailGet(email)

Get a user by email

Get a user object by providing a user email. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String email = "email_example"; // String | User Email
try {
    User result = apiInstance.usersEmailEmailGet(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersEmailEmailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| User Email |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersEmailVerifyPost"></a>
# **usersEmailVerifyPost**
> StatusOK usersEmailVerifyPost(body)

Verify user email

Verify the email used by a user to sign-up their account with. ##### Permissions No permissions required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Body12 body = new Body12(); // Body12 | 
try {
    StatusOK result = apiInstance.usersEmailVerifyPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersEmailVerifyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body12**](Body12.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersEmailVerifySendPost"></a>
# **usersEmailVerifySendPost**
> StatusOK usersEmailVerifySendPost(body)

Send verification email

Send an email with a verification link to a user that has an email matching the one in the request body. This endpoint will return success even if the email does not match any users on the system. ##### Permissions No permissions required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Body13 body = new Body13(); // Body13 | 
try {
    StatusOK result = apiInstance.usersEmailVerifySendPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersEmailVerifySendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body13**](Body13.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersGet"></a>
# **usersGet**
> List&lt;User&gt; usersGet(page, perPage, inTeam, notInTeam, inChannel, notInChannel, withoutTeam, sort)

Get users

Get a page of a list of users. Based on query string parameters, select users from a team, channel, or select users not in a specific channel.  Since server version 4.0, some basic sorting is available using the &#x60;sort&#x60; query parameter. Sorting is currently only supported when selecting users on a team. ##### Permissions Requires an active session and (if specified) membership to the channel or team being selected from. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of users per page. There is a maximum limit of 200 users per page.
String inTeam = "inTeam_example"; // String | The ID of the team to get users for.
String notInTeam = "notInTeam_example"; // String | The ID of the team to exclude users for. Must not be used with \"in_team\" query parameter.
String inChannel = "inChannel_example"; // String | The ID of the channel to get users for.
String notInChannel = "notInChannel_example"; // String | The ID of the channel to exclude users for. Must be used with \"in_channel\" query parameter.
Boolean withoutTeam = true; // Boolean | Whether or not to list users that are not on any team. This option takes precendence over `in_team`, `in_channel`, and `not_in_channel`.
String sort = "sort_example"; // String | Can be \"\", \"last_activity_at\" or \"create_at\". When left blank sorting is done by username. Must be used in conjunction with `in_team` and no other query parameters (exlcuding the paging parameters). **Minimum server version: 4.0** 
try {
    List<User> result = apiInstance.usersGet(page, perPage, inTeam, notInTeam, inChannel, notInChannel, withoutTeam, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of users per page. There is a maximum limit of 200 users per page. | [optional] [default to 60]
 **inTeam** | **String**| The ID of the team to get users for. | [optional]
 **notInTeam** | **String**| The ID of the team to exclude users for. Must not be used with \&quot;in_team\&quot; query parameter. | [optional]
 **inChannel** | **String**| The ID of the channel to get users for. | [optional]
 **notInChannel** | **String**| The ID of the channel to exclude users for. Must be used with \&quot;in_channel\&quot; query parameter. | [optional]
 **withoutTeam** | **Boolean**| Whether or not to list users that are not on any team. This option takes precendence over &#x60;in_team&#x60;, &#x60;in_channel&#x60;, and &#x60;not_in_channel&#x60;. | [optional]
 **sort** | **String**| Can be \&quot;\&quot;, \&quot;last_activity_at\&quot; or \&quot;create_at\&quot;. When left blank sorting is done by username. Must be used in conjunction with &#x60;in_team&#x60; and no other query parameters (exlcuding the paging parameters). **Minimum server version: 4.0**  | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersIdsPost"></a>
# **usersIdsPost**
> List&lt;User&gt; usersIdsPost(body)

Get users by ids

Get a list of users based on a provided list of user ids. ##### Permissions Requires an active session but no other permissions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of user ids
try {
    List<User> result = apiInstance.usersIdsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersIdsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**| List of user ids |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersLoginSwitchPost"></a>
# **usersLoginSwitchPost**
> InlineResponse2002 usersLoginSwitchPost(body)

Switch login method

Switch a user&#39;s login method from using email to OAuth2/SAML/LDAP or back to email. When switching to OAuth2/SAML, account switching is not complete until the user follows the returned link and completes any steps on the OAuth2/SAML service provider.  To switch from email to OAuth2/SAML, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;email&#x60; and &#x60;password&#x60;.  To switch from OAuth2/SAML to email, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;email&#x60; and &#x60;new_password&#x60;.  To switch from email to LDAP/AD, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;email&#x60;, &#x60;password&#x60;, &#x60;ldap_ip&#x60; and &#x60;new_password&#x60; (this is the user&#39;s LDAP password).  To switch from LDAP/AD to email, specify &#x60;current_service&#x60;, &#x60;new_service&#x60;, &#x60;ldap_ip&#x60;, &#x60;password&#x60; (this is the user&#39;s LDAP password), &#x60;email&#x60;  and &#x60;new_password&#x60;.  Additionally, specify &#x60;mfa_code&#x60; when trying to switch an account on LDAP/AD or email that has MFA activated.  ##### Permissions No current authentication required except when switching from OAuth2/SAML to email. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Body14 body = new Body14(); // Body14 | 
try {
    InlineResponse2002 result = apiInstance.usersLoginSwitchPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersLoginSwitchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body14**](Body14.md)|  |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersMfaPost"></a>
# **usersMfaPost**
> InlineResponse2001 usersMfaPost(body)

Check MFA

Check if a user has multi-factor authentication active on their account by providing a login id. Used to check whether an MFA code needs to be provided when logging in. ##### Permissions No permission required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Body7 body = new Body7(); // Body7 | 
try {
    InlineResponse2001 result = apiInstance.usersMfaPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersMfaPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body7**](Body7.md)|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersPasswordResetPost"></a>
# **usersPasswordResetPost**
> StatusOK usersPasswordResetPost(body)

Reset password

Update the password for a user using a one-use, timed recovery code tied to the user&#39;s account. Only works for non-SSO users. ##### Permissions No permissions required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Body5 body = new Body5(); // Body5 | 
try {
    StatusOK result = apiInstance.usersPasswordResetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersPasswordResetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body5**](Body5.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersPasswordResetSendPost"></a>
# **usersPasswordResetSendPost**
> StatusOK usersPasswordResetSendPost(body)

Send password reset email

Send an email containing a link for resetting the user&#39;s password. The link will contain a one-use, timed recovery code tied to the user&#39;s account. Only works for non-SSO users. ##### Permissions No permissions required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Body9 body = new Body9(); // Body9 | 
try {
    StatusOK result = apiInstance.usersPasswordResetSendPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersPasswordResetSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body9**](Body9.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersPost"></a>
# **usersPost**
> User usersPost(body)

Create a user

Create a new user on the system. ##### Permissions No permission required but user creation can be controlled by server configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Body body = new Body(); // Body | User object to be created
try {
    User result = apiInstance.usersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)| User object to be created |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersSearchPost"></a>
# **usersSearchPost**
> List&lt;User&gt; usersSearchPost(body)

Search users

Get a list of users based on search criteria provided in the request body. Searches are typically done against username, full name, nickname and email unless otherwise configured by the server. ##### Permissions Requires an active session and &#x60;read_channel&#x60; and/or &#x60;view_team&#x60; permissions for any channels or teams specified in the request body. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Body1 body = new Body1(); // Body1 | Search criteria
try {
    List<User> result = apiInstance.usersSearchPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body1**](Body1.md)| Search criteria |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersSessionsDevicePut"></a>
# **usersSessionsDevicePut**
> StatusOK usersSessionsDevicePut(body)

Attach mobile device

Attach a mobile device id to the currently logged in session. This will enable push notiofications for a user, if configured by the server. ##### Permissions Must be authenticated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Body11 body = new Body11(); // Body11 | 
try {
    StatusOK result = apiInstance.usersSessionsDevicePut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersSessionsDevicePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body11**](Body11.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersTokensDisablePost"></a>
# **usersTokensDisablePost**
> StatusOK usersTokensDisablePost(token)

Disable personal access token

Disable a personal access token and delete any sessions using the token. The token can be re-enabled using &#x60;/users/tokens/enable&#x60;.  __Minimum server version__: 4.4  ##### Permissions Must have &#x60;revoke_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Token2 token = new Token2(); // Token2 | 
try {
    StatusOK result = apiInstance.usersTokensDisablePost(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersTokensDisablePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | [**Token2**](Token2.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersTokensEnablePost"></a>
# **usersTokensEnablePost**
> StatusOK usersTokensEnablePost(token)

Enable personal access token

Re-enable a personal access token that has been disabled.  __Minimum server version__: 4.4  ##### Permissions Must have &#x60;create_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Token3 token = new Token3(); // Token3 | 
try {
    StatusOK result = apiInstance.usersTokensEnablePost(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersTokensEnablePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | [**Token3**](Token3.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersTokensGet"></a>
# **usersTokensGet**
> List&lt;UserAccessTokenSanitized&gt; usersTokensGet(page, perPage)

Get user access tokens

Get a page of user access tokens for users on the system. Does not include the actual authentication tokens. Use query parameters for paging.  __Minimum server version__: 4.7  ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of tokens per page.
try {
    List<UserAccessTokenSanitized> result = apiInstance.usersTokensGet(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersTokensGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of tokens per page. | [optional] [default to 60]

### Return type

[**List&lt;UserAccessTokenSanitized&gt;**](UserAccessTokenSanitized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersTokensRevokePost"></a>
# **usersTokensRevokePost**
> StatusOK usersTokensRevokePost(token)

Revoke a user access token

Revoke a user access token and delete any sessions using the token.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;revoke_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Token1 token = new Token1(); // Token1 | 
try {
    StatusOK result = apiInstance.usersTokensRevokePost(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersTokensRevokePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | [**Token1**](Token1.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersTokensSearchPost"></a>
# **usersTokensSearchPost**
> List&lt;UserAccessTokenSanitized&gt; usersTokensSearchPost(body)

Search tokens

Get a list of tokens based on search criteria provided in the request body. Searches are done against the token id, user id and username.  __Minimum server version__: 4.7  ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Body15 body = new Body15(); // Body15 | Search criteria
try {
    List<UserAccessTokenSanitized> result = apiInstance.usersTokensSearchPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersTokensSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body15**](Body15.md)| Search criteria |

### Return type

[**List&lt;UserAccessTokenSanitized&gt;**](UserAccessTokenSanitized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersTokensTokenIdGet"></a>
# **usersTokensTokenIdGet**
> UserAccessTokenSanitized usersTokensTokenIdGet(tokenId)

Get a user access token

Get a user access token. Does not include the actual authentication token.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;read_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String tokenId = "tokenId_example"; // String | User access token GUID
try {
    UserAccessTokenSanitized result = apiInstance.usersTokensTokenIdGet(tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersTokensTokenIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | **String**| User access token GUID |

### Return type

[**UserAccessTokenSanitized**](UserAccessTokenSanitized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdActivePut"></a>
# **usersUserIdActivePut**
> StatusOK usersUserIdActivePut(userId, body)

Update user active status

Update user active or inactive status.  __Since server version 4.6, users using a SSO provider to login can be activated or deactivated with this endpoint. However, if their activation status in Mattermost does not reflect their status in the SSO provider, the next synchronization or login by that user will reset the activation status to that of their account in the SSO provider. Server versions 4.5 and before do not allow activation or deactivation of SSO users from this endpoint.__ ##### Permissions User can deactivate themself. User with &#x60;manage_system&#x60; permission can activate or deactivate a user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
Body4 body = new Body4(); // Body4 | Use `true` to set the user active, `false` for inactive
try {
    StatusOK result = apiInstance.usersUserIdActivePut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdActivePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **body** | [**Body4**](Body4.md)| Use &#x60;true&#x60; to set the user active, &#x60;false&#x60; for inactive |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdAuditsGet"></a>
# **usersUserIdAuditsGet**
> List&lt;Audit&gt; usersUserIdAuditsGet(userId)

Get user&#39;s audits

Get a list of audit by providing the user GUID. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
try {
    List<Audit> result = apiInstance.usersUserIdAuditsGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdAuditsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |

### Return type

[**List&lt;Audit&gt;**](Audit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdAuthPut"></a>
# **usersUserIdAuthPut**
> UserAuthData usersUserIdAuthPut(userId, body)

Update a user&#39;s authentication method

Updates a user&#39;s authentication method. This can be used to change them to/from LDAP authentication for example.  __Minimum server version__: 4.6 ##### Permissions Must have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
UserAuthData body = new UserAuthData(); // UserAuthData | 
try {
    UserAuthData result = apiInstance.usersUserIdAuthPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdAuthPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **body** | [**UserAuthData**](UserAuthData.md)|  |

### Return type

[**UserAuthData**](UserAuthData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdDelete"></a>
# **usersUserIdDelete**
> StatusOK usersUserIdDelete(userId)

Deactivate a user account.

Deactivates the user by archiving its user object. ##### Permissions Must be logged in as the user being deactivated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
try {
    StatusOK result = apiInstance.usersUserIdDelete(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdGet"></a>
# **usersUserIdGet**
> User usersUserIdGet(userId)

Get a user

Get a user a object. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
try {
    User result = apiInstance.usersUserIdGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdImageGet"></a>
# **usersUserIdImageGet**
> Void usersUserIdImageGet(userId)

Get user&#39;s profile image

Get a user&#39;s profile image based on user_id string parameter. ##### Permissions Must be logged in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
try {
    Void result = apiInstance.usersUserIdImageGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdImageGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdImagePost"></a>
# **usersUserIdImagePost**
> StatusOK usersUserIdImagePost(image, userId)

Set user&#39;s profile image

Set a user&#39;s profile image based on user_id string parameter. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
File image = new File("/path/to/file.txt"); // File | The image to be uploaded
String userId = "userId_example"; // String | User GUID
try {
    StatusOK result = apiInstance.usersUserIdImagePost(image, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdImagePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| The image to be uploaded |
 **userId** | **String**| User GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="usersUserIdMfaGeneratePost"></a>
# **usersUserIdMfaGeneratePost**
> InlineResponse200 usersUserIdMfaGeneratePost(userId)

Generate MFA secret

Generates an multi-factor authentication secret for a user and returns it as a string and as base64 encoded QR code image. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
try {
    InlineResponse200 result = apiInstance.usersUserIdMfaGeneratePost(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdMfaGeneratePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdMfaPut"></a>
# **usersUserIdMfaPut**
> StatusOK usersUserIdMfaPut(userId, body)

Update a user&#39;s MFA

Activates multi-factor authentication for the user if &#x60;activate&#x60; is true and a valid &#x60;code&#x60; is provided. If activate is false, then &#x60;code&#x60; is not required and multi-factor authentication is disabled for the user. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
Body6 body = new Body6(); // Body6 | 
try {
    StatusOK result = apiInstance.usersUserIdMfaPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdMfaPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **body** | [**Body6**](Body6.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPasswordPut"></a>
# **usersUserIdPasswordPut**
> StatusOK usersUserIdPasswordPut(userId, body)

Update a user&#39;s password

Update a user&#39;s password. New password must meet password policy set by server configuration. Current password is required if you&#39;re updating your own password. ##### Permissions Must be logged in as the user the password is being changed for or have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
Body8 body = new Body8(); // Body8 | 
try {
    StatusOK result = apiInstance.usersUserIdPasswordPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdPasswordPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **body** | [**Body8**](Body8.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPatchPut"></a>
# **usersUserIdPatchPut**
> User usersUserIdPatchPut(userId, body)

Patch a user

Partially update a user by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
Body3 body = new Body3(); // Body3 | User object that is to be updated
try {
    User result = apiInstance.usersUserIdPatchPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdPatchPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **body** | [**Body3**](Body3.md)| User object that is to be updated |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPut"></a>
# **usersUserIdPut**
> User usersUserIdPut(userId, body)

Update a user

Update a user by providing the user object. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
Body2 body = new Body2(); // Body2 | User object that is to be updated
try {
    User result = apiInstance.usersUserIdPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **body** | [**Body2**](Body2.md)| User object that is to be updated |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdRolesPut"></a>
# **usersUserIdRolesPut**
> StatusOK usersUserIdRolesPut(userId, roles)

Update a user&#39;s roles

Update a user&#39;s system-level roles. Valid user roles are \&quot;system_user\&quot;, \&quot;system_admin\&quot; or both of them. Overwrites any previously assigned system-level roles. ##### Permissions Must have the &#x60;manage_roles&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
Roles roles = new Roles(); // Roles | Space-delimited system roles to assign to the user
try {
    StatusOK result = apiInstance.usersUserIdRolesPut(userId, roles);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdRolesPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **roles** | [**Roles**](Roles.md)| Space-delimited system roles to assign to the user |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdSessionsGet"></a>
# **usersUserIdSessionsGet**
> List&lt;Session&gt; usersUserIdSessionsGet(userId)

Get user&#39;s sessions

Get a list of sessions by providing the user GUID. Sensitive information will be sanitized out. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
try {
    List<Session> result = apiInstance.usersUserIdSessionsGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdSessionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |

### Return type

[**List&lt;Session&gt;**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdSessionsRevokeAllPost"></a>
# **usersUserIdSessionsRevokeAllPost**
> StatusOK usersUserIdSessionsRevokeAllPost(userId)

Revoke all active sessions for a user

Revokes all user sessions from the provided user id and session id strings. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. __Minimum server version__: 4.4 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
try {
    StatusOK result = apiInstance.usersUserIdSessionsRevokeAllPost(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdSessionsRevokeAllPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdSessionsRevokePost"></a>
# **usersUserIdSessionsRevokePost**
> StatusOK usersUserIdSessionsRevokePost(userId, body)

Revoke a user session

Revokes a user session from the provided user id and session id strings. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
Body10 body = new Body10(); // Body10 | 
try {
    StatusOK result = apiInstance.usersUserIdSessionsRevokePost(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdSessionsRevokePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **body** | [**Body10**](Body10.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdTokensGet"></a>
# **usersUserIdTokensGet**
> List&lt;UserAccessTokenSanitized&gt; usersUserIdTokensGet(userId, page, perPage)

Get user access tokens

Get a list of user access tokens for a user. Does not include the actual authentication tokens. Use query paremeters for paging.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;read_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of tokens per page.
try {
    List<UserAccessTokenSanitized> result = apiInstance.usersUserIdTokensGet(userId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdTokensGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of tokens per page. | [optional] [default to 60]

### Return type

[**List&lt;UserAccessTokenSanitized&gt;**](UserAccessTokenSanitized.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdTokensPost"></a>
# **usersUserIdTokensPost**
> UserAccessToken usersUserIdTokensPost(userId, token)

Create a user access token

Generate a user access token that can be used to authenticate with the Mattermost REST API.  __Minimum server version__: 4.1  ##### Permissions Must have &#x60;create_user_access_token&#x60; permission. For non-self requests, must also have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User GUID
Token token = new Token(); // Token | 
try {
    UserAccessToken result = apiInstance.usersUserIdTokensPost(userId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUserIdTokensPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **token** | [**Token**](Token.md)|  |

### Return type

[**UserAccessToken**](UserAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUsernameUsernameGet"></a>
# **usersUsernameUsernameGet**
> User usersUsernameUsernameGet(username)

Get a user by username

Get a user object by providing a username. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String username = "username_example"; // String | Username
try {
    User result = apiInstance.usersUsernameUsernameGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUsernameUsernameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Username |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUsernamesPost"></a>
# **usersUsernamesPost**
> List&lt;User&gt; usersUsernamesPost(body)

Get users by usernames

Get a list of users based on a provided list of usernames. ##### Permissions Requires an active session but no other permissions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of usernames
try {
    List<User> result = apiInstance.usersUsernamesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUsernamesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**| List of usernames |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

