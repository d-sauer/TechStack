package com.techstack.timeline.restapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TimelineEventMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-23T08:12:28.883123+02:00[Europe/Amsterdam]")

public class TimelineEventMetadata   {
  @JsonProperty("origin")
  private String origin;

  @JsonProperty("originId")
  private String originId;

  public TimelineEventMetadata origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * System origin of the event
   * @return origin
  */
  @ApiModelProperty(value = "System origin of the event")


  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public TimelineEventMetadata originId(String originId) {
    this.originId = originId;
    return this;
  }

  /**
   * ID in the origin system
   * @return originId
  */
  @ApiModelProperty(value = "ID in the origin system")


  public String getOriginId() {
    return originId;
  }

  public void setOriginId(String originId) {
    this.originId = originId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineEventMetadata timelineEventMetadata = (TimelineEventMetadata) o;
    return Objects.equals(this.origin, timelineEventMetadata.origin) &&
        Objects.equals(this.originId, timelineEventMetadata.originId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origin, originId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineEventMetadata {\n");
    
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
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

