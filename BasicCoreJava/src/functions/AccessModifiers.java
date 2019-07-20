package functions;

public class AccessModifiers {

	public static void main(String[] args)
	{
		/*
		Accessmodifiers

		Public - Acessed thougout the project
		Private - Accessed withinthe class
		No modifer - Accessed within the package
		protected - Within the package and by using object of child class. And can call outside the package
        */
		AccessModifiers obj = new AccessModifiers();
		obj.publicmethod();
		obj.privatemethod();
		obj.NoAccessMod();
		obj.protectMethod();
		
	}
		//Public method
		public void publicmethod()
		{
			System.out.println("Public Method");
		}
		
		//Private method
		private void privatemethod()
		{
			System.out.println("Private Method");
		}
		
		//NoAccessModifier method
		 void NoAccessMod()
		{
			System.out.println("NoAccessModifier method");
		}
		 
		 //protectAccessModfier
		 protected void protectMethod()
		 {
			 System.out.println("Protected method");
		 }
	}


