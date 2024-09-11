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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * TraceWithDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-11T13:40:58.189755+08:00[Asia/Shanghai]", comments = "Generator version: 7.8.0")
public class TraceWithDetails {
  public static final String SERIALIZED_NAME_HTML_PATH = "htmlPath";
  @SerializedName(SERIALIZED_NAME_HTML_PATH)
  private String htmlPath;

  public static final String SERIALIZED_NAME_LATENCY = "latency";
  @SerializedName(SERIALIZED_NAME_LATENCY)
  private Double latency;

  public static final String SERIALIZED_NAME_TOTAL_COST = "totalCost";
  @SerializedName(SERIALIZED_NAME_TOTAL_COST)
  private Double totalCost;

  public static final String SERIALIZED_NAME_OBSERVATIONS = "observations";
  @SerializedName(SERIALIZED_NAME_OBSERVATIONS)
  private List<String> observations = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCORES = "scores";
  @SerializedName(SERIALIZED_NAME_SCORES)
  private List<String> scores = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private Object input;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private Object output;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_RELEASE = "release";
  @SerializedName(SERIALIZED_NAME_RELEASE)
  private String release;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public TraceWithDetails() {
  }

  public TraceWithDetails htmlPath(String htmlPath) {
    this.htmlPath = htmlPath;
    return this;
  }

  /**
   * Path of trace in Langfuse UI
   * @return htmlPath
   */
  @javax.annotation.Nonnull
  public String getHtmlPath() {
    return htmlPath;
  }

  public void setHtmlPath(String htmlPath) {
    this.htmlPath = htmlPath;
  }


  public TraceWithDetails latency(Double latency) {
    this.latency = latency;
    return this;
  }

  /**
   * Latency of trace in seconds
   * @return latency
   */
  @javax.annotation.Nonnull
  public Double getLatency() {
    return latency;
  }

  public void setLatency(Double latency) {
    this.latency = latency;
  }


  public TraceWithDetails totalCost(Double totalCost) {
    this.totalCost = totalCost;
    return this;
  }

  /**
   * Cost of trace in USD
   * @return totalCost
   */
  @javax.annotation.Nonnull
  public Double getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(Double totalCost) {
    this.totalCost = totalCost;
  }


  public TraceWithDetails observations(List<String> observations) {
    this.observations = observations;
    return this;
  }

  public TraceWithDetails addObservationsItem(String observationsItem) {
    if (this.observations == null) {
      this.observations = new ArrayList<>();
    }
    this.observations.add(observationsItem);
    return this;
  }

  /**
   * List of observation ids
   * @return observations
   */
  @javax.annotation.Nonnull
  public List<String> getObservations() {
    return observations;
  }

  public void setObservations(List<String> observations) {
    this.observations = observations;
  }


  public TraceWithDetails scores(List<String> scores) {
    this.scores = scores;
    return this;
  }

  public TraceWithDetails addScoresItem(String scoresItem) {
    if (this.scores == null) {
      this.scores = new ArrayList<>();
    }
    this.scores.add(scoresItem);
    return this;
  }

  /**
   * List of score ids
   * @return scores
   */
  @javax.annotation.Nonnull
  public List<String> getScores() {
    return scores;
  }

  public void setScores(List<String> scores) {
    this.scores = scores;
  }


  public TraceWithDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of a trace
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public TraceWithDetails timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The timestamp when the trace was created
   * @return timestamp
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public TraceWithDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the trace
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TraceWithDetails input(Object input) {
    this.input = input;
    return this;
  }

  /**
   * The input data of the trace. Can be any JSON.
   * @return input
   */
  @javax.annotation.Nullable
  public Object getInput() {
    return input;
  }

  public void setInput(Object input) {
    this.input = input;
  }


  public TraceWithDetails output(Object output) {
    this.output = output;
    return this;
  }

  /**
   * The output data of the trace. Can be any JSON.
   * @return output
   */
  @javax.annotation.Nullable
  public Object getOutput() {
    return output;
  }

  public void setOutput(Object output) {
    this.output = output;
  }


  public TraceWithDetails sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * The session identifier associated with the trace
   * @return sessionId
   */
  @javax.annotation.Nullable
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public TraceWithDetails release(String release) {
    this.release = release;
    return this;
  }

