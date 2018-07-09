# TeamsApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamsGet**](TeamsApi.md#teamsGet) | **GET** teams | Get teams
[**teamsInviteInviteIdGet**](TeamsApi.md#teamsInviteInviteIdGet) | **GET** teams/invite/{invite_id} | Get invite info for a team
[**teamsMembersInvitePost**](TeamsApi.md#teamsMembersInvitePost) | **POST** teams/members/invite | Add user to team from invite
[**teamsNameNameExistsGet**](TeamsApi.md#teamsNameNameExistsGet) | **GET** teams/name/{name}/exists | Check if team exists
[**teamsNameNameGet**](TeamsApi.md#teamsNameNameGet) | **GET** teams/name/{name} | Get a team by name
[**teamsPost**](TeamsApi.md#teamsPost) | **POST** teams | Create a team
[**teamsSearchPost**](TeamsApi.md#teamsSearchPost) | **POST** teams/search | Search teams
[**teamsTeamIdDelete**](TeamsApi.md#teamsTeamIdDelete) | **DELETE** teams/{team_id} | Delete a team
[**teamsTeamIdGet**](TeamsApi.md#teamsTeamIdGet) | **GET** teams/{team_id} | Get a team
[**teamsTeamIdImportPost**](TeamsApi.md#teamsTeamIdImportPost) | **POST** teams/{team_id}/import | Import a Team from other application
[**teamsTeamIdInviteEmailPost**](TeamsApi.md#teamsTeamIdInviteEmailPost) | **POST** teams/{team_id}/invite/email | Invite users to the team by email
[**teamsTeamIdMembersBatchPost**](TeamsApi.md#teamsTeamIdMembersBatchPost) | **POST** teams/{team_id}/members/batch | Add multiple users to team
[**teamsTeamIdMembersGet**](TeamsApi.md#teamsTeamIdMembersGet) | **GET** teams/{team_id}/members | Get team members
[**teamsTeamIdMembersIdsPost**](TeamsApi.md#teamsTeamIdMembersIdsPost) | **POST** teams/{team_id}/members/ids | Get team members by ids
[**teamsTeamIdMembersPost**](TeamsApi.md#teamsTeamIdMembersPost) | **POST** teams/{team_id}/members | Add user to team
[**teamsTeamIdMembersUserIdDelete**](TeamsApi.md#teamsTeamIdMembersUserIdDelete) | **DELETE** teams/{team_id}/members/{user_id} | Remove user from team
[**teamsTeamIdMembersUserIdGet**](TeamsApi.md#teamsTeamIdMembersUserIdGet) | **GET** teams/{team_id}/members/{user_id} | Get a team member
[**teamsTeamIdMembersUserIdRolesPut**](TeamsApi.md#teamsTeamIdMembersUserIdRolesPut) | **PUT** teams/{team_id}/members/{user_id}/roles | Update a team member roles
[**teamsTeamIdPatchPut**](TeamsApi.md#teamsTeamIdPatchPut) | **PUT** teams/{team_id}/patch | Patch a team
[**teamsTeamIdPut**](TeamsApi.md#teamsTeamIdPut) | **PUT** teams/{team_id} | Update a team
[**teamsTeamIdStatsGet**](TeamsApi.md#teamsTeamIdStatsGet) | **GET** teams/{team_id}/stats | Get a team stats
[**usersUserIdTeamsGet**](TeamsApi.md#usersUserIdTeamsGet) | **GET** users/{user_id}/teams | Get a user&#39;s teams
[**usersUserIdTeamsMembersGet**](TeamsApi.md#usersUserIdTeamsMembersGet) | **GET** users/{user_id}/teams/members | Get team members for a user
[**usersUserIdTeamsTeamIdUnreadGet**](TeamsApi.md#usersUserIdTeamsTeamIdUnreadGet) | **GET** users/{user_id}/teams/{team_id}/unread | Get unreads for a team
[**usersUserIdTeamsUnreadGet**](TeamsApi.md#usersUserIdTeamsUnreadGet) | **GET** users/{user_id}/teams/unread | Get team unreads for a user


<a name="teamsGet"></a>
# **teamsGet**
> List&lt;Team&gt; teamsGet(page, perPage)

Get teams

For regular users only returns open teams. Users with the \&quot;manage_system\&quot; permission will return teams regardless of type. The result is based on query string parameters - page and per_page. ##### Permissions Must be authenticated. \&quot;manage_system\&quot; permission is required to show all teams.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of teams per page.
try {
    List<Team> result = apiInstance.teamsGet(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of teams per page. | [optional] [default to 60]

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsInviteInviteIdGet"></a>
# **teamsInviteInviteIdGet**
> InlineResponse2004 teamsInviteInviteIdGet(inviteId)

Get invite info for a team

Get the &#x60;name&#x60;, &#x60;display_name&#x60;, &#x60;description&#x60; and &#x60;id&#x60; for a team from the invite id.  __Minimum server version__: 4.0  ##### Permissions No authentication required. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String inviteId = "inviteId_example"; // String | Invite id for a team
try {
    InlineResponse2004 result = apiInstance.teamsInviteInviteIdGet(inviteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsInviteInviteIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | **String**| Invite id for a team |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsMembersInvitePost"></a>
# **teamsMembersInvitePost**
> TeamMember teamsMembersInvitePost(hash, data, inviteId)

Add user to team from invite

Using either an invite id or hash/data pair from an email invite link, add a user to a team. ##### Permissions Must be authenticated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String hash = "hash_example"; // String | Hash value with time, team id and and InviteSaltId
String data = "data_example"; // String | Data with time and team id
String inviteId = "inviteId_example"; // String | Invite id to add user to the team
try {
    TeamMember result = apiInstance.teamsMembersInvitePost(hash, data, inviteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsMembersInvitePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **String**| Hash value with time, team id and and InviteSaltId | [optional]
 **data** | **String**| Data with time and team id | [optional]
 **inviteId** | **String**| Invite id to add user to the team | [optional]

### Return type

[**TeamMember**](TeamMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsNameNameExistsGet"></a>
# **teamsNameNameExistsGet**
> TeamExists teamsNameNameExistsGet(name)

Check if team exists

Check if the team exists based on a team name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String name = "name_example"; // String | Team Name
try {
    TeamExists result = apiInstance.teamsNameNameExistsGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsNameNameExistsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Team Name |

### Return type

[**TeamExists**](TeamExists.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsNameNameGet"></a>
# **teamsNameNameGet**
> Team teamsNameNameGet(name)

Get a team by name

Get a team based on provided name string ##### Permissions Must be authenticated, team type is open and have the &#x60;view_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String name = "name_example"; // String | Team Name
try {
    Team result = apiInstance.teamsNameNameGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsNameNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Team Name |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsPost"></a>
# **teamsPost**
> Team teamsPost(body)

Create a team

Create a new team on the system. ##### Permissions Must be authenticated and have the &#x60;create_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
Body17 body = new Body17(); // Body17 | Team that is to be created
try {
    Team result = apiInstance.teamsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body17**](Body17.md)| Team that is to be created |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsSearchPost"></a>
# **teamsSearchPost**
> List&lt;Team&gt; teamsSearchPost(body)

Search teams

Search teams based on search term provided in the request body. ##### Permissions Logged in user only shows open teams Logged in user with \&quot;manage_system\&quot; permission shows all teams 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
Body20 body = new Body20(); // Body20 | Search criteria
try {
    List<Team> result = apiInstance.teamsSearchPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body20**](Body20.md)| Search criteria |

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdDelete"></a>
# **teamsTeamIdDelete**
> StatusOK teamsTeamIdDelete(teamId, permanent)

Delete a team

Delete a team softly and put in archived only. ##### Permissions Must have the &#x60;manage_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
Boolean permanent = false; // Boolean | Permanently delete the team, to be used for compliance reasons only.
try {
    StatusOK result = apiInstance.teamsTeamIdDelete(teamId, permanent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **permanent** | **Boolean**| Permanently delete the team, to be used for compliance reasons only. | [optional] [default to false]

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdGet"></a>
# **teamsTeamIdGet**
> Team teamsTeamIdGet(teamId)

Get a team

Get a team on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
try {
    Team result = apiInstance.teamsTeamIdGet(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdImportPost"></a>
# **teamsTeamIdImportPost**
> InlineResponse2003 teamsTeamIdImportPost(file, filesize, importFrom, teamId)

Import a Team from other application

Import a team into a existing team. Import users, channels, posts, hooks. ##### Permissions Must have &#x60;permission_import_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
File file = new File("/path/to/file.txt"); // File | A file to be uploaded in zip format.
Integer filesize = 56; // Integer | The size of the zip file to be imported.
String importFrom = "importFrom_example"; // String | String that defines from which application the team was exported to be imported into Mattermost.
String teamId = "teamId_example"; // String | Team GUID
try {
    InlineResponse2003 result = apiInstance.teamsTeamIdImportPost(file, filesize, importFrom, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdImportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| A file to be uploaded in zip format. |
 **filesize** | **Integer**| The size of the zip file to be imported. |
 **importFrom** | **String**| String that defines from which application the team was exported to be imported into Mattermost. |
 **teamId** | **String**| Team GUID |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="teamsTeamIdInviteEmailPost"></a>
# **teamsTeamIdInviteEmailPost**
> StatusOK teamsTeamIdInviteEmailPost(teamId, body)

Invite users to the team by email

Invite users to the existing team usign the user&#39;s email. ##### Permissions Must have &#x60;invite_to_team&#x60; permission for the team. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of user's email
try {
    StatusOK result = apiInstance.teamsTeamIdInviteEmailPost(teamId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdInviteEmailPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **body** | **List&lt;String&gt;**| List of user&#39;s email |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdMembersBatchPost"></a>
# **teamsTeamIdMembersBatchPost**
> List&lt;TeamMember&gt; teamsTeamIdMembersBatchPost(teamId, body)

Add multiple users to team

Add a number of users to the team by user_id. ##### Permissions Must be authenticated. Authenticated user must have the &#x60;add_user_to_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
List<TeamMember> body = Arrays.asList(new TeamMember()); // List<TeamMember> | 
try {
    List<TeamMember> result = apiInstance.teamsTeamIdMembersBatchPost(teamId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdMembersBatchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **body** | [**List&lt;TeamMember&gt;**](TeamMember.md)|  |

### Return type

[**List&lt;TeamMember&gt;**](TeamMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdMembersGet"></a>
# **teamsTeamIdMembersGet**
> List&lt;TeamMember&gt; teamsTeamIdMembersGet(teamId, page, perPage)

Get team members

Get a page team members list based on query string parameters - team id, page and per page. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of users per page.
try {
    List<TeamMember> result = apiInstance.teamsTeamIdMembersGet(teamId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdMembersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of users per page. | [optional] [default to 60]

### Return type

[**List&lt;TeamMember&gt;**](TeamMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdMembersIdsPost"></a>
# **teamsTeamIdMembersIdsPost**
> List&lt;TeamMember&gt; teamsTeamIdMembersIdsPost(teamId, body)

Get team members by ids

Get a list of team members based on a provided array of user ids. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of user ids
try {
    List<TeamMember> result = apiInstance.teamsTeamIdMembersIdsPost(teamId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdMembersIdsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **body** | **List&lt;String&gt;**| List of user ids |

### Return type

[**List&lt;TeamMember&gt;**](TeamMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdMembersPost"></a>
# **teamsTeamIdMembersPost**
> TeamMember teamsTeamIdMembersPost(teamId, body)

Add user to team

Add user to the team by user_id. ##### Permissions Must be authenticated and team be open to add self. For adding another user, authenticated user must have the &#x60;add_user_to_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
TeamMember body = new TeamMember(); // TeamMember | 
try {
    TeamMember result = apiInstance.teamsTeamIdMembersPost(teamId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdMembersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **body** | [**TeamMember**](TeamMember.md)|  |

### Return type

[**TeamMember**](TeamMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdMembersUserIdDelete"></a>
# **teamsTeamIdMembersUserIdDelete**
> StatusOK teamsTeamIdMembersUserIdDelete(teamId, userId)

Remove user from team

Delete the team member object for a user, effectively removing them from a team. ##### Permissions Must be logged in as the user or have the &#x60;remove_user_from_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
String userId = "userId_example"; // String | User GUID
try {
    StatusOK result = apiInstance.teamsTeamIdMembersUserIdDelete(teamId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdMembersUserIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **userId** | **String**| User GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdMembersUserIdGet"></a>
# **teamsTeamIdMembersUserIdGet**
> TeamMember teamsTeamIdMembersUserIdGet(teamId, userId)

Get a team member

Get a team member on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
String userId = "userId_example"; // String | User GUID
try {
    TeamMember result = apiInstance.teamsTeamIdMembersUserIdGet(teamId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdMembersUserIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **userId** | **String**| User GUID |

### Return type

[**TeamMember**](TeamMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdMembersUserIdRolesPut"></a>
# **teamsTeamIdMembersUserIdRolesPut**
> StatusOK teamsTeamIdMembersUserIdRolesPut(teamId, userId, body)

Update a team member roles

Update a team member roles. Valid team roles are \&quot;team_user\&quot;, \&quot;team_admin\&quot; or both of them. Overwrites any previously assigned team roles. ##### Permissions Must be authenticated and have the &#x60;manage_team_roles&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
String userId = "userId_example"; // String | User GUID
Body21 body = new Body21(); // Body21 | Space-delimited team roles to assign to the user
try {
    StatusOK result = apiInstance.teamsTeamIdMembersUserIdRolesPut(teamId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdMembersUserIdRolesPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **userId** | **String**| User GUID |
 **body** | [**Body21**](Body21.md)| Space-delimited team roles to assign to the user |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdPatchPut"></a>
# **teamsTeamIdPatchPut**
> Team teamsTeamIdPatchPut(teamId, body)

Patch a team

Partially update a team by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;manage_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
Body19 body = new Body19(); // Body19 | Team object that is to be updated
try {
    Team result = apiInstance.teamsTeamIdPatchPut(teamId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdPatchPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **body** | [**Body19**](Body19.md)| Team object that is to be updated |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdPut"></a>
# **teamsTeamIdPut**
> Team teamsTeamIdPut(teamId, body)

Update a team

Update a team by providing the team object. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;manage_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
Body18 body = new Body18(); // Body18 | Team to update
try {
    Team result = apiInstance.teamsTeamIdPut(teamId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |
 **body** | [**Body18**](Body18.md)| Team to update |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdStatsGet"></a>
# **teamsTeamIdStatsGet**
> TeamStats teamsTeamIdStatsGet(teamId)

Get a team stats

Get a team stats on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team GUID
try {
    TeamStats result = apiInstance.teamsTeamIdStatsGet(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsTeamIdStatsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |

### Return type

[**TeamStats**](TeamStats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdTeamsGet"></a>
# **usersUserIdTeamsGet**
> List&lt;Team&gt; usersUserIdTeamsGet(userId)

Get a user&#39;s teams

Get a list of teams that a user is on. ##### Permissions Must be authenticated as the user or have the &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String userId = "userId_example"; // String | User GUID
try {
    List<Team> result = apiInstance.usersUserIdTeamsGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#usersUserIdTeamsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdTeamsMembersGet"></a>
# **usersUserIdTeamsMembersGet**
> List&lt;TeamMember&gt; usersUserIdTeamsMembersGet(userId)

Get team members for a user

Get a list of team members for a user. Useful for getting the ids of teams the user is on and the roles they have in those teams. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String userId = "userId_example"; // String | User GUID
try {
    List<TeamMember> result = apiInstance.usersUserIdTeamsMembersGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#usersUserIdTeamsMembersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |

### Return type

[**List&lt;TeamMember&gt;**](TeamMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdTeamsTeamIdUnreadGet"></a>
# **usersUserIdTeamsTeamIdUnreadGet**
> TeamUnread usersUserIdTeamsTeamIdUnreadGet(userId, teamId)

Get unreads for a team

Get the unread mention and message counts for a team for the specified user. ##### Permissions Must be the user or have &#x60;edit_other_users&#x60; permission and have &#x60;view_team&#x60; permission for the team. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String userId = "userId_example"; // String | User GUID
String teamId = "teamId_example"; // String | Team GUID
try {
    TeamUnread result = apiInstance.usersUserIdTeamsTeamIdUnreadGet(userId, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#usersUserIdTeamsTeamIdUnreadGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **teamId** | **String**| Team GUID |

### Return type

[**TeamUnread**](TeamUnread.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdTeamsUnreadGet"></a>
# **usersUserIdTeamsUnreadGet**
> List&lt;TeamUnread&gt; usersUserIdTeamsUnreadGet(userId, excludeTeam)

Get team unreads for a user

Get the count for unread messages and mentions in the teams the user is a member of. ##### Permissions Must be logged in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String userId = "userId_example"; // String | User GUID
String excludeTeam = "excludeTeam_example"; // String | Optional team id to be excluded from the results
try {
    List<TeamUnread> result = apiInstance.usersUserIdTeamsUnreadGet(userId, excludeTeam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#usersUserIdTeamsUnreadGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User GUID |
 **excludeTeam** | **String**| Optional team id to be excluded from the results |

### Return type

[**List&lt;TeamUnread&gt;**](TeamUnread.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

