package Arraylist;

import java.util.ArrayList;

public class ComparableInterface {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<>();
		//Comparable Interface is a Arraylist implementation for the natural ordering feature
		list.add(2);
		list.add(5);
		list.add(9);
		list.add(2);
		//Less than relation returns -1
		//Greater than relation returns 1
		//0 indicates equality
		System.out.println(list);
		System.out.println(list.get(0).compareTo(list.get(1)));
		System.out.println(list.get(2).compareTo(list.get(1)));
		System.out.println(list.get(0).compareTo(list.get(3)));
		

	}

}
