# MetricsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**metricsDaily**](MetricsApi.md#metricsDaily) | **GET** /api/public/metrics/daily |  |


<a id="metricsDaily"></a>
# **metricsDaily**
> DailyMetrics metricsDaily(page, limit, traceName, userId, tags, fromTimestamp, toTimestamp)



Get daily metrics of the Langfuse project

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    Integer page = 56; // Integer | page number, starts at 1
    Integer limit = 56; // Integer | limit of items per page
    String traceName = "traceName_example"; // String | Optional filter by the name of the trace
    String userId = "userId_example"; // String | Optional filter by the userId associated with the trace
    List<String> tags = Arrays.asList(); // List<String> | Optional filter for metrics where traces include all of these tags
    OffsetDateTime fromTimestamp = OffsetDateTime.now(); // OffsetDateTime | Optional filter to only include traces on or after a certain datetime (ISO 8601)
    OffsetDateTime toTimestamp = OffsetDateTime.now(); // OffsetDateTime | Optional filter to only include traces before a certain datetime (ISO 8601)
    try {
      DailyMetrics result = apiInstance.metricsDaily(page, limit, traceName, userId, tags, fromTimestamp, toTimestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#metricsDaily");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| page number, starts at 1 | [optional] |
| **limit** | **Integer**| limit of items per page | [optional] |
| **traceName** | **String**| Optional filter by the name of the trace | [optional] |
| **userId** | **String**| Optional filter by the userId associated with the trace | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| Optional filter for metrics where traces include all of these tags | [optional] |
| **fromTimestamp** | **OffsetDateTime**| Optional filter to only include traces on or after a certain datetime (ISO 8601) | [optional] |
| **toTimestamp** | **OffsetDateTime**| Optional filter to only include traces before a certain datetime (ISO 8601) | [optional] |

### Return type

[**DailyMetrics**](DailyMetrics.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **405** |  |  -  |

