package com.vstl.assignment.abstraction;

public class Test {
public static void main(String[] args) {
	PageFactoryForBank.getobjBaseAtm().enterPin(161131);
	PageFactoryForBank.getobjBaseAtm().withdrawBalance();
	PageFactoryForBank.getobjBaseAtm().depositBalance();
	PageFactoryForBank.getobjBaseAtm().checkBalance();
	
}
}
