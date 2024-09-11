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
import com.kuga.langfuse.client.model.ObservationsView;
import com.kuga.langfuse.client.model.ObservationsViews;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObservationsApi
 */
@Disabled
public class ObservationsApiTest {

    private final ObservationsApi api = new ObservationsApi();

    /**
     * Get a observation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void observationsGetTest() throws ApiException {
        String observationId = null;
        ObservationsView response = api.observationsGet(observationId);
        // TODO: test validations
    }

    /**
     * Get a list of observations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void observationsGetManyTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String name = null;
        String userId = null;
        String type = null;
        String traceId = null;
        String parentObservationId = null;
        OffsetDateTime fromStartTime = null;
        OffsetDateTime toStartTime = null;
        String version = null;
        ObservationsViews response = api.observationsGetMany(page, limit, name, userId, type, traceId, parentObservationId, fromStartTime, toStartTime, version);
        // TODO: test validations
    }

}
