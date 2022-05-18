package assignment;

public class TestImplicitConversionEx {
	public static void main(String[] args) {
		ImplicitConversionEx objImplicitConversionEx = new ImplicitConversionEx();
		
		objImplicitConversionEx.convertIntToLong();
		
		System.out.println("=================================");
		
		objImplicitConversionEx.convertIntToFloat();
		
		System.out.println("=================================");
		
		objImplicitConversionEx.convertIntToDouble();
		
		System.out.println("=================================");
		
		objImplicitConversionEx.checkBalanceAfterDeposite(4546);
		
		
	}
	
}
