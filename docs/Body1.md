
# Body1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**term** | **String** | The term to match against username, full name, nickname and email | 
**teamId** | **String** | If provided, only search users on this team |  [optional]
**notInTeamId** | **String** | If provided, only search users not on this team |  [optional]
**inChannelId** | **String** | If provided, only search users in this channel |  [optional]
**notInChannelId** | **String** | If provided, only search users not in this channel. Must specifiy &#x60;team_id&#x60; when using this option |  [optional]
**allowInactive** | **Boolean** | When &#x60;true&#x60;, include deactivated users in the results |  [optional]
**withoutTeam** | **Boolean** | Set this to &#x60;true&#x60; if you would like to search for users that are not on a team. This option takes precendence over &#x60;team_id&#x60;, &#x60;in_channel_id&#x60;, and &#x60;not_in_channel_id&#x60;. |  [optional]



