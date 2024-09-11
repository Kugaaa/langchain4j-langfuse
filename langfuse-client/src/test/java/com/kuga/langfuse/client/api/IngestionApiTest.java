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
import com.kuga.langfuse.client.model.IngestionBatchRequest;
import com.kuga.langfuse.client.model.IngestionResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IngestionApi
 */
@Disabled
public class IngestionApiTest {

    private final IngestionApi api = new IngestionApi();

    /**
     * Batched ingestion for Langfuse Tracing. If you want to use tracing via the API, such as to build your own Langfuse client implementation, this is the only API route you need to implement.  Notes:  - Batch sizes are limited to 3.5 MB in total. You need to adjust the number of events per batch accordingly. - The API does not return a 4xx status code for input errors. Instead, it responds with a 207 status code, which includes a list of the encountered errors.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ingestionBatchTest() throws ApiException {
        IngestionBatchRequest ingestionBatchRequest = null;
        IngestionResponse response = api.ingestionBatch(ingestionBatchRequest);
        // TODO: test validations
    }

}
