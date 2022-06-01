package com.vstl.assignment.collectionExample;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
	public HashMap<Integer, String> getPinWithCity(){
		try{
			HashMap<Integer,String> objHashMap = new HashMap<Integer,String>();

			objHashMap.put(410502, "Ballalwadi");
			objHashMap.put(411035, "Akurdi");
			objHashMap.put(411026, "Bhosari");
			objHashMap.put(410501, "Chakan");
			objHashMap.put(411035, "Akurdi");
			objHashMap.put(412114, "Chikhlee");
			System.out.println(objHashMap);
			System.out.println("Size: " +objHashMap.size());
			System.out.println("Element of HashMap: " + objHashMap.toString());
			System.out.println("--------------------------");

			// using iterator
			Set<Integer> keys = objHashMap.keySet();

			//Obtaining iterator over set entries
			Iterator<Integer> itr = keys.iterator();

			//Displaying Key and value pairs
			while (itr.hasNext()) { 
				// Getting Key
				int intPin = itr.next();
				System.out.println("PinCode : "+ intPin +"\tCity : "+objHashMap.get(intPin));
			} 
			System.out.println("--------------------------");

			return objHashMap;
		}
		catch (Exception exception) {
			System.out.println("Exception : "+ exception.getMessage());
			exception.printStackTrace();
			return null;
		}

	}
}
