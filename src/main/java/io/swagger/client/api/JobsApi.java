package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Body31;
import io.swagger.client.model.Job;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface JobsApi {
  /**
   * Get the jobs.
   * Get a page of jobs. Use the query parameters to modify the behaviour of this endpoint. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of jobs per page. (optional, default to 60)
   * @return Call&lt;List&lt;Job&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("jobs")
  Observable<List<Job>> jobsGet(
    @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

  /**
   * Cancel a job.
   * Cancel a job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
   * @param jobId Job GUID (required)
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("jobs/{job_id}/cancel")
  Observable<StatusOK> jobsJobIdCancelPost(
    @retrofit2.http.Path("job_id") String jobId
  );

  /**
   * Get a job.
   * Gets a single job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
   * @param jobId Job GUID (required)
   * @return Call&lt;Job&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("jobs/{job_id}")
  Observable<Job> jobsJobIdGet(
    @retrofit2.http.Path("job_id") String jobId
  );

  /**
   * Create a new job.
   * Create a new job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
   * @param body Job object to be created (required)
   * @return Call&lt;Job&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("jobs")
  Observable<Job> jobsPost(
    @retrofit2.http.Body Body31 body
  );

  /**
   * Get the jobs of the given type.
   * Get a page of jobs of the given type. Use the query parameters to modify the behaviour of this endpoint. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
   * @param type Job type (required)
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of jobs per page. (optional, default to 60)
   * @return Call&lt;List&lt;Job&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("jobs/type/{type}")
  Observable<List<Job>> jobsTypeTypeGet(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

}
