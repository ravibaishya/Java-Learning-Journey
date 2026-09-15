//2. **Student Marks** — Store marks of 5 subjects using `int`.
class StdMarks
{
	public static void main(String args[])
	{
		String name = args[0];
		String subName1 = args[1];
		int marks1 = Integer.parseInt(args[2]);
		String subName2 = args[3];
		int marks2 = Integer.parseInt(args[4]);
		String subName3 = args[5];
		int marks3 = Integer.parseInt(args[6]);
		int totalMarks=marks1+marks2+marks3;
		float percen= (float) totalMarks/3.0f;
		//System.out.println("%.2f", percen);
		//System.out.println(percen);
		
		System.out.println("Name : "+name);
		System.out.print("First Subject : "+subName1);
		System.out.println("  "+marks1);
		System.out.print("Second Subject : "+subName2);
		System.out.println("  "+marks2);
		System.out.print("Third Subject : "+subName3);
		System.out.println("  "+marks3);
		System.out.println("Total marks : "+totalMarks);
		System.out.println("Total Percentage "+percen);
	}
}