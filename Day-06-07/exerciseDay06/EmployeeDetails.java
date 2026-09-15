//10. **Employee Details** — Store age, salary, gender initial, and employment status using appropriate primitive types.
class EmployeeDetails
{
	public static void main(String args[])
	{
		int age = Integer.parseInt(args[0]);
		int salary = Integer.parseInt(args[1]);
		char gender = args[2].trim().charAt(0);
		boolean status = true;
		if (status)
		{
			System.out.println("Employeed");
			
		}
		else
		{
			System.out.println("Unemployeed");
		}
		System.out.println("Age : "+age+" Salary : "+salary+" Gender : "+gender+" Status : "+status);
	}
}