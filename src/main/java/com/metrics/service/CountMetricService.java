package com.metrics.service;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CountMetricService implements MetricService {

  private final NamedParameterJdbcTemplate jdbcTemplate;

  @Autowired
  public CountMetricService(final NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public Number calculateMetric() {
    return jdbcTemplate.queryForObject("select 1", Maps.newHashMap(), Long.class);
  }
}
