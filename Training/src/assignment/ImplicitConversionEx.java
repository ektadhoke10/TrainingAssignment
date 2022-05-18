package assignment;

public class ImplicitConversionEx {
		int intBalance = 1000;
     
    public void convertIntToLong() {
 		long longConvertedBalance = intBalance;
 		System.out.println("After converted into long  " +longConvertedBalance);
 	}
     
	public void convertIntToFloat() {
		float floatConvertedBalance = intBalance;
		System.out.println("After converted into float  " +floatConvertedBalance);
	}
	
	public void convertIntToDouble() {
		double doubleConvertedBalance = intBalance;
		System.out.println("After converted into double  " +doubleConvertedBalance);
	}	
	

	 
	public void checkBalanceAfterDeposite(int intDipositeAmount) {
		long longTotalBalance = (intBalance + intDipositeAmount);
		System.out.println("Avaliabale balance after deposite  " + longTotalBalance);
	}
	
	
	
}
