# DatasetItemsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**datasetItemsCreate**](DatasetItemsApi.md#datasetItemsCreate) | **POST** /api/public/dataset-items |  |
| [**datasetItemsGet**](DatasetItemsApi.md#datasetItemsGet) | **GET** /api/public/dataset-items/{id} |  |
| [**datasetItemsList**](DatasetItemsApi.md#datasetItemsList) | **GET** /api/public/dataset-items |  |


<a id="datasetItemsCreate"></a>
# **datasetItemsCreate**
> DatasetItem datasetItemsCreate(createDatasetItemRequest)



Create a dataset item

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.DatasetItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    DatasetItemsApi apiInstance = new DatasetItemsApi(defaultClient);
    CreateDatasetItemRequest createDatasetItemRequest = new CreateDatasetItemRequest(); // CreateDatasetItemRequest | 
    try {
      DatasetItem result = apiInstance.datasetItemsCreate(createDatasetItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetItemsApi#datasetItemsCreate");
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
| **createDatasetItemRequest** | [**CreateDatasetItemRequest**](CreateDatasetItemRequest.md)|  | |

### Return type

[**DatasetItem**](DatasetItem.md)

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

<a id="datasetItemsGet"></a>
# **datasetItemsGet**
> DatasetItem datasetItemsGet(id)



Get a dataset item

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.DatasetItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    DatasetItemsApi apiInstance = new DatasetItemsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      DatasetItem result = apiInstance.datasetItemsGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetItemsApi#datasetItemsGet");
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
| **id** | **String**|  | |

### Return type

[**DatasetItem**](DatasetItem.md)

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

<a id="datasetItemsList"></a>
# **datasetItemsList**
> PaginatedDatasetItems datasetItemsList(datasetName, sourceTraceId, sourceObservationId, page, limit)



Get dataset items

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.DatasetItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    DatasetItemsApi apiInstance = new DatasetItemsApi(defaultClient);
    String datasetName = "datasetName_example"; // String | 
    String sourceTraceId = "sourceTraceId_example"; // String | 
    String sourceObservationId = "sourceObservationId_example"; // String | 
    Integer page = 56; // Integer | page number, starts at 1
    Integer limit = 56; // Integer | limit of items per page
    try {
      PaginatedDatasetItems result = apiInstance.datasetItemsList(datasetName, sourceTraceId, sourceObservationId, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetItemsApi#datasetItemsList");
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
| **datasetName** | **String**|  | [optional] |
| **sourceTraceId** | **String**|  | [optional] |
| **sourceObservationId** | **String**|  | [optional] |
| **page** | **Integer**| page number, starts at 1 | [optional] |
| **limit** | **Integer**| limit of items per page | [optional] |

### Return type

[**PaginatedDatasetItems**](PaginatedDatasetItems.md)

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

