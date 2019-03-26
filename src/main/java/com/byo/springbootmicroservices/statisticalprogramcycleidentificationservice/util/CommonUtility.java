package com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtility {

	public static Date parseDateStringToSimpleDateFormat(String format, String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		java.util.Date yourDate = sdf.parse(date);
		return yourDate;
	}
}
