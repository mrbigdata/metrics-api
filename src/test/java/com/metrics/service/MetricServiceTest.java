package com.metrics.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("integration")
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MetricServiceTest {
  @Autowired private NamedParameterJdbcTemplate jdbcTemplate;
  private MetricService metricService;

  @Before
  public void init() {
    this.metricService = new CountMetricService(jdbcTemplate);
  }

  @Test
  public void testCalculateMetric() {
    assertEquals(1L, metricService.calculateMetric());
  }
}
