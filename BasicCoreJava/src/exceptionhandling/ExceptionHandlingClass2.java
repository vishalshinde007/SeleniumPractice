package exceptionhandling;

public class ExceptionHandlingClass2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		
		//System.out.println(b/a);
		
		ExceptionHandlingClass2 obj = new ExceptionHandlingClass2();
		
		try
		{
		obj.test(10, 0);
		}catch(Exception e)
		{
			System.out.println("Fail:"+ e.getMessage());
		}
		
		System.out.println("Print Statement");

	}
	
	public int test(int a, int b)
	{
		return a/b;
	}

}
