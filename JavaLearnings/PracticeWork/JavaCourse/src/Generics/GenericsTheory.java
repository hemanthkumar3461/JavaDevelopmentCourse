package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/*
 * Generics provides us type safety
 * It can used with classes, methods and interfaces.
 * Generics is used for code safety and code reusability
 * 
 * The input for the formal parameters is values and input for type parameters is type
 * Strong type checks is done during compile time. So finding errors in compile is better finding those during run time
 * 
 */
public class GenericsTheory {

	public static void main(String[] args) {
		//Before generics
		List list = new ArrayList();
		list.add("hello");
		String s =(String)list.get(0);

	}
	
	//Using Generics
	List<String> list1 = new ArrayList<>();
	//list1.add("Hello");
	String s = list1.get(0);//No casting required

}



//In generics there are 2 types of parameters

/* The following are some of the standard type parameters 
 * 
 * T : Type
 * E : Element
 * N : Number
 * K : Key
 * V : Value
 * 
 * 
 * Generic class
 * 
 * public class GenricClass<>{
 * }
 * 
 * 
 */