package com.vstl.assignment;

import java.util.Random;

public class UtilitiesFunctions{

	public static String getFirstName() {
		Random objRandom= new Random();	
		String [] strArrayOfFirstName = { "Shikhar","Ravindra","Rohit","Virat","Ajinkya","Cheteshwar",};
		String strFname =strArrayOfFirstName[objRandom.nextInt(strArrayOfFirstName.length)];
		return strFname;
	}

	public static String getLastName() {
		Random objRandom= new Random();	
		String [] strArrayOfLastName = { "Pujara","Sharma","Rahane","Jadeja","Dhawan","Kohli",};
		String strLname=strArrayOfLastName[objRandom.nextInt(strArrayOfLastName.length)];
		return strLname;

	}

	public static String getMobileNumber() {
		Random objRandom= new Random();	
		int intFirstThreeNumber;
		int intMoNo;

		String strArrOfNumber[]= new String[10];

		for (int intCount = 0; intCount< 3; intCount++) {

			intFirstThreeNumber = objRandom.nextInt(3)+7;

			strArrOfNumber[intCount]=Integer.toString(intFirstThreeNumber);
		}

		String strStarting = strArrOfNumber[0]+strArrOfNumber[1]+strArrOfNumber[2];

		for (int intCount = 0; intCount <7; intCount++){

			intMoNo= objRandom.nextInt(10);	

			strArrOfNumber[intCount]=Integer.toString(intMoNo);
		}

		String strMobileNumber = strArrOfNumber[0]+strArrOfNumber[1]+strArrOfNumber[2]+strArrOfNumber[3]+strArrOfNumber[4]+strArrOfNumber[5]+strArrOfNumber[6];

		return strStarting + strMobileNumber;

	}
	
	/* public static String getMobileNumber() {
		Random objRandom= new Random();	
		int intMoNo;

		String strArrOfNumber[]= new String[10];

		int intFirstNumber = objRandom.nextInt(3)+7;

		strArrOfNumber[intFirstNumber]=Integer.toString(intFirstNumber);


		for (int intCount = 0; intCount <9; intCount++){

			intMoNo= objRandom.nextInt(10);	

			strArrOfNumber[intCount]=Integer.toString(intMoNo);
		}

		String strMobileNumber = intFirstNumber + strArrOfNumber[0]+strArrOfNumber[1]+strArrOfNumber[2]+strArrOfNumber[3]+strArrOfNumber[4]+strArrOfNumber[5]+strArrOfNumber[6]+strArrOfNumber[7]+strArrOfNumber[8];

		return  strMobileNumber;

	}	*/

	
	
	

	public static String getDateOfBirth() {
		Random objRandom= new Random();	
		int intMinDays = 1;
		int intMaxDays = 30;
		int intDays = objRandom.nextInt(intMaxDays-intMinDays) + intMinDays;
		String strDays=Integer.toString(intDays);

		String [] strArrayOfMonths = { "Jan","Feb","Mar","Apr","May","Jun","Jul","Sep","Oct","Nov","Dec"};
		String strMonths =strArrayOfMonths[objRandom.nextInt(strArrayOfMonths.length)];

		int intMinYear = 2000;
		int inMaxYear = 2022;
		int intYears = objRandom.nextInt(inMaxYear-intMinYear) + intMinYear;
		String strYears=Integer.toString(intYears);
		return strDays+"/"+strMonths+"/"+strYears;
	}

	public static int getGender() {
		Random objRandom= new Random();
		int intNum = objRandom.nextInt(3)+1;
		return intNum;

	}


}
