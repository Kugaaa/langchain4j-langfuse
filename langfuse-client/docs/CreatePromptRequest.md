

# CreatePromptRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** |  |  |
|**prompt** | **String** |  |  |
|**config** | **Object** |  |  [optional] |
|**labels** | **List&lt;String&gt;** | List of deployment labels of this prompt version. |  [optional] |
|**tags** | **List&lt;String&gt;** | List of tags to apply to all versions of this prompt. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHAT | &quot;chat&quot; |
| TEXT | &quot;text&quot; |



