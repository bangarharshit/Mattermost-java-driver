# WebhooksApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hooksIncomingGet**](WebhooksApi.md#hooksIncomingGet) | **GET** hooks/incoming | List incoming webhooks
[**hooksIncomingHookIdGet**](WebhooksApi.md#hooksIncomingHookIdGet) | **GET** hooks/incoming/{hook_id} | Get an incoming webhook
[**hooksIncomingHookIdPut**](WebhooksApi.md#hooksIncomingHookIdPut) | **PUT** hooks/incoming/{hook_id} | Update an incoming webhook
[**hooksIncomingPost**](WebhooksApi.md#hooksIncomingPost) | **POST** hooks/incoming | Create an incoming webhook
[**hooksOutgoingGet**](WebhooksApi.md#hooksOutgoingGet) | **GET** hooks/outgoing | List outgoing webhooks
[**hooksOutgoingHookIdDelete**](WebhooksApi.md#hooksOutgoingHookIdDelete) | **DELETE** hooks/outgoing/{hook_id} | Delete an outgoing webhook
[**hooksOutgoingHookIdGet**](WebhooksApi.md#hooksOutgoingHookIdGet) | **GET** hooks/outgoing/{hook_id} | Get an outgoing webhook
[**hooksOutgoingHookIdPut**](WebhooksApi.md#hooksOutgoingHookIdPut) | **PUT** hooks/outgoing/{hook_id} | Update an outgoing webhook
[**hooksOutgoingHookIdRegenTokenPost**](WebhooksApi.md#hooksOutgoingHookIdRegenTokenPost) | **POST** hooks/outgoing/{hook_id}/regen_token | Regenerate the token for the outgoing webhook.
[**hooksOutgoingPost**](WebhooksApi.md#hooksOutgoingPost) | **POST** hooks/outgoing | Create an outgoing webhook


<a name="hooksIncomingGet"></a>
# **hooksIncomingGet**
> List&lt;IncomingWebhook&gt; hooksIncomingGet(page, perPage, teamId)

List incoming webhooks

Get a page of a list of incoming webhooks. Optionally filter for a specific team using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of hooks per page.
String teamId = "teamId_example"; // String | The ID of the team to get hooks for.
try {
    List<IncomingWebhook> result = apiInstance.hooksIncomingGet(page, perPage, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hooksIncomingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of hooks per page. | [optional] [default to 60]
 **teamId** | **String**| The ID of the team to get hooks for. | [optional]

### Return type

[**List&lt;IncomingWebhook&gt;**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksIncomingHookIdGet"></a>
# **hooksIncomingHookIdGet**
> IncomingWebhook hooksIncomingHookIdGet(hookId)

Get an incoming webhook

Get an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String hookId = "hookId_example"; // String | Incoming Webhook GUID
try {
    IncomingWebhook result = apiInstance.hooksIncomingHookIdGet(hookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hooksIncomingHookIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **String**| Incoming Webhook GUID |

### Return type

[**IncomingWebhook**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksIncomingHookIdPut"></a>
# **hooksIncomingHookIdPut**
> IncomingWebhook hooksIncomingHookIdPut(hookId, body)

Update an incoming webhook

Update an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String hookId = "hookId_example"; // String | Incoming Webhook GUID
Body35 body = new Body35(); // Body35 | Incoming webhook to be updated
try {
    IncomingWebhook result = apiInstance.hooksIncomingHookIdPut(hookId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hooksIncomingHookIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **String**| Incoming Webhook GUID |
 **body** | [**Body35**](Body35.md)| Incoming webhook to be updated |

### Return type

[**IncomingWebhook**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksIncomingPost"></a>
# **hooksIncomingPost**
> IncomingWebhook hooksIncomingPost(body)

Create an incoming webhook

Create an incoming webhook for a channel. ##### Permissions &#x60;manage_webhooks&#x60; for the channel the webhook is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
Body34 body = new Body34(); // Body34 | Incoming webhook to be created
try {
    IncomingWebhook result = apiInstance.hooksIncomingPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hooksIncomingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body34**](Body34.md)| Incoming webhook to be created |

### Return type

[**IncomingWebhook**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingGet"></a>
# **hooksOutgoingGet**
> List&lt;OutgoingWebhook&gt; hooksOutgoingGet(page, perPage, teamId, channelId)

List outgoing webhooks

Get a page of a list of outgoing webhooks. Optionally filter for a specific team or channel using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team/channel. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of hooks per page.
String teamId = "teamId_example"; // String | The ID of the team to get hooks for.
String channelId = "channelId_example"; // String | The ID of the channel to get hooks for.
try {
    List<OutgoingWebhook> result = apiInstance.hooksOutgoingGet(page, perPage, teamId, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hooksOutgoingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of hooks per page. | [optional] [default to 60]
 **teamId** | **String**| The ID of the team to get hooks for. | [optional]
 **channelId** | **String**| The ID of the channel to get hooks for. | [optional]

### Return type

[**List&lt;OutgoingWebhook&gt;**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingHookIdDelete"></a>
# **hooksOutgoingHookIdDelete**
> StatusOK hooksOutgoingHookIdDelete(hookId)

Delete an outgoing webhook

Delete an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String hookId = "hookId_example"; // String | Outgoing webhook GUID
try {
    StatusOK result = apiInstance.hooksOutgoingHookIdDelete(hookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hooksOutgoingHookIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **String**| Outgoing webhook GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingHookIdGet"></a>
# **hooksOutgoingHookIdGet**
> OutgoingWebhook hooksOutgoingHookIdGet(hookId)

Get an outgoing webhook

Get an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String hookId = "hookId_example"; // String | Outgoing webhook GUID
try {
    OutgoingWebhook result = apiInstance.hooksOutgoingHookIdGet(hookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hooksOutgoingHookIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **String**| Outgoing webhook GUID |

### Return type

[**OutgoingWebhook**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingHookIdPut"></a>
# **hooksOutgoingHookIdPut**
> OutgoingWebhook hooksOutgoingHookIdPut(hookId, body)

Update an outgoing webhook

Update an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String hookId = "hookId_example"; // String | outgoing Webhook GUID
Body37 body = new Body37(); // Body37 | Outgoing webhook to be updated
try {
    OutgoingWebhook result = apiInstance.hooksOutgoingHookIdPut(hookId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hooksOutgoingHookIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **String**| outgoing Webhook GUID |
 **body** | [**Body37**](Body37.md)| Outgoing webhook to be updated |

### Return type

[**OutgoingWebhook**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingHookIdRegenTokenPost"></a>
# **hooksOutgoingHookIdRegenTokenPost**
> StatusOK hooksOutgoingHookIdRegenTokenPost(hookId)

Regenerate the token for the outgoing webhook.

Regenerate the token for the outgoing webhook. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String hookId = "hookId_example"; // String | Outgoing webhook GUID
try {
    StatusOK result = apiInstance.hooksOutgoingHookIdRegenTokenPost(hookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hooksOutgoingHookIdRegenTokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **String**| Outgoing webhook GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingPost"></a>
# **hooksOutgoingPost**
> OutgoingWebhook hooksOutgoingPost(body)

Create an outgoing webhook

Create an outgoing webhook for a team. ##### Permissions &#x60;manage_webhooks&#x60; for the team the webhook is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
Body36 body = new Body36(); // Body36 | Outgoing webhook to be created
try {
    OutgoingWebhook result = apiInstance.hooksOutgoingPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hooksOutgoingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body36**](Body36.md)| Outgoing webhook to be created |

### Return type

[**OutgoingWebhook**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

