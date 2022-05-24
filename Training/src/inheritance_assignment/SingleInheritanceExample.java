package inheritance_assignment;

public class SingleInheritanceExample extends SingleInheritanceParent{
	
	public void car(int intSeats, int intGears,String strFuelType ) {
		System.out.println("Number of Seats : " + intSeats);
		System.out.println("FuleType : " + strFuelType);
		System.out.println("Number of Gears : " + intGears);
		
	}
	
	 
	public void scooty(int intWeight, String strStarting, String strTyerType) {
		System.out.println("Weight: " +intWeight + "Kg");
		System.out.println("Starting: " +strStarting);
		System.out.println("Tyer Type: "+ strTyerType);
	}
}
