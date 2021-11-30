package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order ord1 = new Order(1000,"GOOG.NS",12000.10,Order.Side.BUY);
		Order ord2 = new Order(500,"MS.TS",5000.50,Order.Side.SELL);
		Order ord3 = new Order(5000,"MS.TS",5000.50,Order.Side.SELL);
		
		List<Order> orderBook = new ArrayList<Order>();
		orderBook.add(ord1);
		orderBook.add(ord2);
		orderBook.add(ord3);
		// Sort all orders using lambda
		
		System.out.println("Before sorting  : "+ orderBook); // invokes toString()
		// ^ unsorted
		
		
		Collections.sort(orderBook,(a,b)-> Order.compareByQuantity(a,b));
		System.out.println("After sorting  " + orderBook);
		
		// using method reference  for line 26
		
		Collections.sort(orderBook,Order::compareByQuantity);
		
		
		Order order = orderBook.get(0); // we require reference of object
		Collections.sort(orderBook,order::compareByPrice);
		System.out.println("After sorting per price " + orderBook);
		
		String[] symbols = {"GOOGLE","APPLE","META","Microsoft","samsung","amazon"};
		Arrays.sort(symbols, String::compareToIgnoreCase);
		
		System.out.println("*********************************************");
		for(String i:symbols)
		System.out.println(i);
	}

}
