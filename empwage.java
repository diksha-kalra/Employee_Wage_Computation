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