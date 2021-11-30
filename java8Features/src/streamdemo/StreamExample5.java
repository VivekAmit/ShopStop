package streamdemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample5 {

	public static void main(String[] args) {
		// limit function
		
		Stream<Integer> evenInfiniteStream = Stream.iterate(0, n->n+2);
		
		List<Integer> evenList = evenInfiniteStream.limit(10).collect(Collectors.toList());
		
		System.out.println("Even Nos with limit 7  ----> " + evenList);
		 // simmlar for odd initial 1 and n ->n+2
		
		Stream<Integer> oddInfiniteStream = Stream.iterate(1, n->n+2);
		
		Set<Integer> oddSet = oddInfiniteStream.limit(10).collect(Collectors.toSet());
		
		System.out.println("Odd Nos with limit 10  ----> " + oddSet);
		 
		// list will maintain sequence hile set will not also set have unique elements only
		
		
		List<String> desig = Arrays.asList("Manager","Technician","Salesman"," Developer","Manager");
		List<String> distinctDesig = desig.stream().distinct().collect(Collectors.toList());
		//  distinct ill select unique elements
		System.out.println(distinctDesig);
		
		// skip()   -  skip first n elements
		List<Integer> skp = evenList.stream().skip(5).collect(Collectors.toList());
		
		System.out.println("******_____skip elements n =5_______******");
		System.out.println(skp);
		
		// anyMatch()  
		System.out.println("\n" +" AnyMatch Results");
		boolean match = desig.stream().anyMatch(s->s.contains("Developer"));
		
		System.out.println("Match exist ?   "  +match);
		
		
		List s = evenList.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(s);
		
		
		
		
	}

}
