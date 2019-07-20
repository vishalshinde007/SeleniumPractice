package functions;

public class User {

	public static void main(String[] args) 
	{
		//Static variable should be called with class name e.g> Car.wheels
		Car car1 = new Car();
		car1.name="Innova";
		car1.colour="White";
		//car1.wheels=5;
		car1.driving();
		
		Car car2 = new Car();
		car2.name="Santro";
		car2.colour="Red";
		//car2.wheels=4;
		car2.driving();
		
		Car car3 = new Car();
		car2.name="Creta";
		car2.colour="Silver";
		//car2.wheels=4;
		car2.driving();

	}

}
