//12. **Calculate Average**  
//Store three subject marks and calculate the average.

class CalculateAverage
{
	public static void main(String args[])
	{
		int aMarks = Integer.parseInt (args[0]);
		int bMarks = Integer.parseInt (args[1]);
		int cMarks = Integer.parseInt (args[2]);
		int result = (aMarks+bMarks+cMarks)/3;
		System.out.println("");
		System.out.println("Average marks is :"+result);
	}
}