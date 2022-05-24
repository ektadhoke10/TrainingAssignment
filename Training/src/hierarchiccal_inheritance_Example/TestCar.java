package hierarchiccal_inheritance_Example;

public class TestCar {
	public static void main(String[] args) {
		Car objCar = new Car();
		objCar.strModel="Hyundai Creta";
		System.out.println("Detais of " + objCar.strModel);
		System.out.println("----------------------------------");
		objCar.vehicleDetails("Black",21, 1997, 240);
		objCar.car(5, 5, "Diesel");
	}
	
}
