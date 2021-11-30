package newfeatures;

// Java program to use method reference to a constructor

class ConstructorReference{
	ConstructorReference(String msg){
		System.out.println(msg);
	}
}
interface IMessage
{
	ConstructorReference getMesssage(String msg);
}

public class MethodReferenceDemo4 {

	public static void main(String[] args) {
		
		IMessage hello = ConstructorReference ::new;  // instance of FI pointing to constructor
		hello.getMesssage("Method reference to constructor"); //using FI method to instance
	}

}
