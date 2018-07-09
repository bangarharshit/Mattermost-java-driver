# FilesApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filesFileIdGet**](FilesApi.md#filesFileIdGet) | **GET** files/{file_id} | Get a file
[**filesFileIdInfoGet**](FilesApi.md#filesFileIdInfoGet) | **GET** files/{file_id}/info | Get metadata for a file
[**filesFileIdLinkGet**](FilesApi.md#filesFileIdLinkGet) | **GET** files/{file_id}/link | Get a public file link
[**filesFileIdPreviewGet**](FilesApi.md#filesFileIdPreviewGet) | **GET** files/{file_id}/preview | Get a file&#39;s preview
[**filesFileIdThumbnailGet**](FilesApi.md#filesFileIdThumbnailGet) | **GET** files/{file_id}/thumbnail | Get a file&#39;s thumbnail
[**filesPost**](FilesApi.md#filesPost) | **POST** files | Upload a file


<a name="filesFileIdGet"></a>
# **filesFileIdGet**
> Void filesFileIdGet(fileId)

Get a file

Gets a file that has been uploaded previously. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FilesApi;


FilesApi apiInstance = new FilesApi();
String fileId = "fileId_example"; // String | The ID of the file to get
try {
    Void result = apiInstance.filesFileIdGet(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#filesFileIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to get |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesFileIdInfoGet"></a>
# **filesFileIdInfoGet**
> FileInfo filesFileIdInfoGet(fileId)

Get metadata for a file

Gets a file&#39;s info. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FilesApi;


FilesApi apiInstance = new FilesApi();
String fileId = "fileId_example"; // String | The ID of the file info to get
try {
    FileInfo result = apiInstance.filesFileIdInfoGet(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#filesFileIdInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file info to get |

### Return type

[**FileInfo**](FileInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesFileIdLinkGet"></a>
# **filesFileIdLinkGet**
> String filesFileIdLinkGet(fileId)

Get a public file link

Gets a public link for a file that can be accessed without logging into Mattermost.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FilesApi;


FilesApi apiInstance = new FilesApi();
String fileId = "fileId_example"; // String | The ID of the file to get a link for
try {
    String result = apiInstance.filesFileIdLinkGet(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#filesFileIdLinkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to get a link for |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesFileIdPreviewGet"></a>
# **filesFileIdPreviewGet**
> Void filesFileIdPreviewGet(fileId)

Get a file&#39;s preview

Gets a file&#39;s preview. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FilesApi;


FilesApi apiInstance = new FilesApi();
String fileId = "fileId_example"; // String | The ID of the file to get
try {
    Void result = apiInstance.filesFileIdPreviewGet(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#filesFileIdPreviewGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to get |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesFileIdThumbnailGet"></a>
# **filesFileIdThumbnailGet**
> Void filesFileIdThumbnailGet(fileId)

Get a file&#39;s thumbnail

Gets a file&#39;s thumbnail. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FilesApi;


FilesApi apiInstance = new FilesApi();
String fileId = "fileId_example"; // String | The ID of the file to get
try {
    Void result = apiInstance.filesFileIdThumbnailGet(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#filesFileIdThumbnailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to get |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesPost"></a>
# **filesPost**
> InlineResponse2006 filesPost(files, channelId, clientIds, channelId2, filename)

Upload a file

Uploads a file that can later be attached to a post.  This request can either be a multipart/form-data request with a channel_id, files and optional client_ids defined in the FormData, or it can be a request with the channel_id and filename defined as query parameters with the contents of a single file in the body of the request.  Only multipart/form-data requests are supported by server versions up to and including 4.7. Server versions 4.8 and higher support both types of requests.  ##### Permissions Must have &#x60;upload_file&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FilesApi;


FilesApi apiInstance = new FilesApi();
File files = new File("/path/to/file.txt"); // File | A file to be uploaded
String channelId = "channelId_example"; // String | The ID of the channel that this file will be uploaded to
String clientIds = "clientIds_example"; // String | A unique identifier for the file that will be returned in the response
String channelId2 = "channelId_example"; // String | The ID of the channel that this file will be uploaded to
String filename = "filename_example"; // String | The ID of the channel that this file will be uploaded to
try {
    InlineResponse2006 result = apiInstance.filesPost(files, channelId, clientIds, channelId2, filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#filesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **files** | **File**| A file to be uploaded | [optional]
 **channelId** | **String**| The ID of the channel that this file will be uploaded to | [optional]
 **clientIds** | **String**| A unique identifier for the file that will be returned in the response | [optional]
 **channelId2** | **String**| The ID of the channel that this file will be uploaded to | [optional]
 **filename** | **String**| The ID of the channel that this file will be uploaded to | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data, */*
 - **Accept**: application/json

