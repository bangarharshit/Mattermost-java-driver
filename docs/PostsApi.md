# PostsApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**channelsChannelIdPostsGet**](PostsApi.md#channelsChannelIdPostsGet) | **GET** channels/{channel_id}/posts | Get posts for a channel
[**postsPost**](PostsApi.md#postsPost) | **POST** posts | Create a post
[**postsPostIdActionsActionIdPost**](PostsApi.md#postsPostIdActionsActionIdPost) | **POST** posts/{post_id}/actions/{action_id} | Perform a post action
[**postsPostIdDelete**](PostsApi.md#postsPostIdDelete) | **DELETE** posts/{post_id} | Delete a post
[**postsPostIdFilesInfoGet**](PostsApi.md#postsPostIdFilesInfoGet) | **GET** posts/{post_id}/files/info | Get file info for post
[**postsPostIdGet**](PostsApi.md#postsPostIdGet) | **GET** posts/{post_id} | Get a post
[**postsPostIdPatchPut**](PostsApi.md#postsPostIdPatchPut) | **PUT** posts/{post_id}/patch | Patch a post
[**postsPostIdPinPost**](PostsApi.md#postsPostIdPinPost) | **POST** posts/{post_id}/pin | Pin a post to the channel
[**postsPostIdPut**](PostsApi.md#postsPostIdPut) | **PUT** posts/{post_id} | Update a post
[**postsPostIdThreadGet**](PostsApi.md#postsPostIdThreadGet) | **GET** posts/{post_id}/thread | Get a thread
[**postsPostIdUnpinPost**](PostsApi.md#postsPostIdUnpinPost) | **POST** posts/{post_id}/unpin | Unpin a post to the channel
[**teamsTeamIdPostsSearchPost**](PostsApi.md#teamsTeamIdPostsSearchPost) | **POST** teams/{team_id}/posts/search | Search for team posts
[**usersUserIdPostsFlaggedGet**](PostsApi.md#usersUserIdPostsFlaggedGet) | **GET** users/{user_id}/posts/flagged | Get a list of flagged posts


<a name="channelsChannelIdPostsGet"></a>
# **channelsChannelIdPostsGet**
> PostList channelsChannelIdPostsGet(channelId, page, perPage, since, before, after)

Get posts for a channel

Get a page of posts in a channel. Use the query parameters to modify the behaviour of this endpoint. The parameters &#x60;since&#x60;, &#x60;before&#x60; and &#x60;after&#x60; must not be used together. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String channelId = "channelId_example"; // String | The channel ID to get the posts for
String page = "0"; // String | The page to select
String perPage = "60"; // String | The number of posts per page
Integer since = 56; // Integer | Provide a non-zero value in Unix time milliseconds to select posts created after that time
String before = "before_example"; // String | A post id to select the posts that came before this one
String after = "after_example"; // String | A post id to select the posts that came after this one
try {
    PostList result = apiInstance.channelsChannelIdPostsGet(channelId, page, perPage, since, before, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#channelsChannelIdPostsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| The channel ID to get the posts for |
 **page** | **String**| The page to select | [optional] [default to 0]
 **perPage** | **String**| The number of posts per page | [optional] [default to 60]
 **since** | **Integer**| Provide a non-zero value in Unix time milliseconds to select posts created after that time | [optional]
 **before** | **String**| A post id to select the posts that came before this one | [optional]
 **after** | **String**| A post id to select the posts that came after this one | [optional]

### Return type

[**PostList**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPost"></a>
# **postsPost**
> Post postsPost(post)

Create a post

Create a new post in a channel. To create the post as a comment on another post, provide &#x60;root_id&#x60;. ##### Permissions Must have &#x60;create_post&#x60; permission for the channel the post is being created in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
Post post = new Post(); // Post | Post object to create
try {
    Post result = apiInstance.postsPost(post);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | [**Post**](Post.md)| Post object to create |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdActionsActionIdPost"></a>
# **postsPostIdActionsActionIdPost**
> StatusOK postsPostIdActionsActionIdPost(postId, actionId)

Perform a post action

Perform a post action, which allows users to interact with integrations through posts. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String postId = "postId_example"; // String | Post GUID
String actionId = "actionId_example"; // String | Action GUID
try {
    StatusOK result = apiInstance.postsPostIdActionsActionIdPost(postId, actionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsPostIdActionsActionIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **String**| Post GUID |
 **actionId** | **String**| Action GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdDelete"></a>
# **postsPostIdDelete**
> StatusOK postsPostIdDelete(postId)

Delete a post

Soft deletes a post, by marking the post as deleted in the database. Soft deleted posts will not be returned in post queries. ##### Permissions Must be logged in as the user or have &#x60;delete_others_posts&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String postId = "postId_example"; // String | ID of the post to delete
try {
    StatusOK result = apiInstance.postsPostIdDelete(postId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsPostIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **String**| ID of the post to delete |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdFilesInfoGet"></a>
# **postsPostIdFilesInfoGet**
> List&lt;FileInfo&gt; postsPostIdFilesInfoGet(postId)

Get file info for post

Gets a list of file information objects for the files attached to a post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String postId = "postId_example"; // String | ID of the post
try {
    List<FileInfo> result = apiInstance.postsPostIdFilesInfoGet(postId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsPostIdFilesInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **String**| ID of the post |

### Return type

[**List&lt;FileInfo&gt;**](FileInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdGet"></a>
# **postsPostIdGet**
> Post postsPostIdGet(postId)

Get a post

Get a single post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String postId = "postId_example"; // String | ID of the post to get
try {
    Post result = apiInstance.postsPostIdGet(postId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsPostIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **String**| ID of the post to get |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdPatchPut"></a>
# **postsPostIdPatchPut**
> Post postsPostIdPatchPut(postId, body)

Patch a post

Partially update a post by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;edit_post&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String postId = "postId_example"; // String | Post GUID
Body29 body = new Body29(); // Body29 | Post object that is to be updated
try {
    Post result = apiInstance.postsPostIdPatchPut(postId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsPostIdPatchPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **String**| Post GUID |
 **body** | [**Body29**](Body29.md)| Post object that is to be updated |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdPinPost"></a>
# **postsPostIdPinPost**
> StatusOK postsPostIdPinPost(postId)

Pin a post to the channel

Pin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String postId = "postId_example"; // String | Post GUID
try {
    StatusOK result = apiInstance.postsPostIdPinPost(postId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsPostIdPinPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **String**| Post GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdPut"></a>
# **postsPostIdPut**
> Post postsPostIdPut(postId, body)

Update a post

Update a post. Only the fields listed below are updatable, omitted fields will be treated as blank. ##### Permissions Must have &#x60;edit_post&#x60; permission for the channel the post is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String postId = "postId_example"; // String | ID of the post to update
Body28 body = new Body28(); // Body28 | Post object that is to be updated
try {
    Post result = apiInstance.postsPostIdPut(postId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsPostIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **String**| ID of the post to update |
 **body** | [**Body28**](Body28.md)| Post object that is to be updated |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdThreadGet"></a>
# **postsPostIdThreadGet**
> PostList postsPostIdThreadGet(postId)

Get a thread

Get a post and the rest of the posts in the same thread. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String postId = "postId_example"; // String | ID of a post in the thread
try {
    PostList result = apiInstance.postsPostIdThreadGet(postId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsPostIdThreadGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **String**| ID of a post in the thread |

### Return type

[**PostList**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdUnpinPost"></a>
# **postsPostIdUnpinPost**
> StatusOK postsPostIdUnpinPost(postId)

Unpin a post to the channel

Unpin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String postId = "postId_example"; // String | Post GUID
try {
    StatusOK result = apiInstance.postsPostIdUnpinPost(postId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsPostIdUnpinPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **String**| Post GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdPostsSearchPost"></a>
# **teamsTeamIdPostsSearchPost**
> PostList teamsTeamIdPostsSearchPost(teamId, body)

Search for team posts

Search posts in the team and from the provided terms string. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String teamId = "teamId_example"; // String | Team GUID
Body30 body = new Body30(); // Body30 | The search terms and logic to use in the search.
try {
    PostList result = apiInstance.teamsTeamIdPostsSearchPost(teamId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#teamsTeamIdPostsSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **body** | [**Body30**](Body30.md)| The search terms and logic to use in the search. |

### Return type

[**PostList**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPostsFlaggedGet"></a>
# **usersUserIdPostsFlaggedGet**
> List&lt;PostList&gt; usersUserIdPostsFlaggedGet(userId, teamId, channelId, page, perPage)

Get a list of flagged posts

Get a page of flagged posts of a user provided user id string. Selects from a channel, team or all flagged posts by a user. ##### Permissions Must be user or have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
String userId = "userId_example"; // String | ID of the user
String teamId = "teamId_example"; // String | Team ID
String channelId = "channelId_example"; // String | Channel ID
String page = "0"; // String | The page to select
String perPage = "60"; // String | The number of posts per page
try {
    List<PostList> result = apiInstance.usersUserIdPostsFlaggedGet(userId, teamId, channelId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#usersUserIdPostsFlaggedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ID of the user |
 **teamId** | **String**| Team ID | [optional]
 **channelId** | **String**| Channel ID | [optional]
 **page** | **String**| The page to select | [optional] [default to 0]
 **perPage** | **String**| The number of posts per page | [optional] [default to 60]

### Return type

[**List&lt;PostList&gt;**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

