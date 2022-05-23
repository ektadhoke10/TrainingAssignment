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
	
	public StringBuffer stringBufferExample() {
		
		StringBuffer objStringBuffer = new StringBuffer("Verve Square ");
		
			StringBuffer stringBuilderCompanyName = objStringBuffer.append("Technologies");
			return stringBuilderCompanyName;
	}
	public StringBuilder stringBuilderExample() {
		
		StringBuilder objStringBuilder = new StringBuilder("Verve Square ");
		
		StringBuilder stringBuilderCompanyName = objStringBuilder.append("Technologies");
		return stringBuilderCompanyName;
		
	}
	
}
