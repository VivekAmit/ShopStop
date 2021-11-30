package newfeatures;

// WAP to demonstrate method referance of an instance method of a class
class calc
{
	void add(int a, int b) {
		System.out.println("The result is : " +( a+b));
	}
}
@FunctionalInterface
interface IDemo
{
	void sum(int x ,int y );
}

public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		
		calc c1 = new calc();
		
		// using lambda exp
		
		IDemo d1 = (a,b)->System.out.println("the result is :" +(a+b));
		d1.sum(10, 20);
		
		// using method reference
		
		IDemo d2 = c1::add;
		d2.sum(20, 10);

	}

}
