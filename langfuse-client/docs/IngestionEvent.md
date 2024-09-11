

# IngestionEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**body** | [**ObservationBody**](ObservationBody.md) |  |  |
|**id** | **String** | UUID v4 that identifies the event |  |
|**timestamp** | **String** | Datetime (ISO 8601) of event creation in client. Should be as close to actual event creation in client as possible, this timestamp will be used for ordering of events in future release. Resolution: milliseconds (required), microseconds (optimal). |  |
|**metadata** | **Object** | Optional. Metadata field used by the Langfuse SDKs for debugging. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TRACE_CREATE | &quot;trace-create&quot; |
| SCORE_CREATE | &quot;score-create&quot; |
| SPAN_CREATE | &quot;span-create&quot; |
| SPAN_UPDATE | &quot;span-update&quot; |
| GENERATION_CREATE | &quot;generation-create&quot; |
| GENERATION_UPDATE | &quot;generation-update&quot; |
| EVENT_CREATE | &quot;event-create&quot; |
| SDK_LOG | &quot;sdk-log&quot; |
| OBSERVATION_CREATE | &quot;observation-create&quot; |
| OBSERVATION_UPDATE | &quot;observation-update&quot; |



