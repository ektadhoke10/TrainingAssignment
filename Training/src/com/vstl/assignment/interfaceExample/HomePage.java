package com.vstl.assignment.interfaceExample;

public class HomePage implements BasePage , Activity {

	@Override
	public void doLogin(String strEmailId, String strPassword) {
		System.out.println("Email Id :" +strEmailId);
		System.out.println("Password :" +strPassword);
		System.out.println("Login Successful");
		System.out.println("------------------------------");
		
	}

	@Override
	public void clickLogIn() {
		System.out.println("------------------------------");
		this.doLogin("ekta@verve.com", "Pass@123");
		System.out.println("Facebook homepage");
		
	}
	
	
	@Override
	public void cliclLogout() {
		System.out.println("------------------------------");
		System.out.println("Logout successful");
		
	}

	@Override
	public void addPost() {
		System.out.println("------------------------------");
		System.out.println("Post added");
	}

	@Override
	public void writeComment() {
		System.out.println("------------------------------");
		System.out.println("Comment Posted");
		
	}

}
