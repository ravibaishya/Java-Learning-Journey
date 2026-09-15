//OddEven
class OddEven
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		//int check=a/2;
		if (a%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}