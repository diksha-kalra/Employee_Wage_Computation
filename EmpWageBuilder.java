package emp;


public class EmpWageBuilder implements ComputeEmpWage{
	//constant
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	
	//Variables
	private int num_of_company=0;
	private CompanyEmpWage [] comapny_emp_wage_array;
	
	//Constructor
	public EmpWageBuilder() {
		comapny_emp_wage_array=new CompanyEmpWage[4];
	}
	
	private void addCompanyEmpWage(int emp_wage_per_hr, int working_day_per_month, int working_hrs_per_month, String company_name) {
		comapny_emp_wage_array[num_of_company]=new CompanyEmpWage(emp_wage_per_hr,working_day_per_month,working_hrs_per_month,company_name);
		num_of_company++;
	}
	
	private void computeEmpWage() {
		for(int i=0;i<num_of_company;i++) {
			int total_emp_wage=this.computeEmpWage(comapny_emp_wage_array[i]);
			System.out.println("Total Emp Wage for Company "+comapny_emp_wage_array[i].company_name +" is: "+total_emp_wage);
		}
	}
	
	//Method to compute Company Wage
	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int emp_hrs_per_day;
		int total_hrs=0;
		int total_working_days=0;
		System.out.println("Day\t Hours Worked\tTotal Wage");
		while(total_hrs<=companyEmpWage.working_hrs_per_month && total_working_days<companyEmpWage.working_day_per_month) {
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
		int emp_wage=emp_hrs_per_day*companyEmpWage.emp_wage_per_hr;
		total_hrs+=emp_hrs_per_day;
		System.out.println(" "+total_working_days+" \t"+total_hrs+" \t\t"+emp_wage);
	}
		return total_hrs*companyEmpWage.emp_wage_per_hr;
	}
	
	public static void main(String[] args) {
		EmpWageBuilder emp_wage_builder=new EmpWageBuilder();
		emp_wage_builder.addCompanyEmpWage(40,20,70,"capgemini");
		emp_wage_builder.addCompanyEmpWage(50,25,100,"IBM");
		emp_wage_builder.computeEmpWage();
		
		
	}
	
}
	
		