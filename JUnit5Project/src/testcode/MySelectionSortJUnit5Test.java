package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MySelectionSortJUnit5Test {
	
	//Repeated tests are run with the @RepeatedTest annotation. 
	//We specify the total number of repetitions desired.
	 
	private final int N = 10; //declaring constant
	private int[] vals = new int[N];
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
		var r =new Random(System.nanoTime());
		for(int i=0;i<N;i++) {
			vals[i] = r.nextInt(100);
		}
	}

	@Test
	void testDoSort() {
		
	}

}
