package access_specifier_assignment;

public class AccessSpecifierExamples {
	
	// Default Access Modifier 
	
	int intId = 78945;
	String strPassword = "Pass@123";
	
	public void doLogin( int intUserId, String strUserPassword ) {
		if (intId == intUserId && strPassword == strUserPassword ) {
			System.out.println("Log in Successful");
		}
		else {
			System.out.println("Enter correct id and password");
		}
	}
	
	// private access modifier
	 int intBalance = 1000;
	 private int intAtmPin = 123456;
	public void showAccountBalance(int intAtmPin) {
		if (intAtmPin== intAtmPin) {
			System.out.println("Accocunt balance is: "+ intBalance);
		}	
	}
	 
	// protected access specifier
	
	int intEmpId = 102;
	String strEmpName= "Ekta";
	String strDesignation = "Test Engineer Trainee";
	protected void showEmployeeInformation(int intEmployeeId) {
		if (intEmpId== intEmployeeId) {
			System.out.println("Employee id : " + intEmpId);
			System.out.println("Employee Name : " + strEmpName);
			System.out.println("Employee Designation : " + strDesignation);
		}	
	}
	 
	
	
	
}
