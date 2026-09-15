//14. **Circle Area**  
//Store radius using `double` and calculate the area.
class CircleArea
{
	public static void main(String args[])
	{
		double radius = Double.parseDouble(args[0]);
		double area = Math.PI * radius * radius;
		System.out.println("Area of circle is : "+area);
	}
}