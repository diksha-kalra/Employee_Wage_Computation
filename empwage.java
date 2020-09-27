package emp;

public class empwage{
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		//Calling the static method which computes employee wage
		
		int comp_check = (int) Math.floor(Math.random()*10)%3;
		int emp_check= (int) Math.floor(Math.random()*10)%2;
		int emp_wage=Company.companyEmpWage(comp_check,emp_check);
		System.out.println("Employee Wage for a month: "+ emp_wage);
		
	}

}

