class AddNumber
{
  public static void main(String args[])
  {
    String firstNumber = args[0];
    String secNumber = args[1];
    
	int firstNumberInt = Integer.parseInt(firstNumber); // "hello" --> 20
	int secNumberInt = Integer.parseInt(secNumber);
	
    System.out.println(firstNumberInt + secNumberInt);
  
  } 
  
}