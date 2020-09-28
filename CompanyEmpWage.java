package emp;

public class CompanyEmpWage {
	public int working_hrs_per_month;
	public int emp_wage_per_hr;
	public int working_day_per_month;
	public String company_name;
	
	//Constructor of CompanyEmpWage
	public CompanyEmpWage(int emp_wage_per_hr, int working_day_per_month, int working_hrs_per_month, String company_name) {
		this.company_name=company_name;
		this.emp_wage_per_hr=emp_wage_per_hr;
		this.working_hrs_per_month=working_hrs_per_month;
		this.working_day_per_month=working_day_per_month;
	}

}
