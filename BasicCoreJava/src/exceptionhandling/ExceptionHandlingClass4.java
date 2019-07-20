package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingClass4 {

	public static void main(String[] args) throws InterruptedException 
	{
		int a=10;
		int b=0;
		
		//System.out.println(a/b);
		
		Thread.sleep(4000);
		
		readData("");
		divide(a,b);
		
		

	}
	
	public static void readData(String filepath) 
	{
		
		//For checked exception surround with try/catch block 
		
		try {
			FileInputStream obj = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//there is point using throws with unchecked exception
	
	public static void divide(int a, int b) throws ArithmeticException
	{
		
		System.out.println(a/b);
		
	}
	
	public static void readData2(String filepath) throws FileNotFoundException
	{
		
		 
		
		FileInputStream obj = new FileInputStream(filepath);
		
		
	}

}
