# DatasetsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**datasetsCreate**](DatasetsApi.md#datasetsCreate) | **POST** /api/public/v2/datasets |  |
| [**datasetsGet**](DatasetsApi.md#datasetsGet) | **GET** /api/public/v2/datasets/{datasetName} |  |
| [**datasetsGetRun**](DatasetsApi.md#datasetsGetRun) | **GET** /api/public/datasets/{datasetName}/runs/{runName} |  |
| [**datasetsGetRuns**](DatasetsApi.md#datasetsGetRuns) | **GET** /api/public/datasets/{datasetName}/runs |  |
| [**datasetsList**](DatasetsApi.md#datasetsList) | **GET** /api/public/v2/datasets |  |


<a id="datasetsCreate"></a>
# **datasetsCreate**
> Dataset datasetsCreate(createDatasetRequest)



Create a dataset

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    CreateDatasetRequest createDatasetRequest = new CreateDatasetRequest(); // CreateDatasetRequest | 
    try {
      Dataset result = apiInstance.datasetsCreate(createDatasetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#datasetsCreate");
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
| **createDatasetRequest** | [**CreateDatasetRequest**](CreateDatasetRequest.md)|  | |

### Return type

[**Dataset**](Dataset.md)

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

<a id="datasetsGet"></a>
# **datasetsGet**
> Dataset datasetsGet(datasetName)



Get a dataset

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    String datasetName = "datasetName_example"; // String | 
    try {
      Dataset result = apiInstance.datasetsGet(datasetName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#datasetsGet");
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
| **datasetName** | **String**|  | |

### Return type

[**Dataset**](Dataset.md)

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

<a id="datasetsGetRun"></a>
# **datasetsGetRun**
> DatasetRunWithItems datasetsGetRun(datasetName, runName)



Get a dataset run and its items

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    String datasetName = "datasetName_example"; // String | 
    String runName = "runName_example"; // String | 
    try {
      DatasetRunWithItems result = apiInstance.datasetsGetRun(datasetName, runName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#datasetsGetRun");
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
| **datasetName** | **String**|  | |
| **runName** | **String**|  | |

### Return type

[**DatasetRunWithItems**](DatasetRunWithItems.md)

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

<a id="datasetsGetRuns"></a>
# **datasetsGetRuns**
> PaginatedDatasetRuns datasetsGetRuns(datasetName, page, limit)



Get dataset runs

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    String datasetName = "datasetName_example"; // String | 
    Integer page = 56; // Integer | page number, starts at 1
    Integer limit = 56; // Integer | limit of items per page
    try {
      PaginatedDatasetRuns result = apiInstance.datasetsGetRuns(datasetName, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#datasetsGetRuns");
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
| **datasetName** | **String**|  | |
| **page** | **Integer**| page number, starts at 1 | [optional] |
| **limit** | **Integer**| limit of items per page | [optional] |

### Return type

[**PaginatedDatasetRuns**](PaginatedDatasetRuns.md)

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

<a id="datasetsList"></a>
# **datasetsList**
> PaginatedDatasets datasetsList(page, limit)



Get all datasets

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    Integer page = 56; // Integer | page number, starts at 1
    Integer limit = 56; // Integer | limit of items per page
    try {
      PaginatedDatasets result = apiInstance.datasetsList(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#datasetsList");
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

### Return type

[**PaginatedDatasets**](PaginatedDatasets.md)

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

