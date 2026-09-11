class NumOperations
{
	public static void main (String [] nmo)
	{
		int number1 = Integer.parseInt(nmo[0]);
		int number2 = Integer.parseInt(nmo[1]);
		int resultAdd = number1 + number2;
		int resultDifference = number1 - number2;
		
		System.out.print("First Number : " +number1);
		System.out.println("  &  Second Number is : " +number2);
		System.out.println("Total : "+resultAdd);
		System.out.println("Difference : "+resultDifference);				
	}
} 