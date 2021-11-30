package newfeatures;

// Creating functional interface
// contains single abstract method (i.e Method without body) 
@FunctionalInterface     // optional annotation
interface MyFI
{
	public String sayHello();
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFI msg = () -> {return "Hello FI";};   // lambda expression
		System.out.println(msg.sayHello());

	}

}
