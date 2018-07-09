package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ElasticsearchApi
 */
public class ElasticsearchApiTest {

    private ElasticsearchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ElasticsearchApi.class);
    }

    /**
     * Purge all Elasticsearch indexes
     *
     * Deletes all Elasticsearch indexes and their contents. After calling this endpoint, it is necessary to schedule a new Elasticsearch indexing job to repopulate the indexes. __Minimum server version__: 4.1 ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void elasticsearchPurgeIndexesPostTest() {
        // StatusOK response = api.elasticsearchPurgeIndexesPost();

        // TODO: test validations
    }
    /**
     * Test Elasticsearch configuration
     *
     * Test the current Elasticsearch configuration to see if the Elasticsearch server can be contacted successfully. Optionally provide a configuration in the request body to test. If no valid configuration is present in the request body the current server configuration will be tested.  __Minimum server version__: 4.1 ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void elasticsearchTestPostTest() {
        // StatusOK response = api.elasticsearchTestPost();

        // TODO: test validations
    }
}
