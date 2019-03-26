package com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.domain.service;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.constants.Constants;
import com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.domain.model.StatisticalProgramCycle;
import com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.util.CommonUtility;

public class StatisticalProgramCycleIdentifier {
	public List<StatisticalProgramCycle> getStatisticalProgramCyclesFromStatisticalProgramID(Long spId)
			throws ParseException {
		/*
		 * replace this by code which fetches the SP from DB and then fetches the SPC
		 * corresponding to the SP
		 */
		return Arrays.asList(new StatisticalProgramCycle(new Long(1234),
				CommonUtility.parseDateStringToSimpleDateFormat(Constants.DEFAULT_DATE_FORMAT, "1991-07-26"),
				CommonUtility.parseDateStringToSimpleDateFormat(Constants.DEFAULT_DATE_FORMAT, "1992-07-26"), "SP 1",
				"SP Desc"));
	}
}
