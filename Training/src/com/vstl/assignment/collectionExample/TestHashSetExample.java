package com.vstl.assignment.collectionExample;

import java.util.HashSet;

public class TestHashSetExample {
public static void main(String[] args) {
	HashSetExample objHashSetExample =new HashSetExample();
	HashSet<String> city=  objHashSetExample.displayCity();
	System.out.println("city : "+ city);
	System.out.println("isEmptyMethod " +city.isEmpty());
	
	
}
}
