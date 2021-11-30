package newfeatures;

import java.time.LocalDate;

interface Parser{
	default void parse() {
		System.out.println("default parsing logic");
	}
	static void date() {
		System.out.println(LocalDate.now());
	}
}

class TextParser implements Parser{
	// inherit default implementation of Parser
	
	/*public void parse() {
		System.out.println("Parsing XML files but class textparser");
	}*/
}

class XMLParser implements Parser{
	// overriding default method
	public void parse() {
		System.out.println("Parsing XML files");
	}
}

public class DefaultMethodDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Parser p = new TextParser();		// upcasting 
		p.parse();
						
		p = new XMLParser(); // same instance can b used bcoz of upcasting inherits both 
		p.parse();
		
		
		System.out.println("***Date from static method***");
		// static method is invoked by class.Method   or interface.Method
		Parser.date();
		
	}

}
