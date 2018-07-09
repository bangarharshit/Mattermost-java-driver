package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Body28;
import io.swagger.client.model.Body29;
import io.swagger.client.model.Body30;
import io.swagger.client.model.FileInfo;
import io.swagger.client.model.Post;
import io.swagger.client.model.PostList;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PostsApi {
  /**
   * Get posts for a channel
   * Get a page of posts in a channel. Use the query parameters to modify the behaviour of this endpoint. The parameters &#x60;since&#x60;, &#x60;before&#x60; and &#x60;after&#x60; must not be used together. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel. 
   * @param channelId The channel ID to get the posts for (required)
   * @param page The page to select (optional, default to 0)
   * @param perPage The number of posts per page (optional, default to 60)
   * @param since Provide a non-zero value in Unix time milliseconds to select posts created after that time (optional)
   * @param before A post id to select the posts that came before this one (optional)
   * @param after A post id to select the posts that came after this one (optional)
   * @return Call&lt;PostList&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("channels/{channel_id}/posts")
  Observable<PostList> channelsChannelIdPostsGet(
    @retrofit2.http.Path("channel_id") String channelId, @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage, @retrofit2.http.Query("since") Integer since, @retrofit2.http.Query("before") String before, @retrofit2.http.Query("after") String after
  );

  /**
   * Create a post
   * Create a new post in a channel. To create the post as a comment on another post, provide &#x60;root_id&#x60;. ##### Permissions Must have &#x60;create_post&#x60; permission for the channel the post is being created in. 
   * @param post Post object to create (required)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("posts")
  Observable<Post> postsPost(
    @retrofit2.http.Body Post post
  );

  /**
   * Perform a post action
   * Perform a post action, which allows users to interact with integrations through posts. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
   * @param postId Post GUID (required)
   * @param actionId Action GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("posts/{post_id}/actions/{action_id}")
  Observable<StatusOK> postsPostIdActionsActionIdPost(
    @retrofit2.http.Path("post_id") String postId, @retrofit2.http.Path("action_id") String actionId
  );

  /**
   * Delete a post
   * Soft deletes a post, by marking the post as deleted in the database. Soft deleted posts will not be returned in post queries. ##### Permissions Must be logged in as the user or have &#x60;delete_others_posts&#x60; permission. 
   * @param postId ID of the post to delete (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("posts/{post_id}")
  Observable<StatusOK> postsPostIdDelete(
    @retrofit2.http.Path("post_id") String postId
  );

  /**
   * Get file info for post
   * Gets a list of file information objects for the files attached to a post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 
   * @param postId ID of the post (required)
   * @return Call&lt;List&lt;FileInfo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("posts/{post_id}/files/info")
  Observable<List<FileInfo>> postsPostIdFilesInfoGet(
    @retrofit2.http.Path("post_id") String postId
  );

  /**
   * Get a post
   * Get a single post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 
   * @param postId ID of the post to get (required)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("posts/{post_id}")
  Observable<Post> postsPostIdGet(
    @retrofit2.http.Path("post_id") String postId
  );

  /**
   * Patch a post
   * Partially update a post by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;edit_post&#x60; permission. 
   * @param postId Post GUID (required)
   * @param body Post object that is to be updated (required)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("posts/{post_id}/patch")
  Observable<Post> postsPostIdPatchPut(
    @retrofit2.http.Path("post_id") String postId, @retrofit2.http.Body Body29 body
  );

  /**
   * Pin a post to the channel
   * Pin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
   * @param postId Post GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("posts/{post_id}/pin")
  Observable<StatusOK> postsPostIdPinPost(
    @retrofit2.http.Path("post_id") String postId
  );

  /**
   * Update a post
   * Update a post. Only the fields listed below are updatable, omitted fields will be treated as blank. ##### Permissions Must have &#x60;edit_post&#x60; permission for the channel the post is in. 
   * @param postId ID of the post to update (required)
   * @param body Post object that is to be updated (required)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("posts/{post_id}")
  Observable<Post> postsPostIdPut(
    @retrofit2.http.Path("post_id") String postId, @retrofit2.http.Body Body28 body
  );

  /**
   * Get a thread
   * Get a post and the rest of the posts in the same thread. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 
   * @param postId ID of a post in the thread (required)
   * @return Call&lt;PostList&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("posts/{post_id}/thread")
  Observable<PostList> postsPostIdThreadGet(
    @retrofit2.http.Path("post_id") String postId
  );

  /**
   * Unpin a post to the channel
   * Unpin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
   * @param postId Post GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("posts/{post_id}/unpin")
  Observable<StatusOK> postsPostIdUnpinPost(
    @retrofit2.http.Path("post_id") String postId
  );

  /**
   * Search for team posts
   * Search posts in the team and from the provided terms string. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param body The search terms and logic to use in the search. (required)
   * @return Call&lt;PostList&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("teams/{team_id}/posts/search")
  Observable<PostList> teamsTeamIdPostsSearchPost(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Body Body30 body
  );

  /**
   * Get a list of flagged posts
   * Get a page of flagged posts of a user provided user id string. Selects from a channel, team or all flagged posts by a user. ##### Permissions Must be user or have &#x60;manage_system&#x60; permission. 
   * @param userId ID of the user (required)
   * @param teamId Team ID (optional)
   * @param channelId Channel ID (optional)
   * @param page The page to select (optional, default to 0)
   * @param perPage The number of posts per page (optional, default to 60)
   * @return Call&lt;List&lt;PostList&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/posts/flagged")
  Observable<List<PostList>> usersUserIdPostsFlaggedGet(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Query("team_id") String teamId, @retrofit2.http.Query("channel_id") String channelId, @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

}
