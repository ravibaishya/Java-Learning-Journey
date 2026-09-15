//8. **Product Price** — Store the price of a product using `double`.
class ProductPrice
{
	public static void main(String args[])
	{
		String productName = args[0];
		double productPrice = Double.parseDouble(args[1]);
		System.out.println("Product Name : "+productName+"  Price : "+productPrice);
	}
}