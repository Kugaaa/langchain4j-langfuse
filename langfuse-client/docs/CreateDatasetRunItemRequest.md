

# CreateDatasetRunItemRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runName** | **String** |  |  |
|**runDescription** | **String** | Description of the run. If run exists, description will be updated. |  [optional] |
|**metadata** | **Object** | Metadata of the dataset run, updates run if run already exists |  [optional] |
|**datasetItemId** | **String** |  |  |
|**observationId** | **String** |  |  [optional] |
|**traceId** | **String** | traceId should always be provided. For compatibility with older SDK versions it can also be inferred from the provided observationId. |  [optional] |



