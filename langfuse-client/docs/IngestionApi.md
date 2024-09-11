# IngestionApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ingestionBatch**](IngestionApi.md#ingestionBatch) | **POST** /api/public/ingestion |  |


<a id="ingestionBatch"></a>
# **ingestionBatch**
> IngestionResponse ingestionBatch(ingestionBatchRequest)



Batched ingestion for Langfuse Tracing. If you want to use tracing via the API, such as to build your own Langfuse client implementation, this is the only API route you need to implement.  Notes:  - Batch sizes are limited to 3.5 MB in total. You need to adjust the number of events per batch accordingly. - The API does not return a 4xx status code for input errors. Instead, it responds with a 207 status code, which includes a list of the encountered errors.

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.IngestionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    IngestionApi apiInstance = new IngestionApi(defaultClient);
    IngestionBatchRequest ingestionBatchRequest = new IngestionBatchRequest(); // IngestionBatchRequest | 
    try {
      IngestionResponse result = apiInstance.ingestionBatch(ingestionBatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IngestionApi#ingestionBatch");
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
| **ingestionBatchRequest** | [**IngestionBatchRequest**](IngestionBatchRequest.md)|  | |

### Return type

[**IngestionResponse**](IngestionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

