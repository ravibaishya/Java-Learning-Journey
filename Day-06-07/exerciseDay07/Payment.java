class Payment
{
	public static void main(String args[])
	{
		int amount = 600;
		int newTxn = 100;
		int newBal = amount + newTxn;
		System.out.println("Balance is : "+amount);
		System.out.println("New Transaction value is : "+newTxn);
		System.out.println("New available balance is : "+newBal);
	}
}