package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import java.io.File;
import io.swagger.client.model.SamlCertificateStatus;
import io.swagger.client.model.StatusOK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SamlApi {
  /**
   * Remove IDP certificate
   * Delete the current IDP certificate being used with your SAML configuration. This will also disable SAML on your system as this certificate is required for SAML. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("saml/certificate/idp")
  Observable<StatusOK> samlCertificateIdpDelete();
    

  /**
   * Upload IDP certificate
   * Upload the IDP certificate to be used with your SAML configuration. This will also set the filename for the IdpCertificateFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param certificate The IDP certificate file (required)
   * @return Call&lt;StatusOK&gt;
   */
  @retrofit2.http.Multipart
  @POST("saml/certificate/idp")
  Observable<StatusOK> samlCertificateIdpPost(
    @retrofit2.http.Part("certificate\"; filename=\"certificate") RequestBody certificate
  );

  /**
   * Remove private key
   * Delete the current private key being used with your SAML configuration. This will also disable encryption for SAML on your system as this key is required for that. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("saml/certificate/private")
  Observable<StatusOK> samlCertificatePrivateDelete();
    

  /**
   * Upload private key
   * Upload the private key to be used for encryption with your SAML configuration. This will also set the filename for the PrivateKeyFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param certificate The private key file (required)
   * @return Call&lt;StatusOK&gt;
   */
  @retrofit2.http.Multipart
  @POST("saml/certificate/private")
  Observable<StatusOK> samlCertificatePrivatePost(
    @retrofit2.http.Part("certificate\"; filename=\"certificate") RequestBody certificate
  );

  /**
   * Remove public certificate
   * Delete the current public certificate being used with your SAML configuration. This will also disable encryption for SAML on your system as this certificate is required for that. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;StatusOK&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("saml/certificate/public")
  Observable<StatusOK> samlCertificatePublicDelete();
    

  /**
   * Upload public certificate
   * Upload the public certificate to be used for encryption with your SAML configuration. This will also set the filename for the PublicCertificateFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param certificate The public certificate file (required)
   * @return Call&lt;StatusOK&gt;
   */
  @retrofit2.http.Multipart
  @POST("saml/certificate/public")
  Observable<StatusOK> samlCertificatePublicPost(
    @retrofit2.http.Part("certificate\"; filename=\"certificate") RequestBody certificate
  );

  /**
   * Get certificate status
   * Get the status of the uploaded certificates and keys in use by your SAML configuration. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;SamlCertificateStatus&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("saml/certificate/status")
  Observable<SamlCertificateStatus> samlCertificateStatusGet();
    

  /**
   * Get metadata
   * Get SAML metadata from the server. SAML must be configured properly. ##### Permissions No permission required. 
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("saml/metadata")
  Observable<String> samlMetadataGet();
    

}
