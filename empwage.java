// This code computes the wages of full time and part time employee depending on the conditions of maximum 100hrs and 20 days a month.
// For full time employee the no. of hrs per day is 8hrs and for part time it's 4hrs.
// For full time employee as the number of hrs that is 100 is easily achievable in a month hence it is used for wage calculation.
// For part time as it is not possible to work for 100 hrs a month hence 20 days a month is used for wage calculation.

package emp;

public class empwage {
	//Constant
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int TOTAL_WORKING_HRS=100;
	public static final int TOTAL_WORKING_DAYS=20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		
		//Variable
		int emp_hours=0;
		int emp_wage=0;
		
		double emp_check = Math.floor(Math.random()*10)%3;
		
		//Checking whether employee is full time or partime
		if(emp_check == IS_FULL_TIME) {
			System.out.println("Employee is full time");
			emp_hours=8;
			emp_wage=TOTAL_WORKING_HRS*WAGE_PER_HOUR;
			System.out.println("Full Time Employee Wage "+ emp_wage);
		}
		else if (emp_check== IS_PART_TIME) {
			System.out.println("Employee is part time");
			emp_hours=4;
			emp_wage=TOTAL_WORKING_DAYS*emp_hours*WAGE_PER_HOUR;
			System.out.println("Part Time Employee Wage "+ emp_wage);
			
		}
		else {
			System.out.println("Employee absent");
		}
		
	}

}
