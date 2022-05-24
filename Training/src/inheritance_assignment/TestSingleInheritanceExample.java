package inheritance_assignment;

public class TestSingleInheritanceExample{

	public static void main(String[] args) {
		SingleInheritanceExample objSingleInheritanceExample = new SingleInheritanceExample();
		
		objSingleInheritanceExample.strModel="Hyundai Creta";
		System.out.println("Detais of " + objSingleInheritanceExample.strModel);
		System.out.println("----------------------------------");
		objSingleInheritanceExample.vehicleDetails("Black",21, 1997, 240);
		objSingleInheritanceExample.car(5, 5, "Diesel");
		
		System.out.println("==============================================================");
	
		
		objSingleInheritanceExample.strModel="Honda Activa 6G";
		System.out.println("Details of " + objSingleInheritanceExample.strModel);		
		System.out.println("----------------------------------");		
		objSingleInheritanceExample.vehicleDetails("White", 55, 109, 93);
		objSingleInheritanceExample.scooty(107, "Kick and Self Start", "Tubeless");
	}

}
