package com.bl.employeewagecomputation;

public class AddPartTimeEmployeeWageUC3 {

	public static void main(String[] args) {
		
		 int IS_PRESENT = 2;
		 
		 int SALARY_PER_HOUR = 50;
		 
		 int IS_PART_TIME = 3;
		 
		 double empCheck = Math.floor(Math.random() * 10) % 2;
		 
		 int WorkingHour = 0;
		 
		 System.out.println(empCheck);
		 
		 WorkingHour = 8;
		 
		 if (empCheck == IS_PRESENT) {
			 
			 WorkingHour = 4;
			 
		 }else if (empCheck == IS_PRESENT) {
			 
			 WorkingHour = 0;
			 
		 }
		 
		 double empSalary = WorkingHour * SALARY_PER_HOUR;
		 
		 System.out.println("Employee Wage  "+empSalary);
		 

	}

}
