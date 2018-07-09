
# OutgoingWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier for this outgoing webhook |  [optional]
**createAt** | **Integer** |  |  [optional]
**updateAt** | **Integer** |  |  [optional]
**deleteAt** | **Integer** |  |  [optional]
**creatorId** | **String** | The Id of the user who created the webhook |  [optional]
**teamId** | **String** | The ID of the team that the webhook watchs |  [optional]
**channelId** | **String** | The ID of a public channel that the webhook watchs |  [optional]
**description** | **String** | The description for this outgoing webhook |  [optional]
**displayName** | **String** | The display name for this outgoing webhook |  [optional]
**triggerWords** | **List&lt;String&gt;** | List of words for the webhook to trigger on |  [optional]
**triggerWhen** | **Integer** | When to trigger the webhook, &#x60;0&#x60; when a trigger word is present at all and &#x60;1&#x60; if the message starts with a trigger word |  [optional]
**callbackUrls** | **List&lt;String&gt;** | The URLs to POST the payloads to when the webhook is triggered |  [optional]
**contentType** | **String** | The format to POST the data in, either &#x60;application/json&#x60; or &#x60;application/x-www-form-urlencoded&#x60; |  [optional]



