/*11. **Add Two Integers**  
Take two `int` values and print their sum.
*/
class AddTwoIntegers
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int result = a+b;
		System.out.println("First number : "+a +" Second number : "+b +"\nResult : "+result);
	}
}