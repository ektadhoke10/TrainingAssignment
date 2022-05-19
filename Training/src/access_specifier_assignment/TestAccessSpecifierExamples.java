package access_specifier_assignment;

public class TestAccessSpecifierExamples {
 public static void main(String[] args) {
	 AccessSpecifierExamples objAccessSpecifierExamples=new AccessSpecifierExamples();
	 objAccessSpecifierExamples.doLogin( 78945, "Pass@123");
	 System.out.println("==========================================");
	 
	 // it shows error because intTotalMarks is declare as private so it access is only within class
	 //System.out.println(objAccessSpecifierExamples.intAtmPin);
	 
	 	objAccessSpecifierExamples.showAccountBalance(123456);
	 	
	 	System.out.println("==========================================");
	 	
	 	objAccessSpecifierExamples.showEmployeeInformation(102);
}
 
}
