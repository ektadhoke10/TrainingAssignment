package com.vstl.assignment.abstraction;


public class PageFactoryForBank {
	public static BaseAtm objBaseAtm =null;

	public static BaseAtm getobjBaseAtm() {

		objBaseAtm =new BankOfIndiaAtm();

		return objBaseAtm;
	}
}