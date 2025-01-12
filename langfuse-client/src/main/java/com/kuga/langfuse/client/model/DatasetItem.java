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
import com.kuga.langfuse.client.model.DatasetStatus;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * DatasetItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-11T13:40:58.189755+08:00[Asia/Shanghai]", comments = "Generator version: 7.8.0")
public class DatasetItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DatasetStatus status;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private Object input = null;

  public static final String SERIALIZED_NAME_EXPECTED_OUTPUT = "expectedOutput";
  @SerializedName(SERIALIZED_NAME_EXPECTED_OUTPUT)
  private Object expectedOutput = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_SOURCE_TRACE_ID = "sourceTraceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_TRACE_ID)
  private String sourceTraceId;

  public static final String SERIALIZED_NAME_SOURCE_OBSERVATION_ID = "sourceObservationId";
  @SerializedName(SERIALIZED_NAME_SOURCE_OBSERVATION_ID)
  private String sourceObservationId;

  public static final String SERIALIZED_NAME_DATASET_ID = "datasetId";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_DATASET_NAME = "datasetName";
  @SerializedName(SERIALIZED_NAME_DATASET_NAME)
  private String datasetName;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public DatasetItem() {
  }

  public DatasetItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public DatasetItem status(DatasetStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public DatasetStatus getStatus() {
    return status;
  }

  public void setStatus(DatasetStatus status) {
    this.status = status;
  }


  public DatasetItem input(Object input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
   */
  @javax.annotation.Nullable
  public Object getInput() {
    return input;
  }

  public void setInput(Object input) {
    this.input = input;
  }


  public DatasetItem expectedOutput(Object expectedOutput) {
    this.expectedOutput = expectedOutput;
    return this;
  }

  /**
   * Get expectedOutput
   * @return expectedOutput
   */
  @javax.annotation.Nullable
  public Object getExpectedOutput() {
    return expectedOutput;
  }

  public void setExpectedOutput(Object expectedOutput) {
    this.expectedOutput = expectedOutput;
  }


  public DatasetItem metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public DatasetItem sourceTraceId(String sourceTraceId) {
    this.sourceTraceId = sourceTraceId;
    return this;
  }

  /**
   * Get sourceTraceId
   * @return sourceTraceId
   */
  @javax.annotation.Nullable
  public String getSourceTraceId() {
    return sourceTraceId;
  }

  public void setSourceTraceId(String sourceTraceId) {
    this.sourceTraceId = sourceTraceId;
  }


  public DatasetItem sourceObservationId(String sourceObservationId) {
    this.sourceObservationId = sourceObservationId;
    return this;
  }

  /**
   * Get sourceObservationId
   * @return sourceObservationId
   */
  @javax.annotation.Nullable
  public String getSourceObservationId() {
    return sourceObservationId;
  }

  public void setSourceObservationId(String sourceObservationId) {
    this.sourceObservationId = sourceObservationId;
  }


  public DatasetItem datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * Get datasetId
   * @return datasetId
   */
  @javax.annotation.Nonnull
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  public DatasetItem datasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  /**
   * Get datasetName
   * @return datasetName
   */
  @javax.annotation.Nonnull
  public String getDatasetName() {
    return datasetName;
  }

  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }


  public DatasetItem createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DatasetItem updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return the DatasetItem instance itself
   */
  public DatasetItem putAdditionalProperty(String key, Object value) {
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
    DatasetItem datasetItem = (DatasetItem) o;
    return Objects.equals(this.id, datasetItem.id) &&
        Objects.equals(this.status, datasetItem.status) &&
        Objects.equals(this.input, datasetItem.input) &&
        Objects.equals(this.expectedOutput, datasetItem.expectedOutput) &&
        Objects.equals(this.metadata, datasetItem.metadata) &&
        Objects.equals(this.sourceTraceId, datasetItem.sourceTraceId) &&
        Objects.equals(this.sourceObservationId, datasetItem.sourceObservationId) &&
        Objects.equals(this.datasetId, datasetItem.datasetId) &&
        Objects.equals(this.datasetName, datasetItem.datasetName) &&
        Objects.equals(this.createdAt, datasetItem.createdAt) &&
        Objects.equals(this.updatedAt, datasetItem.updatedAt)&&
        Objects.equals(this.additionalProperties, datasetItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, input, expectedOutput, metadata, sourceTraceId, sourceObservationId, datasetId, datasetName, createdAt, updatedAt, additionalProperties);
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
    sb.append("class DatasetItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    expectedOutput: ").append(toIndentedString(expectedOutput)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sourceTraceId: ").append(toIndentedString(sourceTraceId)).append("\n");
    sb.append("    sourceObservationId: ").append(toIndentedString(sourceObservationId)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("status");
    openapiFields.add("input");
    openapiFields.add("expectedOutput");
    openapiFields.add("metadata");
    openapiFields.add("sourceTraceId");
    openapiFields.add("sourceObservationId");
    openapiFields.add("datasetId");
    openapiFields.add("datasetName");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("datasetId");
    openapiRequiredFields.add("datasetName");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatasetItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatasetItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasetItem is not found in the empty JSON string", DatasetItem.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DatasetItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `status`
      DatasetStatus.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("sourceTraceId") != null && !jsonObj.get("sourceTraceId").isJsonNull()) && !jsonObj.get("sourceTraceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceTraceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceTraceId").toString()));
      }
      if ((jsonObj.get("sourceObservationId") != null && !jsonObj.get("sourceObservationId").isJsonNull()) && !jsonObj.get("sourceObservationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceObservationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceObservationId").toString()));
      }
      if (!jsonObj.get("datasetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetId").toString()));
      }
      if (!jsonObj.get("datasetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasetItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasetItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasetItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasetItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasetItem>() {
           @Override
           public void write(JsonWriter out, DatasetItem value) throws IOException {
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
           public DatasetItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DatasetItem instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of DatasetItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatasetItem
   * @throws IOException if the JSON string is invalid with respect to DatasetItem
   */
  public static DatasetItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasetItem.class);
  }

  /**
   * Convert an instance of DatasetItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