  /**
   * The release version of the application when the trace was created
   * @return release
   */
  @javax.annotation.Nullable
  public String getRelease() {
    return release;
  }

  public void setRelease(String release) {
    this.release = release;
  }


  public TraceWithDetails version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the trace
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public TraceWithDetails userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The user identifier associated with the trace
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public TraceWithDetails metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The metadata associated with the trace. Can be any JSON.
   * @return metadata
   */
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public TraceWithDetails tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public TraceWithDetails addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * The tags associated with the trace. Can be an array of strings or null.
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public TraceWithDetails _public(Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * Public traces are accessible via url without login
   * @return _public
   */
  @javax.annotation.Nullable
  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
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
   * @return the TraceWithDetails instance itself
   */
  public TraceWithDetails putAdditionalProperty(String key, Object value) {
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
    TraceWithDetails traceWithDetails = (TraceWithDetails) o;
    return Objects.equals(this.htmlPath, traceWithDetails.htmlPath) &&
        Objects.equals(this.latency, traceWithDetails.latency) &&
        Objects.equals(this.totalCost, traceWithDetails.totalCost) &&
        Objects.equals(this.observations, traceWithDetails.observations) &&
        Objects.equals(this.scores, traceWithDetails.scores) &&
        Objects.equals(this.id, traceWithDetails.id) &&
        Objects.equals(this.timestamp, traceWithDetails.timestamp) &&
        Objects.equals(this.name, traceWithDetails.name) &&
        Objects.equals(this.input, traceWithDetails.input) &&
        Objects.equals(this.output, traceWithDetails.output) &&
        Objects.equals(this.sessionId, traceWithDetails.sessionId) &&
        Objects.equals(this.release, traceWithDetails.release) &&
        Objects.equals(this.version, traceWithDetails.version) &&
        Objects.equals(this.userId, traceWithDetails.userId) &&
        Objects.equals(this.metadata, traceWithDetails.metadata) &&
        Objects.equals(this.tags, traceWithDetails.tags) &&
        Objects.equals(this._public, traceWithDetails._public)&&
        Objects.equals(this.additionalProperties, traceWithDetails.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlPath, latency, totalCost, observations, scores, id, timestamp, name, input, output, sessionId, release, version, userId, metadata, tags, _public, additionalProperties);
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
    sb.append("class TraceWithDetails {\n");
    sb.append("    htmlPath: ").append(toIndentedString(htmlPath)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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
    openapiFields.add("timestamp");
    openapiFields.add("name");
    openapiFields.add("input");
    openapiFields.add("output");
    openapiFields.add("sessionId");
    openapiFields.add("release");
    openapiFields.add("version");
    openapiFields.add("userId");
    openapiFields.add("metadata");
    openapiFields.add("tags");
    openapiFields.add("public");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("htmlPath");
    openapiRequiredFields.add("latency");
    openapiRequiredFields.add("totalCost");
    openapiRequiredFields.add("observations");
    openapiRequiredFields.add("scores");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("timestamp");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TraceWithDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TraceWithDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TraceWithDetails is not found in the empty JSON string", TraceWithDetails.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TraceWithDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("htmlPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `htmlPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("htmlPath").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("observations") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("observations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `observations` to be an array in the JSON string but got `%s`", jsonObj.get("observations").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("scores") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("scores").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scores` to be an array in the JSON string but got `%s`", jsonObj.get("scores").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("sessionId") != null && !jsonObj.get("sessionId").isJsonNull()) && !jsonObj.get("sessionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sessionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sessionId").toString()));
      }
      if ((jsonObj.get("release") != null && !jsonObj.get("release").isJsonNull()) && !jsonObj.get("release").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TraceWithDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TraceWithDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TraceWithDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TraceWithDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TraceWithDetails>() {
           @Override
           public void write(JsonWriter out, TraceWithDetails value) throws IOException {
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
           public TraceWithDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TraceWithDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of TraceWithDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TraceWithDetails
   * @throws IOException if the JSON string is invalid with respect to TraceWithDetails
   */
  public static TraceWithDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TraceWithDetails.class);
  }

  /**
   * Convert an instance of TraceWithDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

