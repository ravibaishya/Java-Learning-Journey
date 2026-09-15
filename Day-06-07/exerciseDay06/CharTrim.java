//Char value check
class CharTrim
{
	public static void main(String args[])
	{
		String name = args[0].trim();
		int marksObtain = Integer.parseInt(args[1]);
		char grade = args[2].trim().charAt(4);
		System.out.println("Name : "+name +"  " + "Marks score : "+marksObtain+ "   Grade secure : "+grade);
	}
}