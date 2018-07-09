package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import java.io.File;
import io.swagger.client.model.FileInfo;
import io.swagger.client.model.InlineResponse2006;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
public class FilesApiTest {

    private FilesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FilesApi.class);
    }

    /**
     * Get a file
     *
     * Gets a file that has been uploaded previously. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     */
    @Test
    public void filesFileIdGetTest() {
        String fileId = null;
        // Void response = api.filesFileIdGet(fileId);

        // TODO: test validations
    }
    /**
     * Get metadata for a file
     *
     * Gets a file&#39;s info. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     */
    @Test
    public void filesFileIdInfoGetTest() {
        String fileId = null;
        // FileInfo response = api.filesFileIdInfoGet(fileId);

        // TODO: test validations
    }
    /**
     * Get a public file link
     *
     * Gets a public link for a file that can be accessed without logging into Mattermost.
     */
    @Test
    public void filesFileIdLinkGetTest() {
        String fileId = null;
        // String response = api.filesFileIdLinkGet(fileId);

        // TODO: test validations
    }
    /**
     * Get a file&#39;s preview
     *
     * Gets a file&#39;s preview. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     */
    @Test
    public void filesFileIdPreviewGetTest() {
        String fileId = null;
        // Void response = api.filesFileIdPreviewGet(fileId);

        // TODO: test validations
    }
    /**
     * Get a file&#39;s thumbnail
     *
     * Gets a file&#39;s thumbnail. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     */
    @Test
    public void filesFileIdThumbnailGetTest() {
        String fileId = null;
        // Void response = api.filesFileIdThumbnailGet(fileId);

        // TODO: test validations
    }
    /**
     * Upload a file
     *
     * Uploads a file that can later be attached to a post.  This request can either be a multipart/form-data request with a channel_id, files and optional client_ids defined in the FormData, or it can be a request with the channel_id and filename defined as query parameters with the contents of a single file in the body of the request.  Only multipart/form-data requests are supported by server versions up to and including 4.7. Server versions 4.8 and higher support both types of requests.  ##### Permissions Must have &#x60;upload_file&#x60; permission. 
     */
    @Test
    public void filesPostTest() {
        File files = null;
        String channelId = null;
        String clientIds = null;
        String channelId2 = null;
        String filename = null;
        // InlineResponse2006 response = api.filesPost(files, channelId, clientIds, channelId2, filename);

        // TODO: test validations
    }
}
