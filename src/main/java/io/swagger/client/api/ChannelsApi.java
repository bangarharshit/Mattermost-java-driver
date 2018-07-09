package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Body22;
import io.swagger.client.model.Body23;
import io.swagger.client.model.Body24;
import io.swagger.client.model.Body25;
import io.swagger.client.model.Body26;
import io.swagger.client.model.Body27;
import io.swagger.client.model.Channel;
import io.swagger.client.model.ChannelMember;
import io.swagger.client.model.ChannelNotifyProps;
import io.swagger.client.model.ChannelStats;
import io.swagger.client.model.ChannelUnread;
import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.PostList;
import io.swagger.client.model.Roles1;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ChannelsApi {
  /**
   * Delete a channel
   * Delete a channel based from provided channel id string. ##### Permissions &#x60;delete_public_channel&#x60; permission if the channel is public, &#x60;delete_private_channel&#x60; permission if the channel is private, or have &#x60;manage_system&#x60; permission. 
   * @param channelId Channel GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("channels/{channel_id}")
  Observable<StatusOK> channelsChannelIdDelete(
    @retrofit2.http.Path("channel_id") String channelId
  );

  /**
   * Get a channel
   * Get channel from the provided channel id string. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
   * @param channelId Channel GUID (required)
   * @return Call&lt;Channel&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("channels/{channel_id}")
  Observable<Channel> channelsChannelIdGet(
    @retrofit2.http.Path("channel_id") String channelId
  );

  /**
   * Get channel members
   * Get a page of members for a channel. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
   * @param channelId Channel GUID (required)
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of members per page. (optional, default to 60)
   * @return Call&lt;List&lt;ChannelMember&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("channels/{channel_id}/members")
  Observable<List<ChannelMember>> channelsChannelIdMembersGet(
    @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

  /**
   * Get channel members by ids
   * Get a list of channel members based on the provided user ids. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 
   * @param channelId Channel GUID (required)
   * @param userIds List of user ids (required)
   * @return Call&lt;List&lt;ChannelMember&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("channels/{channel_id}/members/ids")
  Observable<List<ChannelMember>> channelsChannelIdMembersIdsPost(
    @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Body List<String> userIds
  );

  /**
   * Add user to channel
   * Add a user to a channel by creating a channel member object.
   * @param channelId The channel ID (required)
   * @param body  (required)
   * @return Call&lt;ChannelMember&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("channels/{channel_id}/members")
  Observable<ChannelMember> channelsChannelIdMembersPost(
    @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Body Body26 body
  );

  /**
   * Remove user from channel
   * Delete a channel member, effectively removing them from a channel. ##### Permissions &#x60;manage_public_channel_members&#x60; permission if the channel is public. &#x60;manage_private_channel_members&#x60; permission if the channel is private. 
   * @param channelId Channel GUID (required)
   * @param userId User GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("channels/{channel_id}/members/{user_id}")
  Observable<StatusOK> channelsChannelIdMembersUserIdDelete(
    @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Get channel member
   * Get a channel member. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
   * @param channelId Channel GUID (required)
   * @param userId User GUID (required)
   * @return Call&lt;ChannelMember&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("channels/{channel_id}/members/{user_id}")
  Observable<ChannelMember> channelsChannelIdMembersUserIdGet(
    @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Update channel notifications
   * Update a user&#39;s notification properties for a channel. Only the provided fields are updated. ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
   * @param channelId Channel GUID (required)
   * @param userId User GUID (required)
   * @param notifyProps  (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("channels/{channel_id}/members/{user_id}/notify_props")
  Observable<StatusOK> channelsChannelIdMembersUserIdNotifyPropsPut(
    @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body ChannelNotifyProps notifyProps
  );

  /**
   * Update channel roles
   * Update a user&#39;s roles for a channel. ##### Permissions Must have &#x60;manage_channel_roles&#x60; permission for the channel. 
   * @param channelId Channel GUID (required)
   * @param userId User GUID (required)
   * @param roles Space-delimited channel roles to assign to the user (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("channels/{channel_id}/members/{user_id}/roles")
  Observable<StatusOK> channelsChannelIdMembersUserIdRolesPut(
    @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Roles1 roles
  );

  /**
   * Patch a channel
   * Partially update a channel by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 
   * @param channelId Channel GUID (required)
   * @param body Channel object to be updated (required)
   * @return Call&lt;Channel&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("channels/{channel_id}/patch")
  Observable<Channel> channelsChannelIdPatchPut(
    @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Body Body24 body
  );

  /**
   * Get a channel&#39;s pinned posts
   * Get a list of pinned posts for channel.
   * @param channelId Channel GUID (required)
   * @return Call&lt;PostList&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("channels/{channel_id}/pinned")
  Observable<PostList> channelsChannelIdPinnedGet(
    @retrofit2.http.Path("channel_id") String channelId
  );

  /**
   * Update a channel
   * Update a channel. The fields that can be updated are listed as paramters. Omitted fields will be treated as blanks. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 
   * @param channelId Channel GUID (required)
   * @param body Channel object to be updated (required)
   * @return Call&lt;Channel&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("channels/{channel_id}")
  Observable<Channel> channelsChannelIdPut(
    @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Body Body23 body
  );

  /**
   * Restore a channel
   * Restore channel from the provided channel id string.  __Minimum server version__: 3.10  ##### Permissions &#x60;manage_team&#x60; permission for the team of channel. 
   * @param channelId Channel GUID (required)
   * @return Call&lt;Channel&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("channels/{channel_id}/restore")
  Observable<Channel> channelsChannelIdRestorePost(
    @retrofit2.http.Path("channel_id") String channelId
  );

  /**
   * Get channel statistics
   * Get statistics for a channel. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 
   * @param channelId Channel GUID (required)
   * @return Call&lt;ChannelStats&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("channels/{channel_id}/stats")
  Observable<ChannelStats> channelsChannelIdStatsGet(
    @retrofit2.http.Path("channel_id") String channelId
  );

  /**
   * Create a direct message channel
   * Create a new direct message channel between two users. ##### Permissions Must be one of the two users and have &#x60;create_direct_channel&#x60; permission. Having the &#x60;manage_system&#x60; permission voids the previous requirements. 
   * @param body The two user ids to be in the direct message (required)
   * @return Call&lt;Channel&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("channels/direct")
  Observable<Channel> channelsDirectPost(
    @retrofit2.http.Body List<String> body
  );

  /**
   * Create a group message channel
   * Create a new group message channel to group of users. If the logged in user&#39;s id is not included in the list, it will be appended to the end. ##### Permissions Must have &#x60;create_group_channel&#x60; permission. 
   * @param body User ids to be in the group message channel (required)
   * @return Call&lt;Channel&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("channels/group")
  Observable<Channel> channelsGroupPost(
    @retrofit2.http.Body List<String> body
  );

  /**
   * View channel
   * Perform all the actions involved in viewing a channel. This includes marking channels as read, clearing push notifications, and updating the active channel. ##### Permissions Must be logged in as user or have &#x60;edit_other_users&#x60; permission.  __Response only includes &#x60;last_viewed_at_times&#x60; in Mattermost server 4.3 and newer.__ 
   * @param userId User ID to perform the view action for (required)
   * @param body Paremeters affecting how and which channels to view (required)
   * @return Call&lt;InlineResponse2005&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("channels/members/{user_id}/view")
  Observable<InlineResponse2005> channelsMembersUserIdViewPost(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Body27 body
  );

  /**
   * Create a channel
   * Create a new channel. ##### Permissions If creating a public channel, &#x60;create_public_channel&#x60; permission is required. If creating a private channel, &#x60;create_private_channel&#x60; permission is required. 
   * @param body Channel object to be created (required)
   * @return Call&lt;Channel&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("channels")
  Observable<Channel> channelsPost(
    @retrofit2.http.Body Body22 body
  );

  /**
   * Get a channel by name and team name
   * Gets a channel from the provided team name and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
   * @param teamName Team Name (required)
   * @param channelName Channel Name (required)
   * @return Call&lt;Channel&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/name/{team_name}/channels/name/{channel_name}")
  Observable<Channel> teamsNameTeamNameChannelsNameChannelNameGet(
    @retrofit2.http.Path("team_name") String teamName, @retrofit2.http.Path("channel_name") String channelName
  );

  /**
   * Autocomplete channels
   * Autocomplete public channels on a team based on the search term provided in the request URL.  __Minimum server version__: 4.7  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param name Name or display name (required)
   * @return Call&lt;List&lt;Channel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/{team_id}/channels/autocomplete")
  Observable<List<Channel>> teamsTeamIdChannelsAutocompleteGet(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Query("name") String name
  );

  /**
   * Get deleted channels
   * Get a page of deleted channels on a team based on query string parameters - team_id, page and per_page.  __Minimum server version__: 3.10  ##### Permissions Must be authenticated and have the &#x60;manage_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of public channels per page. (optional, default to 60)
   * @return Call&lt;List&lt;Channel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/{team_id}/channels/deleted")
  Observable<List<Channel>> teamsTeamIdChannelsDeletedGet(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

  /**
   * Get public channels
   * Get a page of public channels on a team based on query string parameters - page and per_page. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of public channels per page. (optional, default to 60)
   * @return Call&lt;List&lt;Channel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/{team_id}/channels")
  Observable<List<Channel>> teamsTeamIdChannelsGet(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

  /**
   * Get a list of channels by ids
   * Get a list of public channels on a team by id. ##### Permissions &#x60;view_team&#x60; for the team the channels are on. 
   * @param teamId Team GUID (required)
   * @param body List of channel ids (required)
   * @return Call&lt;List&lt;Channel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("teams/{team_id}/channels/ids")
  Observable<List<Channel>> teamsTeamIdChannelsIdsPost(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Body List<String> body
  );

  /**
   * Get a channel by name
   * Gets channel from the provided team id and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
   * @param teamId Team GUID (required)
   * @param channelName Channel Name (required)
   * @return Call&lt;Channel&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/{team_id}/channels/name/{channel_name}")
  Observable<Channel> teamsTeamIdChannelsNameChannelNameGet(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Path("channel_name") String channelName
  );

  /**
   * Search channels
   * Search public channels on a team based on the search term provided in the request body. ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param body Search criteria (required)
   * @return Call&lt;List&lt;Channel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("teams/{team_id}/channels/search")
  Observable<List<Channel>> teamsTeamIdChannelsSearchPost(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Body Body25 body
  );

  /**
   * Get unread messages
   * Get the total unread messages and mentions for a channel for a user. ##### Permissions Must be logged in as user and have the &#x60;read_channel&#x60; permission, or have &#x60;edit_other_usrs&#x60; permission. 
   * @param userId User GUID (required)
   * @param channelId Channel GUID (required)
   * @return Call&lt;ChannelUnread&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/channels/{channel_id}/unread")
  Observable<ChannelUnread> usersUserIdChannelsChannelIdUnreadGet(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("channel_id") String channelId
  );

  /**
   * Get channels for user
   * Get all the channels on a team for a user. ##### Permissions Logged in as the user, or have &#x60;edit_other_users&#x60; permission, and &#x60;view_team&#x60; permission for the team. 
   * @param userId User GUID (required)
   * @param teamId Team GUID (required)
   * @return Call&lt;List&lt;Channel&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/teams/{team_id}/channels")
  Observable<List<Channel>> usersUserIdTeamsTeamIdChannelsGet(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("team_id") String teamId
  );

  /**
   * Get channel members for user
   * Get all channel members on a team for a user. ##### Permissions Logged in as the user and &#x60;view_team&#x60; permission for the team. Having &#x60;manage_system&#x60; permission voids the previous requirements. 
   * @param userId User GUID (required)
   * @param teamId Team GUID (required)
   * @return Call&lt;List&lt;ChannelMember&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/teams/{team_id}/channels/members")
  Observable<List<ChannelMember>> usersUserIdTeamsTeamIdChannelsMembersGet(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("team_id") String teamId
  );

}
