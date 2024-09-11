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
import com.kuga.langfuse.client.model.ModelUsageUnit;
import com.kuga.langfuse.client.model.OpenAIUsage;
import com.kuga.langfuse.client.model.Usage;
import java.io.IOException;
import java.util.Arrays;
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
public class IngestionUsage extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(IngestionUsage.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!IngestionUsage.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'IngestionUsage' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Usage> adapterUsage = gson.getDelegateAdapter(this, TypeToken.get(Usage.class));
            final TypeAdapter<OpenAIUsage> adapterOpenAIUsage = gson.getDelegateAdapter(this, TypeToken.get(OpenAIUsage.class));

            return (TypeAdapter<T>) new TypeAdapter<IngestionUsage>() {
                @Override
                public void write(JsonWriter out, IngestionUsage value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Usage`
                    if (value.getActualInstance() instanceof Usage) {
                        JsonElement element = adapterUsage.toJsonTree((Usage)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `OpenAIUsage`
                    if (value.getActualInstance() instanceof OpenAIUsage) {
                        JsonElement element = adapterOpenAIUsage.toJsonTree((OpenAIUsage)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: OpenAIUsage, Usage");
                }

                @Override
                public IngestionUsage read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Usage
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Usage.validateJsonElement(jsonElement);
                        actualAdapter = adapterUsage;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Usage'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Usage failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Usage'", e);
                    }
                    // deserialize OpenAIUsage
                    try {
                        // validate the JSON object to see if any exception is thrown
                        OpenAIUsage.validateJsonElement(jsonElement);
                        actualAdapter = adapterOpenAIUsage;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'OpenAIUsage'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for OpenAIUsage failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'OpenAIUsage'", e);
                    }

                    if (match == 1) {
                        IngestionUsage ret = new IngestionUsage();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for IngestionUsage: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public IngestionUsage() {
        super("oneOf", Boolean.FALSE);
    }

    public IngestionUsage(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Usage", Usage.class);
        schemas.put("OpenAIUsage", OpenAIUsage.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return IngestionUsage.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * OpenAIUsage, Usage
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Usage) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof OpenAIUsage) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be OpenAIUsage, Usage");
    }

    /**
     * Get the actual instance, which can be the following:
     * OpenAIUsage, Usage
     *
     * @return The actual instance (OpenAIUsage, Usage)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Usage`. If the actual instance is not `Usage`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Usage`
     * @throws ClassCastException if the instance is not `Usage`
     */
    public Usage getUsage() throws ClassCastException {
        return (Usage)super.getActualInstance();
    }
    /**
     * Get the actual instance of `OpenAIUsage`. If the actual instance is not `OpenAIUsage`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OpenAIUsage`
     * @throws ClassCastException if the instance is not `OpenAIUsage`
     */
    public OpenAIUsage getOpenAIUsage() throws ClassCastException {
        return (OpenAIUsage)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to IngestionUsage
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Usage
        try {
            Usage.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Usage failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with OpenAIUsage
        try {
            OpenAIUsage.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for OpenAIUsage failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for IngestionUsage with oneOf schemas: OpenAIUsage, Usage. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of IngestionUsage given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of IngestionUsage
     * @throws IOException if the JSON string is invalid with respect to IngestionUsage
     */
    public static IngestionUsage fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, IngestionUsage.class);
    }

    /**
     * Convert an instance of IngestionUsage to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
