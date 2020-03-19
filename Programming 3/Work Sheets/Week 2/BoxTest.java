package pbox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoxTest {

	@Test
	void testGetHeight() {
		Box box = new Box(2,10,6);
		assertEquals(2, box.getHeight());
	}

	@Test
	void testGetLength() {
		Box box = new Box(2,5);
		assertEquals(2, box.getLength());
	}

	@Test
	void testGetWidth() {
		Box box = new Box(2);
		assertEquals(2, box.getWidth());
	}

	@Test
	void testSetHeight() {
		Box box = new Box(0);
		box.setHeight(8);
		assertEquals(8, box.getHeight());
	}
	
	@Test
	void testSetWidth() {
		Box box = new Box(0);
		box.setWidth(10);
		assertEquals(10, box.getWidth());
	}
	
	@Test
	void testSetLength() {
		Box box = new Box(0);
		box.setLength(5);
		assertEquals(5, box.getLength());
	}

	@Test
	void testCalcVolume() {
		Box box = new Box(2);
		assertEquals(8, box.calcVolume());
	}

	@Test
	void testCalcSurfaceArea() {
		Box box = new Box(2);
		assertEquals(24, box.calcSurfaceArea());
	}

	@Test
	void testToString() {
		Box box = new Box(2);
		assertEquals("The height is: 2.0 width is: 2.0 length is: 2.0", box.toString());
	}

}
