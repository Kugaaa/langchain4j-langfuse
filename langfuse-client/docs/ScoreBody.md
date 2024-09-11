

# ScoreBody


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
|**configId** | **String** | Reference a score config on a score. When set, the score name must equal the config name and scores must comply with the config&#39;s range and data type. For categorical scores, the value must map to a config category. Numeric scores might be constrained by the score config&#39;s max and min values |  [optional] |



