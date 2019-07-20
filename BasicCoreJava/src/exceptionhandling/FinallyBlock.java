package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try
		{
			
			int a =10;
			int b=10;
			
			System.out.println(a/b);
			System.out.println("Testing");
			
		}catch(Exception e)
		{
			
			System.out.println(e.getMessage());
			
		}
		//Finally executes with both Try and Catch
		finally
			{
			
			System.out.println("Executing Finally Block");
				
			}
		}

	

}
