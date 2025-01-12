# langfuse-client

langfuse
- API version: 
  - Build date: 2024-09-11T13:40:58.189755+08:00[Asia/Shanghai]
  - Generator version: 7.8.0

## Authentication

Authenticate with the API using [Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication), get API keys in the project settings:

- username: Langfuse Public Key
- password: Langfuse Secret Key

## Exports

- OpenAPI spec: https://cloud.langfuse.com/generated/api/openapi.yml
- Postman collection: https://cloud.langfuse.com/generated/postman/collection.json


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>langfuse-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'langfuse-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'langfuse-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:langfuse-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/langfuse-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DatasetItemsApi* | [**datasetItemsCreate**](docs/DatasetItemsApi.md#datasetItemsCreate) | **POST** /api/public/dataset-items | 
*DatasetItemsApi* | [**datasetItemsGet**](docs/DatasetItemsApi.md#datasetItemsGet) | **GET** /api/public/dataset-items/{id} | 
*DatasetItemsApi* | [**datasetItemsList**](docs/DatasetItemsApi.md#datasetItemsList) | **GET** /api/public/dataset-items | 
*DatasetRunItemsApi* | [**datasetRunItemsCreate**](docs/DatasetRunItemsApi.md#datasetRunItemsCreate) | **POST** /api/public/dataset-run-items | 
*DatasetsApi* | [**datasetsCreate**](docs/DatasetsApi.md#datasetsCreate) | **POST** /api/public/v2/datasets | 
*DatasetsApi* | [**datasetsGet**](docs/DatasetsApi.md#datasetsGet) | **GET** /api/public/v2/datasets/{datasetName} | 
*DatasetsApi* | [**datasetsGetRun**](docs/DatasetsApi.md#datasetsGetRun) | **GET** /api/public/datasets/{datasetName}/runs/{runName} | 
*DatasetsApi* | [**datasetsGetRuns**](docs/DatasetsApi.md#datasetsGetRuns) | **GET** /api/public/datasets/{datasetName}/runs | 
*DatasetsApi* | [**datasetsList**](docs/DatasetsApi.md#datasetsList) | **GET** /api/public/v2/datasets | 
*HealthApi* | [**healthHealth**](docs/HealthApi.md#healthHealth) | **GET** /api/public/health | 
*IngestionApi* | [**ingestionBatch**](docs/IngestionApi.md#ingestionBatch) | **POST** /api/public/ingestion | 
*MetricsApi* | [**metricsDaily**](docs/MetricsApi.md#metricsDaily) | **GET** /api/public/metrics/daily | 
*ModelsApi* | [**modelsCreate**](docs/ModelsApi.md#modelsCreate) | **POST** /api/public/models | 
*ModelsApi* | [**modelsDelete**](docs/ModelsApi.md#modelsDelete) | **DELETE** /api/public/models/{id} | 
*ModelsApi* | [**modelsGet**](docs/ModelsApi.md#modelsGet) | **GET** /api/public/models/{id} | 
*ModelsApi* | [**modelsList**](docs/ModelsApi.md#modelsList) | **GET** /api/public/models | 
*ObservationsApi* | [**observationsGet**](docs/ObservationsApi.md#observationsGet) | **GET** /api/public/observations/{observationId} | 
*ObservationsApi* | [**observationsGetMany**](docs/ObservationsApi.md#observationsGetMany) | **GET** /api/public/observations | 
*ProjectsApi* | [**projectsGet**](docs/ProjectsApi.md#projectsGet) | **GET** /api/public/projects | 
*PromptsApi* | [**promptsCreate**](docs/PromptsApi.md#promptsCreate) | **POST** /api/public/v2/prompts | 
*PromptsApi* | [**promptsGet**](docs/PromptsApi.md#promptsGet) | **GET** /api/public/v2/prompts/{promptName} | 
*PromptsApi* | [**promptsList**](docs/PromptsApi.md#promptsList) | **GET** /api/public/v2/prompts | 
*ScoreApi* | [**scoreCreate**](docs/ScoreApi.md#scoreCreate) | **POST** /api/public/scores | 
*ScoreApi* | [**scoreDelete**](docs/ScoreApi.md#scoreDelete) | **DELETE** /api/public/scores/{scoreId} | 
*ScoreApi* | [**scoreGet**](docs/ScoreApi.md#scoreGet) | **GET** /api/public/scores | 
*ScoreApi* | [**scoreGetById**](docs/ScoreApi.md#scoreGetById) | **GET** /api/public/scores/{scoreId} | 
*ScoreConfigsApi* | [**scoreConfigsCreate**](docs/ScoreConfigsApi.md#scoreConfigsCreate) | **POST** /api/public/score-configs | 
*ScoreConfigsApi* | [**scoreConfigsGet**](docs/ScoreConfigsApi.md#scoreConfigsGet) | **GET** /api/public/score-configs | 
*ScoreConfigsApi* | [**scoreConfigsGetById**](docs/ScoreConfigsApi.md#scoreConfigsGetById) | **GET** /api/public/score-configs/{configId} | 
*SessionsApi* | [**sessionsGet**](docs/SessionsApi.md#sessionsGet) | **GET** /api/public/sessions/{sessionId} | 
*SessionsApi* | [**sessionsList**](docs/SessionsApi.md#sessionsList) | **GET** /api/public/sessions | 
*TraceApi* | [**traceGet**](docs/TraceApi.md#traceGet) | **GET** /api/public/traces/{traceId} | 
*TraceApi* | [**traceList**](docs/TraceApi.md#traceList) | **GET** /api/public/traces | 


## Documentation for Models

 - [BaseEvent](docs/BaseEvent.md)
 - [BasePrompt](docs/BasePrompt.md)
 - [BaseScore](docs/BaseScore.md)
 - [BooleanScore](docs/BooleanScore.md)
 - [CategoricalScore](docs/CategoricalScore.md)
 - [ChatMessage](docs/ChatMessage.md)
 - [ChatPrompt](docs/ChatPrompt.md)
 - [ConfigCategory](docs/ConfigCategory.md)
 - [CreateChatPromptRequest](docs/CreateChatPromptRequest.md)
 - [CreateDatasetItemRequest](docs/CreateDatasetItemRequest.md)
 - [CreateDatasetRequest](docs/CreateDatasetRequest.md)
 - [CreateDatasetRunItemRequest](docs/CreateDatasetRunItemRequest.md)
 - [CreateEventBody](docs/CreateEventBody.md)
 - [CreateEventEvent](docs/CreateEventEvent.md)
 - [CreateGenerationBody](docs/CreateGenerationBody.md)
 - [CreateGenerationEvent](docs/CreateGenerationEvent.md)
 - [CreateModelRequest](docs/CreateModelRequest.md)
 - [CreateObservationEvent](docs/CreateObservationEvent.md)
 - [CreatePromptRequest](docs/CreatePromptRequest.md)
 - [CreatePromptRequestOneOf](docs/CreatePromptRequestOneOf.md)
 - [CreatePromptRequestOneOf1](docs/CreatePromptRequestOneOf1.md)
 - [CreateScoreConfigRequest](docs/CreateScoreConfigRequest.md)
 - [CreateScoreRequest](docs/CreateScoreRequest.md)
 - [CreateScoreResponse](docs/CreateScoreResponse.md)
 - [CreateScoreValue](docs/CreateScoreValue.md)
 - [CreateSpanBody](docs/CreateSpanBody.md)
 - [CreateSpanEvent](docs/CreateSpanEvent.md)
 - [CreateTextPromptRequest](docs/CreateTextPromptRequest.md)
 - [DailyMetrics](docs/DailyMetrics.md)
 - [DailyMetricsDetails](docs/DailyMetricsDetails.md)
 - [Dataset](docs/Dataset.md)
 - [DatasetItem](docs/DatasetItem.md)
 - [DatasetRun](docs/DatasetRun.md)
 - [DatasetRunItem](docs/DatasetRunItem.md)
 - [DatasetRunWithItems](docs/DatasetRunWithItems.md)
 - [DatasetStatus](docs/DatasetStatus.md)
 - [HealthResponse](docs/HealthResponse.md)
 - [IngestionBatchRequest](docs/IngestionBatchRequest.md)
 - [IngestionError](docs/IngestionError.md)
 - [IngestionEvent](docs/IngestionEvent.md)
 - [IngestionEventOneOf](docs/IngestionEventOneOf.md)
 - [IngestionEventOneOf1](docs/IngestionEventOneOf1.md)
 - [IngestionEventOneOf2](docs/IngestionEventOneOf2.md)
 - [IngestionEventOneOf3](docs/IngestionEventOneOf3.md)
 - [IngestionEventOneOf4](docs/IngestionEventOneOf4.md)
 - [IngestionEventOneOf5](docs/IngestionEventOneOf5.md)
 - [IngestionEventOneOf6](docs/IngestionEventOneOf6.md)
 - [IngestionEventOneOf7](docs/IngestionEventOneOf7.md)
 - [IngestionEventOneOf8](docs/IngestionEventOneOf8.md)
 - [IngestionEventOneOf9](docs/IngestionEventOneOf9.md)
 - [IngestionResponse](docs/IngestionResponse.md)
 - [IngestionSuccess](docs/IngestionSuccess.md)
 - [IngestionUsage](docs/IngestionUsage.md)
 - [MapValue](docs/MapValue.md)
 - [Model](docs/Model.md)
 - [ModelUsageUnit](docs/ModelUsageUnit.md)
 - [NumericScore](docs/NumericScore.md)
 - [Observation](docs/Observation.md)
 - [ObservationBody](docs/ObservationBody.md)
 - [ObservationLevel](docs/ObservationLevel.md)
 - [ObservationType](docs/ObservationType.md)
 - [Observations](docs/Observations.md)
 - [ObservationsView](docs/ObservationsView.md)
 - [ObservationsViews](docs/ObservationsViews.md)
 - [OpenAIUsage](docs/OpenAIUsage.md)
 - [OptionalObservationBody](docs/OptionalObservationBody.md)
 - [PaginatedDatasetItems](docs/PaginatedDatasetItems.md)
 - [PaginatedDatasetRuns](docs/PaginatedDatasetRuns.md)
 - [PaginatedDatasets](docs/PaginatedDatasets.md)
 - [PaginatedModels](docs/PaginatedModels.md)
 - [PaginatedSessions](docs/PaginatedSessions.md)
 - [Project](docs/Project.md)
 - [Projects](docs/Projects.md)
 - [Prompt](docs/Prompt.md)
 - [PromptMeta](docs/PromptMeta.md)
 - [PromptMetaListResponse](docs/PromptMetaListResponse.md)
 - [PromptOneOf](docs/PromptOneOf.md)
 - [PromptOneOf1](docs/PromptOneOf1.md)
 - [SDKLogBody](docs/SDKLogBody.md)
 - [SDKLogEvent](docs/SDKLogEvent.md)
 - [Score](docs/Score.md)
 - [ScoreBody](docs/ScoreBody.md)
 - [ScoreConfig](docs/ScoreConfig.md)
 - [ScoreConfigs](docs/ScoreConfigs.md)
 - [ScoreDataType](docs/ScoreDataType.md)
 - [ScoreEvent](docs/ScoreEvent.md)
 - [ScoreOneOf](docs/ScoreOneOf.md)
 - [ScoreOneOf1](docs/ScoreOneOf1.md)
 - [ScoreOneOf2](docs/ScoreOneOf2.md)
 - [ScoreSource](docs/ScoreSource.md)
 - [Scores](docs/Scores.md)
 - [Session](docs/Session.md)
 - [SessionWithTraces](docs/SessionWithTraces.md)
 - [Sort](docs/Sort.md)
 - [TextPrompt](docs/TextPrompt.md)
 - [Trace](docs/Trace.md)
 - [TraceBody](docs/TraceBody.md)
 - [TraceEvent](docs/TraceEvent.md)
 - [TraceWithDetails](docs/TraceWithDetails.md)
 - [TraceWithFullDetails](docs/TraceWithFullDetails.md)
 - [Traces](docs/Traces.md)
 - [UpdateEventBody](docs/UpdateEventBody.md)
 - [UpdateGenerationBody](docs/UpdateGenerationBody.md)
 - [UpdateGenerationEvent](docs/UpdateGenerationEvent.md)
 - [UpdateObservationEvent](docs/UpdateObservationEvent.md)
 - [UpdateSpanBody](docs/UpdateSpanBody.md)
 - [UpdateSpanEvent](docs/UpdateSpanEvent.md)
 - [Usage](docs/Usage.md)
 - [UsageByModel](docs/UsageByModel.md)
 - [UtilsMetaResponse](docs/UtilsMetaResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



