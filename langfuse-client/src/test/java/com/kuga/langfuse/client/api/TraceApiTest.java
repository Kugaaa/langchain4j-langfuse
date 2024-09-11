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
import java.time.OffsetDateTime;
import com.kuga.langfuse.client.model.TraceWithFullDetails;
import com.kuga.langfuse.client.model.Traces;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TraceApi
 */
@Disabled
public class TraceApiTest {

    private final TraceApi api = new TraceApi();

    /**
     * Get a specific trace
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void traceGetTest() throws ApiException {
        String traceId = null;
        TraceWithFullDetails response = api.traceGet(traceId);
        // TODO: test validations
    }

    /**
     * Get list of traces
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void traceListTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String userId = null;
        String name = null;
        String sessionId = null;
        OffsetDateTime fromTimestamp = null;
        OffsetDateTime toTimestamp = null;
        String orderBy = null;
        List<String> tags = null;
        String version = null;
        String release = null;
        Traces response = api.traceList(page, limit, userId, name, sessionId, fromTimestamp, toTimestamp, orderBy, tags, version, release);
        // TODO: test validations
    }

}
