class ShoppingBill
{
	public static void main (String [] b)
	{
		String productName1 = b[0];
		int product1 = Integer.parseInt(b[1]);
		int quantity1 = Integer.parseInt(b[2]);
		float item1 = product1*quantity1;
		
		String productName2 = b[3];
		int product2 = Integer.parseInt(b[4]);
		int quantity2 = Integer.parseInt(b[5]);
		float item2 = product2*quantity2;
		
		String productName3 = b[6];
		int product3 = Integer.parseInt(b[7]);
		int quantity3 = Integer.parseInt(b[8]);
		float item3 = product3*quantity3;
		
		float total1 = item1+item2+item3;
		float disc 	 = (total1 * 15)/100;
		float totalAmt = total1-disc;
		
		System.out.println("");
		System.out.println("---------------------------");
		System.out.print("1. "+productName1);
		System.out.print("  "+product1);
		System.out.println("  "+quantity1);
		
		System.out.print("2. "+productName2);
		System.out.print("  "+product2);
		System.out.println("  "+quantity2);
		
		System.out.print("3. "+productName3);
		System.out.print("  "+product3);
		System.out.println("  "+quantity3);
		
		System.out.println("---------------------------");
		System.out.println("Item total price : "+total1);
		System.out.println("Discount price : "+disc);
		System.out.println("Payable amount : "+totalAmt);
	}
}