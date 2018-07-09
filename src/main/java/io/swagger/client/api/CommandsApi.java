package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Body38;
import io.swagger.client.model.Body39;
import io.swagger.client.model.Command;
import io.swagger.client.model.CommandResponse;
import io.swagger.client.model.InlineResponse2008;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CommandsApi {
  /**
   * Delete a command
   * Delete a command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
   * @param commandId ID of the command to delete (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("commands/{command_id}")
  Observable<StatusOK> commandsCommandIdDelete(
    @retrofit2.http.Path("command_id") String commandId
  );

  /**
   * Update a command
   * Update a single command based on command id string and Command struct. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
   * @param commandId ID of the command to update (required)
   * @param body  (required)
   * @return Call&lt;Command&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("commands/{command_id}")
  Observable<Command> commandsCommandIdPut(
    @retrofit2.http.Path("command_id") String commandId, @retrofit2.http.Body Command body
  );

  /**
   * Generate a new token
   * Generate a new token for the command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
   * @param commandId ID of the command to generate the new token (required)
   * @return Call&lt;InlineResponse2008&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("commands/{command_id}/regen_token")
  Observable<InlineResponse2008> commandsCommandIdRegenTokenPut(
    @retrofit2.http.Path("command_id") String commandId
  );

  /**
   * Execute a command
   * Execute a command on a team. ##### Permissions Must have &#x60;use_slash_commands&#x60; permission for the team the command is in. 
   * @param body command to be executed (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("commands/execute")
  Observable<CommandResponse> commandsExecutePost(
    @retrofit2.http.Body Body39 body
  );

  /**
   * List commands for a team
   * List commands for a team. ##### Permissions &#x60;manage_slash_commands&#x60; if need list custom commands. 
   * @param teamId The team id. (optional)
   * @param customOnly To get only the custom commands. If set to false will get the custom if the user have access plus the system commands, otherwise just the system commands.  (optional, default to false)
   * @return Call&lt;List&lt;Command&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("commands")
  Observable<List<Command>> commandsGet(
    @retrofit2.http.Query("team_id") String teamId, @retrofit2.http.Query("custom_only") String customOnly
  );

  /**
   * Create a command
   * Create a command for a team. ##### Permissions &#x60;manage_slash_commands&#x60; for the team the command is in. 
   * @param body command to be created (required)
   * @return Call&lt;Command&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("commands")
  Observable<Command> commandsPost(
    @retrofit2.http.Body Body38 body
  );

  /**
   * List autocomplete commands
   * List autocomplete commands in the team. ##### Permissions &#x60;view_team&#x60; for the team. 
   * @param teamId Team GUID (required)
   * @return Call&lt;List&lt;Command&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("teams/{team_id}/commands/autocomplete")
  Observable<List<Command>> teamsTeamIdCommandsAutocompleteGet(
    @retrofit2.http.Path("team_id") String teamId
  );

}
