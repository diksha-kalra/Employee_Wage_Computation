package emp;

public class empwage {
	//Constant
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int WORKING_DAY_PER_MONTH=20;
	public static final int TOTAL_WORKING_HRS=100;
	public static final int TOTAL_WORKING_DAYS=20;
	//public static final int IS_PRESENT =1;  // use for checking emp present or not 
		
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		// To check whether employee is present or not
 		
//		double emp_check = Math.floor(Math.random()*10)%2;
//		
//		//Checking whether employee is present or not 
//		if(emp_check == IS_PRESENT) {
//			System.out.println("Employee Present");
//		}
//		else {
//			System.out.println("Employee Absent");
//		}
//		
			
		//Variable
		int emp_hours=0; 
//		int daily_emp_wage=0; //use this variable when computing daily wage
//		int monthly_wage=0; //use this variable when computing monthly wage
		int emp_wage=0;
		
		int emp_check = (int) Math.floor(Math.random()*10)%3;

		switch(emp_check) {
		case IS_FULL_TIME :
			System.out.println("Employee is full time");
			emp_hours=8;
			if(emp_hours*TOTAL_WORKING_DAYS>=TOTAL_WORKING_HRS) {
				emp_wage=TOTAL_WORKING_HRS*WAGE_PER_HOUR;
			}
			else {
				emp_wage=TOTAL_WORKING_DAYS*emp_hours*WAGE_PER_HOUR;
			}
			break;
		case IS_PART_TIME : 
			System.out.println("Employee is part time");
			emp_hours=4;
			if(emp_hours*TOTAL_WORKING_DAYS>=TOTAL_WORKING_HRS) {
				emp_wage=TOTAL_WORKING_HRS*WAGE_PER_HOUR;
			}
			else {
				emp_wage=TOTAL_WORKING_DAYS*emp_hours*WAGE_PER_HOUR;
			}
			break;
		default :
			System.out.println("Employee absent");
			emp_hours=0;
	}
		
		System.out.println("Employee Wage "+ emp_wage);
		
		//Calculating the daily wage of employee

//		daily_emp_wage=emp_hours*WAGE_PER_HOUR;
//		System.out.println("Daily Employee Wage -"+daily_emp_wage);

		
		//Computing monthly wage of employee 
//		monthly_wage= emp_hours*WAGE_PER_HOUR*WORKING_DAY_PER_MONTH;
//		System.out.println("Monthly Employee Wage -"+monthly_wage);


		}
		

	}

