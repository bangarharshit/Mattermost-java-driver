# EmojiApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emojiAutocompleteGet**](EmojiApi.md#emojiAutocompleteGet) | **GET** emoji/autocomplete | Autocomplete custom emoji
[**emojiEmojiIdDelete**](EmojiApi.md#emojiEmojiIdDelete) | **DELETE** emoji/{emoji_id} | Delete a custom emoji
[**emojiEmojiIdGet**](EmojiApi.md#emojiEmojiIdGet) | **GET** emoji/{emoji_id} | Get a custom emoji
[**emojiEmojiIdImageGet**](EmojiApi.md#emojiEmojiIdImageGet) | **GET** emoji/{emoji_id}/image | Get custom emoji image
[**emojiGet**](EmojiApi.md#emojiGet) | **GET** emoji | Get a list of custom emoji
[**emojiNameEmojiNameGet**](EmojiApi.md#emojiNameEmojiNameGet) | **GET** emoji/name/{emoji_name} | Get a custom emoji by name
[**emojiPost**](EmojiApi.md#emojiPost) | **POST** emoji | Create a custom emoji
[**emojiSearchPost**](EmojiApi.md#emojiSearchPost) | **POST** emoji/search | Search custom emoji


<a name="emojiAutocompleteGet"></a>
# **emojiAutocompleteGet**
> Emoji emojiAutocompleteGet(name)

Autocomplete custom emoji

Get a list of custom emoji with names starting with or matching the provided name. Returns a maximum of 100 results. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmojiApi;


EmojiApi apiInstance = new EmojiApi();
String name = "name_example"; // String | The emoji name to search.
try {
    Emoji result = apiInstance.emojiAutocompleteGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmojiApi#emojiAutocompleteGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The emoji name to search. |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiEmojiIdDelete"></a>
# **emojiEmojiIdDelete**
> Emoji emojiEmojiIdDelete(emojiId)

Delete a custom emoji

Delete a custom emoji. ##### Permissions Must have the &#x60;manage_team&#x60; or &#x60;manage_system&#x60; permissions or be the user who created the emoji. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmojiApi;


EmojiApi apiInstance = new EmojiApi();
String emojiId = "emojiId_example"; // String | Emoji GUID
try {
    Emoji result = apiInstance.emojiEmojiIdDelete(emojiId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmojiApi#emojiEmojiIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiId** | **String**| Emoji GUID |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiEmojiIdGet"></a>
# **emojiEmojiIdGet**
> Emoji emojiEmojiIdGet(emojiId)

Get a custom emoji

Get some metadata for a custom emoji. ##### Permissions Must be authenticated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmojiApi;


EmojiApi apiInstance = new EmojiApi();
String emojiId = "emojiId_example"; // String | Emoji GUID
try {
    Emoji result = apiInstance.emojiEmojiIdGet(emojiId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmojiApi#emojiEmojiIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiId** | **String**| Emoji GUID |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiEmojiIdImageGet"></a>
# **emojiEmojiIdImageGet**
> Void emojiEmojiIdImageGet(emojiId)

Get custom emoji image

Get the image for a custom emoji. ##### Permissions Must be authenticated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmojiApi;


EmojiApi apiInstance = new EmojiApi();
String emojiId = "emojiId_example"; // String | Emoji GUID
try {
    Void result = apiInstance.emojiEmojiIdImageGet(emojiId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmojiApi#emojiEmojiIdImageGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiId** | **String**| Emoji GUID |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiGet"></a>
# **emojiGet**
> Emoji emojiGet(page, perPage, sort)

Get a list of custom emoji

Get a page of metadata for custom emoji on the system. Since server version 4.7, sort using the &#x60;sort&#x60; query parameter. ##### Permissions Must be authenticated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmojiApi;


EmojiApi apiInstance = new EmojiApi();
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of users per page.
String sort = ""; // String | Either blank for no sorting or \"name\" to sort by emoji names. Minimum server version for sorting is 4.7.
try {
    Emoji result = apiInstance.emojiGet(page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmojiApi#emojiGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of users per page. | [optional] [default to 60]
 **sort** | **String**| Either blank for no sorting or \&quot;name\&quot; to sort by emoji names. Minimum server version for sorting is 4.7. | [optional] [default to ]

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiNameEmojiNameGet"></a>
# **emojiNameEmojiNameGet**
> Emoji emojiNameEmojiNameGet(emojiName)

Get a custom emoji by name

Get some metadata for a custom emoji using its name. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmojiApi;


EmojiApi apiInstance = new EmojiApi();
String emojiName = "emojiName_example"; // String | Emoji name
try {
    Emoji result = apiInstance.emojiNameEmojiNameGet(emojiName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmojiApi#emojiNameEmojiNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiName** | **String**| Emoji name |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiPost"></a>
# **emojiPost**
> Emoji emojiPost(image, emoji)

Create a custom emoji

Create a custom emoji for the team. ##### Permissions Must be authenticated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmojiApi;


EmojiApi apiInstance = new EmojiApi();
File image = new File("/path/to/file.txt"); // File | A file to be uploaded
String emoji = "emoji_example"; // String | A JSON object containing a `name` field with the name of the emoji and a `creator_id` field with the id of the authenticated user.
try {
    Emoji result = apiInstance.emojiPost(image, emoji);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmojiApi#emojiPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| A file to be uploaded |
 **emoji** | **String**| A JSON object containing a &#x60;name&#x60; field with the name of the emoji and a &#x60;creator_id&#x60; field with the id of the authenticated user. |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="emojiSearchPost"></a>
# **emojiSearchPost**
> List&lt;Emoji&gt; emojiSearchPost(body)

Search custom emoji

Search for custom emoji by name based on search criteria provided in the request body. A maximum of 200 results are returned. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmojiApi;


EmojiApi apiInstance = new EmojiApi();
Body33 body = new Body33(); // Body33 | Search criteria
try {
    List<Emoji> result = apiInstance.emojiSearchPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmojiApi#emojiSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body33**](Body33.md)| Search criteria |

### Return type

[**List&lt;Emoji&gt;**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

