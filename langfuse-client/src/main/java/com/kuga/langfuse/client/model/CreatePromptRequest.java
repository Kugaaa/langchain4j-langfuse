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


package com.kuga.langfuse.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kuga.langfuse.client.model.CreatePromptRequestOneOf;
import com.kuga.langfuse.client.model.CreatePromptRequestOneOf1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.kuga.langfuse.client.invoker.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-11T13:40:58.189755+08:00[Asia/Shanghai]", comments = "Generator version: 7.8.0")
public class CreatePromptRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreatePromptRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreatePromptRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreatePromptRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreatePromptRequestOneOf> adapterCreatePromptRequestOneOf = gson.getDelegateAdapter(this, TypeToken.get(CreatePromptRequestOneOf.class));
            final TypeAdapter<CreatePromptRequestOneOf1> adapterCreatePromptRequestOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(CreatePromptRequestOneOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<CreatePromptRequest>() {
                @Override
                public void write(JsonWriter out, CreatePromptRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreatePromptRequestOneOf`
                    if (value.getActualInstance() instanceof CreatePromptRequestOneOf) {
                        JsonElement element = adapterCreatePromptRequestOneOf.toJsonTree((CreatePromptRequestOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CreatePromptRequestOneOf1`
                    if (value.getActualInstance() instanceof CreatePromptRequestOneOf1) {
                        JsonElement element = adapterCreatePromptRequestOneOf1.toJsonTree((CreatePromptRequestOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreatePromptRequestOneOf, CreatePromptRequestOneOf1");
                }

                @Override
                public CreatePromptRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreatePromptRequestOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreatePromptRequestOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreatePromptRequestOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreatePromptRequestOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreatePromptRequestOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreatePromptRequestOneOf'", e);
                    }
                    // deserialize CreatePromptRequestOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreatePromptRequestOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreatePromptRequestOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreatePromptRequestOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreatePromptRequestOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreatePromptRequestOneOf1'", e);
                    }

                    if (match == 1) {
                        CreatePromptRequest ret = new CreatePromptRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreatePromptRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreatePromptRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CreatePromptRequest(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreatePromptRequestOneOf", CreatePromptRequestOneOf.class);
        schemas.put("CreatePromptRequestOneOf1", CreatePromptRequestOneOf1.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreatePromptRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreatePromptRequestOneOf, CreatePromptRequestOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreatePromptRequestOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreatePromptRequestOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreatePromptRequestOneOf, CreatePromptRequestOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreatePromptRequestOneOf, CreatePromptRequestOneOf1
     *
     * @return The actual instance (CreatePromptRequestOneOf, CreatePromptRequestOneOf1)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreatePromptRequestOneOf`. If the actual instance is not `CreatePromptRequestOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreatePromptRequestOneOf`
     * @throws ClassCastException if the instance is not `CreatePromptRequestOneOf`
     */
    public CreatePromptRequestOneOf getCreatePromptRequestOneOf() throws ClassCastException {
        return (CreatePromptRequestOneOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreatePromptRequestOneOf1`. If the actual instance is not `CreatePromptRequestOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreatePromptRequestOneOf1`
     * @throws ClassCastException if the instance is not `CreatePromptRequestOneOf1`
     */
    public CreatePromptRequestOneOf1 getCreatePromptRequestOneOf1() throws ClassCastException {
        return (CreatePromptRequestOneOf1)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreatePromptRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CreatePromptRequestOneOf
        try {
            CreatePromptRequestOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreatePromptRequestOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CreatePromptRequestOneOf1
        try {
            CreatePromptRequestOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreatePromptRequestOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreatePromptRequest with oneOf schemas: CreatePromptRequestOneOf, CreatePromptRequestOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreatePromptRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreatePromptRequest
     * @throws IOException if the JSON string is invalid with respect to CreatePromptRequest
     */
    public static CreatePromptRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreatePromptRequest.class);
    }

    /**
     * Convert an instance of CreatePromptRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
