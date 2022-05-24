package hierarchiccal_inheritance_Example;

public class TestScooty {
	public static void main(String[] args) {
		Scooty objScooty =new Scooty();
		
		objScooty.strModel="Honda Activa 6G";
		System.out.println("Details of " + objScooty.strModel);		
		System.out.println("----------------------------------");		
		objScooty.vehicleDetails("White", 55, 109, 93);
		objScooty.scooty(107, "Kick and Self Start", "Tubeless");
	}
}

