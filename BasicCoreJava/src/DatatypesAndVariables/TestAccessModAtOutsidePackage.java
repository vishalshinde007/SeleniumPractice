package DatatypesAndVariables;

import functions.AccessModifiers;

public class TestAccessModAtOutsidePackage extends AccessModifiers  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiers obj =new AccessModifiers();
		obj.publicmethod();
		
		TestAccessModAtOutsidePackage obj1 = new TestAccessModAtOutsidePackage();
		obj1.protectMethod();
		
		
	}

}
