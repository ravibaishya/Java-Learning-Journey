/* 18. **Shopping Bill**  
Store prices of 3 products and calculate the total bill.
*/
/*System.out.printf(): Replaced println so we can format the string output dynamically.
%.2f: Tells Java to display the floating-point number (totalDisc) with exactly 2 decimal digits.
%n: Adds a clean, cross-platform newline break at the end.
*/
class ShoppingBill
{
	public static void main(String args[])
	{
		float products1 = Float.parseFloat(args[0]);;
		float product2 = Float.parseFloat(args[1]);
		float product3 = Float.parseFloat(args[2]);
		float discount = 25.50f;
		float total1 = products1+product2+product3;
		float total2 = total1*discount/100;
		
		float totalDisc = total1 - (total1*discount/100);
		System.out.printf("%.2f%n",totalDisc);
	}
}