# JobsApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobsGet**](JobsApi.md#jobsGet) | **GET** jobs | Get the jobs.
[**jobsJobIdCancelPost**](JobsApi.md#jobsJobIdCancelPost) | **POST** jobs/{job_id}/cancel | Cancel a job.
[**jobsJobIdGet**](JobsApi.md#jobsJobIdGet) | **GET** jobs/{job_id} | Get a job.
[**jobsPost**](JobsApi.md#jobsPost) | **POST** jobs | Create a new job.
[**jobsTypeTypeGet**](JobsApi.md#jobsTypeTypeGet) | **GET** jobs/type/{type} | Get the jobs of the given type.


<a name="jobsGet"></a>
# **jobsGet**
> List&lt;Job&gt; jobsGet(page, perPage)

Get the jobs.

Get a page of jobs. Use the query parameters to modify the behaviour of this endpoint. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JobsApi;


JobsApi apiInstance = new JobsApi();
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of jobs per page.
try {
    List<Job> result = apiInstance.jobsGet(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of jobs per page. | [optional] [default to 60]

### Return type

[**List&lt;Job&gt;**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="jobsJobIdCancelPost"></a>
# **jobsJobIdCancelPost**
> StatusOK jobsJobIdCancelPost(jobId)

Cancel a job.

Cancel a job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JobsApi;


JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | Job GUID
try {
    StatusOK result = apiInstance.jobsJobIdCancelPost(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsJobIdCancelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| Job GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="jobsJobIdGet"></a>
# **jobsJobIdGet**
> Job jobsJobIdGet(jobId)

Get a job.

Gets a single job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JobsApi;


JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | Job GUID
try {
    Job result = apiInstance.jobsJobIdGet(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsJobIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| Job GUID |

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="jobsPost"></a>
# **jobsPost**
> Job jobsPost(body)

Create a new job.

Create a new job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JobsApi;


JobsApi apiInstance = new JobsApi();
Body31 body = new Body31(); // Body31 | Job object to be created
try {
    Job result = apiInstance.jobsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body31**](Body31.md)| Job object to be created |

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="jobsTypeTypeGet"></a>
# **jobsTypeTypeGet**
> List&lt;Job&gt; jobsTypeTypeGet(type, page, perPage)

Get the jobs of the given type.

Get a page of jobs of the given type. Use the query parameters to modify the behaviour of this endpoint. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JobsApi;


JobsApi apiInstance = new JobsApi();
String type = "type_example"; // String | Job type
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of jobs per page.
try {
    List<Job> result = apiInstance.jobsTypeTypeGet(type, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsTypeTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Job type |
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of jobs per page. | [optional] [default to 60]

### Return type

[**List&lt;Job&gt;**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

