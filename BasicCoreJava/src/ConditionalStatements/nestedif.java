package ConditionalStatements;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean login=true;
		
		if(login)
		{
			System.out.println("Login passed successfully");
		}
		
		boolean logodisplayed=true;
		if(logodisplayed)
		{
			System.out.println("Correct logo is displayed");
		}
		else
		{
			System.out.println("Home page is not displayed");
		}

	}

}
