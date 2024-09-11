

# Observation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier of the observation |  |
|**traceId** | **String** | The trace ID associated with the observation |  [optional] |
|**type** | **String** | The type of the observation |  |
|**name** | **String** | The name of the observation |  [optional] |
|**startTime** | **OffsetDateTime** | The start time of the observation |  |
|**endTime** | **OffsetDateTime** | The end time of the observation. |  [optional] |
|**completionStartTime** | **OffsetDateTime** | The completion start time of the observation |  [optional] |
|**model** | **String** | The model used for the observation |  [optional] |
|**modelParameters** | [**Map&lt;String, MapValue&gt;**](MapValue.md) | The parameters of the model used for the observation |  [optional] |
|**input** | **Object** | The input data of the observation |  [optional] |
|**version** | **String** | The version of the observation |  [optional] |
|**metadata** | **Object** | Additional metadata of the observation |  [optional] |
|**output** | **Object** | The output data of the observation |  [optional] |
|**usage** | [**Usage**](Usage.md) |  |  [optional] |
|**level** | **ObservationLevel** |  |  |
|**statusMessage** | **String** | The status message of the observation |  [optional] |
|**parentObservationId** | **String** | The parent observation ID |  [optional] |
|**promptId** | **String** | The prompt ID associated with the observation |  [optional] |



