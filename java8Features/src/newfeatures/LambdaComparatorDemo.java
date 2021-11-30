package newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaComparatorDemo {
	
//Java lambda expression can be used in the collection framework. 
//It provides efficient and concise way to iterate, filter and fetch data.



	public static void main(String[] args) {
		
		Student s1 = new Student(101,"James",85);
		Student s2 = new Student(102,"Rod",84);
		Student s3 = new Student(103,"Robert",83);
		Student s4 = new Student(104,"Downy",82);
		Student s5 = new Student(105,"Junior",89);
		
		// add students to arraylist
		List<Student> sList = new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		
		System.out.println("******sort Students based on names : ****** " );
		System.out.println();
		// implementing lambda exp to sort using comparator interface's comparTo() method
		Collections.sort(sList,(st1,st2) -> {
			return st1.name.compareTo(st2.name);
		});
		
		// iterating using enhance for loop
		for(Student s:sList) {
			System.out.println(s.rollNumber +" "+ s.name+" "+   s.marks);
		}
		
		// sort in decending marks
		Collections.sort(sList,(st1,st2) -> {
			return st2.marks.compareTo(st1.marks);
		});
		System.out.println();
		System.out.println("*******sort according to marks*****for enhanced****");
		System.out.println();
		for(Student s:sList) {
			System.out.println(s.rollNumber +" "+ s.name+" "+   s.marks);
		}
		// using a for each loop
		System.out.println();
		System.out.println("*******sort according to marks****for each*****");
		sList.forEach( s->System.out.println((s.rollNumber +" "+ s.name+" "+   s.marks)));
	}

}
