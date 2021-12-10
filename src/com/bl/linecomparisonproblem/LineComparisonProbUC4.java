package com.bl.linecomparisonproblem;

import java.util.Scanner;

public class LineComparisonProbUC4 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program");
		calculateTwoLength();
		checkingEqualsLine(0, 0);
	}

	private static void calculateTwoLength() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" x1: value ");
		int x1 = sc.nextInt();
		
		System.out.println("  x2: value ");
		int x2 = sc.nextInt();
		
		System.out.println("  y1: value ");
		int y1 = sc.nextInt();
		
		System.out.println("y2:value ");
		int y2 = sc.nextInt();

		System.out.println(" a1:value ");
		int a1 = sc.nextInt();
		
		System.out.println(" a2:value ");
		int a2 = sc.nextInt();
		
		System.out.println("b1:value ");
		int b1 = sc.nextInt();
		
		System.out.println("b2:value ");
		int b2 = sc.nextInt();

		double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of the line1 is: " + length1);

		double length2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("Length of the line2 is: " + length2);
	}

	private static void checkingEqualsLine(double length1, double length2) {
		int a = (int) length1;
		int b = (int) length2;

		if (a == b) {
			System.out.println("Lines are equal");
		} else {
			System.out.println("Lines are not equal");
		}
		System.out.println(Double.compare(length1, length2));
	  

	}

}
