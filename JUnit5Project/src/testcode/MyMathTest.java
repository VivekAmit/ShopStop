package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import businesscode.MyMath;


	


public class MyMathTest {
	
	private MyMath m;

	@Before
	public void setUp() throws Exception {
		m = new MyMath();
	}

	@After
	public void tearDown() throws Exception {
		m = null;
	}

	@Test
	public void testSum1() {
		System.out.println("Test with 3 Nos");
		assertEquals(10, m.sum(new int[] {5,3,2}));
	}
	@Test
	public void testSum2() {
		System.out.println("Test with 5 Nos");
		assertEquals(10, m.sum(new int[] {3,1,1,3,2}));
	}
}
