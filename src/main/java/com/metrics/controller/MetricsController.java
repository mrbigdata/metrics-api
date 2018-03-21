package com.metrics.controller;

import com.metrics.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

  private final MetricService metricService;

  @Autowired
  public MetricsController(final MetricService metricService){
    this.metricService = metricService;
  }

  @GetMapping("/metrics/count")
  public Long getCount(){
    return metricService.calculateMetric().longValue();
  }
}
