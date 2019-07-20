package loops;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// o/p : 0 1 1 2 3 5 8 13 21
        int sum=0;
		
		for (int i=0; i<=9; i++)
		{
			for ( int j=0; j<i; j++)
			{
				sum= i +j;
				System.out.print(+ sum + " ");
			}
			
			//System.out.println(" ");
		}
		
	}

}
