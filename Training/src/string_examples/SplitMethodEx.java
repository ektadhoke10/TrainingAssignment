package string_examples;

public class SplitMethodEx {
	String strDistrictNames = "Amravati Akola Nagpur Nanded Nashik Pune Raigad";

    // split string from space
    public void districtName() {
    	String[] strDisplayDistrictNames = strDistrictNames.split(" ");
        System.out.print("District Names = ");
        for (String strName: strDisplayDistrictNames) {
          System.out.print(strName + ", ");
        }
    }
	
}
