

# ScoreConfig

Configuration for a score

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**name** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**projectId** | **String** |  |  |
|**dataType** | **ScoreDataType** |  |  |
|**isArchived** | **Boolean** | Whether the score config is archived. Defaults to false |  |
|**minValue** | **Double** | Sets minimum value for numerical scores. If not set, the minimum value defaults to -∞ |  [optional] |
|**maxValue** | **Double** | Sets maximum value for numerical scores. If not set, the maximum value defaults to +∞ |  [optional] |
|**categories** | [**List&lt;ConfigCategory&gt;**](ConfigCategory.md) | Configures custom categories for categorical scores |  [optional] |
|**description** | **String** |  |  [optional] |



