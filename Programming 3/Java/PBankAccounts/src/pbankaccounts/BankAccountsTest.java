package pbankaccounts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountsTest {

	@Test
	void testGetBalance() {
		BankAccounts acc = new BankAccounts();
		double expected = 0;
		double actual = acc.getBalance();
		assertEquals(expected, actual);
	}

	@Test
	void testDeposit() {
//		fail("Not yet implemented");
		BankAccounts acc = new BankAccounts();
		acc.deposit(50);
		double expected = 50;
		double actual = acc.getBalance();
		assertEquals(expected, actual);
	}

	@Test
	void testWithdraw() {
//		fail("Not yet implemented");
		BankAccounts acc = new BankAccounts();
		acc.withdraw(50);
		double expected = -55;
		double actual = acc.getBalance();
		assertEquals(expected, actual);
	}
	
	@Test
	void testWithdrawWithPenalty() {
//		fail("Not yet implemented");
		BankAccounts acc = new BankAccounts();
		acc.deposit(100);
		acc.withdraw(150);
		double expected = -55;
		double actual = acc.getBalance();
		assertEquals(expected, actual);
	}
	
	@Test
	void testAddInterest() {
//		fail("Not yet implemented");
		BankAccounts acc = new BankAccounts();
		acc.deposit(1000);
		acc.addInterest();
		double expected = 1033.50;
		double actual = acc.getBalance();
		assertEquals(expected, actual);
	}

}
