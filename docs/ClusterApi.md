# ClusterApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clusterStatusGet**](ClusterApi.md#clusterStatusGet) | **GET** cluster/status | Get cluster status


<a name="clusterStatusGet"></a>
# **clusterStatusGet**
> List&lt;ClusterInfo&gt; clusterStatusGet()

Get cluster status

Get a set of information for each node in the cluster, useful for checking the status and health of each node. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
try {
    List<ClusterInfo> result = apiInstance.clusterStatusGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#clusterStatusGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ClusterInfo&gt;**](ClusterInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

