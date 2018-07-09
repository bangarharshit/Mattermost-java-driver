package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.ClusterInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClusterApi {
  /**
   * Get cluster status
   * Get a set of information for each node in the cluster, useful for checking the status and health of each node. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;List&lt;ClusterInfo&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("cluster/status")
  Observable<List<ClusterInfo>> clusterStatusGet();
    

}
