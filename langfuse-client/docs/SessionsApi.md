# SessionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sessionsGet**](SessionsApi.md#sessionsGet) | **GET** /api/public/sessions/{sessionId} |  |
| [**sessionsList**](SessionsApi.md#sessionsList) | **GET** /api/public/sessions |  |


<a id="sessionsGet"></a>
# **sessionsGet**
> SessionWithTraces sessionsGet(sessionId)



Get a session. Please note that &#x60;traces&#x60; on this endpoint are not paginated, if you plan to fetch large sessions, consider &#x60;GET /api/public/traces?sessionId&#x3D;&lt;sessionId&gt;&#x60;

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.SessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    SessionsApi apiInstance = new SessionsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | The unique id of a session
    try {
      SessionWithTraces result = apiInstance.sessionsGet(sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionsApi#sessionsGet");
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
| **sessionId** | **String**| The unique id of a session | |

### Return type

[**SessionWithTraces**](SessionWithTraces.md)

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

<a id="sessionsList"></a>
# **sessionsList**
> PaginatedSessions sessionsList(page, limit, fromTimestamp, toTimestamp)



Get sessions

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.SessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    SessionsApi apiInstance = new SessionsApi(defaultClient);
    Integer page = 56; // Integer | Page number, starts at 1
    Integer limit = 56; // Integer | Limit of items per page. If you encounter api issues due to too large page sizes, try to reduce the limit.
    OffsetDateTime fromTimestamp = OffsetDateTime.now(); // OffsetDateTime | Optional filter to only include sessions created on or after a certain datetime (ISO 8601)
    OffsetDateTime toTimestamp = OffsetDateTime.now(); // OffsetDateTime | Optional filter to only include sessions created before a certain datetime (ISO 8601)
    try {
      PaginatedSessions result = apiInstance.sessionsList(page, limit, fromTimestamp, toTimestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionsApi#sessionsList");
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
| **fromTimestamp** | **OffsetDateTime**| Optional filter to only include sessions created on or after a certain datetime (ISO 8601) | [optional] |
| **toTimestamp** | **OffsetDateTime**| Optional filter to only include sessions created before a certain datetime (ISO 8601) | [optional] |

### Return type

[**PaginatedSessions**](PaginatedSessions.md)

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

