package com.metrics.config;

import javax.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "METRICS_API")
@Validated
public class EnvProperties {

  @NotNull private String eventDbUrl;
  @NotNull private String eventDbUser;
  @NotNull private String eventDbPassword;

  public EnvProperties() {}

  public String getEventDbUrl() {
    return eventDbUrl;
  }

  public void setEventDbUrl(String eventDbUrl) {
    this.eventDbUrl = eventDbUrl;
  }

  public String getEventDbUser() {
    return eventDbUser;
  }

  public void setEventDbUser(String eventDbUser) {
    this.eventDbUser = eventDbUser;
  }

  public String getEventDbPassword() {
    return eventDbPassword;
  }

  public void setEventDbPassword(String eventDbPassword) {
    this.eventDbPassword = eventDbPassword;
  }
}
