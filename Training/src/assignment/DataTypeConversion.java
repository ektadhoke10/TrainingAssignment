package assignment;

public class DataTypeConversion {
	
	public void verifyCandidateVoterEligibility(String strAge){
		int intAge=18;
		int intConvertedAge = Integer.parseInt(strAge);
		
		if (intConvertedAge>intAge) {
			System.out.println("Eligibile for voting");
		}
		else {
			System.out.println("Not eligible for voting");
		}
	}
	
	public void verifyStringEquality(int intAge) {
		
		String strAge="31";
		
		String strConvertedAge =String.valueOf(intAge);
		
		if (strConvertedAge==strAge) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("Both are different");
		}
	}
		
		public void verifyStringEqualityUsingEqualsMethod(int intAge) {
			
			String strAge="31";
			
			String strConvertedAge =String.valueOf(intAge);
			
			if (strConvertedAge.equals(strAge)) {
				System.out.println("Both are same");
			}
			else {
				System.out.println("Both are different");
			}
	}
		
	
}