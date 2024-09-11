

# ScoreOneOf1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **Double** | Only defined if a config is linked. Represents the numeric category mapping of the stringValue |  [optional] |
|**stringValue** | **String** | The string representation of the score value. If no config is linked, can be any string. Otherwise, must map to a config category |  |
|**id** | **String** |  |  |
|**traceId** | **String** |  |  |
|**name** | **String** |  |  |
|**source** | **ScoreSource** |  |  |
|**observationId** | **String** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**authorUserId** | **String** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**configId** | **String** | Reference a score config on a score. When set, config and score name must be equal and value must comply to optionally defined numerical range |  [optional] |
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  |  |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| CATEGORICAL | &quot;CATEGORICAL&quot; |



