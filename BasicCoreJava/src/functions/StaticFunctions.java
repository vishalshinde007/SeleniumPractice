package functions;

public class StaticFunctions {

	public static void main(String[] args)
	{
			
		int add1= sum(10, 20);
		int add2= sum(30,40);
		System.out.println("First Function addition" +add1);
		System.out.println("Second Function addition" +add2);
		System.out.println(add1 + add2);
		
		StaticFunctions ref = new StaticFunctions();
		ref.message(".ajd");
		
	}
	
	public static int sum(int a, int b)
	{
		
		
		return a+b;
	}
	

public void message(String message)
{
	System.out.println("Your Message is" +message);
}

}
