# OAuthApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthAppsAppIdDelete**](OAuthApi.md#oauthAppsAppIdDelete) | **DELETE** oauth/apps/{app_id} | Delete an OAuth app
[**oauthAppsAppIdGet**](OAuthApi.md#oauthAppsAppIdGet) | **GET** oauth/apps/{app_id} | Get an OAuth app
[**oauthAppsAppIdInfoGet**](OAuthApi.md#oauthAppsAppIdInfoGet) | **GET** oauth/apps/{app_id}/info | Get info on an OAuth app
[**oauthAppsAppIdPut**](OAuthApi.md#oauthAppsAppIdPut) | **PUT** oauth/apps/{app_id} | Update an OAuth app
[**oauthAppsAppIdRegenSecretPost**](OAuthApi.md#oauthAppsAppIdRegenSecretPost) | **POST** oauth/apps/{app_id}/regen_secret | Regenerate OAuth app secret
[**oauthAppsGet**](OAuthApi.md#oauthAppsGet) | **GET** oauth/apps | Get OAuth apps
[**oauthAppsPost**](OAuthApi.md#oauthAppsPost) | **POST** oauth/apps | Register OAuth app
[**usersUserIdOauthAppsAuthorizedGet**](OAuthApi.md#usersUserIdOauthAppsAuthorizedGet) | **GET** users/{user_id}/oauth/apps/authorized | Get authorized OAuth apps


<a name="oauthAppsAppIdDelete"></a>
# **oauthAppsAppIdDelete**
> StatusOK oauthAppsAppIdDelete(appId)

Delete an OAuth app

Delete and unregister an OAuth 2.0 client application  ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OAuthApi;


OAuthApi apiInstance = new OAuthApi();
String appId = "appId_example"; // String | Application client id
try {
    StatusOK result = apiInstance.oauthAppsAppIdDelete(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#oauthAppsAppIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application client id |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsAppIdGet"></a>
# **oauthAppsAppIdGet**
> OAuthApp oauthAppsAppIdGet(appId)

Get an OAuth app

Get an OAuth 2.0 client application registered with Mattermost. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OAuthApi;


OAuthApi apiInstance = new OAuthApi();
String appId = "appId_example"; // String | Application client id
try {
    OAuthApp result = apiInstance.oauthAppsAppIdGet(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#oauthAppsAppIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application client id |

### Return type

[**OAuthApp**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsAppIdInfoGet"></a>
# **oauthAppsAppIdInfoGet**
> OAuthApp oauthAppsAppIdInfoGet(appId)

Get info on an OAuth app

Get public information about an OAuth 2.0 client application registered with Mattermost. The application&#39;s client secret will be blanked out. ##### Permissions Must be authenticated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OAuthApi;


OAuthApi apiInstance = new OAuthApi();
String appId = "appId_example"; // String | Application client id
try {
    OAuthApp result = apiInstance.oauthAppsAppIdInfoGet(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#oauthAppsAppIdInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application client id |

### Return type

[**OAuthApp**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsAppIdPut"></a>
# **oauthAppsAppIdPut**
> OAuthApp oauthAppsAppIdPut(appId, body)

Update an OAuth app

Update an OAuth 2.0 client application based on OAuth struct. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OAuthApi;


OAuthApi apiInstance = new OAuthApi();
String appId = "appId_example"; // String | Application client id
Body41 body = new Body41(); // Body41 | OAuth application to update
try {
    OAuthApp result = apiInstance.oauthAppsAppIdPut(appId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#oauthAppsAppIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application client id |
 **body** | [**Body41**](Body41.md)| OAuth application to update |

### Return type

[**OAuthApp**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsAppIdRegenSecretPost"></a>
# **oauthAppsAppIdRegenSecretPost**
> OAuthApp oauthAppsAppIdRegenSecretPost(appId)

Regenerate OAuth app secret

Regenerate the client secret for an OAuth 2.0 client application registered with Mattermost. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OAuthApi;


OAuthApi apiInstance = new OAuthApi();
String appId = "appId_example"; // String | Application client id
try {
    OAuthApp result = apiInstance.oauthAppsAppIdRegenSecretPost(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#oauthAppsAppIdRegenSecretPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application client id |

### Return type

[**OAuthApp**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsGet"></a>
# **oauthAppsGet**
> List&lt;OAuthApp&gt; oauthAppsGet(page, perPage)

Get OAuth apps

Get a page of OAuth 2.0 client applications registered with Mattermost. ##### Permissions With &#x60;manage_oauth&#x60; permission, the apps registered by the logged in user are returned. With &#x60;manage_system_wide_oauth&#x60; permission, all apps regardless of creator are returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OAuthApi;


OAuthApi apiInstance = new OAuthApi();
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of apps per page.
try {
    List<OAuthApp> result = apiInstance.oauthAppsGet(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#oauthAppsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of apps per page. | [optional] [default to 60]

### Return type

[**List&lt;OAuthApp&gt;**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsPost"></a>
# **oauthAppsPost**
> OAuthApp oauthAppsPost(body)

Register OAuth app

Register an OAuth 2.0 client application with Mattermost as the service provider. ##### Permissions Must have &#x60;manage_oauth&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OAuthApi;


OAuthApi apiInstance = new OAuthApi();
Body40 body = new Body40(); // Body40 | OAuth application to register
try {
    OAuthApp result = apiInstance.oauthAppsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#oauthAppsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body40**](Body40.md)| OAuth application to register |

### Return type

[**OAuthApp**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdOauthAppsAuthorizedGet"></a>
# **usersUserIdOauthAppsAuthorizedGet**
> List&lt;OAuthApp&gt; usersUserIdOauthAppsAuthorizedGet(userId, page, perPage)

Get authorized OAuth apps

Get a page of OAuth 2.0 client applications authorized to access a user&#39;s account. ##### Permissions Must be authenticated as the user or have &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OAuthApi;


OAuthApi apiInstance = new OAuthApi();
String userId = "userId_example"; // String | User GUID
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of apps per page.
try {
    List<OAuthApp> result = apiInstance.usersUserIdOauthAppsAuthorizedGet(userId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#usersUserIdOauthAppsAuthorizedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of apps per page. | [optional] [default to 60]

### Return type

[**List&lt;OAuthApp&gt;**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

