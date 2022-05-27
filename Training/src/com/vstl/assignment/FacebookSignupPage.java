package com.vstl.assignment;

public class FacebookSignupPage {


	public void openBrowser(String strUrl) {
		System.out.println("Browser opened");
		System.out.println("---------------------");
	}

	public void setFirstName(String strFirstName ) {
		System.out.println("First name is: "+ strFirstName);
	}

	public void setLastName(String strLastName ) {
		System.out.println("\nLast name is: "+ strLastName);
	}

	public void setMobileNumber(String strMobileNumber) {
		System.out.println("\nMobile Number: " + strMobileNumber);
	}
	
	public void setDateOfBirth(String strDateOfBirth) {
		System.out.println("\nDate Of Birth is: "+ strDateOfBirth );
	}
	
	public void setPassword(String strPassword) {
		System.out.println("\nPassword is: "+ strPassword);
	}

	public void selectGender(int intNum) {
		if (intNum==1) {
			System.out.println("\nFemale Clicked");
		} else  if (intNum==2) {
			System.out.println("\nMale Clicked");
		}else {
			System.out.println("\nCustome Clicked");
		}
	}

	public void closeBrowser() {
		
		System.out.println("----------------------");
		System.out.println("Browser closed");
	}
}
