package newfeatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
 * forEach() Method In Iterable Interface
Java 8 has introduced a “forEach” method in the interface java.lang.Iterable that can iterate over the elements in the collection.
 “forEach” is a default method defined in the Iterable interface. It is used by the Collection classes that extend the Iterable 
 interface to iterate elements.

The “forEach” method takes the Functional Interface as a single parameter i.e. you can pass Lambda Expression as an argument.
 */

public class ForEachDemo {

		public static void main(String[] args) {
			
			List<String> languages = new ArrayList<String>();
			
		languages.add("Java");
		languages.add("Python");
		languages.add("C");
		languages.add("C#");
		languages.add("Scala");
		languages.add("Ruby");
		
		System.out.println("******** Programing languages");
			languages.forEach(i -> System.out.println(i));
			
			//using method reference
			
			System.out.println("******** Programing languages *****using method reference");	
			languages.forEach(System.out::println);

			
/*			Map<Integer,String> customer = new HashMap<Integer,String>();
			// add elements
			customer.put(1, "A");
			customer.put(2, "b");
			customer.put(3, "c");
			customer.put(4, "d");
			customer.put(5, "e");
			
			System.out.println("******** Map Results*********");
			customer.forEach((k,v) -> System.out.println("key..." + k  + "  Values..." + v));
*/			
			
/*			ArrayList<Integer> arrL = new ArrayList<Integer>();
			arrL.add(14);
			arrL.add(20);
			arrL.add(31);
			arrL.add(49);
			
			//use lambda expressions to print elements of arraylist
			System.out.println("********ArrL******");
			arrL.forEach(i -> System.out.println(i));
			
			// to print even numbers in ArrL using lambda exp
			System.out.println("*******Even Nos*******");
			arrL.forEach(n -> {if(n%2==0) System.out.println(n);});
*/			
		}
}
