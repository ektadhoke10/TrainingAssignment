package com.vstl.assignment;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateAndTimeExample {

	public void displayCurrentDateUsingCalenderClas() {
		SimpleDateFormat objSimpleDateFormat =  new SimpleDateFormat ("dd/MM/yyyy");
		Calendar objCalender = Calendar.getInstance();
		System.out.println("\nCurrent Date using calender class: "+ objSimpleDateFormat.format(objCalender.getTime()));

		Calendar calendar = Calendar.getInstance();

		//  Calendar get()method
		System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
		System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
		System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
		System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
	}

	public void displayCurrentTimeUsingCalenderClas() {
		SimpleDateFormat objSimpleDateFormat =  new SimpleDateFormat ("hh:mm:ss");
		Calendar objCalender = Calendar.getInstance();
		System.out.println("\nCurrent time using calender class: "+ objSimpleDateFormat.format(objCalender.getTime()));
	}

	public void displayCurrentDateUsingDateClas() {  
		System.out.println("\n----------------------------------------------");
		Date objDate = new Date();

		SimpleDateFormat objSimpleDateFormat =  new SimpleDateFormat ("\nE yyyy/MM/dd");
		System.out.println("\nCurrent Date and Time in yyyy/mm/dd format: " + objSimpleDateFormat.format(objDate));

		SimpleDateFormat objdate =  new SimpleDateFormat (" E dd/MM/yyyy");
		System.out.println("\nCurrent Date in dd/mm/yyyy format: " + objdate.format(objDate));

	}

	public void displayCurrentTimeUsingDateClas() { 
		System.out.println("\n----------------------------------------------");
		Date objDate = new Date();

		// display time in hh:mm
		SimpleDateFormat objTimeFormat = new SimpleDateFormat("hh:mm"); 
		System.out.println("\nCurrrent time in HH:MM is: " + objTimeFormat.format(objDate));

		// display time in hh:mm with am/pm
		SimpleDateFormat TimeFormat = new SimpleDateFormat("hh:mm aa"); 
		System.out.println("\nCurrrent time in HH:MM is: " + TimeFormat.format(objDate));


		// display time in hh:mm:ss
		SimpleDateFormat objTime = new SimpleDateFormat("hh:mm:ss"); 
		System.out.println("\nCurrrent time in HH:MM:SS is: " + objTime.format(objDate));

		// display day and time in hh:mm:ss
		SimpleDateFormat objForTime = new SimpleDateFormat("dd hh:mm:ss"); 
		System.out.println("\nCurrrent time in HH:MM:SS is: " + objForTime.format(objDate));
	}


	public void displayTimeUsingLocalTime() {
		System.out.println("\n----------------------------------------------");
		//Display Current time
		LocalTime localTime = LocalTime.now();
		System.out.println("\nLocal Time is: "+localTime);

		//Display local time using system zone 
		LocalTime localZoneTime = LocalTime.now(ZoneId.systemDefault());
		System.out.println("\nTime of default zone is: "+localZoneTime);

		//Display local time using zone 
		LocalTime localTimeForZone = LocalTime.now(ZoneId.of("America/Chicago"));
		System.out.println("\nTime using zone : "+localTimeForZone);

		//Display noon time 
		LocalTime locaNnoonTime = LocalTime.NOON;
		System.out.println("\nNoon Time is: "+ locaNnoonTime);

		//Display midnight time
		LocalTime localMidNightTime = LocalTime.MIDNIGHT;
		System.out.println("\nMidnight Time is: " +localMidNightTime);

		//Display Maximum supported local time
		LocalTime maxTime = LocalTime.MAX;
		System.out.println("\nMaximum supported local time is: "+ maxTime);

		try {

			//Display LocalTime with the specified second-of-day
			long longSecond = 62199;
			LocalTime localime = LocalTime.ofSecondOfDay(longSecond);
			System.out.println("\nDisplay Time for given seconds : "+localime);

		} catch (DateTimeException e) {
			System.out.println(e.getMessage());
		}


		try {
			// Display time in hh:mm:ss format
			LocalTime localHourMinSec = LocalTime.of(12, 15, 45);
			System.out.println("\nDisaply Time in HH:MM:SS  "+ localHourMinSec);

		} catch (DateTimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			//Display time in hh:mm:ss:ns
			LocalTime localHourMinSecNanosec = LocalTime.of(12, 15, 45, 514);
			System.out.println("\nDisaply Time in HH:MM:SS:NS  "+ localHourMinSecNanosec);

		} catch (DateTimeException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n----------------------------------------------");
	}

	public void displayDateUsingLocalDate() {
		// display local date 
		LocalDate localDate =LocalDate.now();
		System.out.println("\nDisplay local date: "+localDate);

		// display date using zoneId
		LocalDate localDataByZone =LocalDate.now(ZoneId.of("UTC+01:00"));
		System.out.println("\nDisplay date using zoneID: "+localDataByZone);

		try {
			// display date by entering year month and day
			LocalDate Date=LocalDate.of(2017,2,28);
			System.out.println("\nDisplay date using zoneID: "+Date);

		} catch (DateTimeException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n----------------------------------------------");
	}

	public void displayDateTimeUsingLocalDateTime() {
		LocalDateTime localDateTime= LocalDateTime.now();
		System.out.println("Display local date and time: " +localDateTime);	
	}
}
