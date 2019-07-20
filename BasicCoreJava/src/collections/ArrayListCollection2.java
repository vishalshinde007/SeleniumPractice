package collections;

import java.util.ArrayList;

public class ArrayListCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generic to make array list accept only string values
		//Arraylist uses dynamic Array Data Structure
		//Array list alows duplicate values
		//Its better option for storing and access the data
		//it was introduced in JDK 1.2
		//Fast to work
		
ArrayList<String> list = new ArrayList<>();



list.add("Name");
list.add("Surname");
list.add("Address");

System.out.println(list.get(0));


for(String s : list)
{
	System.out.println(s);
}

System.out.println(list.size());
		
		
		
		

	}

}
