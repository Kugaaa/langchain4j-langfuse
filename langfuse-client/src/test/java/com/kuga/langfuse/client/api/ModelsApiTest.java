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
import com.kuga.langfuse.client.model.CreateModelRequest;
import com.kuga.langfuse.client.model.Model;
import com.kuga.langfuse.client.model.PaginatedModels;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModelsApi
 */
@Disabled
public class ModelsApiTest {

    private final ModelsApi api = new ModelsApi();

    /**
     * Create a model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modelsCreateTest() throws ApiException {
        CreateModelRequest createModelRequest = null;
        Model response = api.modelsCreate(createModelRequest);
        // TODO: test validations
    }

    /**
     * Delete a model. Cannot delete models managed by Langfuse. You can create your own definition with the same modelName to override the definition though.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modelsDeleteTest() throws ApiException {
        String id = null;
        api.modelsDelete(id);
        // TODO: test validations
    }

    /**
     * Get a model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modelsGetTest() throws ApiException {
        String id = null;
        Model response = api.modelsGet(id);
        // TODO: test validations
    }

    /**
     * Get all models
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modelsListTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        PaginatedModels response = api.modelsList(page, limit);
        // TODO: test validations
    }

}
