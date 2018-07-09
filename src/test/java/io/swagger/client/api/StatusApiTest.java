package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.Body16;
import io.swagger.client.model.Status;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatusApi
 */
public class StatusApiTest {

    private StatusApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StatusApi.class);
    }

    /**
     * Get user statuses by id
     *
     * Get a list of user statuses by id from the server. ##### Permissions Must be authenticated. 
     */
    @Test
    public void usersStatusIdsGetTest() {
        // List<Status> response = api.usersStatusIdsGet();

        // TODO: test validations
    }
    /**
     * Get user status
     *
     * Get user status by id from the server. ##### Permissions Must be authenticated. 
     */
    @Test
    public void usersUserIdStatusGetTest() {
        String userId = null;
        // Status response = api.usersUserIdStatusGet(userId);

        // TODO: test validations
    }
    /**
     * Update user status
     *
     * Manually set a user&#39;s status. When setting a user&#39;s status, the status will remain that value until set \&quot;online\&quot; again, which will return the status to being automatically updated based on user activity. ##### Permissions Must have &#x60;edit_other_users&#x60; permission for the team. 
     */
    @Test
    public void usersUserIdStatusPutTest() {
        String userId = null;
        Body16 body = null;
        // Status response = api.usersUserIdStatusPut(userId, body);

        // TODO: test validations
    }
}
