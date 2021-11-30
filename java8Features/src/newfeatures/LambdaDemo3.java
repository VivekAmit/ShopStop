package newfeatures;

public class LambdaDemo3 {

	public static void main(String[] args) {
		
		MyString revStr = (str) -> {
			String result = "";
			for(int i =str.length()-1;i>=0;i--) {
				result+=str.charAt(i);
			}
			return result;
		};
			
		System.out.println(revStr.myStringFunction("Lambda Expression"));
		
		// () is optional if single value ..... as in (name)^
		
		MyString myName = (name) -> {return "Hello" + name;};
		System.out.println(myName.myStringFunction(" Amit"));
	}

}
