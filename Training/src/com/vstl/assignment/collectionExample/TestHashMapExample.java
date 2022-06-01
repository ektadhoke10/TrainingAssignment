package com.vstl.assignment.collectionExample;

import java.util.HashMap;

public class TestHashMapExample {
public static void main(String[] args) {
	HashMapExample objHashMapExample = new HashMapExample();
	HashMap<Integer, String> objHashMap =  objHashMapExample.getPinWithCity();
	System.out.println("get City: "+ objHashMap.get(411035));
	
}
}
