package string_examples;

public class TestSplitMethodEx {
public static void main(String[] args) {

	SplitMethodEx objSplitMethodEx = new SplitMethodEx();
	System.out.println(" Before split method");
	System.out.println("--------------------------");
	System.out.println("District Names = "+ objSplitMethodEx.strDistrictNames);
	
	System.out.println("\n After split method");
	System.out.println("--------------------------");
	objSplitMethodEx.districtName();
	
}
}
