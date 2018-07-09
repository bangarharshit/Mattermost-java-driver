package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.DataRetentionPolicy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DataretentionApi {
  /**
   * Get the data retention policy details.
   * Gets the current data retention policy details from the server, including what data should be purged and the cutoff times for each data type that should be purged. __Minimum server version__: 4.3 ##### Permissions Requires an active session but no other permissions. 
   * @return Call&lt;DataRetentionPolicy&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("data_retention/policy")
  Observable<DataRetentionPolicy> dataRetentionPolicyGet();
    

}
