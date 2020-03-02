package ptempconverter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempConverterAppTest {

	@Test
	public void testGetCel2() {
		TempConverterApp con = new TempConverterApp(32);
		assertEquals(32, con.getCel(), 0.01);
	}

	@Test
	public void testGetFah2() {
		TempConverterApp con = new TempConverterApp(32);
		assertEquals((32 * 9.0 / 5) + 32, con.getFah(), 0.01);
	}

	@Test
	public void testGetKel2() {
		TempConverterApp con = new TempConverterApp(32);
		assertEquals((32 + 273.15), con.getKel(), 0.01);
	}

	@Test
	public void testSetCel2() {
		TempConverterApp con = new TempConverterApp(32);
		con.setCel(32);
		assertEquals(32, con.getCel(), 0.01);
	}

	@Test
	public void testSetFah2() {
		TempConverterApp con = new TempConverterApp(32);
		con.setFah(32);
		assertEquals(32, con.getFah(), 0.01);
	}

	@Test
	public void testSetKel2() {
		TempConverterApp con = new TempConverterApp(32);
		con.setKel(32);
		assertEquals(32, con.getKel(), 0.01);
	}

	@Test
	public void testToString2() {
		TempConverterApp con = new TempConverterApp(32);
		assertEquals("Celsius: 32.0 | Fahrenheit: 89.6 | Kelvin: 305.15", con.toString());
	}


}
