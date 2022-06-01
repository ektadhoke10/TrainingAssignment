package com.vstl.assignment.collectionExample;

import java.util.List;

public class TestListExmaple {
	public static void main(String[] args) {
		ListExmaple objListExmaple = new ListExmaple();
		List<String> empList=  objListExmaple.getEmpList();
		System.out.println("Index 4 emp name: "+empList.get(4));
		System.out.println("remove emp :"+ empList.remove(5));
		System.out.println("New emp Lis: "+empList);
	}
}
