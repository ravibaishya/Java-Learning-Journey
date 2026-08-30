class Account
{
    static void displayAccount()
    {
        System.out.println("Account information");
    }
}

class Employee
{
    static void displayEmployee()
    {
        System.out.println("Employee information");
    }
}

class MultipleClasses
{
    public static void main(String a[])
    {
        Account.displayAccount();
        Employee.displayEmployee();
		displayAccount1();
    }
}