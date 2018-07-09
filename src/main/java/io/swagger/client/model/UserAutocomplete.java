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
import io.swagger.client.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserAutocomplete
 */

public class UserAutocomplete {
  @SerializedName("users")
  private List<User> users = null;

  @SerializedName("out_of_channel")
  private List<User> outOfChannel = null;

  public UserAutocomplete users(List<User> users) {
    this.users = users;
    return this;
  }

  public UserAutocomplete addUsersItem(User usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<User>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * A list of users that are the main result of the query
   * @return users
  **/
  @ApiModelProperty(value = "A list of users that are the main result of the query")
  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  public UserAutocomplete outOfChannel(List<User> outOfChannel) {
    this.outOfChannel = outOfChannel;
    return this;
  }

  public UserAutocomplete addOutOfChannelItem(User outOfChannelItem) {
    if (this.outOfChannel == null) {
      this.outOfChannel = new ArrayList<User>();
    }
    this.outOfChannel.add(outOfChannelItem);
    return this;
  }

   /**
   * A special case list of users returned when autocompleting in a specific channel. Omitted when empty or not relevant
   * @return outOfChannel
  **/
  @ApiModelProperty(value = "A special case list of users returned when autocompleting in a specific channel. Omitted when empty or not relevant")
  public List<User> getOutOfChannel() {
    return outOfChannel;
  }

  public void setOutOfChannel(List<User> outOfChannel) {
    this.outOfChannel = outOfChannel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAutocomplete userAutocomplete = (UserAutocomplete) o;
    return Objects.equals(this.users, userAutocomplete.users) &&
        Objects.equals(this.outOfChannel, userAutocomplete.outOfChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, outOfChannel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAutocomplete {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    outOfChannel: ").append(toIndentedString(outOfChannel)).append("\n");
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
