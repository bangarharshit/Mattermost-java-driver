package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.StatusOK;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LdapApi
 */
public class LdapApiTest {

    private LdapApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LdapApi.class);
    }

    /**
     * Sync with LDAP
     *
     * Synchronize any user attribute changes in the configured AD/LDAP server with Mattermost. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void ldapSyncPostTest() {
        // StatusOK response = api.ldapSyncPost();

        // TODO: test validations
    }
    /**
     * Test LDAP configuration
     *
     * Test the current AD/LDAP configuration to see if the AD/LDAP server can be contacted successfully. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void ldapTestPostTest() {
        // StatusOK response = api.ldapTestPost();

        // TODO: test validations
    }
}
