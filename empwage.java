// This code determines whether an employee is present or absent. 
// Here Math.random is used for generation of random number.

package emp;

public class empwage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		//Constant
		int IS_PRESENT =1;
		
		double emp_check = Math.floor(Math.random()*10)%2;
		
		//Checking whether employee is present or not 
		if(emp_check == IS_PRESENT) {
			System.out.println("Employee Present");
		}
		else {
			System.out.println("Employee Absent");
		}
	}

}
