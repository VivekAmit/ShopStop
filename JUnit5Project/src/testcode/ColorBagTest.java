package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import businesscode.ColorBag;

class ColorBagTest {
	
	private ColorBag colorBag;

	@BeforeEach
	void setUp() throws Exception {
		colorBag = new ColorBag();
		colorBag.add("red");
		colorBag.add("Orange");
		colorBag.add("yellow");
		colorBag.add("green");
		colorBag.add("blue");
		colorBag.add("indigo");
		colorBag.add("voilet");
	}

	@Test
	void testAdd() {
		var newColor = "pink";
		colorBag.add(newColor);
		assertTrue(colorBag.contains(newColor),"failure");
		
	}

	@Test
	void testRemove() {
		var color ="green";
		colorBag.remove(color);
		assertFalse(colorBag.contains(color),"failure");
	}

	@Test
	void testToList() {
		var myList = Arrays.asList("red","Orange","yellow","green","blue","Voilet","indigo");
		var colorList = colorBag.toList();
				
				Collections.sort(myList);
				Collections.sort(colorList);
				assertEquals(colorList,myList,"Failure");
		
	}

	@Test
	void testSize() {
		int bSize= colorBag.size();
		assertEquals(7,bSize,"failure");
	}

}
