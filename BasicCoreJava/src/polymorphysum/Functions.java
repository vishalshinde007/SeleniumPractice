package polymorphysum;
//function overloading
public class Functions {
	
	
	
	public int sum(int a, int b)
	{
		 return a+b;
	}
	
	public int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public int sum(String b,int a)
	{
		return a;
	}
	
	//return object of function class;
	public Functions getInstance()
	{
		return new Functions();
	}

}
