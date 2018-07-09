# ComplianceApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complianceReportsGet**](ComplianceApi.md#complianceReportsGet) | **GET** compliance/reports | Get reports
[**complianceReportsPost**](ComplianceApi.md#complianceReportsPost) | **POST** compliance/reports | Create report
[**complianceReportsReportIdDownloadGet**](ComplianceApi.md#complianceReportsReportIdDownloadGet) | **GET** compliance/reports/{report_id}/download | Download a report
[**complianceReportsReportIdGet**](ComplianceApi.md#complianceReportsReportIdGet) | **GET** compliance/reports/{report_id} | Get a report


<a name="complianceReportsGet"></a>
# **complianceReportsGet**
> List&lt;Compliance&gt; complianceReportsGet(page, perPage)

Get reports

Get a list of compliance reports previously created by page, selected with &#x60;page&#x60; and &#x60;per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComplianceApi;


ComplianceApi apiInstance = new ComplianceApi();
String page = "0"; // String | The page to select.
String perPage = "60"; // String | The number of reports per page.
try {
    List<Compliance> result = apiInstance.complianceReportsGet(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplianceApi#complianceReportsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| The page to select. | [optional] [default to 0]
 **perPage** | **String**| The number of reports per page. | [optional] [default to 60]

### Return type

[**List&lt;Compliance&gt;**](Compliance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="complianceReportsPost"></a>
# **complianceReportsPost**
> Compliance complianceReportsPost()

Create report

Create and save a compliance report. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComplianceApi;


ComplianceApi apiInstance = new ComplianceApi();
try {
    Compliance result = apiInstance.complianceReportsPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplianceApi#complianceReportsPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Compliance**](Compliance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="complianceReportsReportIdDownloadGet"></a>
# **complianceReportsReportIdDownloadGet**
> Void complianceReportsReportIdDownloadGet(reportId)

Download a report

Download the full contents of a report as a file. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComplianceApi;


ComplianceApi apiInstance = new ComplianceApi();
String reportId = "reportId_example"; // String | Compliance report GUID
try {
    Void result = apiInstance.complianceReportsReportIdDownloadGet(reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplianceApi#complianceReportsReportIdDownloadGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **String**| Compliance report GUID |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="complianceReportsReportIdGet"></a>
# **complianceReportsReportIdGet**
> Compliance complianceReportsReportIdGet(reportId)

Get a report

Get a compliance reports previously created. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComplianceApi;


ComplianceApi apiInstance = new ComplianceApi();
String reportId = "reportId_example"; // String | Compliance report GUID
try {
    Compliance result = apiInstance.complianceReportsReportIdGet(reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplianceApi#complianceReportsReportIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **String**| Compliance report GUID |

### Return type

[**Compliance**](Compliance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

