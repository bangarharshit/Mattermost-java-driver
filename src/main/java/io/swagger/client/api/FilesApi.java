package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import java.io.File;
import io.swagger.client.model.FileInfo;
import io.swagger.client.model.InlineResponse2006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FilesApi {
  /**
   * Get a file
   * Gets a file that has been uploaded previously. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
   * @param fileId The ID of the file to get (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("files/{file_id}")
  Observable<Void> filesFileIdGet(
    @retrofit2.http.Path("file_id") String fileId
  );

  /**
   * Get metadata for a file
   * Gets a file&#39;s info. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
   * @param fileId The ID of the file info to get (required)
   * @return Call&lt;FileInfo&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("files/{file_id}/info")
  Observable<FileInfo> filesFileIdInfoGet(
    @retrofit2.http.Path("file_id") String fileId
  );

  /**
   * Get a public file link
   * Gets a public link for a file that can be accessed without logging into Mattermost.
   * @param fileId The ID of the file to get a link for (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("files/{file_id}/link")
  Observable<String> filesFileIdLinkGet(
    @retrofit2.http.Path("file_id") String fileId
  );

  /**
   * Get a file&#39;s preview
   * Gets a file&#39;s preview. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
   * @param fileId The ID of the file to get (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("files/{file_id}/preview")
  Observable<Void> filesFileIdPreviewGet(
    @retrofit2.http.Path("file_id") String fileId
  );

  /**
   * Get a file&#39;s thumbnail
   * Gets a file&#39;s thumbnail. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
   * @param fileId The ID of the file to get (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("files/{file_id}/thumbnail")
  Observable<Void> filesFileIdThumbnailGet(
    @retrofit2.http.Path("file_id") String fileId
  );

  /**
   * Upload a file
   * Uploads a file that can later be attached to a post.  This request can either be a multipart/form-data request with a channel_id, files and optional client_ids defined in the FormData, or it can be a request with the channel_id and filename defined as query parameters with the contents of a single file in the body of the request.  Only multipart/form-data requests are supported by server versions up to and including 4.7. Server versions 4.8 and higher support both types of requests.  ##### Permissions Must have &#x60;upload_file&#x60; permission. 
   * @param files A file to be uploaded (optional)
   * @param channelId The ID of the channel that this file will be uploaded to (optional)
   * @param clientIds A unique identifier for the file that will be returned in the response (optional)
   * @param channelId2 The ID of the channel that this file will be uploaded to (optional)
   * @param filename The ID of the channel that this file will be uploaded to (optional)
   * @return Call&lt;InlineResponse2006&gt;
   */
  @retrofit2.http.Multipart
  @POST("files")
  Observable<InlineResponse2006> filesPost(
    @retrofit2.http.Part("files\"; filename=\"files") RequestBody files, @retrofit2.http.Part("channel_id") String channelId, @retrofit2.http.Part("client_ids") String clientIds, @retrofit2.http.Query("channel_id") String channelId2, @retrofit2.http.Query("filename") String filename
  );

}
