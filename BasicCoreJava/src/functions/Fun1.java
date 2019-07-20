package functions;

public class Fun1 {

	public static void main(String[] args)
	{
			
		int add1= sum(10, 20);
		int add2= sum(30,40);
		System.out.println("First Function addition" +add1);
		System.out.println("Second Function addition" +add2);
		System.out.println(add1 + add2);
		
	}
	
	public static int sum(int a, int b)
	{
		
		
		return a+b;
	}

}
