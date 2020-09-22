package emp;

public class empwage {
	//Constant
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int WORKING_DAY_PER_MONTH=20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		//Checking if employee present or not
		
		//Variable
		int emp_hours=0;
		int monthly_wage=0;
		int emp_check = (int)Math.floor(Math.random()*10)%3;
		//checking condition
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
		
		monthly_wage= emp_hours*WAGE_PER_HOUR*WORKING_DAY_PER_MONTH;
		System.out.println("Monthly Employee Wage -"+monthly_wage);
	}

}
