package com.bl.employeewagecomputation;

public class CalWagesForMonthUC5 {
	
	static final int IS_PRESENT = 4;
	
	static final int SALARY_PER_HOUR = 5;
	
	static final int IS_PART_TIME = 50;
	
	static final int IS_FULL_TIME = 100;
	
	public static void main (String[]args) {
		
		calculateTotalWage();
		
		
	}
	
	private static void calculateTotalWage() {
		
		int empCheck;
		
		int empHr = 0;
		
		int totalSalary = 0;
		
		for (int i = 1; i <= 20; i++) {
			
		}
			empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			
			switch (empCheck) {
			
			case IS_PRESENT:
				
				empHr = 8;
				
				break;

			case IS_PART_TIME:
				
				empHr = 4;
				
				break;

			default:
				
				empHr = 0;
				break;
			}
	}

}
