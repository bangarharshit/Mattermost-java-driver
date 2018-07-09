# DataretentionApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataRetentionPolicyGet**](DataretentionApi.md#dataRetentionPolicyGet) | **GET** data_retention/policy | Get the data retention policy details.


<a name="dataRetentionPolicyGet"></a>
# **dataRetentionPolicyGet**
> DataRetentionPolicy dataRetentionPolicyGet()

Get the data retention policy details.

Gets the current data retention policy details from the server, including what data should be purged and the cutoff times for each data type that should be purged. __Minimum server version__: 4.3 ##### Permissions Requires an active session but no other permissions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DataretentionApi;


DataretentionApi apiInstance = new DataretentionApi();
try {
    DataRetentionPolicy result = apiInstance.dataRetentionPolicyGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataretentionApi#dataRetentionPolicyGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DataRetentionPolicy**](DataRetentionPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

