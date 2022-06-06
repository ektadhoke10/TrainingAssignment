package facebookPage;

public class TestSignUpPage extends BaseTest  {
	public static void main(String[] args){
		SignUpPage objSignUpPage =new SignUpPage();
		initializeWebdriver();
		objSignUpPage.setFirstNameOnFacebookSignupPage();
		objSignUpPage.setLastNameOnFacebookSignupPage();
		objSignUpPage.setMobileNumberForFacebookSignupPage();
		objSignUpPage.setPasswordForFacebookSignupPage();
		objSignUpPage.setDateForFacebookSignupPage();
		objSignUpPage.setMonthForFacebookSignupPage();
		objSignUpPage.setYearForFacebookSignupPage();
		objSignUpPage.setGenderForFacebookSignupPage(getGenderForFacebookSignupPage());
		objSignUpPage.clickOnTerms();
		objSignUpPage.clickOnCookiePolicy();
		tearDown();
	}

}
