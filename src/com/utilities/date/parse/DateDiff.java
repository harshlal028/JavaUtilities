package com.utilities.date.parse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateDiff {
	
	public static void main(String[] args) throws ParseException {
		
		String startDateStr = "1872-12-10";
		String endDateStr = "1872-12-15";
		System.out.println(getDifference(startDateStr, endDateStr, null));
		
	}
	
	/**
	 * This function takes date string and return the number of days elapsed between them
	 * @param startDate
	 * @param endDate
	 * @param parserString
	 * @return
	 * @throws ParseException
	 */
	public static long getDifference(String startDate, String endDate, String parserString) throws ParseException
	{
		if(null == parserString)
		{
			parserString = "yyyy-mm-dd";
		}
		SimpleDateFormat parser=new SimpleDateFormat(parserString);
		Date start = parser.parse(startDate);
		Date end = parser.parse(endDate);
		long diff = end.getTime() - start.getTime();
		return(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
	}

}
