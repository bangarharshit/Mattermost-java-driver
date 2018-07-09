package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import java.io.File;
import io.swagger.client.model.SamlCertificateStatus;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SamlApi
 */
public class SamlApiTest {

    private SamlApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SamlApi.class);
    }

    /**
     * Remove IDP certificate
     *
     * Delete the current IDP certificate being used with your SAML configuration. This will also disable SAML on your system as this certificate is required for SAML. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void samlCertificateIdpDeleteTest() {
        // StatusOK response = api.samlCertificateIdpDelete();

        // TODO: test validations
    }
    /**
     * Upload IDP certificate
     *
     * Upload the IDP certificate to be used with your SAML configuration. This will also set the filename for the IdpCertificateFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void samlCertificateIdpPostTest() {
        File certificate = null;
        // StatusOK response = api.samlCertificateIdpPost(certificate);

        // TODO: test validations
    }
    /**
     * Remove private key
     *
     * Delete the current private key being used with your SAML configuration. This will also disable encryption for SAML on your system as this key is required for that. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void samlCertificatePrivateDeleteTest() {
        // StatusOK response = api.samlCertificatePrivateDelete();

        // TODO: test validations
    }
    /**
     * Upload private key
     *
     * Upload the private key to be used for encryption with your SAML configuration. This will also set the filename for the PrivateKeyFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void samlCertificatePrivatePostTest() {
        File certificate = null;
        // StatusOK response = api.samlCertificatePrivatePost(certificate);

        // TODO: test validations
    }
    /**
     * Remove public certificate
     *
     * Delete the current public certificate being used with your SAML configuration. This will also disable encryption for SAML on your system as this certificate is required for that. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void samlCertificatePublicDeleteTest() {
        // StatusOK response = api.samlCertificatePublicDelete();

        // TODO: test validations
    }
    /**
     * Upload public certificate
     *
     * Upload the public certificate to be used for encryption with your SAML configuration. This will also set the filename for the PublicCertificateFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void samlCertificatePublicPostTest() {
        File certificate = null;
        // StatusOK response = api.samlCertificatePublicPost(certificate);

        // TODO: test validations
    }
    /**
     * Get certificate status
     *
     * Get the status of the uploaded certificates and keys in use by your SAML configuration. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void samlCertificateStatusGetTest() {
        // SamlCertificateStatus response = api.samlCertificateStatusGet();

        // TODO: test validations
    }
    /**
     * Get metadata
     *
     * Get SAML metadata from the server. SAML must be configured properly. ##### Permissions No permission required. 
     */
    @Test
    public void samlMetadataGetTest() {
        // String response = api.samlMetadataGet();

        // TODO: test validations
    }
}
