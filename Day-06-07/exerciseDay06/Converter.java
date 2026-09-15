class Converter
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
	
	    float x = (float) num1/(float) num2;
		double division = x;
		
		System.out.println("Number is : "+x);
		System.out.println("Number is : "+division);
		
	}	
}