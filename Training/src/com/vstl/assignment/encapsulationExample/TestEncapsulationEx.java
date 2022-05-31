package com.vstl.assignment.encapsulationExample;

public class TestEncapsulationEx {
public static void main(String[] args) {
	EncapsulationEx objEncapsulationEx = new EncapsulationEx();
	objEncapsulationEx.setIntAccNumber(134631);
	objEncapsulationEx.setStrPassword("Pass@123");
	objEncapsulationEx.setStrName("Radha");
	objEncapsulationEx.setIntAccBalance(5000);
	System.out.println("Account Number: "+objEncapsulationEx.getIntAccNumber() );
	System.out.println("Password: "+objEncapsulationEx.getStrPassword() );
	System.out.println("Account Holder Name: "+	objEncapsulationEx.getStrName());
	System.out.println("Initial Account Balance: "+ objEncapsulationEx.getIntAccBalance());
	objEncapsulationEx.withdraw(1200);

	
}
}
