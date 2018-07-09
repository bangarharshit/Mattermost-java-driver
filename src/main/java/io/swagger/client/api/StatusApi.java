package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Body16;
import io.swagger.client.model.Status;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StatusApi {
  /**
   * Get user statuses by id
   * Get a list of user statuses by id from the server. ##### Permissions Must be authenticated. 
   * @return Call&lt;List&lt;Status&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/status/ids")
  Observable<List<Status>> usersStatusIdsGet();
    

  /**
   * Get user status
   * Get user status by id from the server. ##### Permissions Must be authenticated. 
   * @param userId User ID (required)
   * @return Call&lt;Status&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("users/{user_id}/status")
  Observable<Status> usersUserIdStatusGet(
    @retrofit2.http.Path("user_id") String userId
  );

  /**
   * Update user status
   * Manually set a user&#39;s status. When setting a user&#39;s status, the status will remain that value until set \&quot;online\&quot; again, which will return the status to being automatically updated based on user activity. ##### Permissions Must have &#x60;edit_other_users&#x60; permission for the team. 
   * @param userId User ID (required)
   * @param body Status object that is to be updated (required)
   * @return Call&lt;Status&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/status")
  Observable<Status> usersUserIdStatusPut(
    @retrofit2.http.Path("user_id") String userId, @retrofit2.http.Body Body16 body
  );

}
