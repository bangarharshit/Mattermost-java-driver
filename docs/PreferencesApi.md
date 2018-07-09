# PreferencesApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersUserIdPreferencesCategoryGet**](PreferencesApi.md#usersUserIdPreferencesCategoryGet) | **GET** users/{user_id}/preferences/{category} | List a user&#39;s preferences by category
[**usersUserIdPreferencesCategoryNamePreferenceNameGet**](PreferencesApi.md#usersUserIdPreferencesCategoryNamePreferenceNameGet) | **GET** users/{user_id}/preferences/{category}/name/{preference_name} | Get a specific user preference
[**usersUserIdPreferencesDeletePost**](PreferencesApi.md#usersUserIdPreferencesDeletePost) | **POST** users/{user_id}/preferences/delete | Delete user&#39;s preferences
[**usersUserIdPreferencesGet**](PreferencesApi.md#usersUserIdPreferencesGet) | **GET** users/{user_id}/preferences | Get the user&#39;s preferences
[**usersUserIdPreferencesPut**](PreferencesApi.md#usersUserIdPreferencesPut) | **PUT** users/{user_id}/preferences | Save the user&#39;s preferences


<a name="usersUserIdPreferencesCategoryGet"></a>
# **usersUserIdPreferencesCategoryGet**
> List&lt;Preference&gt; usersUserIdPreferencesCategoryGet(userId, category)

List a user&#39;s preferences by category

Lists the current user&#39;s stored preferences in the given category. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PreferencesApi;


PreferencesApi apiInstance = new PreferencesApi();
String userId = "userId_example"; // String | User GUID
String category = "category_example"; // String | The category of a group of preferences
try {
    List<Preference> result = apiInstance.usersUserIdPreferencesCategoryGet(userId, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferencesApi#usersUserIdPreferencesCategoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **category** | **String**| The category of a group of preferences |

### Return type

[**List&lt;Preference&gt;**](Preference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPreferencesCategoryNamePreferenceNameGet"></a>
# **usersUserIdPreferencesCategoryNamePreferenceNameGet**
> Preference usersUserIdPreferencesCategoryNamePreferenceNameGet(userId, category, preferenceName)

Get a specific user preference

Gets a single preference for the current user with the given category and name. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PreferencesApi;


PreferencesApi apiInstance = new PreferencesApi();
String userId = "userId_example"; // String | User GUID
String category = "category_example"; // String | The category of a group of preferences
String preferenceName = "preferenceName_example"; // String | The name of the preference
try {
    Preference result = apiInstance.usersUserIdPreferencesCategoryNamePreferenceNameGet(userId, category, preferenceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferencesApi#usersUserIdPreferencesCategoryNamePreferenceNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **category** | **String**| The category of a group of preferences |
 **preferenceName** | **String**| The name of the preference |

### Return type

[**Preference**](Preference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPreferencesDeletePost"></a>
# **usersUserIdPreferencesDeletePost**
> StatusOK usersUserIdPreferencesDeletePost(userId, body)

Delete user&#39;s preferences

Delete a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PreferencesApi;


PreferencesApi apiInstance = new PreferencesApi();
String userId = "userId_example"; // String | User GUID
List<Preference> body = Arrays.asList(new Preference()); // List<Preference> | List of preference object
try {
    StatusOK result = apiInstance.usersUserIdPreferencesDeletePost(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferencesApi#usersUserIdPreferencesDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **body** | [**List&lt;Preference&gt;**](Preference.md)| List of preference object |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPreferencesGet"></a>
# **usersUserIdPreferencesGet**
> List&lt;Preference&gt; usersUserIdPreferencesGet(userId)

Get the user&#39;s preferences

Get a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PreferencesApi;


PreferencesApi apiInstance = new PreferencesApi();
String userId = "userId_example"; // String | User GUID
try {
    List<Preference> result = apiInstance.usersUserIdPreferencesGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferencesApi#usersUserIdPreferencesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |

### Return type

[**List&lt;Preference&gt;**](Preference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPreferencesPut"></a>
# **usersUserIdPreferencesPut**
> StatusOK usersUserIdPreferencesPut(userId, body)

Save the user&#39;s preferences

Save a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PreferencesApi;


PreferencesApi apiInstance = new PreferencesApi();
String userId = "userId_example"; // String | User GUID
List<Preference> body = Arrays.asList(new Preference()); // List<Preference> | List of preference object
try {
    StatusOK result = apiInstance.usersUserIdPreferencesPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferencesApi#usersUserIdPreferencesPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **body** | [**List&lt;Preference&gt;**](Preference.md)| List of preference object |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

