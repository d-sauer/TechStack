package com.techstack.timeline.restapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.techstack.timeline.restapi.model.TimelineEventMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TimelineEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-18T15:42:11.577035+02:00[Europe/Amsterdam]")

public class TimelineEvent   {
  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("date")
  private OffsetDateTime date;

  @JsonProperty("status")
  private String status = "pending";

  @JsonProperty("category")
  private String category;

  @JsonProperty("metadata")
  private TimelineEventMetadata metadata = null;

  public TimelineEvent uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID of the event
   * @return uuid
  */
  @ApiModelProperty(required = true, value = "UUID of the event")
  @NotNull


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TimelineEvent date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public TimelineEvent status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TimelineEvent category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public TimelineEvent metadata(TimelineEventMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimelineEventMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(TimelineEventMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineEvent timelineEvent = (TimelineEvent) o;
    return Objects.equals(this.uuid, timelineEvent.uuid) &&
        Objects.equals(this.date, timelineEvent.date) &&
        Objects.equals(this.status, timelineEvent.status) &&
        Objects.equals(this.category, timelineEvent.category) &&
        Objects.equals(this.metadata, timelineEvent.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, date, status, category, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineEvent {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

