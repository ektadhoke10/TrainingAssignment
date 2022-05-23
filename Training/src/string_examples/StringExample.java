package string_examples;

public class StringExample {
	public String getFullName(String strFirstName, String strLastName) {
		String strFullName = strFirstName + " ".concat(strLastName);
		return strFullName;
	}
	
	public void displayCharArray(String strCompanyName) {
		char [] charArray = strCompanyName.toCharArray();
		for (char charCompanyArray : charArray) {
			System.out.println(charCompanyArray);
		}
		
	}
	
}
