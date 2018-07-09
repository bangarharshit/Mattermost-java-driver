# BrandApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandImageGet**](BrandApi.md#brandImageGet) | **GET** brand/image | Get brand image
[**brandImagePost**](BrandApi.md#brandImagePost) | **POST** brand/image | Upload brand image


<a name="brandImageGet"></a>
# **brandImageGet**
> String brandImageGet()

Get brand image

Get the previously uploaded brand image. Returns 404 if no brand image has been uploaded. ##### Permissions No permission required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BrandApi;


BrandApi apiInstance = new BrandApi();
try {
    String result = apiInstance.brandImageGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#brandImageGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="brandImagePost"></a>
# **brandImagePost**
> StatusOK brandImagePost(image)

Upload brand image

Uploads a brand image. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BrandApi;


BrandApi apiInstance = new BrandApi();
File image = new File("/path/to/file.txt"); // File | The image to be uploaded
try {
    StatusOK result = apiInstance.brandImagePost(image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#brandImagePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| The image to be uploaded |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

