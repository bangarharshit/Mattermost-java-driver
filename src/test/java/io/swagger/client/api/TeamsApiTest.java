package io.swagger.client.api;

import io.swagger.client.ApiClient;
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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
public class TeamsApiTest {

    private TeamsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TeamsApi.class);
    }

    /**
     * Get teams
     *
     * For regular users only returns open teams. Users with the \&quot;manage_system\&quot; permission will return teams regardless of type. The result is based on query string parameters - page and per_page. ##### Permissions Must be authenticated. \&quot;manage_system\&quot; permission is required to show all teams.  
     */
    @Test
    public void teamsGetTest() {
        String page = null;
        String perPage = null;
        // List<Team> response = api.teamsGet(page, perPage);

        // TODO: test validations
    }
    /**
     * Get invite info for a team
     *
     * Get the &#x60;name&#x60;, &#x60;display_name&#x60;, &#x60;description&#x60; and &#x60;id&#x60; for a team from the invite id.  __Minimum server version__: 4.0  ##### Permissions No authentication required. 
     */
    @Test
    public void teamsInviteInviteIdGetTest() {
        String inviteId = null;
        // InlineResponse2004 response = api.teamsInviteInviteIdGet(inviteId);

        // TODO: test validations
    }
    /**
     * Add user to team from invite
     *
     * Using either an invite id or hash/data pair from an email invite link, add a user to a team. ##### Permissions Must be authenticated. 
     */
    @Test
    public void teamsMembersInvitePostTest() {
        String hash = null;
        String data = null;
        String inviteId = null;
        // TeamMember response = api.teamsMembersInvitePost(hash, data, inviteId);

        // TODO: test validations
    }
    /**
     * Check if team exists
     *
     * Check if the team exists based on a team name. 
     */
    @Test
    public void teamsNameNameExistsGetTest() {
        String name = null;
        // TeamExists response = api.teamsNameNameExistsGet(name);

        // TODO: test validations
    }
    /**
     * Get a team by name
     *
     * Get a team based on provided name string ##### Permissions Must be authenticated, team type is open and have the &#x60;view_team&#x60; permission. 
     */
    @Test
    public void teamsNameNameGetTest() {
        String name = null;
        // Team response = api.teamsNameNameGet(name);

        // TODO: test validations
    }
    /**
     * Create a team
     *
     * Create a new team on the system. ##### Permissions Must be authenticated and have the &#x60;create_team&#x60; permission. 
     */
    @Test
    public void teamsPostTest() {
        Body17 body = null;
        // Team response = api.teamsPost(body);

        // TODO: test validations
    }
    /**
     * Search teams
     *
     * Search teams based on search term provided in the request body. ##### Permissions Logged in user only shows open teams Logged in user with \&quot;manage_system\&quot; permission shows all teams 
     */
    @Test
    public void teamsSearchPostTest() {
        Body20 body = null;
        // List<Team> response = api.teamsSearchPost(body);

        // TODO: test validations
    }
    /**
     * Delete a team
     *
     * Delete a team softly and put in archived only. ##### Permissions Must have the &#x60;manage_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdDeleteTest() {
        String teamId = null;
        Boolean permanent = null;
        // StatusOK response = api.teamsTeamIdDelete(teamId, permanent);

        // TODO: test validations
    }
    /**
     * Get a team
     *
     * Get a team on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdGetTest() {
        String teamId = null;
        // Team response = api.teamsTeamIdGet(teamId);

        // TODO: test validations
    }
    /**
     * Import a Team from other application
     *
     * Import a team into a existing team. Import users, channels, posts, hooks. ##### Permissions Must have &#x60;permission_import_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdImportPostTest() {
        File file = null;
        Integer filesize = null;
        String importFrom = null;
        String teamId = null;
        // InlineResponse2003 response = api.teamsTeamIdImportPost(file, filesize, importFrom, teamId);

        // TODO: test validations
    }
    /**
     * Invite users to the team by email
     *
     * Invite users to the existing team usign the user&#39;s email. ##### Permissions Must have &#x60;invite_to_team&#x60; permission for the team. 
     */
    @Test
    public void teamsTeamIdInviteEmailPostTest() {
        String teamId = null;
        List<String> body = null;
        // StatusOK response = api.teamsTeamIdInviteEmailPost(teamId, body);

        // TODO: test validations
    }
    /**
     * Add multiple users to team
     *
     * Add a number of users to the team by user_id. ##### Permissions Must be authenticated. Authenticated user must have the &#x60;add_user_to_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdMembersBatchPostTest() {
        String teamId = null;
        List<TeamMember> body = null;
        // List<TeamMember> response = api.teamsTeamIdMembersBatchPost(teamId, body);

        // TODO: test validations
    }
    /**
     * Get team members
     *
     * Get a page team members list based on query string parameters - team id, page and per page. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdMembersGetTest() {
        String teamId = null;
        String page = null;
        String perPage = null;
        // List<TeamMember> response = api.teamsTeamIdMembersGet(teamId, page, perPage);

        // TODO: test validations
    }
    /**
     * Get team members by ids
     *
     * Get a list of team members based on a provided array of user ids. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
     */
    @Test
    public void teamsTeamIdMembersIdsPostTest() {
        String teamId = null;
        List<String> body = null;
        // List<TeamMember> response = api.teamsTeamIdMembersIdsPost(teamId, body);

        // TODO: test validations
    }
    /**
     * Add user to team
     *
     * Add user to the team by user_id. ##### Permissions Must be authenticated and team be open to add self. For adding another user, authenticated user must have the &#x60;add_user_to_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdMembersPostTest() {
        String teamId = null;
        TeamMember body = null;
        // TeamMember response = api.teamsTeamIdMembersPost(teamId, body);

        // TODO: test validations
    }
    /**
     * Remove user from team
     *
     * Delete the team member object for a user, effectively removing them from a team. ##### Permissions Must be logged in as the user or have the &#x60;remove_user_from_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdMembersUserIdDeleteTest() {
        String teamId = null;
        String userId = null;
        // StatusOK response = api.teamsTeamIdMembersUserIdDelete(teamId, userId);

        // TODO: test validations
    }
    /**
     * Get a team member
     *
     * Get a team member on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdMembersUserIdGetTest() {
        String teamId = null;
        String userId = null;
        // TeamMember response = api.teamsTeamIdMembersUserIdGet(teamId, userId);

        // TODO: test validations
    }
    /**
     * Update a team member roles
     *
     * Update a team member roles. Valid team roles are \&quot;team_user\&quot;, \&quot;team_admin\&quot; or both of them. Overwrites any previously assigned team roles. ##### Permissions Must be authenticated and have the &#x60;manage_team_roles&#x60; permission. 
     */
    @Test
    public void teamsTeamIdMembersUserIdRolesPutTest() {
        String teamId = null;
        String userId = null;
        Body21 body = null;
        // StatusOK response = api.teamsTeamIdMembersUserIdRolesPut(teamId, userId, body);

        // TODO: test validations
    }
    /**
     * Patch a team
     *
     * Partially update a team by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;manage_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdPatchPutTest() {
        String teamId = null;
        Body19 body = null;
        // Team response = api.teamsTeamIdPatchPut(teamId, body);

        // TODO: test validations
    }
    /**
     * Update a team
     *
     * Update a team by providing the team object. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;manage_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdPutTest() {
        String teamId = null;
        Body18 body = null;
        // Team response = api.teamsTeamIdPut(teamId, body);

        // TODO: test validations
    }
    /**
     * Get a team stats
     *
     * Get a team stats on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     */
    @Test
    public void teamsTeamIdStatsGetTest() {
        String teamId = null;
        // TeamStats response = api.teamsTeamIdStatsGet(teamId);

        // TODO: test validations
    }
    /**
     * Get a user&#39;s teams
     *
     * Get a list of teams that a user is on. ##### Permissions Must be authenticated as the user or have the &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void usersUserIdTeamsGetTest() {
        String userId = null;
        // List<Team> response = api.usersUserIdTeamsGet(userId);

        // TODO: test validations
    }
    /**
     * Get team members for a user
     *
     * Get a list of team members for a user. Useful for getting the ids of teams the user is on and the roles they have in those teams. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdTeamsMembersGetTest() {
        String userId = null;
        // List<TeamMember> response = api.usersUserIdTeamsMembersGet(userId);

        // TODO: test validations
    }
    /**
     * Get unreads for a team
     *
     * Get the unread mention and message counts for a team for the specified user. ##### Permissions Must be the user or have &#x60;edit_other_users&#x60; permission and have &#x60;view_team&#x60; permission for the team. 
     */
    @Test
    public void usersUserIdTeamsTeamIdUnreadGetTest() {
        String userId = null;
        String teamId = null;
        // TeamUnread response = api.usersUserIdTeamsTeamIdUnreadGet(userId, teamId);

        // TODO: test validations
    }
    /**
     * Get team unreads for a user
     *
     * Get the count for unread messages and mentions in the teams the user is a member of. ##### Permissions Must be logged in. 
     */
    @Test
    public void usersUserIdTeamsUnreadGetTest() {
        String userId = null;
        String excludeTeam = null;
        // List<TeamUnread> response = api.usersUserIdTeamsUnreadGet(userId, excludeTeam);

        // TODO: test validations
    }
}
