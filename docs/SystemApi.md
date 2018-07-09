# SystemApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyticsOldGet**](SystemApi.md#analyticsOldGet) | **GET** analytics/old | Get analytics
[**auditsGet**](SystemApi.md#auditsGet) | **GET** audits | Get audits
[**cachesInvalidatePost**](SystemApi.md#cachesInvalidatePost) | **POST** caches/invalidate | Invalidate all the caches
[**configClientGet**](SystemApi.md#configClientGet) | **GET** config/client | Get client configuration
[**configGet**](SystemApi.md#configGet) | **GET** config | Get configuration
[**configPut**](SystemApi.md#configPut) | **PUT** config | Update configuration
[**configReloadPost**](SystemApi.md#configReloadPost) | **POST** config/reload | Reload configuration
[**databaseRecyclePost**](SystemApi.md#databaseRecyclePost) | **POST** database/recycle | Recycle database connections
[**emailTestPost**](SystemApi.md#emailTestPost) | **POST** email/test | Send a test email
[**licenseClientGet**](SystemApi.md#licenseClientGet) | **GET** license/client | Get client license
[**licenseDelete**](SystemApi.md#licenseDelete) | **DELETE** license | Remove license file
[**licensePost**](SystemApi.md#licensePost) | **POST** license | Upload license file
[**logsGet**](SystemApi.md#logsGet) | **GET** logs | Get logs
[**logsPost**](SystemApi.md#logsPost) | **POST** logs | Add log message
[**systemPingGet**](SystemApi.md#systemPingGet) | **GET** system/ping | Check system health
[**webrtcTokenGet**](SystemApi.md#webrtcTokenGet) | **GET** webrtc/token | Get WebRTC token


<a name="analyticsOldGet"></a>
# **analyticsOldGet**
> Void analyticsOldGet(name, teamId)

Get analytics

Get some analytics data about the system. This endpoint uses the old format, the &#x60;/analytics&#x60; route is reserved for the new format when it gets implemented.  The returned JSON changes based on the &#x60;name&#x60; query parameter but is always key/value pairs.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
String name = "standard"; // String | Possible values are \"standard\", \"post_counts_day\", \"user_counts_with_posts_day\" or \"extra_counts\"
String teamId = "teamId_example"; // String | The team ID to filter the data by
try {
    Void result = apiInstance.analyticsOldGet(name, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#analyticsOldGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Possible values are \&quot;standard\&quot;, \&quot;post_counts_day\&quot;, \&quot;user_counts_with_posts_day\&quot; or \&quot;extra_counts\&quot; | [optional] [default to standard]
 **teamId** | **String**| The team ID to filter the data by | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditsGet"></a>
# **auditsGet**
> List&lt;Audit&gt; auditsGet(page, perPage)

Get audits

Get a page of audits for all users on the system, selected with &#x60;page&#x60; and &#x60;per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of audits per page.
try {
    List<Audit> result = apiInstance.auditsGet(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#auditsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of audits per page. | [optional] [default to 60]

### Return type

[**List&lt;Audit&gt;**](Audit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cachesInvalidatePost"></a>
# **cachesInvalidatePost**
> StatusOK cachesInvalidatePost()

Invalidate all the caches

Purge all the in-memory caches for the Mattermost server. This can have a temporary negative effect on performance while the caches are re-populated. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    StatusOK result = apiInstance.cachesInvalidatePost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#cachesInvalidatePost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configClientGet"></a>
# **configClientGet**
> Void configClientGet(format)

Get client configuration

Get a subset of the server configuration needed by the client. ##### Permissions No permission required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
String format = "format_example"; // String | Must be `old`, other formats not implemented yet
try {
    Void result = apiInstance.configClientGet(format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#configClientGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Must be &#x60;old&#x60;, other formats not implemented yet |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configGet"></a>
# **configGet**
> Config configGet()

Get configuration

Retrieve the current server configuration ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    Config result = apiInstance.configGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#configGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Config**](Config.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configPut"></a>
# **configPut**
> Config configPut(body)

Update configuration

Submit a new configuration for the server to use. As of server version 4.8, the &#x60;PluginSettings.EnableUploads&#x60; setting cannot be modified by this endpoint. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
Config body = new Config(); // Config | Mattermost configuration
try {
    Config result = apiInstance.configPut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#configPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Config**](Config.md)| Mattermost configuration |

### Return type

[**Config**](Config.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configReloadPost"></a>
# **configReloadPost**
> StatusOK configReloadPost()

Reload configuration

Reload the configuration file to pick up on any changes made to it. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    StatusOK result = apiInstance.configReloadPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#configReloadPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="databaseRecyclePost"></a>
# **databaseRecyclePost**
> StatusOK databaseRecyclePost()

Recycle database connections

Recycle database connections by closing and reconnecting all connections to master and read replica databases. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    StatusOK result = apiInstance.databaseRecyclePost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#databaseRecyclePost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailTestPost"></a>
# **emailTestPost**
> StatusOK emailTestPost()

Send a test email

Send a test email to make sure you have your email settings configured correctly. Optionally provide a configuration in the request body to test. If no valid configuration is present in the request body the current server configuration will be tested. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    StatusOK result = apiInstance.emailTestPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#emailTestPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="licenseClientGet"></a>
# **licenseClientGet**
> Void licenseClientGet(format)

Get client license

Get a subset of the server license needed by the client. ##### Permissions No permission required but having the &#x60;manage_system&#x60; permission returns more information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
String format = "format_example"; // String | Must be `old`, other formats not implemented yet
try {
    Void result = apiInstance.licenseClientGet(format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#licenseClientGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Must be &#x60;old&#x60;, other formats not implemented yet |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="licenseDelete"></a>
# **licenseDelete**
> Void licenseDelete()

Remove license file

Remove the license file from the server. This will disable all enterprise features.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    Void result = apiInstance.licenseDelete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#licenseDelete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="licensePost"></a>
# **licensePost**
> StatusOK licensePost(license)

Upload license file

Upload a license to enable enterprise features.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
File license = new File("/path/to/file.txt"); // File | The license to be uploaded
try {
    StatusOK result = apiInstance.licensePost(license);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#licensePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **license** | **File**| The license to be uploaded |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="logsGet"></a>
# **logsGet**
> List&lt;String&gt; logsGet(page, logsPerPage)

Get logs

Get a page of server logs, selected with &#x60;page&#x60; and &#x60;logs_per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
String page = "0"; // String | The page to select.
String logsPerPage = "10000"; // String | The number of logs per page. There is a maximum limit of 10000 logs per page.
try {
    List<String> result = apiInstance.logsGet(page, logsPerPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#logsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| The page to select. | [optional] [default to 0]
 **logsPerPage** | **String**| The number of logs per page. There is a maximum limit of 10000 logs per page. | [optional] [default to 10000]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logsPost"></a>
# **logsPost**
> Object logsPost(body)

Add log message

Add log messages to the server logs. ##### Permissions Users with &#x60;manage_system&#x60; permission can log ERROR or DEBUG messages. Logged in users can log ERROR or DEBUG messages when &#x60;ServiceSettings.EnableDeveloper&#x60; is &#x60;true&#x60; or just DEBUG messages when &#x60;false&#x60;. Non-logged in users can log ERROR or DEBUG messages when &#x60;ServiceSettings.EnableDeveloper&#x60; is &#x60;true&#x60; and cannot log when &#x60;false&#x60;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
Body32 body = new Body32(); // Body32 | 
try {
    Object result = apiInstance.logsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#logsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body32**](Body32.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemPingGet"></a>
# **systemPingGet**
> Object systemPingGet()

Check system health

Check if the server is up and healthy based on the configuration setting &#x60;GoRoutineHealthThreshold&#x60;. If &#x60;GoRoutineHealthThreshold&#x60; and the number of goroutines on the server exceeds that threshold the server is considered unhealthy. If &#x60;GoRoutineHealthThreshold&#x60; is not set or the number of goroutines is below the threshold the server is considered healthy. __Minimum server version__: 3.10 ##### Permissions Must be logged in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    Object result = apiInstance.systemPingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemPingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webrtcTokenGet"></a>
# **webrtcTokenGet**
> InlineResponse2007 webrtcTokenGet()

Get WebRTC token

Get a valid WebRTC token, STUN and TURN server URLs along with TURN credentials to use with the Mattermost WebRTC service. See https://docs.mattermost.com/administration/config-settings.html#webrtc-beta for WebRTC configutation settings. The token returned is for the current user&#39;s session. ##### Permissions Must be authenticated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    InlineResponse2007 result = apiInstance.webrtcTokenGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#webrtcTokenGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

