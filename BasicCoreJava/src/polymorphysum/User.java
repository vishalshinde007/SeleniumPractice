package polymorphysum;

public class User {

	public static void main(String[] args)
	{
		int add1;
		//int add2;
		Functions obj1 = new Functions();
		add1=obj1.sum(10, 20);
		System.out.println("Sum of 2 numbers" + add1);
		
		add1=obj1.sum(10, 20, 30);
		System.out.println("Sum of 3 numbers"+ add1);
		
		
	}

}
