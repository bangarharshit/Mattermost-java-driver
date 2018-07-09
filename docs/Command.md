
# Command

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the slash command |  [optional]
**token** | **String** | The token which is used to verify the source of the payload |  [optional]
**createAt** | **Integer** | Timestamp when the command was created |  [optional]
**updatedAt** | **Integer** | Timestamp when the command was last updated |  [optional]
**deletedAt** | **Integer** | Timestamp when the command was deleted, 0 if never deleted |  [optional]
**creatorId** | **String** | The user id for the commands creator |  [optional]
**teamId** | **String** | The team id for which this command is configured |  [optional]
**trigger** | **String** | The string that triggers this command |  [optional]
**method** | **String** | Is the trigger done with HTTP Get (&#39;G&#39;) or HTTP Post (&#39;P&#39;) |  [optional]
**username** | **String** | What is the username for the response post |  [optional]
**iconUrl** | **String** | The url to find the icon for this users avatar |  [optional]
**autoComplete** | **Boolean** | Use auto complete for this command |  [optional]
**autoCompleteDesc** | **String** | The description for this command shown when selecting the command |  [optional]
**autoCompleteHint** | **String** | The hint for this command |  [optional]
**displayName** | **String** | Display name for the command |  [optional]
**description** | **String** | Description for this command |  [optional]
**url** | **String** | The URL that is triggered |  [optional]



