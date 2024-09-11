# ScoreApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**scoreCreate**](ScoreApi.md#scoreCreate) | **POST** /api/public/scores |  |
| [**scoreDelete**](ScoreApi.md#scoreDelete) | **DELETE** /api/public/scores/{scoreId} |  |
| [**scoreGet**](ScoreApi.md#scoreGet) | **GET** /api/public/scores |  |
| [**scoreGetById**](ScoreApi.md#scoreGetById) | **GET** /api/public/scores/{scoreId} |  |


<a id="scoreCreate"></a>
# **scoreCreate**
> CreateScoreResponse scoreCreate(createScoreRequest)



Create a score

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.ScoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    ScoreApi apiInstance = new ScoreApi(defaultClient);
    CreateScoreRequest createScoreRequest = new CreateScoreRequest(); // CreateScoreRequest | 
    try {
      CreateScoreResponse result = apiInstance.scoreCreate(createScoreRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#scoreCreate");
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
| **createScoreRequest** | [**CreateScoreRequest**](CreateScoreRequest.md)|  | |

### Return type

[**CreateScoreResponse**](CreateScoreResponse.md)

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

<a id="scoreDelete"></a>
# **scoreDelete**
> scoreDelete(scoreId)



Delete a score

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.ScoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    ScoreApi apiInstance = new ScoreApi(defaultClient);
    String scoreId = "scoreId_example"; // String | The unique langfuse identifier of a score
    try {
      apiInstance.scoreDelete(scoreId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#scoreDelete");
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
| **scoreId** | **String**| The unique langfuse identifier of a score | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **405** |  |  -  |

<a id="scoreGet"></a>
# **scoreGet**
> Scores scoreGet(page, limit, userId, name, fromTimestamp, toTimestamp, source, operator, value, scoreIds, configId, dataType)



Get a list of scores

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.ScoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    ScoreApi apiInstance = new ScoreApi(defaultClient);
    Integer page = 56; // Integer | Page number, starts at 1.
    Integer limit = 56; // Integer | Limit of items per page. If you encounter api issues due to too large page sizes, try to reduce the limit.
    String userId = "userId_example"; // String | Retrieve only scores with this userId associated to the trace.
    String name = "name_example"; // String | Retrieve only scores with this name.
    OffsetDateTime fromTimestamp = OffsetDateTime.now(); // OffsetDateTime | Optional filter to only include scores created on or after a certain datetime (ISO 8601)
    OffsetDateTime toTimestamp = OffsetDateTime.now(); // OffsetDateTime | Optional filter to only include scores created before a certain datetime (ISO 8601)
    ScoreSource source = ScoreSource.fromValue("ANNOTATION"); // ScoreSource | Retrieve only scores from a specific source.
    String operator = "operator_example"; // String | Retrieve only scores with <operator> value.
    Double value = 3.4D; // Double | Retrieve only scores with <operator> value.
    String scoreIds = "scoreIds_example"; // String | Comma-separated list of score IDs to limit the results to.
    String configId = "configId_example"; // String | Retrieve only scores with a specific configId.
    ScoreDataType dataType = ScoreDataType.fromValue("NUMERIC"); // ScoreDataType | Retrieve only scores with a specific dataType.
    try {
      Scores result = apiInstance.scoreGet(page, limit, userId, name, fromTimestamp, toTimestamp, source, operator, value, scoreIds, configId, dataType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#scoreGet");
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
| **userId** | **String**| Retrieve only scores with this userId associated to the trace. | [optional] |
| **name** | **String**| Retrieve only scores with this name. | [optional] |
| **fromTimestamp** | **OffsetDateTime**| Optional filter to only include scores created on or after a certain datetime (ISO 8601) | [optional] |
| **toTimestamp** | **OffsetDateTime**| Optional filter to only include scores created before a certain datetime (ISO 8601) | [optional] |
| **source** | [**ScoreSource**](.md)| Retrieve only scores from a specific source. | [optional] [enum: ANNOTATION, API, EVAL] |
| **operator** | **String**| Retrieve only scores with &lt;operator&gt; value. | [optional] |
| **value** | **Double**| Retrieve only scores with &lt;operator&gt; value. | [optional] |
| **scoreIds** | **String**| Comma-separated list of score IDs to limit the results to. | [optional] |
| **configId** | **String**| Retrieve only scores with a specific configId. | [optional] |
| **dataType** | [**ScoreDataType**](.md)| Retrieve only scores with a specific dataType. | [optional] [enum: NUMERIC, BOOLEAN, CATEGORICAL] |

### Return type

[**Scores**](Scores.md)

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

<a id="scoreGetById"></a>
# **scoreGetById**
> Score scoreGetById(scoreId)



Get a score

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.ScoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    ScoreApi apiInstance = new ScoreApi(defaultClient);
    String scoreId = "scoreId_example"; // String | The unique langfuse identifier of a score
    try {
      Score result = apiInstance.scoreGetById(scoreId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScoreApi#scoreGetById");
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
| **scoreId** | **String**| The unique langfuse identifier of a score | |

### Return type

[**Score**](Score.md)

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

