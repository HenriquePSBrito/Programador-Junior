package entities;

public class AccountData {
	
	public int account;
	public String holder;
	public double balance;
	
	public AccountData() {
	}
	
	public AccountData(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}
	
	public AccountData(int account, String holder, double balance) {
		this.account = account;
		this.holder = holder;
		this.balance = balance;
	}
	
	public String toString() {
		return "Account " + account + ", Holder: " + holder + ", Balance R$: "+ balance; 
	}
	
	
	
	
	
	

}
