package assignment;

public class ExplicitConversionEx {
	double doubleBalance = 1000.53;
    
    public void convertdoubleToLong() {
 		long longConvertedBalance = (long) doubleBalance;
 		System.out.println("After converted into long  " +  longConvertedBalance);
 	}
     
	public void convertdoubleToFloat() {
		float floatConvertedBalance= (float) doubleBalance;
		System.out.println("After converted into float  " +  floatConvertedBalance);
	}
	
	public void convertDoubletoInt() {
		int doubleConvertedBalance = (int) doubleBalance;
		System.out.println("After converted into int  " +  doubleConvertedBalance);
	}
	

	public void checkBalanceAfterDeposite(long longDipositeAmount) {
		long longConvertedBalance = (long) doubleBalance;
		long longTotalBalance = (longConvertedBalance + longDipositeAmount);
		System.out.println("Avaliabale balance after deposite  " + longTotalBalance);
	}
	
}

