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
import com.kuga.langfuse.client.model.IngestionUsage;
import com.kuga.langfuse.client.model.MapValue;
import com.kuga.langfuse.client.model.ObservationLevel;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
 * UpdateGenerationBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-11T13:40:58.189755+08:00[Asia/Shanghai]", comments = "Generator version: 7.8.0")
public class UpdateGenerationBody {
  public static final String SERIALIZED_NAME_COMPLETION_START_TIME = "completionStartTime";
  @SerializedName(SERIALIZED_NAME_COMPLETION_START_TIME)
  private OffsetDateTime completionStartTime;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_MODEL_PARAMETERS = "modelParameters";
  @SerializedName(SERIALIZED_NAME_MODEL_PARAMETERS)
  private Map<String, MapValue> modelParameters;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private IngestionUsage usage;

  public static final String SERIALIZED_NAME_PROMPT_NAME = "promptName";
  @SerializedName(SERIALIZED_NAME_PROMPT_NAME)
  private String promptName;

  public static final String SERIALIZED_NAME_PROMPT_VERSION = "promptVersion";
  @SerializedName(SERIALIZED_NAME_PROMPT_VERSION)
  private Integer promptVersion;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TRACE_ID = "traceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private Object input;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private Object output;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private ObservationLevel level;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "statusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_PARENT_OBSERVATION_ID = "parentObservationId";
  @SerializedName(SERIALIZED_NAME_PARENT_OBSERVATION_ID)
  private String parentObservationId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public UpdateGenerationBody() {
  }

  public UpdateGenerationBody completionStartTime(OffsetDateTime completionStartTime) {
    this.completionStartTime = completionStartTime;
    return this;
  }

  /**
   * Get completionStartTime
   * @return completionStartTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCompletionStartTime() {
    return completionStartTime;
  }

  public void setCompletionStartTime(OffsetDateTime completionStartTime) {
    this.completionStartTime = completionStartTime;
  }


  public UpdateGenerationBody model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public UpdateGenerationBody modelParameters(Map<String, MapValue> modelParameters) {
    this.modelParameters = modelParameters;
    return this;
  }

  public UpdateGenerationBody putModelParametersItem(String key, MapValue modelParametersItem) {
    if (this.modelParameters == null) {
      this.modelParameters = new HashMap<>();
    }
    this.modelParameters.put(key, modelParametersItem);
    return this;
  }

  /**
   * Get modelParameters
   * @return modelParameters
   */
  @javax.annotation.Nullable
  public Map<String, MapValue> getModelParameters() {
    return modelParameters;
  }

  public void setModelParameters(Map<String, MapValue> modelParameters) {
    this.modelParameters = modelParameters;
  }


