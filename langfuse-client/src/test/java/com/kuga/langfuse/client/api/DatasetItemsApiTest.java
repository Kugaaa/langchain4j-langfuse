/*
 * langfuse
 * ## Authentication  Authenticate with the API using [Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication), get API keys in the project settings:  - username: Langfuse Public Key - password: Langfuse Secret Key  ## Exports  - OpenAPI spec: https://cloud.langfuse.com/generated/api/openapi.yml - Postman collection: https://cloud.langfuse.com/generated/postman/collection.json
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kuga.langfuse.client.api;

import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.model.CreateDatasetItemRequest;
import com.kuga.langfuse.client.model.DatasetItem;
import com.kuga.langfuse.client.model.PaginatedDatasetItems;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatasetItemsApi
 */
@Disabled
public class DatasetItemsApiTest {

    private final DatasetItemsApi api = new DatasetItemsApi();

    /**
     * Create a dataset item
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void datasetItemsCreateTest() throws ApiException {
        CreateDatasetItemRequest createDatasetItemRequest = null;
        DatasetItem response = api.datasetItemsCreate(createDatasetItemRequest);
        // TODO: test validations
    }

    /**
     * Get a dataset item
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void datasetItemsGetTest() throws ApiException {
        String id = null;
        DatasetItem response = api.datasetItemsGet(id);
        // TODO: test validations
    }

    /**
     * Get dataset items
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void datasetItemsListTest() throws ApiException {
        String datasetName = null;
        String sourceTraceId = null;
        String sourceObservationId = null;
        Integer page = null;
        Integer limit = null;
        PaginatedDatasetItems response = api.datasetItemsList(datasetName, sourceTraceId, sourceObservationId, page, limit);
        // TODO: test validations
    }

}
