/* 19. **Percentage Calculator**  
Given obtained marks and total marks, calculate percentage.
*/
class Percentage
{
	public static void main(String args[])
	{
		float subMarks1 = 89.50f;
		float subMarks2 = 99.25f;
		float subMarks3 = 79.50f;
		float totalMarks = subMarks1+subMarks2+subMarks3;
		float percentage = (totalMarks/300f) * 100f;
		
		//System.out.printf("Total percentage %.2f%n" , percentage + "Total Marks obtain : %.2f%n"+totalMarks);
		//System.out.printf("Total percentage: %.2f%%%n Total Marks obtained: %.2f%n", percentage, totalMarks);
		System.out.printf("Total percentage: %.2f%%%nTotal Marks obtained: %.2f%n", percentage, totalMarks);
	}
}