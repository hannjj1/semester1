package pbankaccount;

public class BankAccount {
	
	private double balance;
	
	public BankAccount()
	{
		this.balance = 0;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(int i)
	{
		balance = balance + i;
	}
	
	public void withdrawn(int i)
	{
		balance = balance - i;
		
		if(balance < 0)
		{
			balance -= 5;
		}
	}
	
	public void addInterest() {
		double interest = balance * 0.05;
		double tax = interest * 0.33;
		
		interest = interest - tax;
		balance = balance + interest;
	}

}
