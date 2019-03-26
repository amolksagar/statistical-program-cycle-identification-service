package com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("statistical-program-cycle-identification-service")
public class StatisticalPrgCycleAppConfiguration {
	private int maximumRequired;
	private int minimumRequired;

	public int getMaximumRequired() {
		return maximumRequired;
	}

	public int getMinimumRequired() {
		return minimumRequired;
	}

	public void setMaximumRequired(int maximumRequired) {
		this.maximumRequired = maximumRequired;
	}

	public void setMinimumRequired(int minimumRequired) {
		this.minimumRequired = minimumRequired;
	}

}
