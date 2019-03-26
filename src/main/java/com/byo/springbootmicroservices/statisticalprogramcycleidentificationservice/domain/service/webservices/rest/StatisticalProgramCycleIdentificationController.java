package com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.domain.service.webservices.rest;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.constants.Constants;
import com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.domain.model.StatisticalProgramCycle;
import com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.domain.service.StatisticalProgramCycleIdentifier;
import com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.exception.StatisticalProgramCycleNotFoundException;
import com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.util.CommonUtility;
import com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.util.StatisticalPrgCycleAppConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class StatisticalProgramCycleIdentificationController {
	Logger logger = LoggerFactory.getLogger(StatisticalProgramCycleIdentificationController.class);
	@Autowired
	private StatisticalPrgCycleAppConfiguration statisticalPrgCycleAppConfiguration;

	@GetMapping("/statistical-program-cycle/{statisticalProgram}")
	public List<StatisticalProgramCycle> findStatisticalProgramCycles(@PathVariable String statisticalProgram)
			throws NumberFormatException, ParseException, StatisticalProgramCycleNotFoundException {
		StatisticalProgramCycleIdentifier statisticalProgramCycleIdentifier = new StatisticalProgramCycleIdentifier();
		if (logger.isInfoEnabled()) {
			logger.info("Max is " + statisticalPrgCycleAppConfiguration.getMaximumRequired());
			logger.info("Min is " + statisticalPrgCycleAppConfiguration.getMinimumRequired());
		}
		Optional<List<StatisticalProgramCycle>> statisticalProgramCycles = Optional
				.ofNullable(statisticalProgramCycleIdentifier
						.getStatisticalProgramCyclesFromStatisticalProgramID(new Long(statisticalProgram)));
		if (statisticalProgramCycles.isPresent()) {
			return statisticalProgramCycles.get();
		} else {
			throw new StatisticalProgramCycleNotFoundException(Constants.SPC_NOT_FOUND);
		}
	}

	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod = "findStatisticalProgramCyclesFallBack")
	public List<StatisticalProgramCycle> findStatisticalProgramCycles() {
		throw new RuntimeException("Not Available");
	}
	
	public List<StatisticalProgramCycle> findStatisticalProgramCyclesFallBack() throws ParseException {
		return Arrays.asList(new StatisticalProgramCycle(new Long(9999),
				CommonUtility.parseDateStringToSimpleDateFormat(Constants.DEFAULT_DATE_FORMAT, "0000-00-00"),
				CommonUtility.parseDateStringToSimpleDateFormat(Constants.DEFAULT_DATE_FORMAT, "0000-00-00"), "FallBack_SP",
				"FallBack_SP Desc"));
	}
}
