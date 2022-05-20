package loop_assignment;

public class LoopExamples {
		
	// print all even numbers from an array using for loop
	
	public void forLoopExample() {
			int intArray []= {12,45,32,14,9,42};
			System.out.println("Even numbers are :" );
			for(int intArrayIndex =0 ; intArrayIndex < intArray.length; intArrayIndex ++) {
				
				if (intArrayIndex % 2 == 0) {
					System.out.print("  " + intArray[intArrayIndex] );
				}
			}
		}
	
	// print all elements in an array using while loop
	
	public void whileLoopExapmple() {
	        int intArrayOfNumber [] = {12, 25, 87, 69, 45, 55};
	        int intIndex = 0;
	        System.out.println(" \n------------------------------------");
	        System.out.println("Array Elements are: ");
	        while (intIndex < intArrayOfNumber.length) {
	            System.out.print(" " + intArrayOfNumber[intIndex]);
	            intIndex++;
	        }
	    } 
	
	//  print table of number using do while loop
	
	public void doWhileLoopExample(int intNumberTable) {
		
		System.out.println("\n----------------------------------");
		int intCount = 1;
		do {
			System.out.println(intNumberTable +  "*" + intCount + " = " +intNumberTable*intCount);
			intCount++;
		} while (intCount<=10);
		
	}
}
	 
	

