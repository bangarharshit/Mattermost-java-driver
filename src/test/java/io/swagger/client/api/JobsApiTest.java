package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.Body31;
import io.swagger.client.model.Job;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
public class JobsApiTest {

    private JobsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(JobsApi.class);
    }

    /**
     * Get the jobs.
     *
     * Get a page of jobs. Use the query parameters to modify the behaviour of this endpoint. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
     */
    @Test
    public void jobsGetTest() {
        String page = null;
        String perPage = null;
        // List<Job> response = api.jobsGet(page, perPage);

        // TODO: test validations
    }
    /**
     * Cancel a job.
     *
     * Cancel a job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
     */
    @Test
    public void jobsJobIdCancelPostTest() {
        String jobId = null;
        // StatusOK response = api.jobsJobIdCancelPost(jobId);

        // TODO: test validations
    }
    /**
     * Get a job.
     *
     * Gets a single job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
     */
    @Test
    public void jobsJobIdGetTest() {
        String jobId = null;
        // Job response = api.jobsJobIdGet(jobId);

        // TODO: test validations
    }
    /**
     * Create a new job.
     *
     * Create a new job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
     */
    @Test
    public void jobsPostTest() {
        Body31 body = null;
        // Job response = api.jobsPost(body);

        // TODO: test validations
    }
    /**
     * Get the jobs of the given type.
     *
     * Get a page of jobs of the given type. Use the query parameters to modify the behaviour of this endpoint. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
     */
    @Test
    public void jobsTypeTypeGetTest() {
        String type = null;
        String page = null;
        String perPage = null;
        // List<Job> response = api.jobsTypeTypeGet(type, page, perPage);

        // TODO: test validations
    }
}
