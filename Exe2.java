class Exe2
{
	public static void main(String[] args)
	{
	   try
	   {
	   int a=Integer.parseInt(args[0]);
	   int b=Integer.parseInt(args[1]);
	   System.out.println("div is:"+(a/b));
	   }
	   catch(ArithmeticException ae)
	   {
	   	System.out.println("divide with zero is not possibl");
	   	//ae.printStackTrace();
	   	//ae.toString();
	   	ae.getMessage();
	   }
	   catch(ArrayIndexOutOfBoundsException ai)
	   {
	   	System.out.println("please pass only two arguments");
	   }
	   catch(NumberFormatException nfe)
	   {
	   	System.out.println("please pass only numbers");
	   }
	   //System.out.println("The sum is"+(a+b));

	}
}