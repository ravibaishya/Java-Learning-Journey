//6. **Student Grade** — Store a grade such as `'A'` using `char`.
class CharValue
{
	public static void main(String args[])
	{
		String name = args[0];
		String subject = args[1];
		int marks = Integer.parseInt(args[2]);
		char grade = args[3].trim().charAt(3);
		System.out.println("Student name : "+name);
		System.out.println("Subject : "+subject);
		System.out.println("Total marks obtain :"+marks);
		System.out.println("Grade : "+grade);
	}
}