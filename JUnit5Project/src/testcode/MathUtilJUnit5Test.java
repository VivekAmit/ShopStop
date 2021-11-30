package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.MathUtil;

class MathUtilJUnit5Test {
	
	private static List<Integer> vals;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		vals = List.of(2,-1,-2,3,-1,0,-2);
	}

	@Test
	@DisplayName("Testing Sum of Values")
	void testSum() {
		var sum = MathUtil.sum(vals);
		assertEquals(Integer.valueOf(-1),sum);
	}
	
	@Test
	void testPositive() {
		var pValues = MathUtil.positive(vals);
		assertEquals(pValues, List.of(2,3));
	}

}
