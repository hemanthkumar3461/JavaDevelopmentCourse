package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hemanth");
		list.add("Hemanth noobs");
		list.add("Hemanth pro ");
		
		//Adding elements at a specified location
		list.add(1, "hello");
		//list.remove(0);
		//list.remove("hello");
		//list.set(1, "More noobs");
		
		//Iterating through arrayList of elements
		/*
		 * for(int i=0;i<list.size();i++) {
		 * 
		 * System.out.println(list.get(i)); }
		 */
		
		/*
		 * for(String i:list) { System.out.println(i); }
		 */
		
		/*
		 * Iterator<String> it = list.it(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		
		
	}

}
