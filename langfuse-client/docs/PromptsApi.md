# PromptsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**promptsCreate**](PromptsApi.md#promptsCreate) | **POST** /api/public/v2/prompts |  |
| [**promptsGet**](PromptsApi.md#promptsGet) | **GET** /api/public/v2/prompts/{promptName} |  |
| [**promptsList**](PromptsApi.md#promptsList) | **GET** /api/public/v2/prompts |  |


<a id="promptsCreate"></a>
# **promptsCreate**
> Prompt promptsCreate(createPromptRequest)



Create a new version for the prompt with the given &#x60;name&#x60;

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.PromptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PromptsApi apiInstance = new PromptsApi(defaultClient);
    CreatePromptRequest createPromptRequest = new CreatePromptRequest(); // CreatePromptRequest | 
    try {
      Prompt result = apiInstance.promptsCreate(createPromptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptsApi#promptsCreate");
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
| **createPromptRequest** | [**CreatePromptRequest**](CreatePromptRequest.md)|  | |

### Return type

[**Prompt**](Prompt.md)

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

<a id="promptsGet"></a>
# **promptsGet**
> Prompt promptsGet(promptName, version, label)



Get a prompt

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.PromptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PromptsApi apiInstance = new PromptsApi(defaultClient);
    String promptName = "promptName_example"; // String | The name of the prompt
    Integer version = 56; // Integer | Version of the prompt to be retrieved.
    String label = "label_example"; // String | Label of the prompt to be retrieved. Defaults to \"production\" if no label or version is set.
    try {
      Prompt result = apiInstance.promptsGet(promptName, version, label);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptsApi#promptsGet");
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
| **promptName** | **String**| The name of the prompt | |
| **version** | **Integer**| Version of the prompt to be retrieved. | [optional] |
| **label** | **String**| Label of the prompt to be retrieved. Defaults to \&quot;production\&quot; if no label or version is set. | [optional] |

### Return type

[**Prompt**](Prompt.md)

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

<a id="promptsList"></a>
# **promptsList**
> PromptMetaListResponse promptsList(name, label, tag, page, limit, fromUpdatedAt, toUpdatedAt)



Get a list of prompt names with versions and labels

### Example
```java
// Import classes:
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.auth.*;
import com.kuga.langfuse.client.invoker.models.*;
import com.kuga.langfuse.client.api.PromptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    PromptsApi apiInstance = new PromptsApi(defaultClient);
    String name = "name_example"; // String | 
    String label = "label_example"; // String | 
    String tag = "tag_example"; // String | 
    Integer page = 56; // Integer | page number, starts at 1
    Integer limit = 56; // Integer | limit of items per page
    OffsetDateTime fromUpdatedAt = OffsetDateTime.now(); // OffsetDateTime | Optional filter to only include prompt versions created/updated on or after a certain datetime (ISO 8601)
    OffsetDateTime toUpdatedAt = OffsetDateTime.now(); // OffsetDateTime | Optional filter to only include prompt versions created/updated before a certain datetime (ISO 8601)
    try {
      PromptMetaListResponse result = apiInstance.promptsList(name, label, tag, page, limit, fromUpdatedAt, toUpdatedAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptsApi#promptsList");
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
| **name** | **String**|  | [optional] |
| **label** | **String**|  | [optional] |
| **tag** | **String**|  | [optional] |
| **page** | **Integer**| page number, starts at 1 | [optional] |
| **limit** | **Integer**| limit of items per page | [optional] |
| **fromUpdatedAt** | **OffsetDateTime**| Optional filter to only include prompt versions created/updated on or after a certain datetime (ISO 8601) | [optional] |
| **toUpdatedAt** | **OffsetDateTime**| Optional filter to only include prompt versions created/updated before a certain datetime (ISO 8601) | [optional] |

### Return type

[**PromptMetaListResponse**](PromptMetaListResponse.md)

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

