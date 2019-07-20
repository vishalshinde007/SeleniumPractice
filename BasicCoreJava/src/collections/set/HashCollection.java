package collections.set;

import java.util.HashSet;

public class HashCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Its a Random Access
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Name");
		set.add("Surname");
		set.add("Address");
		set.add("Name");
		set.add("Surname");
		set.add("Address");
		
		for(String s :set)
		{
			System.out.println(s);
		}
		
		
		

	}

}
