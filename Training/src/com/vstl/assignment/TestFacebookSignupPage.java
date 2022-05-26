package com.vstl.assignment;



public class TestFacebookSignupPage extends UtilitiesFunctions {
	public static void main(String[] args) {
		FacebookSignupPage objFacebookSignupPage = new FacebookSignupPage();
		objFacebookSignupPage.openBrowser("https://www.facebook.com/r.php?locale=en_GB&display=page");
		objFacebookSignupPage.setFirstName(getFirstName());
		objFacebookSignupPage.setLastName(getLastName());
		objFacebookSignupPage.setMobileNumber(getMobileNumber());
		objFacebookSignupPage.setDateOfBirth(getDateOfBirth());
		objFacebookSignupPage.setPassword("Pass@123");
		objFacebookSignupPage.selectGender(getGender());
		objFacebookSignupPage.closeBrowser();
	}

}
