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

public interface LdapApi {
  /**
   * Sync with LDAP
   * Synchronize any user attribute changes in the configured AD/LDAP server with Mattermost. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("ldap/sync")
  Observable<StatusOK> ldapSyncPost();
    

  /**
   * Test LDAP configuration
   * Test the current AD/LDAP configuration to see if the AD/LDAP server can be contacted successfully. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("ldap/test")
  Observable<StatusOK> ldapTestPost();
    

}
