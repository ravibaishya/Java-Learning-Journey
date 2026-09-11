class MiniCalculator
{
	public static void main (String [] nmo)
	{
		int number1 = Integer.parseInt(nmo[0]);
		int number2 = Integer.parseInt(nmo[1]);
		int resultAdd = number1 + number2;
		int resultSubstract = number1 - number2;
		int resultMultiply = number1 * number2;
		float resultDivision = number1 / number2;
		
		System.out.print("First Number : " +number1);
		System.out.println("   &    Second Number is : " +number2);
		System.out.println("Addition of your given number is : "+resultAdd);
		System.out.println("Substraction of entered number is : "+resultSubstract);
		System.out.println("Multiplication of your given number is : "+resultMultiply);
		System.out.println("Division of your entered number is : "+resultDivision);							
	}
} 