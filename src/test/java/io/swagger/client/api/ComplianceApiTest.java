package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AppError;
import io.swagger.client.model.Compliance;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ComplianceApi
 */
public class ComplianceApiTest {

    private ComplianceApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ComplianceApi.class);
    }

    /**
     * Get reports
     *
     * Get a list of compliance reports previously created by page, selected with &#x60;page&#x60; and &#x60;per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void complianceReportsGetTest() {
        String page = null;
        String perPage = null;
        // List<Compliance> response = api.complianceReportsGet(page, perPage);

        // TODO: test validations
    }
    /**
     * Create report
     *
     * Create and save a compliance report. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void complianceReportsPostTest() {
        // Compliance response = api.complianceReportsPost();

        // TODO: test validations
    }
    /**
     * Download a report
     *
     * Download the full contents of a report as a file. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void complianceReportsReportIdDownloadGetTest() {
        String reportId = null;
        // Void response = api.complianceReportsReportIdDownloadGet(reportId);

        // TODO: test validations
    }
    /**
     * Get a report
     *
     * Get a compliance reports previously created. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     */
    @Test
    public void complianceReportsReportIdGetTest() {
        String reportId = null;
        // Compliance response = api.complianceReportsReportIdGet(reportId);

        // TODO: test validations
    }
}
