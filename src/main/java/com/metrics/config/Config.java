package com.metrics.config;

import javax.sql.DataSource;
import org.postgresql.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(EnvProperties.class)
public class Config {

  @Autowired EnvProperties env;

  @Bean(name = "dataSource")
  public DataSource exportDataSource() {
    return DataSourceBuilder.create()
        .driverClassName(Driver.class.getName())
        .username(env.getEventDbUser())
        .password(env.getEventDbPassword())
        .url(env.getEventDbUrl())
        .build();
  }
}
