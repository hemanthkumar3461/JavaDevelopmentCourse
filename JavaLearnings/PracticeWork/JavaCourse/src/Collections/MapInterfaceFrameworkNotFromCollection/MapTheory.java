package Collections.MapInterfaceFrameworkNotFromCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map is a collection framework but it does not implement collection interface.
 * Map stores data in the form of key - value pairs
 * We can implements maps using 3- types of concrete classes
 * 1) Hashmap
 * 2) Linked hashmap
 * 3) Treemap
 * 
 * A key-value pair is known as an entry
 * Map contains unique keys and allows duplicate values
 * Map is useful to search, update or delete elements on the basis of the key
 * Map is the root interface in map hierarchy for collection framework
 * Map interface is extended by sorted map and implemented by hashmap, Linkdedhashmap
 * Map implementation classes hashmap and linkedhashmap allow null keys and values but treemap dont allow null key-value
 * Map can't be traversed, for traversing needs to convert into the set using method ketSet() or entrySet()
 * 
 */
public class MapTheory {

	public static void main(String[] args) {
		
		
		Map<String, Integer> phoneNumbers = new HashMap<String, Integer>();
		
		phoneNumbers.put("name 1", 123456);
		phoneNumbers.put("name 2", 12345);
		phoneNumbers.put("name 3", 1234);
		phoneNumbers.put("name 4", 123);
		phoneNumbers.put("name 5", 12);
		
		System.out.println(phoneNumbers);
		System.out.println(phoneNumbers.get("name 2"));
		System.out.println(phoneNumbers.containsKey("name 1"));
		System.out.println(phoneNumbers.isEmpty());
		System.out.println(phoneNumbers.keySet());
	
		
//Map don't have iterator for traversing elements 
		//So, here in maps we have keyset(), which returns keys 
		//We have values method which returns values of keys
		System.out.println(phoneNumbers.values());
		
		//Keyset methods belongs to set interface
		Set<String> nameSet = phoneNumbers.keySet();
		for(String s : nameSet) {
			System.out.println(s);
		}
		
		//Values method belongs to Collection interface
		Collection<Integer> phoneCollection = phoneNumbers.values();
		for(Integer p : phoneCollection) {
			System.out.println(p);
		}
		//When you use hashamp, keys are unpredictable format

		for(String name: phoneNumbers.keySet()) {
			Integer number = phoneNumbers.get(name);
			System.out.println(name + " =  " + number);
		}

	}

}
