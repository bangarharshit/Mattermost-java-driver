package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Body17;
import io.swagger.client.model.Body18;
import io.swagger.client.model.Body19;
import io.swagger.client.model.Body20;
import io.swagger.client.model.Body21;
import java.io.File;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.StatusOK;
import io.swagger.client.model.Team;
import io.swagger.client.model.TeamExists;
import io.swagger.client.model.TeamMember;
import io.swagger.client.model.TeamStats;
import io.swagger.client.model.TeamUnread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TeamsApi {
  /**
   * Get teams
   * For regular users only returns open teams. Users with the \&quot;manage_system\&quot; permission will return teams regardless of type. The result is based on query string parameters - page and per_page. ##### Permissions Must be authenticated. \&quot;manage_system\&quot; permission is required to show all teams.  
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of teams per page. (optional, default to 60)
   * @return Call&lt;List&lt;Team&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams")
  Observable<List<Team>> teamsGet(
    @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

  /**
   * Get invite info for a team
   * Get the &#x60;name&#x60;, &#x60;display_name&#x60;, &#x60;description&#x60; and &#x60;id&#x60; for a team from the invite id.  __Minimum server version__: 4.0  ##### Permissions No authentication required. 
   * @param inviteId Invite id for a team (required)
   * @return Call&lt;InlineResponse2004&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/invite/{invite_id}")
  Observable<InlineResponse2004> teamsInviteInviteIdGet(
    @retrofit2.http.Path("invite_id") String inviteId
  );

  /**
   * Add user to team from invite
   * Using either an invite id or hash/data pair from an email invite link, add a user to a team. ##### Permissions Must be authenticated. 
   * @param hash Hash value with time, team id and and InviteSaltId (optional)
   * @param data Data with time and team id (optional)
   * @param inviteId Invite id to add user to the team (optional)
   * @return Call&lt;TeamMember&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("teams/members/invite")
  Observable<TeamMember> teamsMembersInvitePost(
    @retrofit2.http.Query("hash") String hash, @retrofit2.http.Query("data") String data, @retrofit2.http.Query("invite_id") String inviteId
  );

  /**
   * Check if team exists
   * Check if the team exists based on a team name. 
   * @param name Team Name (required)
   * @return Call&lt;TeamExists&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/name/{name}/exists")
  Observable<TeamExists> teamsNameNameExistsGet(
    @retrofit2.http.Path("name") String name
  );

  /**
   * Get a team by name
   * Get a team based on provided name string ##### Permissions Must be authenticated, team type is open and have the &#x60;view_team&#x60; permission. 
   * @param name Team Name (required)
   * @return Call&lt;Team&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/name/{name}")
  Observable<Team> teamsNameNameGet(
    @retrofit2.http.Path("name") String name
  );

  /**
   * Create a team
   * Create a new team on the system. ##### Permissions Must be authenticated and have the &#x60;create_team&#x60; permission. 
   * @param body Team that is to be created (required)
   * @return Call&lt;Team&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("teams")
  Observable<Team> teamsPost(
    @retrofit2.http.Body Body17 body
  );

  /**
   * Search teams
   * Search teams based on search term provided in the request body. ##### Permissions Logged in user only shows open teams Logged in user with \&quot;manage_system\&quot; permission shows all teams 
   * @param body Search criteria (required)
   * @return Call&lt;List&lt;Team&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("teams/search")
  Observable<List<Team>> teamsSearchPost(
    @retrofit2.http.Body Body20 body
  );

  /**
   * Delete a team
   * Delete a team softly and put in archived only. ##### Permissions Must have the &#x60;manage_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param permanent Permanently delete the team, to be used for compliance reasons only. (optional, default to false)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("teams/{team_id}")
  Observable<StatusOK> teamsTeamIdDelete(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Query("permanent") Boolean permanent
  );

  /**
   * Get a team
   * Get a team on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @return Call&lt;Team&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/{team_id}")
  Observable<Team> teamsTeamIdGet(
    @retrofit2.http.Path("team_id") String teamId
  );

  /**
   * Import a Team from other application
   * Import a team into a existing team. Import users, channels, posts, hooks. ##### Permissions Must have &#x60;permission_import_team&#x60; permission. 
   * @param file A file to be uploaded in zip format. (required)
   * @param filesize The size of the zip file to be imported. (required)
   * @param importFrom String that defines from which application the team was exported to be imported into Mattermost. (required)
   * @param teamId Team GUID (required)
   * @return Call&lt;InlineResponse2003&gt;
   */
  @retrofit2.http.Multipart
  @POST("teams/{team_id}/import")
  Observable<InlineResponse2003> teamsTeamIdImportPost(
    @retrofit2.http.Part("file\"; filename=\"file") RequestBody file, @retrofit2.http.Part("filesize") Integer filesize, @retrofit2.http.Part("importFrom") String importFrom, @retrofit2.http.Path("team_id") String teamId
  );

  /**
   * Invite users to the team by email
   * Invite users to the existing team usign the user&#39;s email. ##### Permissions Must have &#x60;invite_to_team&#x60; permission for the team. 
   * @param teamId Team GUID (required)
   * @param body List of user&#39;s email (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("teams/{team_id}/invite/email")
  Observable<StatusOK> teamsTeamIdInviteEmailPost(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Body List<String> body
  );

  /**
   * Add multiple users to team
   * Add a number of users to the team by user_id. ##### Permissions Must be authenticated. Authenticated user must have the &#x60;add_user_to_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param body  (required)
   * @return Call&lt;List&lt;TeamMember&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("teams/{team_id}/members/batch")
  Observable<List<TeamMember>> teamsTeamIdMembersBatchPost(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Body List<TeamMember> body
  );

  /**
   * Get team members
   * Get a page team members list based on query string parameters - team id, page and per page. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of users per page. (optional, default to 60)
   * @return Call&lt;List&lt;TeamMember&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/{team_id}/members")
  Observable<List<TeamMember>> teamsTeamIdMembersGet(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

  /**
   * Get team members by ids
   * Get a list of team members based on a provided array of user ids. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
   * @param teamId Team GUID (required)
   * @param body List of user ids (required)
   * @return Call&lt;List&lt;TeamMember&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("teams/{team_id}/members/ids")
  Observable<List<TeamMember>> teamsTeamIdMembersIdsPost(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Body List<String> body
  );

  /**
   * Add user to team
   * Add user to the team by user_id. ##### Permissions Must be authenticated and team be open to add self. For adding another user, authenticated user must have the &#x60;add_user_to_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param body  (required)
   * @return Call&lt;TeamMember&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("teams/{team_id}/members")
  Observable<TeamMember> teamsTeamIdMembersPost(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Body TeamMember body
  );

  /**
   * Remove user from team
   * Delete the team member object for a user, effectively removing them from a team. ##### Permissions Must be logged in as the user or have the &#x60;remove_user_from_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param userId User GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("teams/{team_id}/members/{user_id}")
  Observable<StatusOK> teamsTeamIdMembersUserIdDelete(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Get a team member
   * Get a team member on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param userId User GUID (required)
   * @return Call&lt;TeamMember&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/{team_id}/members/{user_id}")
  Observable<TeamMember> teamsTeamIdMembersUserIdGet(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Update a team member roles
   * Update a team member roles. Valid team roles are \&quot;team_user\&quot;, \&quot;team_admin\&quot; or both of them. Overwrites any previously assigned team roles. ##### Permissions Must be authenticated and have the &#x60;manage_team_roles&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param userId User GUID (required)
   * @param body Space-delimited team roles to assign to the user (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("teams/{team_id}/members/{user_id}/roles")
  Observable<StatusOK> teamsTeamIdMembersUserIdRolesPut(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Body21 body
  );

  /**
   * Patch a team
   * Partially update a team by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;manage_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param body Team object that is to be updated (required)
   * @return Call&lt;Team&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("teams/{team_id}/patch")
  Observable<Team> teamsTeamIdPatchPut(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Body Body19 body
  );

  /**
   * Update a team
   * Update a team by providing the team object. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;manage_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @param body Team to update (required)
   * @return Call&lt;Team&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("teams/{team_id}")
  Observable<Team> teamsTeamIdPut(
    @retrofit2.http.Path("team_id") String teamId, @retrofit2.http.Body Body18 body
  );

  /**
   * Get a team stats
   * Get a team stats on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
   * @param teamId Team GUID (required)
   * @return Call&lt;TeamStats&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/{team_id}/stats")
  Observable<TeamStats> teamsTeamIdStatsGet(
    @retrofit2.http.Path("team_id") String teamId
  );

  /**
   * Get a user&#39;s teams
   * Get a list of teams that a user is on. ##### Permissions Must be authenticated as the user or have the &#x60;manage_system&#x60; permission. 
   * @param userId User GUID (required)
   * @return Call&lt;List&lt;Team&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/teams")
  Observable<List<Team>> usersUserIdTeamsGet(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Get team members for a user
   * Get a list of team members for a user. Useful for getting the ids of teams the user is on and the roles they have in those teams. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @return Call&lt;List&lt;TeamMember&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/teams/members")
  Observable<List<TeamMember>> usersUserIdTeamsMembersGet(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Get unreads for a team
   * Get the unread mention and message counts for a team for the specified user. ##### Permissions Must be the user or have &#x60;edit_other_users&#x60; permission and have &#x60;view_team&#x60; permission for the team. 
   * @param userId User GUID (required)
   * @param teamId Team GUID (required)
   * @return Call&lt;TeamUnread&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/teams/{team_id}/unread")
  Observable<TeamUnread> usersUserIdTeamsTeamIdUnreadGet(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("team_id") String teamId
  );

  /**
   * Get team unreads for a user
   * Get the count for unread messages and mentions in the teams the user is a member of. ##### Permissions Must be logged in. 
   * @param userId User GUID (required)
   * @param excludeTeam Optional team id to be excluded from the results (required)
   * @return Call&lt;List&lt;TeamUnread&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/teams/unread")
  Observable<List<TeamUnread>> usersUserIdTeamsUnreadGet(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Query("exclude_team") String excludeTeam
  );

}
