# TraceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**traceGet**](TraceApi.md#traceGet) | **GET** /api/public/traces/{traceId} |  |
| [**traceList**](TraceApi.md#traceList) | **GET** /api/public/traces |  |


<a id="traceGet"></a>
# **traceGet**
> TraceWithFullDetails traceGet(traceId)



Get a specific trace

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.TraceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TraceApi apiInstance = new TraceApi(defaultClient);
    String traceId = "traceId_example"; // String | The unique langfuse identifier of a trace
    try {
      TraceWithFullDetails result = apiInstance.traceGet(traceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TraceApi#traceGet");
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
| **traceId** | **String**| The unique langfuse identifier of a trace | |

### Return type

[**TraceWithFullDetails**](TraceWithFullDetails.md)

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

<a id="traceList"></a>
# **traceList**
> Traces traceList(page, limit, userId, name, sessionId, fromTimestamp, toTimestamp, orderBy, tags, version, release)



Get list of traces

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.TraceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TraceApi apiInstance = new TraceApi(defaultClient);
    Integer page = 56; // Integer | Page number, starts at 1
    Integer limit = 56; // Integer | Limit of items per page. If you encounter api issues due to too large page sizes, try to reduce the limit.
    String userId = "userId_example"; // String | 
    String name = "name_example"; // String | 
    String sessionId = "sessionId_example"; // String | 
    OffsetDateTime fromTimestamp = OffsetDateTime.now(); // OffsetDateTime | Optional filter to only include traces with a trace.timestamp on or after a certain datetime (ISO 8601)
    OffsetDateTime toTimestamp = OffsetDateTime.now(); // OffsetDateTime | Optional filter to only include traces with a trace.timestamp before a certain datetime (ISO 8601)
    String orderBy = "orderBy_example"; // String | Format of the string [field].[asc/desc]. Fields: id, timestamp, name, userId, release, version, public, bookmarked, sessionId. Example: timestamp.asc
    List<String> tags = Arrays.asList(); // List<String> | Only traces that include all of these tags will be returned.
    String version = "version_example"; // String | Optional filter to only include traces with a certain version.
    String release = "release_example"; // String | Optional filter to only include traces with a certain release.
    try {
      Traces result = apiInstance.traceList(page, limit, userId, name, sessionId, fromTimestamp, toTimestamp, orderBy, tags, version, release);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TraceApi#traceList");
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
| **page** | **Integer**| Page number, starts at 1 | [optional] |
| **limit** | **Integer**| Limit of items per page. If you encounter api issues due to too large page sizes, try to reduce the limit. | [optional] |
| **userId** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **sessionId** | **String**|  | [optional] |
| **fromTimestamp** | **OffsetDateTime**| Optional filter to only include traces with a trace.timestamp on or after a certain datetime (ISO 8601) | [optional] |
| **toTimestamp** | **OffsetDateTime**| Optional filter to only include traces with a trace.timestamp before a certain datetime (ISO 8601) | [optional] |
| **orderBy** | **String**| Format of the string [field].[asc/desc]. Fields: id, timestamp, name, userId, release, version, public, bookmarked, sessionId. Example: timestamp.asc | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| Only traces that include all of these tags will be returned. | [optional] |
| **version** | **String**| Optional filter to only include traces with a certain version. | [optional] |
| **release** | **String**| Optional filter to only include traces with a certain release. | [optional] |

### Return type

[**Traces**](Traces.md)

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

