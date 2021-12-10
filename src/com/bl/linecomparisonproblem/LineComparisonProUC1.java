package com.bl.linecomparisonproblem;

import java.util.Scanner;


public class LineComparisonProUC1 {

	public static void main(String[] args) {
		
		
		System.out.println(" Line Comparison Computation Program");
		calLength();
	}

	private static void calLength() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x1:value ");
		
		int x1 = sc.nextInt();
		
		System.out.println(" x2:value ");
		
		int x2 = sc.nextInt();
		
		System.out.println(" y1:value ");
		
		int y1 = sc.nextInt();
		
		System.out.println(" y2:value ");
		
		int y2 = sc.nextInt();

		double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println("Length of the line is: " + length1);

	}

}
