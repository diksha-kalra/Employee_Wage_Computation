// This code computes the daily wages of full time and part time employee and uses the switch statement for determing the employees.
// Full time emp works for 8hrs/day and part time emp works for 4hrs/day.
// daily_emp_wage=emp_hours*WAGE_PER_HOUR   ------ this formula is used for wage calculation.

package emp;

public class empwage {
	//Constant
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		
		//Variable
		int emp_hours=0;
		int daily_emp_wage=0;
		int emp_check = (int)Math.floor(Math.random()*10)%3;
		//Applying switch case to check whether employee is full time or part time
		switch(emp_check) {
			case IS_FULL_TIME :
				System.out.println("Employee is full time");
				emp_hours=8;
				break;
			case IS_PART_TIME : 
				System.out.println("Employee is part time");
				emp_hours=8;
				break;
			default :
				emp_hours=0;
		}
		//Calculating the daily wage of employee
		daily_emp_wage=emp_hours*WAGE_PER_HOUR;
		System.out.println("Daily Employee Wage -"+daily_emp_wage);
	}

}
