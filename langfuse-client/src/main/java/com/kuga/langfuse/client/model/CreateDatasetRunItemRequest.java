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
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.kuga.langfuse.client.invoker.JSON;

/**
 * CreateDatasetRunItemRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-11T13:40:58.189755+08:00[Asia/Shanghai]", comments = "Generator version: 7.8.0")
public class CreateDatasetRunItemRequest {
  public static final String SERIALIZED_NAME_RUN_NAME = "runName";
  @SerializedName(SERIALIZED_NAME_RUN_NAME)
  private String runName;

  public static final String SERIALIZED_NAME_RUN_DESCRIPTION = "runDescription";
  @SerializedName(SERIALIZED_NAME_RUN_DESCRIPTION)
  private String runDescription;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_DATASET_ITEM_ID = "datasetItemId";
  @SerializedName(SERIALIZED_NAME_DATASET_ITEM_ID)
  private String datasetItemId;

  public static final String SERIALIZED_NAME_OBSERVATION_ID = "observationId";
  @SerializedName(SERIALIZED_NAME_OBSERVATION_ID)
  private String observationId;

  public static final String SERIALIZED_NAME_TRACE_ID = "traceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  public CreateDatasetRunItemRequest() {
  }

  public CreateDatasetRunItemRequest runName(String runName) {
    this.runName = runName;
    return this;
  }

  /**
   * Get runName
   * @return runName
   */
  @javax.annotation.Nonnull
  public String getRunName() {
    return runName;
  }

  public void setRunName(String runName) {
    this.runName = runName;
  }


  public CreateDatasetRunItemRequest runDescription(String runDescription) {
    this.runDescription = runDescription;
    return this;
  }

  /**
   * Description of the run. If run exists, description will be updated.
   * @return runDescription
   */
  @javax.annotation.Nullable
  public String getRunDescription() {
    return runDescription;
  }

  public void setRunDescription(String runDescription) {
    this.runDescription = runDescription;
  }


  public CreateDatasetRunItemRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Metadata of the dataset run, updates run if run already exists
   * @return metadata
   */
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public CreateDatasetRunItemRequest datasetItemId(String datasetItemId) {
    this.datasetItemId = datasetItemId;
    return this;
  }

  /**
   * Get datasetItemId
   * @return datasetItemId
   */
  @javax.annotation.Nonnull
  public String getDatasetItemId() {
    return datasetItemId;
  }

  public void setDatasetItemId(String datasetItemId) {
    this.datasetItemId = datasetItemId;
  }


  public CreateDatasetRunItemRequest observationId(String observationId) {
    this.observationId = observationId;
    return this;
  }

  /**
   * Get observationId
   * @return observationId
   */
  @javax.annotation.Nullable
  public String getObservationId() {
    return observationId;
  }

  public void setObservationId(String observationId) {
    this.observationId = observationId;
  }


  public CreateDatasetRunItemRequest traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * traceId should always be provided. For compatibility with older SDK versions it can also be inferred from the provided observationId.
   * @return traceId
   */
  @javax.annotation.Nullable
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CreateDatasetRunItemRequest instance itself
   */
  public CreateDatasetRunItemRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDatasetRunItemRequest createDatasetRunItemRequest = (CreateDatasetRunItemRequest) o;
    return Objects.equals(this.runName, createDatasetRunItemRequest.runName) &&
        Objects.equals(this.runDescription, createDatasetRunItemRequest.runDescription) &&
        Objects.equals(this.metadata, createDatasetRunItemRequest.metadata) &&
        Objects.equals(this.datasetItemId, createDatasetRunItemRequest.datasetItemId) &&
        Objects.equals(this.observationId, createDatasetRunItemRequest.observationId) &&
        Objects.equals(this.traceId, createDatasetRunItemRequest.traceId)&&
        Objects.equals(this.additionalProperties, createDatasetRunItemRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(runName, runDescription, metadata, datasetItemId, observationId, traceId, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDatasetRunItemRequest {\n");
    sb.append("    runName: ").append(toIndentedString(runName)).append("\n");
    sb.append("    runDescription: ").append(toIndentedString(runDescription)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    datasetItemId: ").append(toIndentedString(datasetItemId)).append("\n");
    sb.append("    observationId: ").append(toIndentedString(observationId)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("runName");
    openapiFields.add("runDescription");
    openapiFields.add("metadata");
    openapiFields.add("datasetItemId");
    openapiFields.add("observationId");
    openapiFields.add("traceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("runName");
    openapiRequiredFields.add("datasetItemId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateDatasetRunItemRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDatasetRunItemRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDatasetRunItemRequest is not found in the empty JSON string", CreateDatasetRunItemRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDatasetRunItemRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("runName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runName").toString()));
      }
      if ((jsonObj.get("runDescription") != null && !jsonObj.get("runDescription").isJsonNull()) && !jsonObj.get("runDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runDescription").toString()));
      }
      if (!jsonObj.get("datasetItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetItemId").toString()));
      }
      if ((jsonObj.get("observationId") != null && !jsonObj.get("observationId").isJsonNull()) && !jsonObj.get("observationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `observationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("observationId").toString()));
      }
      if ((jsonObj.get("traceId") != null && !jsonObj.get("traceId").isJsonNull()) && !jsonObj.get("traceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDatasetRunItemRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDatasetRunItemRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDatasetRunItemRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDatasetRunItemRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDatasetRunItemRequest>() {
           @Override
           public void write(JsonWriter out, CreateDatasetRunItemRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDatasetRunItemRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateDatasetRunItemRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateDatasetRunItemRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateDatasetRunItemRequest
   * @throws IOException if the JSON string is invalid with respect to CreateDatasetRunItemRequest
   */
  public static CreateDatasetRunItemRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDatasetRunItemRequest.class);
  }

  /**
   * Convert an instance of CreateDatasetRunItemRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

