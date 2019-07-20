package exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception 
	{
		
		test(10, 0);
		

	}
	
	//Throws used for to report user defined exception
	
	public static void test(int a, int b) throws Exception
	{
		
		if (b==0)
		{
			throw new Exception("The Value of b is zero");
		}
		
	}

}
