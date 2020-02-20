package pbankaccounts;

public class BankAccounts {

	private double balance;
	
	public BankAccounts() {
		balance = 0;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double i) {
		balance += i;
	}
	
	public void withdraw(double i) {
		balance -= i;
		if (balance < 0) {
			balance -= 5;
		}
	}
	
	public void addInterest() {
		double interest = 0.05;
		double tax = 0.33;
		
		if (balance > 0) {
			interest = balance * interest;
		}
		tax = interest * tax;
		balance = balance - tax;
			
//			interest = interest * tax;
//			balance = balance * interest;
	}
}
