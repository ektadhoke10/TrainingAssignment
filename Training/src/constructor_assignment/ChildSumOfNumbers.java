package constructor_assignment;

public class ChildSumOfNumbers extends SumOfNumbers{

	public ChildSumOfNumbers(int intFirstNum, int intSecondNumber, int intThirdNumber) {
		// It will call the constructor with (int, int) arguments
		super(4, 2 ,3);
		int intSumOfThreeNumbers =intFirstNum+intSecondNumber+intThirdNumber;
		System.out.println("Sum of Three Numbers " +intSumOfThreeNumbers);
	}



}