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

import com.kuga.langfuse.client.invoker.ApiCallback;
import com.kuga.langfuse.client.invoker.ApiClient;
import com.kuga.langfuse.client.invoker.ApiException;
import com.kuga.langfuse.client.invoker.ApiResponse;
import com.kuga.langfuse.client.invoker.Configuration;
import com.kuga.langfuse.client.invoker.Pair;
import com.kuga.langfuse.client.invoker.ProgressRequestBody;
import com.kuga.langfuse.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kuga.langfuse.client.model.CreatePromptRequest;
import java.time.OffsetDateTime;
import com.kuga.langfuse.client.model.Prompt;
import com.kuga.langfuse.client.model.PromptMetaListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromptsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PromptsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PromptsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for promptsCreate
     * @param createPromptRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call promptsCreateCall(CreatePromptRequest createPromptRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createPromptRequest;

        // create path and map variables
        String localVarPath = "/api/public/v2/prompts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call promptsCreateValidateBeforeCall(CreatePromptRequest createPromptRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createPromptRequest' is set
        if (createPromptRequest == null) {
            throw new ApiException("Missing the required parameter 'createPromptRequest' when calling promptsCreate(Async)");
        }

        return promptsCreateCall(createPromptRequest, _callback);

    }

    /**
     * 
     * Create a new version for the prompt with the given &#x60;name&#x60;
     * @param createPromptRequest  (required)
     * @return Prompt
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Prompt promptsCreate(CreatePromptRequest createPromptRequest) throws ApiException {
        ApiResponse<Prompt> localVarResp = promptsCreateWithHttpInfo(createPromptRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a new version for the prompt with the given &#x60;name&#x60;
     * @param createPromptRequest  (required)
     * @return ApiResponse&lt;Prompt&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Prompt> promptsCreateWithHttpInfo(CreatePromptRequest createPromptRequest) throws ApiException {
        okhttp3.Call localVarCall = promptsCreateValidateBeforeCall(createPromptRequest, null);
        Type localVarReturnType = new TypeToken<Prompt>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a new version for the prompt with the given &#x60;name&#x60;
     * @param createPromptRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call promptsCreateAsync(CreatePromptRequest createPromptRequest, final ApiCallback<Prompt> _callback) throws ApiException {

        okhttp3.Call localVarCall = promptsCreateValidateBeforeCall(createPromptRequest, _callback);
        Type localVarReturnType = new TypeToken<Prompt>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for promptsGet
     * @param promptName The name of the prompt (required)
     * @param version Version of the prompt to be retrieved. (optional)
     * @param label Label of the prompt to be retrieved. Defaults to \&quot;production\&quot; if no label or version is set. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call promptsGetCall(String promptName, Integer version, String label, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/public/v2/prompts/{promptName}"
            .replace("{" + "promptName" + "}", localVarApiClient.escapeString(promptName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (label != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("label", label));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call promptsGetValidateBeforeCall(String promptName, Integer version, String label, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'promptName' is set
        if (promptName == null) {
            throw new ApiException("Missing the required parameter 'promptName' when calling promptsGet(Async)");
        }

        return promptsGetCall(promptName, version, label, _callback);

    }

    /**
     * 
     * Get a prompt
     * @param promptName The name of the prompt (required)
     * @param version Version of the prompt to be retrieved. (optional)
     * @param label Label of the prompt to be retrieved. Defaults to \&quot;production\&quot; if no label or version is set. (optional)
     * @return Prompt
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Prompt promptsGet(String promptName, Integer version, String label) throws ApiException {
        ApiResponse<Prompt> localVarResp = promptsGetWithHttpInfo(promptName, version, label);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a prompt
     * @param promptName The name of the prompt (required)
     * @param version Version of the prompt to be retrieved. (optional)
     * @param label Label of the prompt to be retrieved. Defaults to \&quot;production\&quot; if no label or version is set. (optional)
     * @return ApiResponse&lt;Prompt&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Prompt> promptsGetWithHttpInfo(String promptName, Integer version, String label) throws ApiException {
        okhttp3.Call localVarCall = promptsGetValidateBeforeCall(promptName, version, label, null);
        Type localVarReturnType = new TypeToken<Prompt>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a prompt
     * @param promptName The name of the prompt (required)
     * @param version Version of the prompt to be retrieved. (optional)
     * @param label Label of the prompt to be retrieved. Defaults to \&quot;production\&quot; if no label or version is set. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call promptsGetAsync(String promptName, Integer version, String label, final ApiCallback<Prompt> _callback) throws ApiException {

        okhttp3.Call localVarCall = promptsGetValidateBeforeCall(promptName, version, label, _callback);
        Type localVarReturnType = new TypeToken<Prompt>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for promptsList
     * @param name  (optional)
     * @param label  (optional)
     * @param tag  (optional)
     * @param page page number, starts at 1 (optional)
     * @param limit limit of items per page (optional)
     * @param fromUpdatedAt Optional filter to only include prompt versions created/updated on or after a certain datetime (ISO 8601) (optional)
     * @param toUpdatedAt Optional filter to only include prompt versions created/updated before a certain datetime (ISO 8601) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call promptsListCall(String name, String label, String tag, Integer page, Integer limit, OffsetDateTime fromUpdatedAt, OffsetDateTime toUpdatedAt, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/public/v2/prompts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (label != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("label", label));
        }

        if (tag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag", tag));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (fromUpdatedAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromUpdatedAt", fromUpdatedAt));
        }

        if (toUpdatedAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toUpdatedAt", toUpdatedAt));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call promptsListValidateBeforeCall(String name, String label, String tag, Integer page, Integer limit, OffsetDateTime fromUpdatedAt, OffsetDateTime toUpdatedAt, final ApiCallback _callback) throws ApiException {
        return promptsListCall(name, label, tag, page, limit, fromUpdatedAt, toUpdatedAt, _callback);

    }

    /**
     * 
     * Get a list of prompt names with versions and labels
     * @param name  (optional)
     * @param label  (optional)
     * @param tag  (optional)
     * @param page page number, starts at 1 (optional)
     * @param limit limit of items per page (optional)
     * @param fromUpdatedAt Optional filter to only include prompt versions created/updated on or after a certain datetime (ISO 8601) (optional)
     * @param toUpdatedAt Optional filter to only include prompt versions created/updated before a certain datetime (ISO 8601) (optional)
     * @return PromptMetaListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public PromptMetaListResponse promptsList(String name, String label, String tag, Integer page, Integer limit, OffsetDateTime fromUpdatedAt, OffsetDateTime toUpdatedAt) throws ApiException {
        ApiResponse<PromptMetaListResponse> localVarResp = promptsListWithHttpInfo(name, label, tag, page, limit, fromUpdatedAt, toUpdatedAt);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a list of prompt names with versions and labels
     * @param name  (optional)
     * @param label  (optional)
     * @param tag  (optional)
     * @param page page number, starts at 1 (optional)
     * @param limit limit of items per page (optional)
     * @param fromUpdatedAt Optional filter to only include prompt versions created/updated on or after a certain datetime (ISO 8601) (optional)
     * @param toUpdatedAt Optional filter to only include prompt versions created/updated before a certain datetime (ISO 8601) (optional)
     * @return ApiResponse&lt;PromptMetaListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PromptMetaListResponse> promptsListWithHttpInfo(String name, String label, String tag, Integer page, Integer limit, OffsetDateTime fromUpdatedAt, OffsetDateTime toUpdatedAt) throws ApiException {
        okhttp3.Call localVarCall = promptsListValidateBeforeCall(name, label, tag, page, limit, fromUpdatedAt, toUpdatedAt, null);
        Type localVarReturnType = new TypeToken<PromptMetaListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a list of prompt names with versions and labels
     * @param name  (optional)
     * @param label  (optional)
     * @param tag  (optional)
     * @param page page number, starts at 1 (optional)
     * @param limit limit of items per page (optional)
     * @param fromUpdatedAt Optional filter to only include prompt versions created/updated on or after a certain datetime (ISO 8601) (optional)
     * @param toUpdatedAt Optional filter to only include prompt versions created/updated before a certain datetime (ISO 8601) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 405 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call promptsListAsync(String name, String label, String tag, Integer page, Integer limit, OffsetDateTime fromUpdatedAt, OffsetDateTime toUpdatedAt, final ApiCallback<PromptMetaListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = promptsListValidateBeforeCall(name, label, tag, page, limit, fromUpdatedAt, toUpdatedAt, _callback);
        Type localVarReturnType = new TypeToken<PromptMetaListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}