package psalary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {

	@Test
	void testGetGross() {
		Salary earnings = new Salary(500000);
		earnings.setGross(500000);
		assertEquals(500000, earnings.getGross());
	}

	@Test
	void testSetGross() {
		Salary earnings = new Salary(500000);
		earnings.setGross(500000);
		assertEquals(500000, earnings.getGross());
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
		Salary earnings = new Salary(500000);
		assertEquals(344080, earnings.getNet());
	}
	
	@Test
	//test for $100,000 gross
	void test100k() {
		Salary earnings = new Salary(100000);
		double expected = 23920;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for $50,000 gross
	void test50k() {
		Salary earnings = new Salary(50000);
		double expected = 8020;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for $20,000 gross
	void test20k() {
		Salary earnings = new Salary(20000);
		double expected = 2520;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for $5,000 gross
	void test5k() {
		Salary earnings = new Salary(5000);
		double expected = 525;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for $48,000 gross
	void test48k() {
		Salary earnings = new Salary(48000);
		double expected = 7420;
		double actual = earnings.getTax();
		assertEquals(expected, actual);
	}
	
	@Test
	//test for $70,000 gross
	void test70k() {
		Salary earnings = new Salary(70000);
		double expected = 14020;
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
	
	@Test
    public void dalesTestSuiteForTax()
    {
	//the instructor's test suite for tax
	Salary money = new Salary(120000.50);
	assertEquals(30520.17, money.getTax(),0.01);
	money.setGross(52112);
	assertEquals(8653.6, money.getTax(),0.01);
	money.setGross(44567);
	assertEquals(6819.23, money.getTax(),0.01);
	money.setGross(7623);
	assertEquals(800.42, money.getTax(),0.01);
	//a couple more tests
	//these would normally be in separate methods
	//test the net
	assertEquals(6822.59, money.getNet(),0.01);
	//test a negative
	money.setGross(-50);
	assertEquals(0, money.getTax(),0.01);
    }
	
	
	
}
