package emp;

public class EmpWageBuilder {
	//constant
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	
	//Variables
	private int working_hrs_per_month;
	private int emp_wage_per_hr;
	private int working_day_per_month;
	private int emp_hrs_per_day;
	private String company_name;
	
	//Constructor of EmpWage
	public EmpWageBuilder(int emp_wage_per_hr, int working_day_per_month, int working_hrs_per_month, String company_name) {
		this.company_name=company_name;
		this.emp_wage_per_hr=emp_wage_per_hr;
		this.working_hrs_per_month=working_hrs_per_month;
		this.working_day_per_month=working_day_per_month;
	}
	
	//Method to compute Company Wage
	public int CompanyWage() {
		int total_hrs=0;
		int total_working_days=0;
		System.out.println("Day\t Hours Worked\tTotal Wage");
		while(total_hrs<=working_hrs_per_month && total_working_days<working_day_per_month) {
		total_working_days++;
		int emp_check= (int) Math.floor(Math.random()*10)%3;
		switch(emp_check) {
		case IS_FULL_TIME:
			emp_hrs_per_day=8;
			break;
		case IS_PART_TIME:
			emp_hrs_per_day=4;
			break;
		default:  
			emp_hrs_per_day=0;
			
		}
		int emp_wage=emp_hrs_per_day*emp_wage_per_hr;
		total_hrs+=emp_hrs_per_day;
		System.out.println(" "+total_working_days+" \t"+total_hrs+" \t\t"+emp_wage);
	}
		return total_hrs*emp_wage_per_hr;
	}
	
	public static void main(String[] args) {
		
		//Employee Wage Builder for company1
		EmpWageBuilder capgemini=new EmpWageBuilder(50,20,100,"Capgemini");
		
		//Employee Wage Builder for company2
		EmpWageBuilder IBM=new EmpWageBuilder(40,28,90,"IBM");
		
		//Employee Wage Builder for company3
		EmpWageBuilder Accenture=new EmpWageBuilder(70,30,110,"Accenture");
		
		System.out.println("Total Employee wage for "+capgemini.company_name+" comapny is "+capgemini.CompanyWage());
		System.out.println("Total Employee wage for "+IBM.company_name+" comapny is "+IBM.CompanyWage());
		System.out.println("Total Employee wage for "+Accenture.company_name+" comapny is "+Accenture.CompanyWage());
	}
	
}
	
		