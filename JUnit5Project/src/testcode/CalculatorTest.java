package testcode;
import businesscode.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	
	// create a  object of class to be tested
	private Calculator calc;

	
	/*@Before annotation in JUnit is used on a method containing Java 
	 * code to run before each test case. i.e it 
	 * runs before each test execution.
	 * 
	 */
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	/*@After annotation is used on a method containing java code to run 
	 * after each test case. These methods will run even if
	 *  any exceptions are thrown in the test case or in the case of 
	 *  assertion failures.*/	
	@After
	public void tearDown() throws Exception {
		calc =null;
	}

	@Test
	public void testAdd() {
		double result =calc.add(10.50, 10.32);
		assertEquals(20.82,result,0);
	}

	@Test
	public void testSubtract() {
		double result =calc.subtract(10.50, 10.32);
		assertEquals(0.18,result,0.000000000001);
	}

	@Test
	public void testMultiply() {
		double result =calc.multiply(10.0, 10.1);
		assertEquals(101.0,result,0);
	}

	@Test
	public void testDivide() {
		double result =calc.divide(10.0, 2);
		assertEquals(5.0,result,0);
	}
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		calc.divide(10.0, 0);
		
	}

}
