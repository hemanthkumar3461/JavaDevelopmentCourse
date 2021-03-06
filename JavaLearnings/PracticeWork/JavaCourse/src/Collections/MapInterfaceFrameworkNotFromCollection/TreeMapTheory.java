package Collections.MapInterfaceFrameworkNotFromCollection;
//Hashmap performs a it faster than treemap stores any type of data, Keys are stored randomly 

import java.util.Map;
import java.util.TreeMap;

//Treemap is slower than hashmap, stores only comparable data. 
//It keeps keys in sorted order Ex: a,b,c,d,e...



public class TreeMapTheory {

	public static void main(String[] args) {
		Map<String, Integer> phoneNumbers = new TreeMap<String, Integer>();
		
		phoneNumbers.put("name 1", 123456);
		phoneNumbers.put("name 2", 12345);
		phoneNumbers.put("name 3", 1234);
		phoneNumbers.put("name 4", 123);
		phoneNumbers.put("name 5", 12);
		
		System.out.println(phoneNumbers);

	}

}
