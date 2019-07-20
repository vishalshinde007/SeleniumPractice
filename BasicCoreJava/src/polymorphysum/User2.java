package polymorphysum;

public class User2 {

	public static void main(String[] args)
	{
		NodirectObject obj = NodirectObject.getInstance();
		obj.age=32;
		
		NodirectObject obj2 = NodirectObject.getInstance();
		obj2.age=30;
		
		System.out.println(obj2.age);
		System.out.println(obj.age);
		
		
		

	}

}
