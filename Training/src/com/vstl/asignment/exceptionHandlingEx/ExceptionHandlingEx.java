package com.vstl.asignment.exceptionHandlingEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandlingEx {
	//ArrayIndexOutOfBound
	public void arithmaticExceptionEx(){
		int intNum=10;
		for(int intIndex=5;intIndex >=0;intIndex--)
			try{
				System.out.println(intNum/intIndex);  
			}catch(ArithmeticException exception){
				System.out.println("ArryaIndexOutOfBoundException.." + exception.getMessage());
				exception.printStackTrace();
			}
	}

	//stringIndexOutOfBound 
	public void stringIndexOutOfBoundEx() {
		try{
			String strCompany="Verve Squar Technologies";
			System.out.println(strCompany.length());;
			char charCharacter = strCompany.charAt(0);
			charCharacter = strCompany.charAt(35);
			System.out.println(charCharacter);
		}catch(StringIndexOutOfBoundsException exception){
			System.out.println("StringIndexOutOfBoundsException.." +exception.getMessage());
			exception.printStackTrace();
		}
	}

	public void nullPointerExceptionEx() {
		try{
			String strName=null;
			System.out.println (strName.length());
		}
		catch(NullPointerException exception){
			System.out.println("NullPointerException.." +exception.getMessage());
		}
	}

	//ArrayIndexOutOfBound
	public void arrayIndexOutOfBoundEx() {
		int intArray[] = { 1, 2, 3, 4, 5 };
		try {
			for (int intCount = 0; intCount <= intArray.length; intCount++)
				System.out.print(intArray[intCount]);
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("ArrayIndexOutOfBoundsException.."+ exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	public void ioExceptionEx() {
	    try {
	    	File newFile=new File("EmpDetails.txt");
		    FileInputStream readFile=new FileInputStream(newFile);
		} catch (IOException exception) {
			System.out.println("IOException.." +exception.getMessage());
			exception.printStackTrace();
		}
	}
}

