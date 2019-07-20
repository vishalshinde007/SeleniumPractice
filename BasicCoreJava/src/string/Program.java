package string;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "anand";
		
		int count=0;
		
		/*for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)=='a')
			{
				count++;
			}
		}
		
		
		System.out.println(count);*/
		
		//Sub String
		
		/*for (int i=0;i<str1.length();i++)
		{
			
			if(str1.substring(i, i+1).equals('a'))
			{
				count++;
			}
		}
		
		System.out.println(count);*/
		
		System.out.println(str1.length()-str1.replace("a","").length());

	}

}
