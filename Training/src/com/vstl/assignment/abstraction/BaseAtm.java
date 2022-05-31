package com.vstl.assignment.abstraction;

abstract public class BaseAtm {
	static int intBalance = 10000;
	int intWithdraw, intDeposit;  
	public void enterPin(int intPin) {
		System.out.println("Welcome to Bank Of India Atm");
	}
	public abstract void withdrawBalance();
	public abstract void depositBalance(); 

	public  void checkBalance() {
		System.out.println("Account Balance is:" +intBalance);
	}




}
