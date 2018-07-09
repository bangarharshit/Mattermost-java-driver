package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Body33;
import io.swagger.client.model.Emoji;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EmojiApi {
  /**
   * Autocomplete custom emoji
   * Get a list of custom emoji with names starting with or matching the provided name. Returns a maximum of 100 results. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 
   * @param name The emoji name to search. (required)
   * @return Call&lt;Emoji&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("emoji/autocomplete")
  Observable<Emoji> emojiAutocompleteGet(
    @retrofit2.http.Query("name") String name
  );

  /**
   * Delete a custom emoji
   * Delete a custom emoji. ##### Permissions Must have the &#x60;manage_team&#x60; or &#x60;manage_system&#x60; permissions or be the user who created the emoji. 
   * @param emojiId Emoji GUID (required)
   * @return Call&lt;Emoji&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("emoji/{emoji_id}")
  Observable<Emoji> emojiEmojiIdDelete(
    @retrofit2.http.Path("emoji_id") String emojiId
  );

  /**
   * Get a custom emoji
   * Get some metadata for a custom emoji. ##### Permissions Must be authenticated. 
   * @param emojiId Emoji GUID (required)
   * @return Call&lt;Emoji&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("emoji/{emoji_id}")
  Observable<Emoji> emojiEmojiIdGet(
    @retrofit2.http.Path("emoji_id") String emojiId
  );

  /**
   * Get custom emoji image
   * Get the image for a custom emoji. ##### Permissions Must be authenticated. 
   * @param emojiId Emoji GUID (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("emoji/{emoji_id}/image")
  Observable<Void> emojiEmojiIdImageGet(
    @retrofit2.http.Path("emoji_id") String emojiId
  );

  /**
   * Get a list of custom emoji
   * Get a page of metadata for custom emoji on the system. Since server version 4.7, sort using the &#x60;sort&#x60; query parameter. ##### Permissions Must be authenticated. 
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of users per page. (optional, default to 60)
   * @param sort Either blank for no sorting or \&quot;name\&quot; to sort by emoji names. Minimum server version for sorting is 4.7. (optional, default to )
   * @return Call&lt;Emoji&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("emoji")
  Observable<Emoji> emojiGet(
    @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage, @retrofit2.http.Query("sort") String sort
  );

  /**
   * Get a custom emoji by name
   * Get some metadata for a custom emoji using its name. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 
   * @param emojiName Emoji name (required)
   * @return Call&lt;Emoji&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("emoji/name/{emoji_name}")
  Observable<Emoji> emojiNameEmojiNameGet(
    @retrofit2.http.Path("emoji_name") String emojiName
  );

  /**
   * Create a custom emoji
   * Create a custom emoji for the team. ##### Permissions Must be authenticated. 
   * @param image A file to be uploaded (required)
   * @param emoji A JSON object containing a &#x60;name&#x60; field with the name of the emoji and a &#x60;creator_id&#x60; field with the id of the authenticated user. (required)
   * @return Call&lt;Emoji&gt;
   */
  @retrofit2.http.Multipart
  @POST("emoji")
  Observable<Emoji> emojiPost(
    @retrofit2.http.Part("image\"; filename=\"image") RequestBody image, @retrofit2.http.Part("emoji") String emoji
  );

  /**
   * Search custom emoji
   * Search for custom emoji by name based on search criteria provided in the request body. A maximum of 200 results are returned. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 
   * @param body Search criteria (required)
   * @return Call&lt;List&lt;Emoji&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("emoji/search")
  Observable<List<Emoji>> emojiSearchPost(
    @retrofit2.http.Body Body33 body
  );

}
