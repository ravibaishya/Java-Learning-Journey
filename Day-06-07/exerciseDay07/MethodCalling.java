class MethodCalling
{
	int balance = 10000;
	public static void main(String []args)
	{
		MethodCalling mc = new MethodCalling(); 
		
		int newTrx = Integer.parseInt(args[0]);
		int balanceInfo = mc.balance - newTrx;
		System.out.println(balanceInfo);
		mc.bonusInfo();
	}
	void bonusInfo()
	{
		int bonus = 1200;
		System.out.println((balanceInfo-bonus));
	}
}

/* 
class MethodCalling
{
    int balance = 10000;
    
    public static void main(String []args)
    {
        // Prevent array index crash if no argument is passed
        if (args.length == 0) {
            System.out.println("Please provide a transaction amount as a command-line argument.");
            return;
        }

        MethodCalling mc = new MethodCalling(); 
        int newTrx = Integer.parseInt(args[0]);
        int balanceInfo = mc.balance - newTrx;
        
        System.out.println("Balance after transaction: " + balanceInfo);
        mc.bonusInfo();
    }
    
    void bonusInfo()
    {
        int bonus = 1200;
        // Directly access the instance variable 'balance'
        System.out.println("Balance after bonus deduction: " + (balance - bonus));
    }
}

*/