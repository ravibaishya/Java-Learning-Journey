//Check Voting elgibility

class Voting
{
	public static void main(String args[])
	{
		int age = Integer.parseInt(args[0]);
		if (age>=18 && age<120)
		{
			System.out.println("Eligible to vote !!!");
		}
		else if(age>=120)
		{
			System.out.println("Please enter a valid age.");
		}
		else
		{
			System.out.println("Minor");
		}
		
			
	}
}