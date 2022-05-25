package constructor_assignment;

public class ConstructorEx {
	private int intRate;
	ConstructorEx() {
	intRate = 100;
	}
	ConstructorEx(int intPrice) {
	this();
	/*
	 this() is used for calling the default constructor from parameterized
	 constructor. It should always be the first statement in constructor
	 body.
	*/
	intRate = intRate + intPrice;
	}
	public int getRate() {
	return intRate;
	}
	public void setRate(int intRate) {
	this.intRate = intRate;
	}
}


