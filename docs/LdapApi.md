# LdapApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ldapSyncPost**](LdapApi.md#ldapSyncPost) | **POST** ldap/sync | Sync with LDAP
[**ldapTestPost**](LdapApi.md#ldapTestPost) | **POST** ldap/test | Test LDAP configuration


<a name="ldapSyncPost"></a>
# **ldapSyncPost**
> StatusOK ldapSyncPost()

Sync with LDAP

Synchronize any user attribute changes in the configured AD/LDAP server with Mattermost. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LdapApi;


LdapApi apiInstance = new LdapApi();
try {
    StatusOK result = apiInstance.ldapSyncPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapApi#ldapSyncPost");
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

<a name="ldapTestPost"></a>
# **ldapTestPost**
> StatusOK ldapTestPost()

Test LDAP configuration

Test the current AD/LDAP configuration to see if the AD/LDAP server can be contacted successfully. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LdapApi;


LdapApi apiInstance = new LdapApi();
try {
    StatusOK result = apiInstance.ldapTestPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapApi#ldapTestPost");
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

