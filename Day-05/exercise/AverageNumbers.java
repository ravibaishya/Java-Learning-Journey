class AvgNum
{
	public static void main (String [] an)
	{
		int f1 = Integer.parseInt(an[0]);
		int f2 = Integer.parseInt(an[1]);
		int f3 = Integer.parseInt(an[2]);
		int av = (f1+f2+f3)/3;
		
		System.out.println("You have entered : "+f1 +" " +f2  +" " +f3);
		System.out.println("Average of your given numbers : " +av);
	}
}