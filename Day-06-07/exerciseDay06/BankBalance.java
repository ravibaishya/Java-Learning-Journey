//9. **Bank Balance** — Store an account balance using `double`.
class BankBalance
{
	public static void main(String args[])
	{
		String custName = args[0];
		String custAccountType = args[1];
		//int custAccountNo = Integer.parseInt(args[2]);
		long custAccountNo = Long.parseLong(args[2]);
		double accBalance = Double.parseDouble(args[3]);
		System.out.println("Customer Name : "+custName+" Account Type : "+custAccountType+" Account No : "+custAccountNo+" Balance Amount : "+accBalance);
	}
}
