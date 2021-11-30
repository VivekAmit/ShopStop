package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// creating consumer action
// using developer created function along with forEach
public class ForEachDemo1 {
	
	public static void main(String[]args) {

/*		
		List<String> names = Arrays.asList("John", "Mike","Alex");
		
	// Traversing through Consumer interface implementation
	 * 
		Consumer<String> convertUpperCase = new Consumer<String>()
				{

					@Override
					public void accept(String t) {
						// TODO Auto-generated method stub
						System.out.println(t.toUpperCase());
					}
			
				};
				names.forEach(convertUpperCase);
*/	
		// consumer to display numbers
		Consumer<Integer> display = a -> System.out.println(a);
		
		display.accept(10);
		
	}
	

}
