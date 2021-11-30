package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// java program to filter collection of user defined objects using stream

public class StreamExample4 {

	public static void main(String[] args) {
		
		//Creating list of Books
		List<Book> list=new ArrayList<Book>();

		//Creating Books
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		Book b4=new Book(104,"Let us C++","Yashwant Kanetkar","BPB",8);
		Book b5=new Book(105,"Networking","Forouzan","Mc Graw Hill",15);
		Book b6=new Book(106,"Operating System 2.0","Galvin","Wiley",6);

		//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		
		List<Integer> list1 = list.stream()
				.filter(b -> b.quantity >7)
				.map(b-> b.quantity)
				.collect(Collectors.toList());
		System.out.println("******** Books with quantity > 7 *******");
		System.out.println(list1);
		
		System.out.println("*** Book details ith quantity > 7 ***");
		
		list.stream().filter(b ->b.quantity >7)
						.forEach(b ->System.out.println(b.id +" ** " + b.name + " ** " +
						b.author+ "||"));

		// reduce method
		
		int totalQty = list.stream().map(b ->b.quantity).reduce(0,(sum,qty)->sum + qty);
		System.out.println("Total Qty :   " +totalQty);
		
		//
		//max and min
		Book bk1 = list.stream().max((b,c)->b.quantity>c.quantity ? 1:-1).get();
		System.out.println("************* MaximumQty****************"
							+ bk1.quantity + "||"+bk1.name);
		
		// simillarly min
		
		// count
		
		long count = list.stream().count();
		System.out.println("*************->  "  +count);
		
		long count1 = list.stream().filter(b ->b.quantity<7).count();
		System.out.println("count less than 7   ----> " + count1);
		
	}

}
