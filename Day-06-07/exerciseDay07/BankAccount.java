class BankAccount
{
	int accBalance = 10000; //instance variable
	static int intRate = 12; // static variable
	public static void main (String [] args)
	{
		BankAccount ba = new BankAccount ();
		int newTxn = 500;
		int newBal = ba.accBalance - newTxn;
	//	int emi = (newBal * intRate)/100;
	//	int balAfterEmi = ba.accBalance - emi;
		
		System.out.println("Account Starting Balance : "+ba.accBalance);
		System.out.println("New credit amount : " +newTxn);
	//	System.out.println("EMI deducted amount is : " +emi);
	//	System.out.println ("Available balance after deduction of EMI : " +balAfterEmi);
		BankAccount.emi();
		
	}
	public static void emi()
	{
		int emi = (newBal * intRate)/100;
		int balAfterEmi = ba.accBalance - emi;
		//int balAfterEmi = BankAccount.accBalance - emi;
		System.out.println("EMI deducted amount is : " +emi);
		System.out.println ("Available balance after deduction of EMI : " +balAfterEmi);
		
	}
}