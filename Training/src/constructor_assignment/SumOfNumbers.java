package constructor_assignment;

public class SumOfNumbers {

	public SumOfNumbers(String strMessage) {
		System.out.println("Sum of Numbers:");
	}

	public SumOfNumbers(int intFirstNum, int intSecondNumber) {
		// It will call the constructor with String argument
		this("");
		int intSumOfTwoNumbers =intFirstNum+intSecondNumber;
		System.out.println("Sum of two Numbers " + intSumOfTwoNumbers);
	}

	public SumOfNumbers(int intFirstNum, int intSecondNumber, int intThirdNumber) {
		// It will call the constructor with (int, int) arguments
		this(5, 2);
		int intSumOfThreeNumbers =intFirstNum+intSecondNumber+intThirdNumber;
		System.out.println("Sum of Three Numbers " +intSumOfThreeNumbers);
	}



}