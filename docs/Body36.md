
# Body36

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**teamId** | **String** | The ID of the team that the webhook watchs | 
**channelId** | **String** | The ID of a public channel that the webhook watchs |  [optional]
**description** | **String** | The description for this outgoing webhook |  [optional]
**displayName** | **String** | The display name for this outgoing webhook | 
**triggerWords** | **List&lt;String&gt;** | List of words for the webhook to trigger on | 
**triggerWhen** | **Integer** | When to trigger the webhook, &#x60;0&#x60; when a trigger word is present at all and &#x60;1&#x60; if the message starts with a trigger word |  [optional]
**callbackUrls** | **List&lt;String&gt;** | The URLs to POST the payloads to when the webhook is triggered | 
**contentType** | **String** | The format to POST the data in, either &#x60;application/json&#x60; or &#x60;application/x-www-form-urlencoded&#x60; |  [optional]



