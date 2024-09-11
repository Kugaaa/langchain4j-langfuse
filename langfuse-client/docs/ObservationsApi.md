# ObservationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**observationsGet**](ObservationsApi.md#observationsGet) | **GET** /api/public/observations/{observationId} |  |
| [**observationsGetMany**](ObservationsApi.md#observationsGetMany) | **GET** /api/public/observations |  |


<a id="observationsGet"></a>
# **observationsGet**
> ObservationsView observationsGet(observationId)



Get a observation

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.ObservationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    ObservationsApi apiInstance = new ObservationsApi(defaultClient);
    String observationId = "observationId_example"; // String | The unique langfuse identifier of an observation, can be an event, span or generation
    try {
      ObservationsView result = apiInstance.observationsGet(observationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservationsApi#observationsGet");
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
| **observationId** | **String**| The unique langfuse identifier of an observation, can be an event, span or generation | |

### Return type

[**ObservationsView**](ObservationsView.md)

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

<a id="observationsGetMany"></a>
# **observationsGetMany**
> ObservationsViews observationsGetMany(page, limit, name, userId, type, traceId, parentObservationId, fromStartTime, toStartTime, version)



Get a list of observations

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.ObservationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    ObservationsApi apiInstance = new ObservationsApi(defaultClient);
    Integer page = 56; // Integer | Page number, starts at 1.
    Integer limit = 56; // Integer | Limit of items per page. If you encounter api issues due to too large page sizes, try to reduce the limit.
    String name = "name_example"; // String | 
    String userId = "userId_example"; // String | 
    String type = "type_example"; // String | 
    String traceId = "traceId_example"; // String | 
    String parentObservationId = "parentObservationId_example"; // String | 
    OffsetDateTime fromStartTime = OffsetDateTime.now(); // OffsetDateTime | Retrieve only observations with a start_time or or after this datetime (ISO 8601).
    OffsetDateTime toStartTime = OffsetDateTime.now(); // OffsetDateTime | Retrieve only observations with a start_time before this datetime (ISO 8601).
    String version = "version_example"; // String | Optional filter to only include observations with a certain version.
    try {
      ObservationsViews result = apiInstance.observationsGetMany(page, limit, name, userId, type, traceId, parentObservationId, fromStartTime, toStartTime, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservationsApi#observationsGetMany");
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
| **page** | **Integer**| Page number, starts at 1. | [optional] |
| **limit** | **Integer**| Limit of items per page. If you encounter api issues due to too large page sizes, try to reduce the limit. | [optional] |
| **name** | **String**|  | [optional] |
| **userId** | **String**|  | [optional] |
| **type** | **String**|  | [optional] |
| **traceId** | **String**|  | [optional] |
| **parentObservationId** | **String**|  | [optional] |
| **fromStartTime** | **OffsetDateTime**| Retrieve only observations with a start_time or or after this datetime (ISO 8601). | [optional] |
| **toStartTime** | **OffsetDateTime**| Retrieve only observations with a start_time before this datetime (ISO 8601). | [optional] |
| **version** | **String**| Optional filter to only include observations with a certain version. | [optional] |

### Return type

[**ObservationsViews**](ObservationsViews.md)

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

