package locators;

import facebookPage.BaseTest;

public class TestLocatorsEx extends BaseTest {
	public static void main(String[] args) {

		LocatorsEx objloLocatorsEx =new LocatorsEx();
		initializeWebdriver();
		objloLocatorsEx.setFirstNameUsingXpath();
		objloLocatorsEx.setLastNameUsingName();
		objloLocatorsEx.setEmailUsingCssSelector();
		objloLocatorsEx.setPasswordUsingId();
		objloLocatorsEx.getTextUsingClassName();
		objloLocatorsEx.getSizeOfTagUsingTagName();
		objloLocatorsEx.clickOnTermsUsingLinkText();

	}
}
