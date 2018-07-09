package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AppError;
import io.swagger.client.model.Compliance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ComplianceApi {
  /**
   * Get reports
   * Get a list of compliance reports previously created by page, selected with &#x60;page&#x60; and &#x60;per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param page The page to select. (optional, default to 0)
   * @param perPage The number of reports per page. (optional, default to 60)
   * @return Call&lt;List&lt;Compliance&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("compliance/reports")
  Observable<List<Compliance>> complianceReportsGet(
    @retrofit2.http.Query("page") String page, @retrofit2.http.Query("per_page") String perPage
  );

  /**
   * Create report
   * Create and save a compliance report. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @return Call&lt;Compliance&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("compliance/reports")
  Observable<Compliance> complianceReportsPost();
    

  /**
   * Download a report
   * Download the full contents of a report as a file. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param reportId Compliance report GUID (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("compliance/reports/{report_id}/download")
  Observable<Void> complianceReportsReportIdDownloadGet(
    @retrofit2.http.Path("report_id") String reportId
  );

  /**
   * Get a report
   * Get a compliance reports previously created. ##### Permissions Must have &#x60;manage_system&#x60; permission. 
   * @param reportId Compliance report GUID (required)
   * @return Call&lt;Compliance&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("compliance/reports/{report_id}")
  Observable<Compliance> complianceReportsReportIdGet(
    @retrofit2.http.Path("report_id") String reportId
  );

}
