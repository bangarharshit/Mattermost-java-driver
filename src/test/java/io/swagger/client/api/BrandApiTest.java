package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import java.io.File;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BrandApi
 */
public class BrandApiTest {

    private BrandApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BrandApi.class);
    }

    /**
     * Get brand image
     *
     * Get the previously uploaded brand image. Returns 404 if no brand image has been uploaded. ##### Permissions No permission required. 
     */
    @Test
    public void brandImageGetTest() {
        // String response = api.brandImageGet();

        // TODO: test validations
    }
    /**
     * Upload brand image
     *
     * Uploads a brand image. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void brandImagePostTest() {
        File image = null;
        // StatusOK response = api.brandImagePost(image);

        // TODO: test validations
    }
}
