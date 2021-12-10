package com.bl.employeewagecomputation;

public class EmployeeWageCompuUC2 {

	public static void main(String[] args) {
		
		int  IS_PRESENT = 4;
		
		int SALARY_PER_HOUR = 50;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		int WorkingHour = 0;
		
		System.out.println(empCheck);
		
		if (empCheck == IS_PRESENT ) {
			
			WorkingHour = 9;
			
		}
		
		double empSalary = WorkingHour * SALARY_PER_HOUR;
		
		System.out.println("Employee has earned "+empSalary+ " Dollar per Day");

	}

}
