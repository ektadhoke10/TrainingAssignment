package string_examples;



public class TestStringExample {
public static void main(String[] args) {
	StringExample objStringExample = new StringExample();
	String strName="Ekta Dhoke";
	String strFullName= objStringExample.getFullName("Ekta", "Dhoke");
	System.out.println("Full Name is: "+ strFullName);
	System.out.println("------------------------------------");
	System.out.println("Length of Full Name is: "+ strFullName.length());
	System.out.println("------------------------------------");
	System.out.println("Charcter present in 5th index is :"+ strFullName.charAt(5));
	System.out.println("------------------------------------");
	System.out.println("Substring is: " +strFullName.substring(4,10));
	System.out.println("------------------------------------");
	System.out.println(strFullName.isEmpty());
	System.out.println("------------------------------------");
	System.out.println(strFullName.compareTo(strName));
	System.out.println("------------------------------------");
	System.out.println("Full name in lower case: " + strFullName.toLowerCase());
	System.out.println("------------------------------------");
	System.out.println("Full name in upper case: " +strFullName.toUpperCase());
	System.out.println("------------------------------------");
	System.out.println(strFullName.equals(strName));
	System.out.println("------------------------------------");

	
	objStringExample.displayCharArray("Verve Square Technologies");
	
	
	
}
}
