package com.vstl.assignment.interfaceExample;

public class TestHomePage  {
	public static void main(String[] args) {
		BasePage objBasePage =new HomePage();
		Activity objActivity= new HomePage();
		System.out.println("Open Url: "+ objBasePage.strUrl);
		objBasePage.clickLogIn();
		objActivity.addPost();
		objActivity.writeComment();
		objBasePage.cliclLogout();
	}
}

