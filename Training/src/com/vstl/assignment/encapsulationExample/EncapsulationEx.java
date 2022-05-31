package com.vstl.assignment.encapsulationExample;

public class EncapsulationEx {
	private String strName;
	private int intAccNumber;
	private String strPassword;
	private static int intAccBalance;
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntAccNumber() {
		return intAccNumber;
	}
	public void setIntAccNumber(int intAccNumber) {
		this.intAccNumber = intAccNumber;
	}
	
	public String getStrPassword() {
		return strPassword;
	}
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}
	
	public int getIntAccBalance() {
		return intAccBalance;
	}
	public void setIntAccBalance(int intAccBalance) {
		EncapsulationEx.intAccBalance = intAccBalance;
	}
	
	public void withdraw(int intWithdraw) {
		if(intAccBalance >= intWithdraw)  
		{  
			intAccBalance = intAccBalance - intWithdraw;  
			System.out.println("-------------------------------");
			System.out.println("Please collect your money"); 
			System.out.println("-------------------------------");
			System.out.println("Avaliable Balance After withdrawal:" +intAccBalance);
		}  
		else  
		{  
			//show custom error message   
			System.out.println("Insufficient Balance");  
		}  
		
	}
	
	
	
	
	
}
