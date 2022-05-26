package com.vstl.assignment;


public class FacebookSignupPage {


	public void openBrowser(String strUrl) {
		System.out.println("Browser opened");
	}
	public void setDateOfBirth(String strDateOfBirth) {
		System.out.println("Date Of Birth is: "+ strDateOfBirth );
	}

	public void setFirstName(String strFirstName ) {
		System.out.println("First name is: "+ strFirstName);
	}

	public void setLastName(String strLastName ) {
		System.out.println("Last name is: "+ strLastName);
	}

	public void setMobileNumber(String strMobileNumber) {
		System.out.println("Mobile Number: " + strMobileNumber);
	}

	public void setPassword(String strPassword) {
		System.out.println(strPassword);
	}

	public void selectGender(int intNum) {
		if (intNum==1) {
			System.out.println("Female Clicked");
		} else  if (intNum==2) {
			System.out.println("Male Clicked");
		}else {
			System.out.println("Custome Clicked");
		}
	}

	public void closeBrowser() {
		System.out.println("Browser closed");
	}
}
