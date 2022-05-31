package com.vstl.assignment.interfaceExample;

import java.util.Scanner;

public class AreaOfShape implements Area{
	Scanner objScanner = new Scanner(System.in);
	@Override
	public void calculateAreOfCircle() {
		System.out.println("Enter the radius of the circle");
		float floatRedius =  objScanner.nextInt();
		double doubleAreaOfCircle = 3.142 * floatRedius * floatRedius;
		System.out.println("Area of the circle is" + doubleAreaOfCircle);

	}

	@Override
	public void calculateAreOfSquare() {
		System.out.println("----------------------------------------------------");
		System.out.println("Input the length of the side of the square");
		float floatSide = objScanner.nextInt();
		float floatAreaOfSquare = floatSide * floatSide;
		System.out.println("Area of the square is" + floatAreaOfSquare);

	}

	@Override
	public void calculateAreOfRectangle() {
		System.out.println("----------------------------------------------------");
		System.out.println("Enter the length of the Rectangle");
		float floatLength = objScanner.nextInt();
		System.out.println("Enter the breadth of the Rectangle");
		float floatBreadth = objScanner.nextInt();
		double doubleAreaOfRectangle = floatLength * floatBreadth;
		System.out.println("Area of the Rectangle is" + doubleAreaOfRectangle);

	}

	@Override
	public void calculateAreOfTriangle() {
		System.out.println("----------------------------------------------------");
		System.out.println("Enter the base of the Triangle");
		float floatBase = objScanner.nextInt();
		System.out.println("Enter the height of the Triangle");
		float floatHeight = objScanner.nextInt();
		double doubleAreaOfTriangle = 0.5 * floatBase * floatHeight;
		System.out.println("Area of the Triangle is" + doubleAreaOfTriangle);
	}

}
