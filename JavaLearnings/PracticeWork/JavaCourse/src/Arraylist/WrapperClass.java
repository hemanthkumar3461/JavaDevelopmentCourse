package Arraylist;

import java.util.ArrayList;


//Wrapper-class is an class that stores primitive data as an objects
//This is for converting primitive type of data into object type of data
//Candy example
public class WrapperClass {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		 //int x = 10; 
		 //Integer y = new Integer("10");
		 //Integer z = y.intValue();
		 
		Integer k = 15;//Advanced -->Wrapping into object
		arr.add(k);
		arr.add(21);
		//arr.add(2);
		/*
		 * int x = 10; 
		 * Integer y = new Integer("10");
		 * Integer z = y.intValue(); --> Wrapping out - Conversion from Object to primitive type
		 */
		System.out.println(arr);
	}

}
