package com.vstl.asignment.exceptionHandlingEx;

public class MultipleCatchBlockEx {
	public void multipleCatchEx() {
		try {
			int intArray[] = { 11, 22, 33, 44, 55 };
			for (int intCount = 0; intCount <= intArray.length; intCount++)
				System.out.print(intArray[intCount]+" ");
		} 
		catch(ArithmeticException arithmeticException){
			System.out.println("\nArithmeticException.."+arithmeticException.getMessage());
			arithmeticException.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
			System.out.println("\nArrayIndexOutOfBoundsException.."+ arrayIndexOutOfBoundsException.getMessage());
			arrayIndexOutOfBoundsException.printStackTrace();
		}
		catch(Exception exception){
			System.out.println("\nException.."+ exception.getMessage());
			exception.printStackTrace();
		}
		finally {
			System.out.println("--------------------------------");
			System.out.println("Finally Block Always Execute");
		}
	}
}
