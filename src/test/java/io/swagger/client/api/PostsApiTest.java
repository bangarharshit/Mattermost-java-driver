package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.Body28;
import io.swagger.client.model.Body29;
import io.swagger.client.model.Body30;
import io.swagger.client.model.FileInfo;
import io.swagger.client.model.Post;
import io.swagger.client.model.PostList;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PostsApi
 */
public class PostsApiTest {

    private PostsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PostsApi.class);
    }

    /**
     * Get posts for a channel
     *
     * Get a page of posts in a channel. Use the query parameters to modify the behaviour of this endpoint. The parameters &#x60;since&#x60;, &#x60;before&#x60; and &#x60;after&#x60; must not be used together. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel. 
     */
    @Test
    public void channelsChannelIdPostsGetTest() {
        String channelId = null;
        String page = null;
        String perPage = null;
        Integer since = null;
        String before = null;
        String after = null;
        // PostList response = api.channelsChannelIdPostsGet(channelId, page, perPage, since, before, after);

        // TODO: test validations
    }
    /**
     * Create a post
     *
     * Create a new post in a channel. To create the post as a comment on another post, provide &#x60;root_id&#x60;. ##### Permissions Must have &#x60;create_post&#x60; permission for the channel the post is being created in. 
     */
    @Test
    public void postsPostTest() {
        Post post = null;
        // Post response = api.postsPost(post);

        // TODO: test validations
    }
    /**
     * Perform a post action
     *
     * Perform a post action, which allows users to interact with integrations through posts. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
     */
    @Test
    public void postsPostIdActionsActionIdPostTest() {
        String postId = null;
        String actionId = null;
        // StatusOK response = api.postsPostIdActionsActionIdPost(postId, actionId);

        // TODO: test validations
    }
    /**
     * Delete a post
     *
     * Soft deletes a post, by marking the post as deleted in the database. Soft deleted posts will not be returned in post queries. ##### Permissions Must be logged in as the user or have &#x60;delete_others_posts&#x60; permission. 
     */
    @Test
    public void postsPostIdDeleteTest() {
        String postId = null;
        // StatusOK response = api.postsPostIdDelete(postId);

        // TODO: test validations
    }
    /**
     * Get file info for post
     *
     * Gets a list of file information objects for the files attached to a post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 
     */
    @Test
    public void postsPostIdFilesInfoGetTest() {
        String postId = null;
        // List<FileInfo> response = api.postsPostIdFilesInfoGet(postId);

        // TODO: test validations
    }
    /**
     * Get a post
     *
     * Get a single post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 
     */
    @Test
    public void postsPostIdGetTest() {
        String postId = null;
        // Post response = api.postsPostIdGet(postId);

        // TODO: test validations
    }
    /**
     * Patch a post
     *
     * Partially update a post by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;edit_post&#x60; permission. 
     */
    @Test
    public void postsPostIdPatchPutTest() {
        String postId = null;
        Body29 body = null;
        // Post response = api.postsPostIdPatchPut(postId, body);

        // TODO: test validations
    }
    /**
     * Pin a post to the channel
     *
     * Pin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
     */
    @Test
    public void postsPostIdPinPostTest() {
        String postId = null;
        // StatusOK response = api.postsPostIdPinPost(postId);

        // TODO: test validations
    }
    /**
     * Update a post
     *
     * Update a post. Only the fields listed below are updatable, omitted fields will be treated as blank. ##### Permissions Must have &#x60;edit_post&#x60; permission for the channel the post is in. 
     */
    @Test
    public void postsPostIdPutTest() {
        String postId = null;
        Body28 body = null;
        // Post response = api.postsPostIdPut(postId, body);

        // TODO: test validations
    }
    /**
     * Get a thread
     *
     * Get a post and the rest of the posts in the same thread. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 
     */
    @Test
    public void postsPostIdThreadGetTest() {
        String postId = null;
        // PostList response = api.postsPostIdThreadGet(postId);

        // TODO: test validations
    }
    /**
     * Unpin a post to the channel
     *
     * Unpin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
     */
    @Test
    public void postsPostIdUnpinPostTest() {
        String postId = null;
        // StatusOK response = api.postsPostIdUnpinPost(postId);

        // TODO: test validations
    }
    /**
     * Search for team posts
     *
     * Search posts in the team and from the provided terms string. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdPostsSearchPostTest() {
        String teamId = null;
        Body30 body = null;
        // PostList response = api.teamsTeamIdPostsSearchPost(teamId, body);

        // TODO: test validations
    }
    /**
     * Get a list of flagged posts
     *
     * Get a page of flagged posts of a user provided user id string. Selects from a channel, team or all flagged posts by a user. ##### Permissions Must be user or have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void usersUserIdPostsFlaggedGetTest() {
        String userId = null;
        String teamId = null;
        String channelId = null;
        String page = null;
        String perPage = null;
        // List<PostList> response = api.usersUserIdPostsFlaggedGet(userId, teamId, channelId, page, perPage);

        // TODO: test validations
    }
}
