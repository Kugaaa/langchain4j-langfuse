# DatasetRunItemsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**datasetRunItemsCreate**](DatasetRunItemsApi.md#datasetRunItemsCreate) | **POST** /api/public/dataset-run-items |  |


<a id="datasetRunItemsCreate"></a>
# **datasetRunItemsCreate**
> DatasetRunItem datasetRunItemsCreate(createDatasetRunItemRequest)



Create a dataset run item

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.DatasetRunItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    DatasetRunItemsApi apiInstance = new DatasetRunItemsApi(defaultClient);
    CreateDatasetRunItemRequest createDatasetRunItemRequest = new CreateDatasetRunItemRequest(); // CreateDatasetRunItemRequest | 
    try {
      DatasetRunItem result = apiInstance.datasetRunItemsCreate(createDatasetRunItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetRunItemsApi#datasetRunItemsCreate");
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
| **createDatasetRunItemRequest** | [**CreateDatasetRunItemRequest**](CreateDatasetRunItemRequest.md)|  | |

### Return type

[**DatasetRunItem**](DatasetRunItem.md)

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

