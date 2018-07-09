# StatusApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersStatusIdsGet**](StatusApi.md#usersStatusIdsGet) | **GET** users/status/ids | Get user statuses by id
[**usersUserIdStatusGet**](StatusApi.md#usersUserIdStatusGet) | **GET** users/{user_id}/status | Get user status
[**usersUserIdStatusPut**](StatusApi.md#usersUserIdStatusPut) | **PUT** users/{user_id}/status | Update user status


<a name="usersStatusIdsGet"></a>
# **usersStatusIdsGet**
> List&lt;Status&gt; usersStatusIdsGet()

Get user statuses by id

Get a list of user statuses by id from the server. ##### Permissions Must be authenticated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatusApi;


StatusApi apiInstance = new StatusApi();
try {
    List<Status> result = apiInstance.usersStatusIdsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#usersStatusIdsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Status&gt;**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdStatusGet"></a>
# **usersUserIdStatusGet**
> Status usersUserIdStatusGet(userId)

Get user status

Get user status by id from the server. ##### Permissions Must be authenticated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatusApi;


StatusApi apiInstance = new StatusApi();
String userId = "userId_example"; // String | User ID
try {
    Status result = apiInstance.usersUserIdStatusGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#usersUserIdStatusGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdStatusPut"></a>
# **usersUserIdStatusPut**
> Status usersUserIdStatusPut(userId, body)

Update user status

Manually set a user&#39;s status. When setting a user&#39;s status, the status will remain that value until set \&quot;online\&quot; again, which will return the status to being automatically updated based on user activity. ##### Permissions Must have &#x60;edit_other_users&#x60; permission for the team. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatusApi;


StatusApi apiInstance = new StatusApi();
String userId = "userId_example"; // String | User ID
Body16 body = new Body16(); // Body16 | Status object that is to be updated
try {
    Status result = apiInstance.usersUserIdStatusPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#usersUserIdStatusPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**Body16**](Body16.md)| Status object that is to be updated |

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

