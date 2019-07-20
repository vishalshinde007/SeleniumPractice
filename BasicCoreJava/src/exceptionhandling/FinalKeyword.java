package exceptionhandling;

public final class FinalKeyword {
	
	//Final -> Class -> Can't extend
	//Final ->Variable -> Can't re-initialize
	//Final -> Method ->Can't Override
	
	public final static String name = "anand";

	public static void main(String[] args)
	{
		//name = "abc";

	}
	
	public final void test()
	{
		System.out.println("Test");
	}

}
