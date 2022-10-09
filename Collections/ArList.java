package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArList {

	public static void main(String[] args) {

		List a = new ArrayList<>();
		a.add(100);
		a.add("Karthik");
		a.add(null);
		a.add("John");
		a.add(500);
		a.add(50.10);
		
		System.out.println(a); // Insertion order
		System.out.println(a.size());// Will calc the length start from 1
		System.out.println(a.get(2));
		a.set(2, "String"); // Inserting the value by mentioning the Index and value of it
		System.out.println(a);
		System.out.println(a.remove(3));// remove the specified value by using index
		System.out.println(a.removeAll(a));// Boolean concept.If it removes all then true or false
		system.out.println("DONEEE");
		
		a.add(100);
		a.add("Karthik");
		a.add(null);
		a.add("John");
		a.add(500);
		a.add(50.10);
		System.out.println(a.containsAll(a)); //Boolean-it will be True 
		
		a.add(100);
		a.add("Karthik");
		a.add(null);
		a.add("John");
		a.add(500);
		a.add(50.10);
		System.out.println(a.indexOf("John"));//index
		
		a.add(100);
		a.add("Karthik");
		a.add(null);
		a.add("John");
		a.add(500);
		a.add(50.10);
		System.out.println(a.retainAll(a));// Need to check
		
		a.add(100);
		a.add("Karthik");
		a.add(null);
		a.add("John");
		a.add(500);
		a.add(50.10);
a.clear();
System.out.println(a);// clears all the value and returns []
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
