package io.swagger.client.api;

import io.swagger.client.ApiClient;
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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelsApi
 */
public class ChannelsApiTest {

    private ChannelsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ChannelsApi.class);
    }

    /**
     * Delete a channel
     *
     * Delete a channel based from provided channel id string. ##### Permissions &#x60;delete_public_channel&#x60; permission if the channel is public, &#x60;delete_private_channel&#x60; permission if the channel is private, or have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void channelsChannelIdDeleteTest() {
        String channelId = null;
        // StatusOK response = api.channelsChannelIdDelete(channelId);

        // TODO: test validations
    }
    /**
     * Get a channel
     *
     * Get channel from the provided channel id string. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     */
    @Test
    public void channelsChannelIdGetTest() {
        String channelId = null;
        // Channel response = api.channelsChannelIdGet(channelId);

        // TODO: test validations
    }
    /**
     * Get channel members
     *
     * Get a page of members for a channel. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     */
    @Test
    public void channelsChannelIdMembersGetTest() {
        String channelId = null;
        String page = null;
        String perPage = null;
        // List<ChannelMember> response = api.channelsChannelIdMembersGet(channelId, page, perPage);

        // TODO: test validations
    }
    /**
     * Get channel members by ids
     *
     * Get a list of channel members based on the provided user ids. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 
     */
    @Test
    public void channelsChannelIdMembersIdsPostTest() {
        String channelId = null;
        List<String> userIds = null;
        // List<ChannelMember> response = api.channelsChannelIdMembersIdsPost(channelId, userIds);

        // TODO: test validations
    }
    /**
     * Add user to channel
     *
     * Add a user to a channel by creating a channel member object.
     */
    @Test
    public void channelsChannelIdMembersPostTest() {
        String channelId = null;
        Body26 body = null;
        // ChannelMember response = api.channelsChannelIdMembersPost(channelId, body);

        // TODO: test validations
    }
    /**
     * Remove user from channel
     *
     * Delete a channel member, effectively removing them from a channel. ##### Permissions &#x60;manage_public_channel_members&#x60; permission if the channel is public. &#x60;manage_private_channel_members&#x60; permission if the channel is private. 
     */
    @Test
    public void channelsChannelIdMembersUserIdDeleteTest() {
        String channelId = null;
        String userId = null;
        // StatusOK response = api.channelsChannelIdMembersUserIdDelete(channelId, userId);

        // TODO: test validations
    }
    /**
     * Get channel member
     *
     * Get a channel member. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     */
    @Test
    public void channelsChannelIdMembersUserIdGetTest() {
        String channelId = null;
        String userId = null;
        // ChannelMember response = api.channelsChannelIdMembersUserIdGet(channelId, userId);

        // TODO: test validations
    }
    /**
     * Update channel notifications
     *
     * Update a user&#39;s notification properties for a channel. Only the provided fields are updated. ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void channelsChannelIdMembersUserIdNotifyPropsPutTest() {
        String channelId = null;
        String userId = null;
        ChannelNotifyProps notifyProps = null;
        // StatusOK response = api.channelsChannelIdMembersUserIdNotifyPropsPut(channelId, userId, notifyProps);

        // TODO: test validations
    }
    /**
     * Update channel roles
     *
     * Update a user&#39;s roles for a channel. ##### Permissions Must have &#x60;manage_channel_roles&#x60; permission for the channel. 
     */
    @Test
    public void channelsChannelIdMembersUserIdRolesPutTest() {
        String channelId = null;
        String userId = null;
        Roles1 roles = null;
        // StatusOK response = api.channelsChannelIdMembersUserIdRolesPut(channelId, userId, roles);

        // TODO: test validations
    }
    /**
     * Patch a channel
     *
     * Partially update a channel by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 
     */
    @Test
    public void channelsChannelIdPatchPutTest() {
        String channelId = null;
        Body24 body = null;
        // Channel response = api.channelsChannelIdPatchPut(channelId, body);

        // TODO: test validations
    }
    /**
     * Get a channel&#39;s pinned posts
     *
     * Get a list of pinned posts for channel.
     */
    @Test
    public void channelsChannelIdPinnedGetTest() {
        String channelId = null;
        // PostList response = api.channelsChannelIdPinnedGet(channelId);

        // TODO: test validations
    }
    /**
     * Update a channel
     *
     * Update a channel. The fields that can be updated are listed as paramters. Omitted fields will be treated as blanks. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 
     */
    @Test
    public void channelsChannelIdPutTest() {
        String channelId = null;
        Body23 body = null;
        // Channel response = api.channelsChannelIdPut(channelId, body);

        // TODO: test validations
    }
    /**
     * Restore a channel
     *
     * Restore channel from the provided channel id string.  __Minimum server version__: 3.10  ##### Permissions &#x60;manage_team&#x60; permission for the team of channel. 
     */
    @Test
    public void channelsChannelIdRestorePostTest() {
        String channelId = null;
        // Channel response = api.channelsChannelIdRestorePost(channelId);

        // TODO: test validations
    }
    /**
     * Get channel statistics
     *
     * Get statistics for a channel. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 
     */
    @Test
    public void channelsChannelIdStatsGetTest() {
        String channelId = null;
        // ChannelStats response = api.channelsChannelIdStatsGet(channelId);

        // TODO: test validations
    }
    /**
     * Create a direct message channel
     *
     * Create a new direct message channel between two users. ##### Permissions Must be one of the two users and have &#x60;create_direct_channel&#x60; permission. Having the &#x60;manage_system&#x60; permission voids the previous requirements. 
     */
    @Test
    public void channelsDirectPostTest() {
        List<String> body = null;
        // Channel response = api.channelsDirectPost(body);

        // TODO: test validations
    }
    /**
     * Create a group message channel
     *
     * Create a new group message channel to group of users. If the logged in user&#39;s id is not included in the list, it will be appended to the end. ##### Permissions Must have &#x60;create_group_channel&#x60; permission. 
     */
    @Test
    public void channelsGroupPostTest() {
        List<String> body = null;
        // Channel response = api.channelsGroupPost(body);

        // TODO: test validations
    }
    /**
     * View channel
     *
     * Perform all the actions involved in viewing a channel. This includes marking channels as read, clearing push notifications, and updating the active channel. ##### Permissions Must be logged in as user or have &#x60;edit_other_users&#x60; permission.  __Response only includes &#x60;last_viewed_at_times&#x60; in Mattermost server 4.3 and newer.__ 
     */
    @Test
    public void channelsMembersUserIdViewPostTest() {
        String userId = null;
        Body27 body = null;
        // InlineResponse2005 response = api.channelsMembersUserIdViewPost(userId, body);

        // TODO: test validations
    }
    /**
     * Create a channel
     *
     * Create a new channel. ##### Permissions If creating a public channel, &#x60;create_public_channel&#x60; permission is required. If creating a private channel, &#x60;create_private_channel&#x60; permission is required. 
     */
    @Test
    public void channelsPostTest() {
        Body22 body = null;
        // Channel response = api.channelsPost(body);

        // TODO: test validations
    }
    /**
     * Get a channel by name and team name
     *
     * Gets a channel from the provided team name and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     */
    @Test
    public void teamsNameTeamNameChannelsNameChannelNameGetTest() {
        String teamName = null;
        String channelName = null;
        // Channel response = api.teamsNameTeamNameChannelsNameChannelNameGet(teamName, channelName);

        // TODO: test validations
    }
    /**
     * Autocomplete channels
     *
     * Autocomplete public channels on a team based on the search term provided in the request URL.  __Minimum server version__: 4.7  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 
     */
    @Test
    public void teamsTeamIdChannelsAutocompleteGetTest() {
        String teamId = null;
        String name = null;
        // List<Channel> response = api.teamsTeamIdChannelsAutocompleteGet(teamId, name);

        // TODO: test validations
    }
    /**
     * Get deleted channels
     *
     * Get a page of deleted channels on a team based on query string parameters - team_id, page and per_page.  __Minimum server version__: 3.10  ##### Permissions Must be authenticated and have the &#x60;manage_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdChannelsDeletedGetTest() {
        String teamId = null;
        String page = null;
        String perPage = null;
        // List<Channel> response = api.teamsTeamIdChannelsDeletedGet(teamId, page, perPage);

        // TODO: test validations
    }
    /**
     * Get public channels
     *
     * Get a page of public channels on a team based on query string parameters - page and per_page. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     */
    @Test
    public void teamsTeamIdChannelsGetTest() {
        String teamId = null;
        String page = null;
        String perPage = null;
        // List<Channel> response = api.teamsTeamIdChannelsGet(teamId, page, perPage);

        // TODO: test validations
    }
    /**
     * Get a list of channels by ids
     *
     * Get a list of public channels on a team by id. ##### Permissions &#x60;view_team&#x60; for the team the channels are on. 
     */
    @Test
    public void teamsTeamIdChannelsIdsPostTest() {
        String teamId = null;
        List<String> body = null;
        // List<Channel> response = api.teamsTeamIdChannelsIdsPost(teamId, body);

        // TODO: test validations
    }
    /**
     * Get a channel by name
     *
     * Gets channel from the provided team id and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     */
    @Test
    public void teamsTeamIdChannelsNameChannelNameGetTest() {
        String teamId = null;
        String channelName = null;
        // Channel response = api.teamsTeamIdChannelsNameChannelNameGet(teamId, channelName);

        // TODO: test validations
    }
    /**
     * Search channels
     *
     * Search public channels on a team based on the search term provided in the request body. ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 
     */
    @Test
    public void teamsTeamIdChannelsSearchPostTest() {
        String teamId = null;
        Body25 body = null;
        // List<Channel> response = api.teamsTeamIdChannelsSearchPost(teamId, body);

        // TODO: test validations
    }
    /**
     * Get unread messages
     *
     * Get the total unread messages and mentions for a channel for a user. ##### Permissions Must be logged in as user and have the &#x60;read_channel&#x60; permission, or have &#x60;edit_other_usrs&#x60; permission. 
     */
    @Test
    public void usersUserIdChannelsChannelIdUnreadGetTest() {
        String userId = null;
        String channelId = null;
        // ChannelUnread response = api.usersUserIdChannelsChannelIdUnreadGet(userId, channelId);

        // TODO: test validations
    }
    /**
     * Get channels for user
     *
     * Get all the channels on a team for a user. ##### Permissions Logged in as the user, or have &#x60;edit_other_users&#x60; permission, and &#x60;view_team&#x60; permission for the team. 
     */
    @Test
    public void usersUserIdTeamsTeamIdChannelsGetTest() {
        String userId = null;
        String teamId = null;
        // List<Channel> response = api.usersUserIdTeamsTeamIdChannelsGet(userId, teamId);

        // TODO: test validations
    }
    /**
     * Get channel members for user
     *
     * Get all channel members on a team for a user. ##### Permissions Logged in as the user and &#x60;view_team&#x60; permission for the team. Having &#x60;manage_system&#x60; permission voids the previous requirements. 
     */
    @Test
    public void usersUserIdTeamsTeamIdChannelsMembersGetTest() {
        String userId = null;
        String teamId = null;
        // List<ChannelMember> response = api.usersUserIdTeamsTeamIdChannelsMembersGet(userId, teamId);

        // TODO: test validations
    }
}
