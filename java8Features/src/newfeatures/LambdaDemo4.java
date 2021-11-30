package newfeatures;

public class LambdaDemo4 {

	public static void main(String[] args) {
		
		// perform arthematic operations using lambda
		
		Addition op1 = (a,b)->(a+b);
		System.out.println("Addition of 2 Nos :  " + op1.calc(10, 20));
		Addition op2 = (a,b)->(a-b);
		System.out.println("Substraction of 2 Nos : " + op2.calc(10,20));
		Addition op3 = (a,b)->(a*b);
		System.out.println("multiplication of 2 Nos :  " + op3.calc(10, 20));
		Addition op4 = (a,b)->(a/b);
		System.out.println("Division of 2 Nos : " + op4.calc(50,20));
		
		
		// multiple interface can be used in a single class for example using Lambda Demo 3 
		// function here
		MyString myName = (name) -> {return "Hello" + name;};
		System.out.println(myName.myStringFunction(" Amit"));

	}

}
