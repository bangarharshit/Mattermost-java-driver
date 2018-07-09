package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Preference;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PreferencesApi {
  /**
   * List a user&#39;s preferences by category
   * Lists the current user&#39;s stored preferences in the given category. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param category The category of a group of preferences (required)
   * @return Call&lt;List&lt;Preference&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/preferences/{category}")
  Observable<List<Preference>> usersUserIdPreferencesCategoryGet(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("category") String category
  );

  /**
   * Get a specific user preference
   * Gets a single preference for the current user with the given category and name. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param category The category of a group of preferences (required)
   * @param preferenceName The name of the preference (required)
   * @return Call&lt;Preference&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/preferences/{category}/name/{preference_name}")
  Observable<Preference> usersUserIdPreferencesCategoryNamePreferenceNameGet(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Path("category") String category, @retrofit2.http.Path("preference_name") String preferenceName
  );

  /**
   * Delete user&#39;s preferences
   * Delete a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param body List of preference object (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/preferences/delete")
  Observable<StatusOK> usersUserIdPreferencesDeletePost(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body List<Preference> body
  );

  /**
   * Get the user&#39;s preferences
   * Get a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @return Call&lt;List&lt;Preference&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/preferences")
  Observable<List<Preference>> usersUserIdPreferencesGet(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Save the user&#39;s preferences
   * Save a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
   * @param userId User GUID (required)
   * @param body List of preference object (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/preferences")
  Observable<StatusOK> usersUserIdPreferencesPut(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body List<Preference> body
  );

}
