# PluginsApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pluginsGet**](PluginsApi.md#pluginsGet) | **GET** plugins | Get plugins
[**pluginsPluginIdActivatePost**](PluginsApi.md#pluginsPluginIdActivatePost) | **POST** plugins/{plugin_id}/activate | Activate plugin
[**pluginsPluginIdDeactivatePost**](PluginsApi.md#pluginsPluginIdDeactivatePost) | **POST** plugins/{plugin_id}/deactivate | Deactivate plugin
[**pluginsPluginIdDelete**](PluginsApi.md#pluginsPluginIdDelete) | **DELETE** plugins/{plugin_id} | Remove plugin
[**pluginsPost**](PluginsApi.md#pluginsPost) | **POST** plugins | Upload plugin
[**pluginsWebappGet**](PluginsApi.md#pluginsWebappGet) | **GET** plugins/webapp | Get webapp plugins


<a name="pluginsGet"></a>
# **pluginsGet**
> InlineResponse2009 pluginsGet()

Get plugins

Get a list of inactive and a list of active plugin manifests. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PluginsApi;


PluginsApi apiInstance = new PluginsApi();
try {
    InlineResponse2009 result = apiInstance.pluginsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginsApi#pluginsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pluginsPluginIdActivatePost"></a>
# **pluginsPluginIdActivatePost**
> StatusOK pluginsPluginIdActivatePost(pluginId)

Activate plugin

Activate a previously uploaded plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PluginsApi;


PluginsApi apiInstance = new PluginsApi();
String pluginId = "pluginId_example"; // String | 
try {
    StatusOK result = apiInstance.pluginsPluginIdActivatePost(pluginId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginsApi#pluginsPluginIdActivatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **String**|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pluginsPluginIdDeactivatePost"></a>
# **pluginsPluginIdDeactivatePost**
> StatusOK pluginsPluginIdDeactivatePost(pluginId)

Deactivate plugin

Deactivate a previously activated plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PluginsApi;


PluginsApi apiInstance = new PluginsApi();
String pluginId = "pluginId_example"; // String | 
try {
    StatusOK result = apiInstance.pluginsPluginIdDeactivatePost(pluginId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginsApi#pluginsPluginIdDeactivatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **String**|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pluginsPluginIdDelete"></a>
# **pluginsPluginIdDelete**
> StatusOK pluginsPluginIdDelete(pluginId)

Remove plugin

Remove the plugin with the provided ID from the server. All plugin files are deleted. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PluginsApi;


PluginsApi apiInstance = new PluginsApi();
String pluginId = "pluginId_example"; // String | 
try {
    StatusOK result = apiInstance.pluginsPluginIdDelete(pluginId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginsApi#pluginsPluginIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **String**|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pluginsPost"></a>
# **pluginsPost**
> StatusOK pluginsPost(plugin)

Upload plugin

Upload a plugin compressed in a .tar.gz file. Plugins and plugin uploads must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PluginsApi;


PluginsApi apiInstance = new PluginsApi();
File plugin = new File("/path/to/file.txt"); // File | The plugin image to be uploaded
try {
    StatusOK result = apiInstance.pluginsPost(plugin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginsApi#pluginsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plugin** | **File**| The plugin image to be uploaded |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="pluginsWebappGet"></a>
# **pluginsWebappGet**
> List&lt;PluginManifestWebapp&gt; pluginsWebappGet()

Get webapp plugins

Deactivate a previously activated plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions No permissions required.  __Minimum server version__: 4.4 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PluginsApi;


PluginsApi apiInstance = new PluginsApi();
try {
    List<PluginManifestWebapp> result = apiInstance.pluginsWebappGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginsApi#pluginsWebappGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PluginManifestWebapp&gt;**](PluginManifestWebapp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

