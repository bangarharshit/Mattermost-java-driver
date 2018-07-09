package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.DataRetentionPolicy;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataretentionApi
 */
public class DataretentionApiTest {

    private DataretentionApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DataretentionApi.class);
    }

    /**
     * Get the data retention policy details.
     *
     * Gets the current data retention policy details from the server, including what data should be purged and the cutoff times for each data type that should be purged. __Minimum server version__: 4.3 ##### Permissions Requires an active session but no other permissions. 
     */
    @Test
    public void dataRetentionPolicyGetTest() {
        // DataRetentionPolicy response = api.dataRetentionPolicyGet();

        // TODO: test validations
    }
}
