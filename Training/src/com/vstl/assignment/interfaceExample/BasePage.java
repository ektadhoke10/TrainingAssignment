package com.vstl.assignment.interfaceExample;

public interface BasePage {
	String strUrl ="https://www.facebook.com/login/";
	void doLogin(String strEmailId, String strPassword);
	void clickLogIn();
	void cliclLogout();	
	
}
