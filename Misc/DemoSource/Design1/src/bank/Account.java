package bank;

public class Account implements IBank {
	private int balance;
	
	public boolean deposit(int amount) {
		this.balance = this.balance + amount;
		return true;
	}
	public boolean withdraw(int amount) {
		this.balance = this.balance - amount;
		return true;
	}
	public int getBalance() {
		return this.balance;
	}
	
}


interface IBank {
	public boolean deposit(int amount);
	public boolean withdraw(int amount);
	public int getBalance();
	
}