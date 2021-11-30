package newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		Integer[] marks= {45,47,94,27,53};
		Stream<Integer> strm = Stream.of(marks);
		strm.forEach(i->System.out.println(i));
	
		// Build Stream from collections
		List<Integer> grades =new ArrayList<Integer>();
		grades.add(10);
		grades.add(9);
		grades.add(7);
		grades.add(10);
		grades.add(8);
		grades.add(7);
		
		Stream<Integer> strm1=grades.stream();
		
		// strm1.forEach(i->System.out.println(i));
		
		System.out.println("********ArrayList********");
		strm1.forEach(System.out::println);
		
		List<Integer> squares = grades.stream().map(m->m*m).collect(Collectors.toList());
		
	}
}
