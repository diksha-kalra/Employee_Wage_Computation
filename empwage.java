package emp;

public class empwage {
	//Constant
	public static final int IS_PRESENT =1;
	public static final int WAGE_PER_HOUR=20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		//Checking if employee present or not
		
		//Variable
		int emp_hours=0;
		int daily_emp_wage=0;
		double emp_check = Math.floor(Math.random()*10)%2;
		//checking condition
		if(emp_check == IS_PRESENT) {
			System.out.println("Employee Present");
			emp_hours=8;
		}
		else {
			System.out.println("Employee Absent");
			emp_hours=0;
		}
		daily_emp_wage=emp_hours*WAGE_PER_HOUR;
		System.out.println("Daily Employee Wage -"+daily_emp_wage);
	}

}
