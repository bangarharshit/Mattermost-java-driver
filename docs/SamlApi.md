# SamlApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**samlCertificateIdpDelete**](SamlApi.md#samlCertificateIdpDelete) | **DELETE** saml/certificate/idp | Remove IDP certificate
[**samlCertificateIdpPost**](SamlApi.md#samlCertificateIdpPost) | **POST** saml/certificate/idp | Upload IDP certificate
[**samlCertificatePrivateDelete**](SamlApi.md#samlCertificatePrivateDelete) | **DELETE** saml/certificate/private | Remove private key
[**samlCertificatePrivatePost**](SamlApi.md#samlCertificatePrivatePost) | **POST** saml/certificate/private | Upload private key
[**samlCertificatePublicDelete**](SamlApi.md#samlCertificatePublicDelete) | **DELETE** saml/certificate/public | Remove public certificate
[**samlCertificatePublicPost**](SamlApi.md#samlCertificatePublicPost) | **POST** saml/certificate/public | Upload public certificate
[**samlCertificateStatusGet**](SamlApi.md#samlCertificateStatusGet) | **GET** saml/certificate/status | Get certificate status
[**samlMetadataGet**](SamlApi.md#samlMetadataGet) | **GET** saml/metadata | Get metadata


<a name="samlCertificateIdpDelete"></a>
# **samlCertificateIdpDelete**
> StatusOK samlCertificateIdpDelete()

Remove IDP certificate

Delete the current IDP certificate being used with your SAML configuration. This will also disable SAML on your system as this certificate is required for SAML. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SamlApi;


SamlApi apiInstance = new SamlApi();
try {
    StatusOK result = apiInstance.samlCertificateIdpDelete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamlApi#samlCertificateIdpDelete");
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

<a name="samlCertificateIdpPost"></a>
# **samlCertificateIdpPost**
> StatusOK samlCertificateIdpPost(certificate)

Upload IDP certificate

Upload the IDP certificate to be used with your SAML configuration. This will also set the filename for the IdpCertificateFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SamlApi;


SamlApi apiInstance = new SamlApi();
File certificate = new File("/path/to/file.txt"); // File | The IDP certificate file
try {
    StatusOK result = apiInstance.samlCertificateIdpPost(certificate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamlApi#samlCertificateIdpPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificate** | **File**| The IDP certificate file |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="samlCertificatePrivateDelete"></a>
# **samlCertificatePrivateDelete**
> StatusOK samlCertificatePrivateDelete()

Remove private key

Delete the current private key being used with your SAML configuration. This will also disable encryption for SAML on your system as this key is required for that. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SamlApi;


SamlApi apiInstance = new SamlApi();
try {
    StatusOK result = apiInstance.samlCertificatePrivateDelete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamlApi#samlCertificatePrivateDelete");
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

<a name="samlCertificatePrivatePost"></a>
# **samlCertificatePrivatePost**
> StatusOK samlCertificatePrivatePost(certificate)

Upload private key

Upload the private key to be used for encryption with your SAML configuration. This will also set the filename for the PrivateKeyFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SamlApi;


SamlApi apiInstance = new SamlApi();
File certificate = new File("/path/to/file.txt"); // File | The private key file
try {
    StatusOK result = apiInstance.samlCertificatePrivatePost(certificate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamlApi#samlCertificatePrivatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificate** | **File**| The private key file |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="samlCertificatePublicDelete"></a>
# **samlCertificatePublicDelete**
> StatusOK samlCertificatePublicDelete()

Remove public certificate

Delete the current public certificate being used with your SAML configuration. This will also disable encryption for SAML on your system as this certificate is required for that. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SamlApi;


SamlApi apiInstance = new SamlApi();
try {
    StatusOK result = apiInstance.samlCertificatePublicDelete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamlApi#samlCertificatePublicDelete");
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

<a name="samlCertificatePublicPost"></a>
# **samlCertificatePublicPost**
> StatusOK samlCertificatePublicPost(certificate)

Upload public certificate

Upload the public certificate to be used for encryption with your SAML configuration. This will also set the filename for the PublicCertificateFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SamlApi;


SamlApi apiInstance = new SamlApi();
File certificate = new File("/path/to/file.txt"); // File | The public certificate file
try {
    StatusOK result = apiInstance.samlCertificatePublicPost(certificate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamlApi#samlCertificatePublicPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificate** | **File**| The public certificate file |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="samlCertificateStatusGet"></a>
# **samlCertificateStatusGet**
> SamlCertificateStatus samlCertificateStatusGet()

Get certificate status

Get the status of the uploaded certificates and keys in use by your SAML configuration. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SamlApi;


SamlApi apiInstance = new SamlApi();
try {
    SamlCertificateStatus result = apiInstance.samlCertificateStatusGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamlApi#samlCertificateStatusGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SamlCertificateStatus**](SamlCertificateStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="samlMetadataGet"></a>
# **samlMetadataGet**
> String samlMetadataGet()

Get metadata

Get SAML metadata from the server. SAML must be configured properly. ##### Permissions No permission required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SamlApi;


SamlApi apiInstance = new SamlApi();
try {
    String result = apiInstance.samlMetadataGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamlApi#samlMetadataGet");
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

