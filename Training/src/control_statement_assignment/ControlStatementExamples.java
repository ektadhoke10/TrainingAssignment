package control_statement_assignment;

public class ControlStatementExamples {
	int intAvaliableBalance = 15000;
	
	
// if statement
	public void sixDigitOTP(String strOTP) {
		if (strOTP.length() == 6) {
			System.out.println("OTP is " + strOTP);
		}
	}
	
	
// if-else statement 
	
	public void checkEvenOddNumber() {
		int intNumber = 11;
		if (intNumber % 2==0) {
			System.out.println(intNumber + " is even number");
		}
		else {
			System.out.println(intNumber + " is odd number");
		}
	}
	

// if-else statement 
	
	public void withdrawAccountBalance(int intBalance) {
		 
		if (intAvaliableBalance >= intBalance ) {
			int intTotalBalance = intAvaliableBalance -intBalance;
			System.out.println("Total Balanace is " + intTotalBalance);
			intAvaliableBalance = intTotalBalance;		
		} else {
			System.out.println("AvaliabBalance is not sufficient for withdrawal");
		}				
}


// if-else ladder
	public void checkNumberType(int intNumber) {
		if (intNumber > 0) {
			System.out.println("Number is positive");
		} else if (intNumber < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is zero");
		} 
	}
// switch statement
 
  public void checkSizeOfJeans( String strSize) {
	    boolean booleanSize;
	    switch (strSize) {
	   
	    case "Extra Small":
	    	booleanSize = true;
	        break;
	        
	      case "Small":
	    	  booleanSize = true;
	        break;

	      case "Medium":
	    	  booleanSize = true;
	        break;

	      case "Large":
	    	  booleanSize = false;
	        break;

	      case "Extra Large" :
	    	  booleanSize = true;
	        break;
	      
	      default:
	    	  booleanSize = false;
	        break;

	    }
	    
	    if (booleanSize == true) {
			System.out.println(strSize +" size jeans is avaliable");
		}
	    else {
	    	System.out.println(strSize +" size jeans is not avaliable");
		}
	  }
  }
