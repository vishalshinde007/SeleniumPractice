package polymorphysum;

public class NodirectObject 
{
	int age;
	private static NodirectObject obj= new NodirectObject();
	private NodirectObject()
	{
		
	}
	
	public static NodirectObject getInstance()
	{
		return obj;
	}

}
