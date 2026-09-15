/* 17. **SalaryCalculation**  
Calculate annual salary from monthly salary.
*/
class SalaryCalculation
{
	public static void main(String args[])
	{
		float salaryBasic = Float.parseFloat(args[0]);
		float salaryHRA = Float.parseFloat(args[1]);
		float annualSalary = (salaryBasic+salaryHRA)*12;
		System.out.println("Annual salary is :"+annualSalary);
	}
}