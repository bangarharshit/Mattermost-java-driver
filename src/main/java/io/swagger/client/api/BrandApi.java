package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import java.io.File;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BrandApi {
  /**
   * Get brand image
   * Get the previously uploaded brand image. Returns 404 if no brand image has been uploaded. ##### Permissions No permission required. 
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("brand/image")
  Observable<String> brandImageGet();
    

  /**
   * Upload brand image
   * Uploads a brand image. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param image The image to be uploaded (required)
   * @return Call&lt;StatusOK&gt;
   */
  @retrofit2.http.Multipart
  @POST("brand/image")
  Observable<StatusOK> brandImagePost(
    @retrofit2.http.Part("image\"; filename=\"image") RequestBody image
  );

}
