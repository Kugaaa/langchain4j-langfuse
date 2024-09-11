

# CreateSpanEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | [**CreateSpanBody**](CreateSpanBody.md) |  |  |
|**id** | **String** | UUID v4 that identifies the event |  |
|**timestamp** | **String** | Datetime (ISO 8601) of event creation in client. Should be as close to actual event creation in client as possible, this timestamp will be used for ordering of events in future release. Resolution: milliseconds (required), microseconds (optimal). |  |
|**metadata** | **Object** | Optional. Metadata field used by the Langfuse SDKs for debugging. |  [optional] |



