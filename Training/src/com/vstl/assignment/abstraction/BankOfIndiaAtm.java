package com.vstl.assignment.abstraction;

import java.util.Scanner;

public class BankOfIndiaAtm extends BaseAtm{
	Scanner objScanner = new Scanner(System.in);
	
	@Override
	public void withdrawBalance() {
		System.out.println("----------------------------------------");
		System.out.print("Enter money to be withdrawn:");  

		//get the withdrawal money from user  
		intWithdraw = objScanner.nextInt();  

		//check whether the balance is greater than or equal to the withdrawal amount  
		if(intBalance >= intWithdraw)  
		{  
			//remove the withdrawal amount from the total balance  
			intBalance = intBalance - intWithdraw;  
			System.out.println("Please collect your money");  
		}  
		else  
		{  
			//show custom error message   
			System.out.println("Insufficient Balance");  
		}  
		System.out.println("Current Balanace" +intBalance);  
	 
	}
	

	@Override
	public void depositBalance() {
		System.out.println("----------------------------------------");
		System.out.print("Enter money to be deposited:");  

		//get deposit amount from to user  
		intDeposit = objScanner.nextInt();  

		//add the deposit amount to the total balance  
		intBalance = intBalance + intDeposit;  
		System.out.println("Your Money has been successfully depsited");  
		System.out.println("Current Balance is" + intBalance);
		System.out.println("----------------------------------------");
	}

	

}
