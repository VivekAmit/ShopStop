package newfeatures;

class Test{ // instance class
	void display() {// instance method
		System.out.println("I  am a instance Method");
	}
}
@FunctionalInterface
interface MyInterface {
	void myMethod();
}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		// traditional approach
		Test t1 =new Test();
		t1.display();
		
		// java 8 method reference approach
		// since it is shortened lambda expression it requires functional interface FI
		MyInterface m1ref = t1::display; // method reference to instance method of object 
		m1ref.myMethod();
	}

}
