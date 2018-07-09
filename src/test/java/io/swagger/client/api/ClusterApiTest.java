package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.ClusterInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClusterApi
 */
public class ClusterApiTest {

    private ClusterApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ClusterApi.class);
    }

    /**
     * Get cluster status
     *
     * Get a set of information for each node in the cluster, useful for checking the status and health of each node. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void clusterStatusGetTest() {
        // List<ClusterInfo> response = api.clusterStatusGet();

        // TODO: test validations
    }
}
