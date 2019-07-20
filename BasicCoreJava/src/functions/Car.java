package functions;

public class Car
{
	String name;
	String colour;
	static int wheels=4;
	
	
	public Car(String name, String colour)
	{
		
		this.name=name;
		this.colour=colour;
		
	}
	
	//Default Constructor
	//Construcor Overaloadding: When we have more than one constructor in one class
	public Car() {
		// TODO Auto-generated constructor stub
	}

	//non static functions (we have to create object of class)
	public void driving()
	{
		System.out.println("I am driving "+colour+" colour "+name+" which has "+wheels+" wheels");
	}

}
