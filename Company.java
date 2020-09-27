package emp;

public class Company {
	//constant
	public static final int IS_COMP_1=1;
	public static final int IS_COMP_2=2;
	public static final int IS_COMP_3=3;
	public static final int IS_FULL_TIME =0;
	public static final int IS_PART_TIME=1;
	
	public static int companyEmpWage(int type_of_comp,int type_of_emp) {
		int emp_hours=0;
		int emp_wage_per_hr=0;
		int working_days=0;
		
		switch(type_of_comp) {
		case IS_COMP_1 : 
			System.out.println("Employee of Company 1");
			if(type_of_emp==IS_FULL_TIME) {
				System.out.println("Full Time Employee");
				emp_hours=8;
			}
			else {
				System.out.println("Part Time Employee");
				emp_hours=4;
			}
			emp_wage_per_hr=100;
			working_days=25;
			System.out.println("Hours per day: "+emp_hours+"\nWage per hr: "+emp_wage_per_hr+"\nWorking days per month: "+working_days);
			
			break;
		case IS_COMP_2:
			System.out.println("Employee of Company 2");
			if(type_of_emp==IS_FULL_TIME) {
				System.out.println("Full Time Employee");
				emp_hours=6;
			}
			else {
				System.out.println("Part Time Employee");
				emp_hours=3;
			}
			emp_wage_per_hr=75;
			working_days=23;
			System.out.println("Hours per day: "+emp_hours+"\nWage per hr: "+emp_wage_per_hr+"\nWorking days per month: "+working_days);
			break;
		case IS_COMP_3:
			System.out.println("Employee of Company 3");
			if(type_of_emp==IS_FULL_TIME) {
				System.out.println("Full Time Employee");
				emp_hours=7;
			}
			else {
				System.out.println("Part Time Employee");
				emp_hours=4;
			}
			emp_wage_per_hr=50;
			working_days=20;
			System.out.println("Hours per day: "+emp_hours+"\nWage per hr: "+emp_wage_per_hr+"\nWorking days per month: "+working_days);
			break;
		}
		int emp_wage=emp_hours*working_days*emp_wage_per_hr;
		return emp_wage;
	}
	
}
		