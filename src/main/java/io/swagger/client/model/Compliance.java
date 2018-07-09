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
 * Compliance
 */

public class Compliance {
  @SerializedName("id")
  private String id = null;

  @SerializedName("create_at")
  private Integer createAt = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("start_at")
  private Integer startAt = null;

  @SerializedName("end_at")
  private Integer endAt = null;

  @SerializedName("keywords")
  private String keywords = null;

  @SerializedName("emails")
  private String emails = null;

  public Compliance id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Compliance createAt(Integer createAt) {
    this.createAt = createAt;
    return this;
  }

   /**
   * Get createAt
   * @return createAt
  **/
  @ApiModelProperty(value = "")
  public Integer getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Integer createAt) {
    this.createAt = createAt;
  }

  public Compliance userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Compliance status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Compliance count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Compliance desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @ApiModelProperty(value = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Compliance type(String type) {
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

  public Compliance startAt(Integer startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @ApiModelProperty(value = "")
  public Integer getStartAt() {
    return startAt;
  }

  public void setStartAt(Integer startAt) {
    this.startAt = startAt;
  }

  public Compliance endAt(Integer endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @ApiModelProperty(value = "")
  public Integer getEndAt() {
    return endAt;
  }

  public void setEndAt(Integer endAt) {
    this.endAt = endAt;
  }

  public Compliance keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @ApiModelProperty(value = "")
  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public Compliance emails(String emails) {
    this.emails = emails;
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @ApiModelProperty(value = "")
  public String getEmails() {
    return emails;
  }

  public void setEmails(String emails) {
    this.emails = emails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Compliance compliance = (Compliance) o;
    return Objects.equals(this.id, compliance.id) &&
        Objects.equals(this.createAt, compliance.createAt) &&
        Objects.equals(this.userId, compliance.userId) &&
        Objects.equals(this.status, compliance.status) &&
        Objects.equals(this.count, compliance.count) &&
        Objects.equals(this.desc, compliance.desc) &&
        Objects.equals(this.type, compliance.type) &&
        Objects.equals(this.startAt, compliance.startAt) &&
        Objects.equals(this.endAt, compliance.endAt) &&
        Objects.equals(this.keywords, compliance.keywords) &&
        Objects.equals(this.emails, compliance.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createAt, userId, status, count, desc, type, startAt, endAt, keywords, emails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compliance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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
