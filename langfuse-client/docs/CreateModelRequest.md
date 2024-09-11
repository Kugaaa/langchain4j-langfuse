

# CreateModelRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modelName** | **String** | Name of the model definition. If multiple with the same name exist, they are applied in the following order: (1) custom over built-in, (2) newest according to startTime where model.startTime&lt;observation.startTime |  |
|**matchPattern** | **String** | Regex pattern which matches this model definition to generation.model. Useful in case of fine-tuned models. If you want to exact match, use &#x60;(?i)^modelname$&#x60; |  |
|**startDate** | **String** | Apply only to generations which are newer than this ISO date. |  [optional] |
|**unit** | **ModelUsageUnit** |  |  |
|**inputPrice** | **Double** | Price (USD) per input unit |  [optional] |
|**outputPrice** | **Double** | Price (USD) per output unit |  [optional] |
|**totalPrice** | **Double** | Price (USD) per total units. Cannot be set if input or output price is set. |  [optional] |
|**tokenizerId** | **String** | Optional. Tokenizer to be applied to observations which match to this model. See docs for more details. |  [optional] |
|**tokenizerConfig** | **Object** | Optional. Configuration for the selected tokenizer. Needs to be JSON. See docs for more details. |  [optional] |



