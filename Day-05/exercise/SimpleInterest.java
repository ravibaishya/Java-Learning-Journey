class SimpleInt
{
	public static void main (String [] si )
	{
		int principal = Integer.parseInt(si[0]);
		float rate = Float.parseFloat(si[1]);
		int time = Integer.parseInt(si[2]);
		float amt = (principal*rate*time)/100;
		
		System.out.println("Entered Principal amount is :"+principal);
		System.out.println("Rate of Interest is : "+rate);
		System.out.println("Duration is : "+time);
		System.out.println("Total interest amount is : "+amt);
	}
}