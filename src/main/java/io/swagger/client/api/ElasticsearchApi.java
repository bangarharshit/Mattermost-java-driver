package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ElasticsearchApi {
  /**
   * Purge all Elasticsearch indexes
   * Deletes all Elasticsearch indexes and their contents. After calling this endpoint, it is necessary to schedule a new Elasticsearch indexing job to repopulate the indexes. __Minimum server version__: 4.1 ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("elasticsearch/purge_indexes")
  Observable<StatusOK> elasticsearchPurgeIndexesPost();
    

  /**
   * Test Elasticsearch configuration
   * Test the current Elasticsearch configuration to see if the Elasticsearch server can be contacted successfully. Optionally provide a configuration in the request body to test. If no valid configuration is present in the request body the current server configuration will be tested.  __Minimum server version__: 4.1 ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("elasticsearch/test")
  Observable<StatusOK> elasticsearchTestPost();
    

}
