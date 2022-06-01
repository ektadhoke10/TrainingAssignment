package com.vstl.assignment.collectionExample;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

public class ArrayListExmaple {
	public ArrayList<Integer> getPinCodeList(){
		try {
			ArrayList<Integer> objArrayList= new ArrayList<Integer>();
			objArrayList.add(111045);
			objArrayList.add(411002);
			objArrayList.add(411007);
			objArrayList.add(411035);
			objArrayList.add(411012);
			objArrayList.add(411003);
			System.out.println(objArrayList);

			//print size of arraylist 
			System.out.println("Size Is :"+objArrayList.size());
			System.out.println("--------------------------");

			// print element using index
			System.out.println("print pincode on index 2 :"+objArrayList.get(2));
			System.out.println("--------------------------");

			// remove element by index
			System.out.println("remove index 1 element :"+objArrayList.remove(1));
			System.out.println("--------------------------");

			//use of set method (replace by using index)
			System.out.println("list before set:" +objArrayList);
			System.out.println("set :"+objArrayList.set(1, 411025));
			System.out.println("List after set: "+ objArrayList);
			System.out.println("--------------------------");

			//contains method return true if element is present
			System.out.println("contains method :"+objArrayList.contains(411026));
			//returns true if list is empty 
			System.out.println("isEmpty method:"+objArrayList.isEmpty());
			System.out.println("--------------------------");

			// removing element from an arraylist on condition
			ListIterator<Integer> objListIterator = objArrayList.listIterator();
			while(objListIterator.hasNext()) {
				if(objListIterator.next()==411012) {
					objListIterator.remove();
				}
			}
			System.out.println("After Remove:"+ objArrayList);
			System.out.println("--------------------------");

			// print using for loop
			System.out.println("Using For Loop");
			for(int intIndex=0;intIndex<objArrayList.size();intIndex++) {
				System.out.println(objArrayList.get(intIndex));
			}
			System.out.println("--------------------------");
			//print using for each loop
			System.out.println("using for each loop");
			for(int intPin:objArrayList) {
				System.out.println(intPin);
			}
			System.out.println("--------------------------");

			// using iterator
			System.out.println("Using Iterator");
			Iterator<Integer> objIterator =objArrayList.iterator();
			while(objIterator.hasNext()) {
				int intPin=objIterator.next();
				System.out.println(intPin);
			}
			System.out.println("--------------------------");

			return objArrayList;
			
		} catch (Exception exception) {
			System.out.println("Exception : "+ exception.getMessage());
			exception.printStackTrace();
			return null;
		}
	}
}
