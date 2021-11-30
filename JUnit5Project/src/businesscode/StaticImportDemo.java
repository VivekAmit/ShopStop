package businesscode;

import static java .lang.Math.*;
import static java.lang.System.*; // now System word can be ignored elsewhere chk line 20.

//In Java, static import concept is introduced in 1.5 version. With the help 
//of static import, we can access the static members of a class directly without 
//class name or any object.

public class StaticImportDemo {

	public static void main(String[] args) {
		// ithout static import
		System.out.println(Math.sqrt(55));
		System.out.println(Math.pow(10, 2));
		System.out.println(Math.abs(55.67));
		// after ststtic import
		System.out.println(sqrt(65));
		System.out.println(pow(7,2));
		out.println(abs(71.52));
	}

}
