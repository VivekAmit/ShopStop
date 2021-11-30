package testcode;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.Calculator;


@DisplayName("Calculator test case")

class CalculatorJUnit5Test {
	
/*	
 * In Junit 5, test classes and test methods can declare custom display
 *  names via Junit 5 @DisplayName annotation.
 */
private Calculator calc;
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calc = null;
	}

	@Test
	@DisplayName("Calculator add test")
	void testAdd() {
		double result =calc.add(10.50, 10.32);
		assertEquals(20.82,result,0);
	}

	@Test
	@DisplayName("Calculator substract test")
	void testSubtract() {
		double result =calc.subtract(10.50, 10.32);
		assertEquals(0.18,result,0.000000000001);
	}

	@Test
	//@DisplayName("Calculator Multiply test")
	void testMultiply() {
		double result =calc.multiply(10.0, 10.1);
		assertEquals(101.0,result,0);
	}

	@Test
	@DisplayName("Calculator divide test")
	void testDivide() {
		double result =calc.divide(10.0, 2);
		assertEquals(5.0,result,0);
	}

}
