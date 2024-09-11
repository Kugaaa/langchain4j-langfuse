# ScoreConfigsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**scoreConfigsCreate**](ScoreConfigsApi.md#scoreConfigsCreate) | **POST** /api/public/score-configs |  |
| [**scoreConfigsGet**](ScoreConfigsApi.md#scoreConfigsGet) | **GET** /api/public/score-configs |  |
| [**scoreConfigsGetById**](ScoreConfigsApi.md#scoreConfigsGetById) | **GET** /api/public/score-configs/{configId} |  |


<a id="scoreConfigsCreate"></a>
# **scoreConfigsCreate**
> ScoreConfig scoreConfigsCreate(createScoreConfigRequest)



Create a score configuration (config). Score configs are used to define the structure of scores

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.ScoreConfigsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    ScoreConfigsApi apiInstance = new ScoreConfigsApi(defaultClient);
    CreateScoreConfigRequest createScoreConfigRequest = new CreateScoreConfigRequest(); // CreateScoreConfigRequest | 
    try {
      ScoreConfig result = apiInstance.scoreConfigsCreate(createScoreConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreConfigsApi#scoreConfigsCreate");
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
| **createScoreConfigRequest** | [**CreateScoreConfigRequest**](CreateScoreConfigRequest.md)|  | |

### Return type

[**ScoreConfig**](ScoreConfig.md)

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

<a id="scoreConfigsGet"></a>
# **scoreConfigsGet**
> ScoreConfigs scoreConfigsGet(page, limit)



Get all score configs

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.ScoreConfigsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    ScoreConfigsApi apiInstance = new ScoreConfigsApi(defaultClient);
    Integer page = 56; // Integer | Page number, starts at 1.
    Integer limit = 56; // Integer | Limit of items per page. If you encounter api issues due to too large page sizes, try to reduce the limit
    try {
      ScoreConfigs result = apiInstance.scoreConfigsGet(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreConfigsApi#scoreConfigsGet");
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
| **limit** | **Integer**| Limit of items per page. If you encounter api issues due to too large page sizes, try to reduce the limit | [optional] |

### Return type

[**ScoreConfigs**](ScoreConfigs.md)

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

<a id="scoreConfigsGetById"></a>
# **scoreConfigsGetById**
> ScoreConfig scoreConfigsGetById(configId)



Get a score config

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.ScoreConfigsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    ScoreConfigsApi apiInstance = new ScoreConfigsApi(defaultClient);
    String configId = "configId_example"; // String | The unique langfuse identifier of a score config
    try {
      ScoreConfig result = apiInstance.scoreConfigsGetById(configId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreConfigsApi#scoreConfigsGetById");
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
| **configId** | **String**| The unique langfuse identifier of a score config | |

### Return type

[**ScoreConfig**](ScoreConfig.md)

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

