

# CreateScoreRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**traceId** | **String** |  |  |
|**name** | **String** |  |  |
|**value** | [**CreateScoreValue**](CreateScoreValue.md) |  |  |
|**observationId** | **String** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**dataType** | **ScoreDataType** |  |  [optional] |
|**configId** | **String** | Reference a score config on a score. The unique langfuse identifier of a score config. When passing this field, the dataType and stringValue fields are automatically populated. |  [optional] |



