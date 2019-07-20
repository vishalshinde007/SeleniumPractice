package collections.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Default Sorted
		
TreeSet<String> set = new TreeSet<>();
		
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
