package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.Body38;
import io.swagger.client.model.Body39;
import io.swagger.client.model.Command;
import io.swagger.client.model.CommandResponse;
import io.swagger.client.model.InlineResponse2008;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommandsApi
 */
public class CommandsApiTest {

    private CommandsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CommandsApi.class);
    }

    /**
     * Delete a command
     *
     * Delete a command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
     */
    @Test
    public void commandsCommandIdDeleteTest() {
        String commandId = null;
        // StatusOK response = api.commandsCommandIdDelete(commandId);

        // TODO: test validations
    }
    /**
     * Update a command
     *
     * Update a single command based on command id string and Command struct. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
     */
    @Test
    public void commandsCommandIdPutTest() {
        String commandId = null;
        Command body = null;
        // Command response = api.commandsCommandIdPut(commandId, body);

        // TODO: test validations
    }
    /**
     * Generate a new token
     *
     * Generate a new token for the command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
     */
    @Test
    public void commandsCommandIdRegenTokenPutTest() {
        String commandId = null;
        // InlineResponse2008 response = api.commandsCommandIdRegenTokenPut(commandId);

        // TODO: test validations
    }
    /**
     * Execute a command
     *
     * Execute a command on a team. ##### Permissions Must have &#x60;use_slash_commands&#x60; permission for the team the command is in. 
     */
    @Test
    public void commandsExecutePostTest() {
        Body39 body = null;
        // CommandResponse response = api.commandsExecutePost(body);

        // TODO: test validations
    }
    /**
     * List commands for a team
     *
     * List commands for a team. ##### Permissions &#x60;manage_slash_commands&#x60; if need list custom commands. 
     */
    @Test
    public void commandsGetTest() {
        String teamId = null;
        String customOnly = null;
        // List<Command> response = api.commandsGet(teamId, customOnly);

        // TODO: test validations
    }
    /**
     * Create a command
     *
     * Create a command for a team. ##### Permissions &#x60;manage_slash_commands&#x60; for the team the command is in. 
     */
    @Test
    public void commandsPostTest() {
        Body38 body = null;
        // Command response = api.commandsPost(body);

        // TODO: test validations
    }
    /**
     * List autocomplete commands
     *
     * List autocomplete commands in the team. ##### Permissions &#x60;view_team&#x60; for the team. 
     */
    @Test
    public void teamsTeamIdCommandsAutocompleteGetTest() {
        String teamId = null;
        // List<Command> response = api.teamsTeamIdCommandsAutocompleteGet(teamId);

        // TODO: test validations
    }
}
