package com.vstl.assignment.collectionExample;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public HashSet<String> displayCity(){

		try{
			HashSet<String> objHashSet= new HashSet<String>();
			objHashSet.add("Pune");
			objHashSet.add("Amravati");
			objHashSet.add("Akola");
			objHashSet.add("Pune");
			objHashSet.add("Nagpur");

			System.out.println(objHashSet);
			System.out.println("size is: " +objHashSet.size());
			System.out.println("Contains method: " +objHashSet.contains("Pune"));
			System.out.println("isEmpty Method: " +objHashSet.isEmpty());
			System.out.println("get class: " +objHashSet.getClass());
			System.out.println("Remove Method: " +objHashSet.remove("Akola"));
			System.out.println("After remove: "+objHashSet);
			System.out.println("-----------------------------------");
			
			//print using for each loop
			System.out.println("using for each loop: ");
			for(String strCity:objHashSet) {
				System.out.println("City Name :"+strCity);
			}
			System.out.println("--------------------------");
			
			// using iterator
			System.out.println("using iterator: ");
			Iterator<String> iterator =objHashSet.iterator();
			while(iterator.hasNext()) {

				System.out.println("City Name :"+iterator.next());
			}
			System.out.println("-----------------------------------");
			
			// clear method
			objHashSet.clear();
			return objHashSet;
		}
		catch (Exception exception) {
			System.out.println("Exception : "+ exception.getMessage());
			exception.printStackTrace();
			return null;
		}
	}
}
