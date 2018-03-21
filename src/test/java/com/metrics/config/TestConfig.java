package com.metrics.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("integration")
@Configuration
@PropertySource("file:.env")
@EnableConfigurationProperties
public class TestConfig {}
