

# Trace


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier of a trace |  |
|**timestamp** | **OffsetDateTime** | The timestamp when the trace was created |  |
|**name** | **String** | The name of the trace |  [optional] |
|**input** | **Object** | The input data of the trace. Can be any JSON. |  [optional] |
|**output** | **Object** | The output data of the trace. Can be any JSON. |  [optional] |
|**sessionId** | **String** | The session identifier associated with the trace |  [optional] |
|**release** | **String** | The release version of the application when the trace was created |  [optional] |
|**version** | **String** | The version of the trace |  [optional] |
|**userId** | **String** | The user identifier associated with the trace |  [optional] |
|**metadata** | **Object** | The metadata associated with the trace. Can be any JSON. |  [optional] |
|**tags** | **List&lt;String&gt;** | The tags associated with the trace. Can be an array of strings or null. |  [optional] |
|**_public** | **Boolean** | Public traces are accessible via url without login |  [optional] |



