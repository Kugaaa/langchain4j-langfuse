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
 * CreateModelRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-11T13:40:58.189755+08:00[Asia/Shanghai]", comments = "Generator version: 7.8.0")
public class CreateModelRequest {
  public static final String SERIALIZED_NAME_MODEL_NAME = "modelName";
  @SerializedName(SERIALIZED_NAME_MODEL_NAME)
  private String modelName;

  public static final String SERIALIZED_NAME_MATCH_PATTERN = "matchPattern";
  @SerializedName(SERIALIZED_NAME_MATCH_PATTERN)
  private String matchPattern;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private ModelUsageUnit unit;

  public static final String SERIALIZED_NAME_INPUT_PRICE = "inputPrice";
  @SerializedName(SERIALIZED_NAME_INPUT_PRICE)
  private Double inputPrice;

  public static final String SERIALIZED_NAME_OUTPUT_PRICE = "outputPrice";
  @SerializedName(SERIALIZED_NAME_OUTPUT_PRICE)
  private Double outputPrice;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "totalPrice";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private Double totalPrice;

  public static final String SERIALIZED_NAME_TOKENIZER_ID = "tokenizerId";
  @SerializedName(SERIALIZED_NAME_TOKENIZER_ID)
  private String tokenizerId;

  public static final String SERIALIZED_NAME_TOKENIZER_CONFIG = "tokenizerConfig";
  @SerializedName(SERIALIZED_NAME_TOKENIZER_CONFIG)
  private Object tokenizerConfig = null;

  public CreateModelRequest() {
  }

  public CreateModelRequest modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * Name of the model definition. If multiple with the same name exist, they are applied in the following order: (1) custom over built-in, (2) newest according to startTime where model.startTime&lt;observation.startTime
   * @return modelName
   */
  @javax.annotation.Nonnull
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }


  public CreateModelRequest matchPattern(String matchPattern) {
    this.matchPattern = matchPattern;
    return this;
  }

  /**
   * Regex pattern which matches this model definition to generation.model. Useful in case of fine-tuned models. If you want to exact match, use &#x60;(?i)^modelname$&#x60;
   * @return matchPattern
   */
  @javax.annotation.Nonnull
  public String getMatchPattern() {
    return matchPattern;
  }

  public void setMatchPattern(String matchPattern) {
    this.matchPattern = matchPattern;
  }


  public CreateModelRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Apply only to generations which are newer than this ISO date.
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public CreateModelRequest unit(ModelUsageUnit unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  @javax.annotation.Nonnull
  public ModelUsageUnit getUnit() {
    return unit;
  }

  public void setUnit(ModelUsageUnit unit) {
    this.unit = unit;
  }


  public CreateModelRequest inputPrice(Double inputPrice) {
    this.inputPrice = inputPrice;
    return this;
  }

  /**
   * Price (USD) per input unit
   * @return inputPrice
   */
  @javax.annotation.Nullable
  public Double getInputPrice() {
    return inputPrice;
  }

  public void setInputPrice(Double inputPrice) {
    this.inputPrice = inputPrice;
  }


  public CreateModelRequest outputPrice(Double outputPrice) {
    this.outputPrice = outputPrice;
    return this;
  }

  /**
   * Price (USD) per output unit
   * @return outputPrice
   */
  @javax.annotation.Nullable
  public Double getOutputPrice() {
    return outputPrice;
  }

  public void setOutputPrice(Double outputPrice) {
    this.outputPrice = outputPrice;
  }


  public CreateModelRequest totalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * Price (USD) per total units. Cannot be set if input or output price is set.
   * @return totalPrice
   */
  @javax.annotation.Nullable
  public Double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }


  public CreateModelRequest tokenizerId(String tokenizerId) {
    this.tokenizerId = tokenizerId;
    return this;
  }

  /**
   * Optional. Tokenizer to be applied to observations which match to this model. See docs for more details.
   * @return tokenizerId
   */
  @javax.annotation.Nullable
  public String getTokenizerId() {
    return tokenizerId;
  }

  public void setTokenizerId(String tokenizerId) {
    this.tokenizerId = tokenizerId;
  }


  public CreateModelRequest tokenizerConfig(Object tokenizerConfig) {
    this.tokenizerConfig = tokenizerConfig;
    return this;
  }

  /**
   * Optional. Configuration for the selected tokenizer. Needs to be JSON. See docs for more details.
   * @return tokenizerConfig
   */
  @javax.annotation.Nullable
  public Object getTokenizerConfig() {
    return tokenizerConfig;
  }

  public void setTokenizerConfig(Object tokenizerConfig) {
    this.tokenizerConfig = tokenizerConfig;
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
   * @return the CreateModelRequest instance itself
   */
  public CreateModelRequest putAdditionalProperty(String key, Object value) {
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
    CreateModelRequest createModelRequest = (CreateModelRequest) o;
    return Objects.equals(this.modelName, createModelRequest.modelName) &&
        Objects.equals(this.matchPattern, createModelRequest.matchPattern) &&
        Objects.equals(this.startDate, createModelRequest.startDate) &&
        Objects.equals(this.unit, createModelRequest.unit) &&
        Objects.equals(this.inputPrice, createModelRequest.inputPrice) &&
        Objects.equals(this.outputPrice, createModelRequest.outputPrice) &&
        Objects.equals(this.totalPrice, createModelRequest.totalPrice) &&
        Objects.equals(this.tokenizerId, createModelRequest.tokenizerId) &&
        Objects.equals(this.tokenizerConfig, createModelRequest.tokenizerConfig)&&
        Objects.equals(this.additionalProperties, createModelRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, matchPattern, startDate, unit, inputPrice, outputPrice, totalPrice, tokenizerId, tokenizerConfig, additionalProperties);
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
    sb.append("class CreateModelRequest {\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    matchPattern: ").append(toIndentedString(matchPattern)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    inputPrice: ").append(toIndentedString(inputPrice)).append("\n");
    sb.append("    outputPrice: ").append(toIndentedString(outputPrice)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    tokenizerId: ").append(toIndentedString(tokenizerId)).append("\n");
    sb.append("    tokenizerConfig: ").append(toIndentedString(tokenizerConfig)).append("\n");
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
    openapiFields.add("modelName");
    openapiFields.add("matchPattern");
    openapiFields.add("startDate");
    openapiFields.add("unit");
    openapiFields.add("inputPrice");
    openapiFields.add("outputPrice");
    openapiFields.add("totalPrice");
    openapiFields.add("tokenizerId");
    openapiFields.add("tokenizerConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("modelName");
    openapiRequiredFields.add("matchPattern");
    openapiRequiredFields.add("unit");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateModelRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateModelRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateModelRequest is not found in the empty JSON string", CreateModelRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateModelRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("modelName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modelName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modelName").toString()));
      }
      if (!jsonObj.get("matchPattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchPattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchPattern").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      // validate the required field `unit`
      ModelUsageUnit.validateJsonElement(jsonObj.get("unit"));
      if ((jsonObj.get("tokenizerId") != null && !jsonObj.get("tokenizerId").isJsonNull()) && !jsonObj.get("tokenizerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenizerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenizerId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateModelRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateModelRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateModelRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateModelRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateModelRequest>() {
           @Override
           public void write(JsonWriter out, CreateModelRequest value) throws IOException {
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
           public CreateModelRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateModelRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CreateModelRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateModelRequest
   * @throws IOException if the JSON string is invalid with respect to CreateModelRequest
   */
  public static CreateModelRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateModelRequest.class);
  }

  /**
   * Convert an instance of CreateModelRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
