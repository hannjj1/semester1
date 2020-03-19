package pbankaccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testGetBalance() {
		BankAccount acc = new BankAccount();
		//balance should be "0"
		assertEquals(0, acc.getBalance());
	}

	@Test
	void testDeposit() {
		BankAccount acc = new BankAccount();
		//deposit 100
		acc.deposit(100);
		assertEquals(100, acc.getBalance());
	}

	@Test
	void testWithdrawn() {
		BankAccount acc = new BankAccount();
		//deposit 100
		acc.deposit(100);
		//withdraw 50.
		acc.withdrawn(50);
		assertEquals(50, acc.getBalance());
	}
	
	@Test
	void testWittdrawnInNegative() {
		BankAccount acc = new BankAccount();
		//deposit 100
		acc.deposit(50);
		//withdraw 50.
		acc.withdrawn(100);
		assertEquals(-55, acc.getBalance());
	}
	
	@Test
	void testAddInterest() {
		BankAccount acc = new BankAccount();
		acc.deposit(1000);
		acc.addInterest();
		assertEquals(1033.5, acc.getBalance());
	}
}
