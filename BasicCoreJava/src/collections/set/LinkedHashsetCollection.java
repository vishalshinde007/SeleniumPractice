package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Preserves Insertion Order
		
LinkedHashSet<String> set = new LinkedHashSet<>();
		
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
