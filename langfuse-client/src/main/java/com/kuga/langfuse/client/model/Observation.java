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
import com.kuga.langfuse.client.model.MapValue;
import com.kuga.langfuse.client.model.ObservationLevel;
import com.kuga.langfuse.client.model.Usage;
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
 * Observation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-11T13:40:58.189755+08:00[Asia/Shanghai]", comments = "Generator version: 7.8.0")
public class Observation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TRACE_ID = "traceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_COMPLETION_START_TIME = "completionStartTime";
  @SerializedName(SERIALIZED_NAME_COMPLETION_START_TIME)
  private OffsetDateTime completionStartTime;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_MODEL_PARAMETERS = "modelParameters";
  @SerializedName(SERIALIZED_NAME_MODEL_PARAMETERS)
  private Map<String, MapValue> modelParameters;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private Object input = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private Object output = null;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private Usage usage;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private ObservationLevel level;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "statusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_PARENT_OBSERVATION_ID = "parentObservationId";
  @SerializedName(SERIALIZED_NAME_PARENT_OBSERVATION_ID)
  private String parentObservationId;

  public static final String SERIALIZED_NAME_PROMPT_ID = "promptId";
  @SerializedName(SERIALIZED_NAME_PROMPT_ID)
  private String promptId;

  public Observation() {
  }

  public Observation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the observation
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Observation traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * The trace ID associated with the observation
   * @return traceId
   */
  @javax.annotation.Nullable
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public Observation type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the observation
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Observation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the observation
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Observation startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The start time of the observation
   * @return startTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public Observation endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The end time of the observation.
   * @return endTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public Observation completionStartTime(OffsetDateTime completionStartTime) {
    this.completionStartTime = completionStartTime;
    return this;
  }

  /**
   * The completion start time of the observation
   * @return completionStartTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCompletionStartTime() {
    return completionStartTime;
  }

  public void setCompletionStartTime(OffsetDateTime completionStartTime) {
    this.completionStartTime = completionStartTime;
  }


  public Observation model(String model) {
    this.model = model;
    return this;
  }

  /**
   * The model used for the observation
   * @return model
   */
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public Observation modelParameters(Map<String, MapValue> modelParameters) {
    this.modelParameters = modelParameters;
    return this;
  }

  public Observation putModelParametersItem(String key, MapValue modelParametersItem) {
    if (this.modelParameters == null) {
      this.modelParameters = new HashMap<>();
    }
    this.modelParameters.put(key, modelParametersItem);
    return this;
  }

  /**
   * The parameters of the model used for the observation
   * @return modelParameters
   */
  @javax.annotation.Nullable
  public Map<String, MapValue> getModelParameters() {
    return modelParameters;
  }

  public void setModelParameters(Map<String, MapValue> modelParameters) {
    this.modelParameters = modelParameters;
  }


  public Observation input(Object input) {
    this.input = input;
    return this;
  }

  /**
   * The input data of the observation
   * @return input
   */
  @javax.annotation.Nullable
  public Object getInput() {
    return input;
  }

  public void setInput(Object input) {
    this.input = input;
  }


  public Observation version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the observation
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public Observation metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Additional metadata of the observation
   * @return metadata
   */
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public Observation output(Object output) {
    this.output = output;
    return this;
  }

  /**
   * The output data of the observation
   * @return output
   */
  @javax.annotation.Nullable
  public Object getOutput() {
    return output;
  }

  public void setOutput(Object output) {
    this.output = output;
  }


  public Observation usage(Usage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @javax.annotation.Nullable
  public Usage getUsage() {
    return usage;
  }

  public void setUsage(Usage usage) {
    this.usage = usage;
  }


  public Observation level(ObservationLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
   */
  @javax.annotation.Nonnull
  public ObservationLevel getLevel() {
    return level;
  }

  public void setLevel(ObservationLevel level) {
    this.level = level;
  }


  public Observation statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * The status message of the observation
   * @return statusMessage
   */
  @javax.annotation.Nullable
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  public Observation parentObservationId(String parentObservationId) {
    this.parentObservationId = parentObservationId;
    return this;
  }

  /**
   * The parent observation ID
   * @return parentObservationId
   */
  @javax.annotation.Nullable
  public String getParentObservationId() {
    return parentObservationId;
  }

  public void setParentObservationId(String parentObservationId) {
    this.parentObservationId = parentObservationId;
  }


  public Observation promptId(String promptId) {
    this.promptId = promptId;
    return this;
  }

  /**
   * The prompt ID associated with the observation
   * @return promptId
   */
  @javax.annotation.Nullable
  public String getPromptId() {
    return promptId;
  }

  public void setPromptId(String promptId) {
    this.promptId = promptId;
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
   * @return the Observation instance itself
   */
  public Observation putAdditionalProperty(String key, Object value) {
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
    Observation observation = (Observation) o;
    return Objects.equals(this.id, observation.id) &&
        Objects.equals(this.traceId, observation.traceId) &&
        Objects.equals(this.type, observation.type) &&
        Objects.equals(this.name, observation.name) &&
        Objects.equals(this.startTime, observation.startTime) &&
        Objects.equals(this.endTime, observation.endTime) &&
        Objects.equals(this.completionStartTime, observation.completionStartTime) &&
        Objects.equals(this.model, observation.model) &&
        Objects.equals(this.modelParameters, observation.modelParameters) &&
        Objects.equals(this.input, observation.input) &&
        Objects.equals(this.version, observation.version) &&
        Objects.equals(this.metadata, observation.metadata) &&
        Objects.equals(this.output, observation.output) &&
        Objects.equals(this.usage, observation.usage) &&
        Objects.equals(this.level, observation.level) &&
        Objects.equals(this.statusMessage, observation.statusMessage) &&
        Objects.equals(this.parentObservationId, observation.parentObservationId) &&
        Objects.equals(this.promptId, observation.promptId)&&
        Objects.equals(this.additionalProperties, observation.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, traceId, type, name, startTime, endTime, completionStartTime, model, modelParameters, input, version, metadata, output, usage, level, statusMessage, parentObservationId, promptId, additionalProperties);
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
    sb.append("class Observation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    completionStartTime: ").append(toIndentedString(completionStartTime)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelParameters: ").append(toIndentedString(modelParameters)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    parentObservationId: ").append(toIndentedString(parentObservationId)).append("\n");
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
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
    openapiFields.add("traceId");
    openapiFields.add("type");
    openapiFields.add("name");
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("completionStartTime");
    openapiFields.add("model");
    openapiFields.add("modelParameters");
    openapiFields.add("input");
    openapiFields.add("version");
    openapiFields.add("metadata");
    openapiFields.add("output");
    openapiFields.add("usage");
    openapiFields.add("level");
    openapiFields.add("statusMessage");
    openapiFields.add("parentObservationId");
    openapiFields.add("promptId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("startTime");
    openapiRequiredFields.add("level");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Observation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Observation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Observation is not found in the empty JSON string", Observation.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Observation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("traceId") != null && !jsonObj.get("traceId").isJsonNull()) && !jsonObj.get("traceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceId").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // validate the optional field `usage`
      if (jsonObj.get("usage") != null && !jsonObj.get("usage").isJsonNull()) {
        Usage.validateJsonElement(jsonObj.get("usage"));
      }
      // validate the required field `level`
      ObservationLevel.validateJsonElement(jsonObj.get("level"));
      if ((jsonObj.get("statusMessage") != null && !jsonObj.get("statusMessage").isJsonNull()) && !jsonObj.get("statusMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusMessage").toString()));
      }
      if ((jsonObj.get("parentObservationId") != null && !jsonObj.get("parentObservationId").isJsonNull()) && !jsonObj.get("parentObservationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentObservationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentObservationId").toString()));
      }
      if ((jsonObj.get("promptId") != null && !jsonObj.get("promptId").isJsonNull()) && !jsonObj.get("promptId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promptId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promptId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Observation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Observation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Observation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Observation.class));

       return (TypeAdapter<T>) new TypeAdapter<Observation>() {
           @Override
           public void write(JsonWriter out, Observation value) throws IOException {
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
           public Observation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Observation instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of Observation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Observation
   * @throws IOException if the JSON string is invalid with respect to Observation
   */
  public static Observation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Observation.class);
  }

  /**
   * Convert an instance of Observation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

