# CommandsApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commandsCommandIdDelete**](CommandsApi.md#commandsCommandIdDelete) | **DELETE** commands/{command_id} | Delete a command
[**commandsCommandIdPut**](CommandsApi.md#commandsCommandIdPut) | **PUT** commands/{command_id} | Update a command
[**commandsCommandIdRegenTokenPut**](CommandsApi.md#commandsCommandIdRegenTokenPut) | **PUT** commands/{command_id}/regen_token | Generate a new token
[**commandsExecutePost**](CommandsApi.md#commandsExecutePost) | **POST** commands/execute | Execute a command
[**commandsGet**](CommandsApi.md#commandsGet) | **GET** commands | List commands for a team
[**commandsPost**](CommandsApi.md#commandsPost) | **POST** commands | Create a command
[**teamsTeamIdCommandsAutocompleteGet**](CommandsApi.md#teamsTeamIdCommandsAutocompleteGet) | **GET** teams/{team_id}/commands/autocomplete | List autocomplete commands


<a name="commandsCommandIdDelete"></a>
# **commandsCommandIdDelete**
> StatusOK commandsCommandIdDelete(commandId)

Delete a command

Delete a command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommandsApi;


CommandsApi apiInstance = new CommandsApi();
String commandId = "commandId_example"; // String | ID of the command to delete
try {
    StatusOK result = apiInstance.commandsCommandIdDelete(commandId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandsApi#commandsCommandIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandId** | **String**| ID of the command to delete |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commandsCommandIdPut"></a>
# **commandsCommandIdPut**
> Command commandsCommandIdPut(commandId, body)

Update a command

Update a single command based on command id string and Command struct. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommandsApi;


CommandsApi apiInstance = new CommandsApi();
String commandId = "commandId_example"; // String | ID of the command to update
Command body = new Command(); // Command | 
try {
    Command result = apiInstance.commandsCommandIdPut(commandId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandsApi#commandsCommandIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandId** | **String**| ID of the command to update |
 **body** | [**Command**](Command.md)|  |

### Return type

[**Command**](Command.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commandsCommandIdRegenTokenPut"></a>
# **commandsCommandIdRegenTokenPut**
> InlineResponse2008 commandsCommandIdRegenTokenPut(commandId)

Generate a new token

Generate a new token for the command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommandsApi;


CommandsApi apiInstance = new CommandsApi();
String commandId = "commandId_example"; // String | ID of the command to generate the new token
try {
    InlineResponse2008 result = apiInstance.commandsCommandIdRegenTokenPut(commandId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandsApi#commandsCommandIdRegenTokenPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandId** | **String**| ID of the command to generate the new token |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commandsExecutePost"></a>
# **commandsExecutePost**
> CommandResponse commandsExecutePost(body)

Execute a command

Execute a command on a team. ##### Permissions Must have &#x60;use_slash_commands&#x60; permission for the team the command is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommandsApi;


CommandsApi apiInstance = new CommandsApi();
Body39 body = new Body39(); // Body39 | command to be executed
try {
    CommandResponse result = apiInstance.commandsExecutePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandsApi#commandsExecutePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body39**](Body39.md)| command to be executed |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commandsGet"></a>
# **commandsGet**
> List&lt;Command&gt; commandsGet(teamId, customOnly)

List commands for a team

List commands for a team. ##### Permissions &#x60;manage_slash_commands&#x60; if need list custom commands. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommandsApi;


CommandsApi apiInstance = new CommandsApi();
String teamId = "teamId_example"; // String | The team id.
String customOnly = "false"; // String | To get only the custom commands. If set to false will get the custom if the user have access plus the system commands, otherwise just the system commands. 
try {
    List<Command> result = apiInstance.commandsGet(teamId, customOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandsApi#commandsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team id. | [optional]
 **customOnly** | **String**| To get only the custom commands. If set to false will get the custom if the user have access plus the system commands, otherwise just the system commands.  | [optional] [default to false]

### Return type

[**List&lt;Command&gt;**](Command.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commandsPost"></a>
# **commandsPost**
> Command commandsPost(body)

Create a command

Create a command for a team. ##### Permissions &#x60;manage_slash_commands&#x60; for the team the command is in. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommandsApi;


CommandsApi apiInstance = new CommandsApi();
Body38 body = new Body38(); // Body38 | command to be created
try {
    Command result = apiInstance.commandsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandsApi#commandsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body38**](Body38.md)| command to be created |

### Return type

[**Command**](Command.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdCommandsAutocompleteGet"></a>
# **teamsTeamIdCommandsAutocompleteGet**
> List&lt;Command&gt; teamsTeamIdCommandsAutocompleteGet(teamId)

List autocomplete commands

List autocomplete commands in the team. ##### Permissions &#x60;view_team&#x60; for the team. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommandsApi;


CommandsApi apiInstance = new CommandsApi();
String teamId = "teamId_example"; // String | Team GUID
try {
    List<Command> result = apiInstance.teamsTeamIdCommandsAutocompleteGet(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandsApi#teamsTeamIdCommandsAutocompleteGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| Team GUID |

### Return type

[**List&lt;Command&gt;**](Command.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