  public UpdateGenerationBody usage(IngestionUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @javax.annotation.Nullable
  public IngestionUsage getUsage() {
    return usage;
  }

  public void setUsage(IngestionUsage usage) {
    this.usage = usage;
  }


  public UpdateGenerationBody promptName(String promptName) {
    this.promptName = promptName;
    return this;
  }

  /**
   * Get promptName
   * @return promptName
   */
  @javax.annotation.Nullable
  public String getPromptName() {
    return promptName;
  }

  public void setPromptName(String promptName) {
    this.promptName = promptName;
  }


  public UpdateGenerationBody promptVersion(Integer promptVersion) {
    this.promptVersion = promptVersion;
    return this;
  }

  /**
   * Get promptVersion
   * @return promptVersion
   */
  @javax.annotation.Nullable
  public Integer getPromptVersion() {
    return promptVersion;
  }

  public void setPromptVersion(Integer promptVersion) {
    this.promptVersion = promptVersion;
  }


  public UpdateGenerationBody endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public UpdateGenerationBody id(String id) {
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


  public UpdateGenerationBody traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Get traceId
   * @return traceId
   */
  @javax.annotation.Nullable
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public UpdateGenerationBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public UpdateGenerationBody startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public UpdateGenerationBody metadata(Object metadata) {
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


  public UpdateGenerationBody input(Object input) {
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


  public UpdateGenerationBody output(Object output) {
    this.output = output;
    return this;
  }

  /**
   * Get output
   * @return output
   */
  @javax.annotation.Nullable
  public Object getOutput() {
    return output;
  }

  public void setOutput(Object output) {
    this.output = output;
  }


  public UpdateGenerationBody level(ObservationLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
   */
  @javax.annotation.Nullable
  public ObservationLevel getLevel() {
    return level;
  }

  public void setLevel(ObservationLevel level) {
    this.level = level;
  }


  public UpdateGenerationBody statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Get statusMessage
   * @return statusMessage
   */
  @javax.annotation.Nullable
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  public UpdateGenerationBody parentObservationId(String parentObservationId) {
    this.parentObservationId = parentObservationId;
    return this;
  }

  /**
   * Get parentObservationId
   * @return parentObservationId
   */
  @javax.annotation.Nullable
  public String getParentObservationId() {
    return parentObservationId;
  }

  public void setParentObservationId(String parentObservationId) {
    this.parentObservationId = parentObservationId;
  }


  public UpdateGenerationBody version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return the UpdateGenerationBody instance itself
   */
  public UpdateGenerationBody putAdditionalProperty(String key, Object value) {
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
    UpdateGenerationBody updateGenerationBody = (UpdateGenerationBody) o;
    return Objects.equals(this.completionStartTime, updateGenerationBody.completionStartTime) &&
        Objects.equals(this.model, updateGenerationBody.model) &&
        Objects.equals(this.modelParameters, updateGenerationBody.modelParameters) &&
        Objects.equals(this.usage, updateGenerationBody.usage) &&
        Objects.equals(this.promptName, updateGenerationBody.promptName) &&
        Objects.equals(this.promptVersion, updateGenerationBody.promptVersion) &&
        Objects.equals(this.endTime, updateGenerationBody.endTime) &&
        Objects.equals(this.id, updateGenerationBody.id) &&
        Objects.equals(this.traceId, updateGenerationBody.traceId) &&
        Objects.equals(this.name, updateGenerationBody.name) &&
        Objects.equals(this.startTime, updateGenerationBody.startTime) &&
        Objects.equals(this.metadata, updateGenerationBody.metadata) &&
        Objects.equals(this.input, updateGenerationBody.input) &&
        Objects.equals(this.output, updateGenerationBody.output) &&
        Objects.equals(this.level, updateGenerationBody.level) &&
        Objects.equals(this.statusMessage, updateGenerationBody.statusMessage) &&
        Objects.equals(this.parentObservationId, updateGenerationBody.parentObservationId) &&
        Objects.equals(this.version, updateGenerationBody.version)&&
        Objects.equals(this.additionalProperties, updateGenerationBody.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionStartTime, model, modelParameters, usage, promptName, promptVersion, endTime, id, traceId, name, startTime, metadata, input, output, level, statusMessage, parentObservationId, version, additionalProperties);
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
    sb.append("class UpdateGenerationBody {\n");
    sb.append("    completionStartTime: ").append(toIndentedString(completionStartTime)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelParameters: ").append(toIndentedString(modelParameters)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    promptName: ").append(toIndentedString(promptName)).append("\n");
    sb.append("    promptVersion: ").append(toIndentedString(promptVersion)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    parentObservationId: ").append(toIndentedString(parentObservationId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("endTime");
    openapiFields.add("id");
    openapiFields.add("traceId");
    openapiFields.add("name");
    openapiFields.add("startTime");
    openapiFields.add("metadata");
    openapiFields.add("input");
    openapiFields.add("output");
    openapiFields.add("level");
    openapiFields.add("statusMessage");
    openapiFields.add("parentObservationId");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateGenerationBody
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateGenerationBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGenerationBody is not found in the empty JSON string", UpdateGenerationBody.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateGenerationBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      // validate the optional field `usage`
      if (jsonObj.get("usage") != null && !jsonObj.get("usage").isJsonNull()) {
        IngestionUsage.validateJsonElement(jsonObj.get("usage"));
      }
      if ((jsonObj.get("promptName") != null && !jsonObj.get("promptName").isJsonNull()) && !jsonObj.get("promptName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promptName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promptName").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("traceId") != null && !jsonObj.get("traceId").isJsonNull()) && !jsonObj.get("traceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `level`
      if (jsonObj.get("level") != null && !jsonObj.get("level").isJsonNull()) {
        ObservationLevel.validateJsonElement(jsonObj.get("level"));
      }
      if ((jsonObj.get("statusMessage") != null && !jsonObj.get("statusMessage").isJsonNull()) && !jsonObj.get("statusMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusMessage").toString()));
      }
      if ((jsonObj.get("parentObservationId") != null && !jsonObj.get("parentObservationId").isJsonNull()) && !jsonObj.get("parentObservationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentObservationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentObservationId").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGenerationBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGenerationBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGenerationBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGenerationBody.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGenerationBody>() {
           @Override
           public void write(JsonWriter out, UpdateGenerationBody value) throws IOException {
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
           public UpdateGenerationBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UpdateGenerationBody instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UpdateGenerationBody given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateGenerationBody
   * @throws IOException if the JSON string is invalid with respect to UpdateGenerationBody
   */
  public static UpdateGenerationBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGenerationBody.class);
  }

  /**
   * Convert an instance of UpdateGenerationBody to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

