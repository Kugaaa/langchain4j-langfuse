

# Score


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  |  |
|**value** | **Double** | The numeric value of the score. Equals 1 for \&quot;True\&quot; and 0 for \&quot;False\&quot; |  |
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
|**stringValue** | **String** | The string representation of the score value. Is inferred from the numeric value and equals \&quot;True\&quot; or \&quot;False\&quot; |  |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| BOOLEAN | &quot;BOOLEAN&quot; |



