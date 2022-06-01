package com.vstl.assignment.collectionExample;

import java.util.ArrayList;
import java.util.List;

public class ListExmaple {
	public List<String> getEmpList() {
		try {
			List<String> objList=new ArrayList<>();
			objList.add("Rohini");
			objList.add("Ekta");
			objList.add("shivani");
			objList.add("Chaitali");
			objList.add("Aditi");
			objList.add("Priyanka");
			System.out.println("List Data: "+ objList.toString());
			System.out.println("index 2 emp: "+objList.get(2) );
			return objList;
		} catch (Exception exception) {
			System.out.println("Exception : "+ exception.getMessage());
			exception.printStackTrace();
			return null;
		}
	}
	
}
