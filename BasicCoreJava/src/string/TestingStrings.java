package string;

public class TestingStrings {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str="anand";
		String str2= "Anand";
		String test = "My name is Vishal Shinde";
		//cahrAt
		
		System.out.println(str.charAt(3));
		
		//Length
		
		System.out.println(str.length());
		
		//Equals
		System.out.println(str.equals(str2));
		
		//EqualIgnorecase
		System.out.println(str.equalsIgnoreCase(str2));
		
		//Replace
		System.out.println(str.replace("anan", "vishal"));
		
		//Split
		
		String[]arr=test.split(" ");
		for(String s : arr)
		{
			System.out.println(s);
		}
		
		//Sub String
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 4));

	}

}
