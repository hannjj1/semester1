package psalary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {

	@Test
	void testGetGross() {
		fail("Not yet implemented");
	}

	@Test
	void testSetGross() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTax() {
		Salary earnings = new Salary(0);
		double expected = 0;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}

	@Test
	void testGetNet() {
		fail("Not yet implemented");
	}
	
	@Test
	//test for $100,000 gross
	void test100k() {
		Salary earnings = new Salary(100000);
		double expected = 76080;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for $50,000 gross
	void test50k() {
		Salary earnings = new Salary(50000);
		double expected = 41980;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for $20,000 gross
	void test20k() {
		Salary earnings = new Salary(20000);
		double expected = 17480;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for $5,000 gross
	void test5k() {
		Salary earnings = new Salary(5000);
		double expected = 4475;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for $48,000 gross
	void test48k() {
		Salary earnings = new Salary(48000);
		double expected = 40580;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for $70,000 gross
	void test70k() {
		Salary earnings = new Salary(70000);
		double expected = 55980;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for $0 gross
	void test0() {
		Salary earnings = new Salary(0);
		double expected = 0;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for -$5000 gross
	void testMinus5k() {
		Salary earnings = new Salary(-5000);
		double expected = 0;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	
	
	
}
