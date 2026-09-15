class MultiPayment
{
	public static void main(String args[])
	{
		int amount = 6000;
		int newTxn = 100;
		int newBal = amount + newTxn;
		System.out.println("Balance is : "+amount);
		System.out.println("New Transaction value is : "+newTxn);
		System.out.println("New available balance is : "+newBal);
	}
	void Emi()
	{
		int emiAmnt = 1000;
		int balAsOnNow = newBal - emiAmnt;
		System.out.println("Current EMI payable amount : "+emiAmnt);
		System.out.println("Available balance : "+balAsOnNow);		
	}
}