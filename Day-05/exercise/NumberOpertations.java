class NumOpertations
{
	public static void main (String [] nmo)
	{
		int n1 = Integer.parseInt(nmo[0]);
		int n2 = Integer.parseInt(nmo[1]);
		int ra = n1 + n2;
		int rs = n1 - n2;
		int rm = n1 * n2;
		int rd = n1 / n2;
		
		System.out.print ("First Number : " +n1);
		System.out.println("||  &  || Second Number is : " +n2);
		System.out.println ("Addition of your given number is : "+ra);
		System.out.println ("Substraction of entered number is : "+rd);
		System.out.println ("Multiplication of your given number is : "+rm);
		System.out.println("Division of your entered number is : "+rd);
		
	}
} 