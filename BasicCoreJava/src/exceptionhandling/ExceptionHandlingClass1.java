package exceptionhandling;

import oopsinterface.RBI;

public class ExceptionHandlingClass1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		//abnormal behavior of code is known as exception
		
		
		//type 1 exception
		int a=10;
		int b=0;
		//System.out.println(a/b);
		
		RBI obj = null;
		//obj.creditcard();
		
		String str="anand";
		System.out.println(str.charAt(5));
		
		System.out.println("anand");
		//Exception Type2 : Check Exception
		Thread.sleep(3000);
		System.out.println("bhayre");
		Test.login();

	}

}
