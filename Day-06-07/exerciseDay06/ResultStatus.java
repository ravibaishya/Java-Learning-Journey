//7. **Pass/Fail Status** — Store whether a student passed using `boolean`.
class ResultStatus
{
	public static void main(String args[])
	{
		String name= args[0];
		int marks = Integer.parseInt(args[1]);
		//boolean result; = marks>40;
		boolean result;
		if (marks>=40)
		{
			result=true;
		}
		else
		{
			result=false;
		}
		if(result){
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}