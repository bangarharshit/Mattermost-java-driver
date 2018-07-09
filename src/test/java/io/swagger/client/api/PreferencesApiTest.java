package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.Preference;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PreferencesApi
 */
public class PreferencesApiTest {

    private PreferencesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PreferencesApi.class);
    }

    /**
     * List a user&#39;s preferences by category
     *
     * Lists the current user&#39;s stored preferences in the given category. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdPreferencesCategoryGetTest() {
        String userId = null;
        String category = null;
        // List<Preference> response = api.usersUserIdPreferencesCategoryGet(userId, category);

        // TODO: test validations
    }
    /**
     * Get a specific user preference
     *
     * Gets a single preference for the current user with the given category and name. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdPreferencesCategoryNamePreferenceNameGetTest() {
        String userId = null;
        String category = null;
        String preferenceName = null;
        // Preference response = api.usersUserIdPreferencesCategoryNamePreferenceNameGet(userId, category, preferenceName);

        // TODO: test validations
    }
    /**
     * Delete user&#39;s preferences
     *
     * Delete a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdPreferencesDeletePostTest() {
        String userId = null;
        List<Preference> body = null;
        // StatusOK response = api.usersUserIdPreferencesDeletePost(userId, body);

        // TODO: test validations
    }
    /**
     * Get the user&#39;s preferences
     *
     * Get a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdPreferencesGetTest() {
        String userId = null;
        // List<Preference> response = api.usersUserIdPreferencesGet(userId);

        // TODO: test validations
    }
    /**
     * Save the user&#39;s preferences
     *
     * Save a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     */
    @Test
    public void usersUserIdPreferencesPutTest() {
        String userId = null;
        List<Preference> body = null;
        // StatusOK response = api.usersUserIdPreferencesPut(userId, body);

        // TODO: test validations
    }
}
