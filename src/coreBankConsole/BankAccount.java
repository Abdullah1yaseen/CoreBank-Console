package coreBankConsole;

public class BankAccount {
	
	private double balance;
	private String accountNumber;
	
	public BankAccount(double balance, String accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public boolean withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient balance");
			return false;
		}
		balance -=amount;
		return true;
	}
	
	public double getBalance() {
		return balance;
	}

}
