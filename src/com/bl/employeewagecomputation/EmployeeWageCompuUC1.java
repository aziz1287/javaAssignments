package com.bl.employeewagecomputation;

public class EmployeeWageCompuUC1 {

	public static void main(String[] args) {
		
		int IS_PRESENT = 4;
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		System.out.println(empCheck);
		
		if (empCheck == IS_PRESENT) {
			
			System.out.println("Employee is present");
			
		}
		
		else {
			
			System.out.println("Employee is Absent");
		}

	}

}
