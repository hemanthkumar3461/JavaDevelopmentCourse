package Collections.SetInterfaceFromCollectionInterface;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import java.util.Iterator;
/*
 * Sets interface extends collection interface
 * Sets are used to store the unordered set of elements, which does not allow us to store the duplicates 
 * Set interface is implemented by Hashset, Treeset and LinkedHashset
 */
public class SetInterface {

	public static void main(String[] args) {
		
		//Set<String> s1 = new HashSet<>();
		
		//Set<String> s2 = new LinkedHashSet<>();
		
		//Set<String> s3 = new TreeSet<>();
		
		
		
		//Hashset: Unordered.(Order is not predictable)
		//It is implemented using hashtable for storage. This uses hashcode for placing elements in any specific location
		Set<String> s1 = new HashSet<>();
		s1.add("H4i");
		s1.add("H4i");
		s1.add("5");
		s1.add("H5i");
		s1.add("Hi53");
		s1.add("H53435353i hlo");
		s1.add("Hi 5h44ello");
		s1.add("Hi he453llo");
		s1.add("hell53o");
		s1.add("Hi 5345535hello");
		//Use Iterator from iterable interface for printing the set content
		
		Iterator<String> iterator = s1.iterator();
		
		for(String s: s1) {
			System.out.println(s);
			
			
		}
		
		while(iterator.hasNext()) {
			   Object str = iterator.next(); 
			   System.out.println(str); 
			  
		}
		
		//LinkedHashset: It is an order version of hashset that maintains a doubly linked list across all elements.
		//When the insertion order is needed to be maintained this class is used.
		//While iterating with hashset the order is unpredictable,but linkedhashset lets us iterate through the elements in the order in which they were inserted
		//The order is your priority then use linkedHashset
		System.out.println(" ");
		System.out.println(" ");
		Set<String> s2 = new LinkedHashSet<>();
		s2.add("a");
		s2.add("a");
		s2.add("b");
		s2.add("c");
		s2.add("d");
		s2.add("d");
		s2.add("d");
		s2.add("e");
		s2.add("e");
		
		s2.remove("d");
		Iterator<String> iterator1 = s2.iterator();
		
		for(String s: s2) {
			System.out.println(s);
			
			
		}
		
		
		//Treeset 
		//Java Treeset class implements the set interface that uses a tree for storage 
		//Like hashset, treeset also contains unique elements. The access and retirvel time of treeset is quite fast.
		//The elements in treeset are stored in asecending order.
		//This internally uses binary search tree for sorting order
		System.out.println(" ");
		Set<String> s3 = new TreeSet<>();
		s3.add("b");
		s3.add("a");
		s3.add("a");
		s3.add("c");
		s3.add("d");
		s3.add("e");
		
		
		Iterator<String> iterator2 = s3.iterator();
		
		for(String s: s3) {
			System.out.println(s);
			
			
		}
	
	
	}

}
