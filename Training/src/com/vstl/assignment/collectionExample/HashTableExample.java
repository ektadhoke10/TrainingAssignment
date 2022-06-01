package com.vstl.assignment.collectionExample;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


public class HashTableExample {
	public Hashtable<String, String> getHashTableData(){
		Hashtable<String, String> objHashtable1 = new Hashtable<String, String>();
		objHashtable1.put("FirstName", "yogesh");
		objHashtable1.put("Company", "VSTL");
		objHashtable1.put("ProjectName", "Salefish");
		System.out.println("Data: "+ objHashtable1.toString());
		return objHashtable1;
	}
	public Hashtable<Integer, String> getPinWithCity(){
		try{
			Hashtable<Integer,String> objHashtable = new Hashtable<Integer,String>();

			objHashtable.put(410502, "Ballalwadi");
			objHashtable.put(411035, "Akurdi");
			objHashtable.put(411026, "Bhosari");
			objHashtable.put(410501, "Chakan");
			objHashtable.put(411035, "Akurdi");
			objHashtable.put(412114, "Chikhlee");
			System.out.println(objHashtable);
			System.out.println("Size: " +objHashtable.size());
			System.out.println("Element of hashTable: " + objHashtable.toString());
			System.out.println("--------------------------");

			// using Enumeration
			Enumeration<Integer> objEnumeration = objHashtable.keys();
			while (objEnumeration.hasMoreElements()) {

				// Getting the key of a particular entry
				int intkey = objEnumeration.nextElement();

				//  display the pincode and city
				System.out.println("PinCode : " + intkey
						+ "\tCity : "
						+ objHashtable.get(intkey));
			}
			System.out.println("--------------------------");
			
			// using iterator
			Set<Integer> keys = objHashtable.keySet();
			 
		    //Obtaining iterator over set entries
		    Iterator<Integer> itr = keys.iterator();
		 
		    //Displaying Key and value pairs
		    while (itr.hasNext()) { 
		       // Getting Key
		       int intPin = itr.next();
		       System.out.println("PinCode : "+ intPin +"\tCity : "+objHashtable.get(intPin));
		    } 
			System.out.println("--------------------------");
			

			return objHashtable;
		}catch (Exception exception) {
			System.out.println("Exception : "+ exception.getMessage());
			exception.printStackTrace();
			return null;
		}

	}

}

