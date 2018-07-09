/*
 * Mattermost API Reference
 * ### API version 4 is stable with the Mattermost server 4.0 release. API version 3 is scheduled for deprecation on January 16th, 2018. [Details here](/#tag/APIv3-Deprecation). Looking for the APIv3 reference? It has moved [here](https://api.mattermost.com/v3). 
 *
 * OpenAPI spec version: 4.0.0
 * Contact: feedback@mattermost.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Audio object used in OpenGraph metadata of a webpage
 */
@ApiModel(description = "Audio object used in OpenGraph metadata of a webpage")

public class OpenGraphAudios {
  @SerializedName("url")
  private String url = null;

  @SerializedName("secure_url")
  private String secureUrl = null;

  @SerializedName("type")
  private String type = null;

  public OpenGraphAudios url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OpenGraphAudios secureUrl(String secureUrl) {
    this.secureUrl = secureUrl;
    return this;
  }

   /**
   * Get secureUrl
   * @return secureUrl
  **/
  @ApiModelProperty(value = "")
  public String getSecureUrl() {
    return secureUrl;
  }

  public void setSecureUrl(String secureUrl) {
    this.secureUrl = secureUrl;
  }

  public OpenGraphAudios type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenGraphAudios openGraphAudios = (OpenGraphAudios) o;
    return Objects.equals(this.url, openGraphAudios.url) &&
        Objects.equals(this.secureUrl, openGraphAudios.secureUrl) &&
        Objects.equals(this.type, openGraphAudios.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, secureUrl, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenGraphAudios {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secureUrl: ").append(toIndentedString(secureUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
