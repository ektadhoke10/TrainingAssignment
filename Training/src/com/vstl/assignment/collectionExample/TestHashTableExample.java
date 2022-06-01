package com.vstl.assignment.collectionExample;

import java.util.Hashtable;

public class TestHashTableExample {
	public static void main(String[] args) {
		HashTableExample objHashTableExample = new HashTableExample();
		Hashtable<String, String> objHashTable =  objHashTableExample.getHashTableData();
		System.out.println("get Firstname: "+ objHashTable.get("FirstName"));
		System.out.println("======================================================");
		
		HashTableExample objHashTableExample1 = new HashTableExample();
		Hashtable<Integer, String> objHashTable1 =  objHashTableExample1.getPinWithCity();
		System.out.println("get City: "+ objHashTable1.get(411035));
		
		
	}
}

