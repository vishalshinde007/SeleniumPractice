package inheritance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Multiple inheritance is not possible in Java using classes
		//Multi level inheritance of classes is pobbile in Java
		
		Smartphone phone = new Smartphone();
		phone.internet();
		phone.texting();
		phone.calling();
		
		Telephone obj = new Telephone();
		obj.calling();
		
		Telephone tel = new Telephone();
		tel=new Mobile();
		tel = new Smartphone();
	

	}

}
