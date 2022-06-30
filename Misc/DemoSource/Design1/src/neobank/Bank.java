package neobank;

public class Bank {
	Withdraw w = null;
	Report perform(Transaction t){ 
		switch(t.type) {
			case "Withdraw":
				return this.w.withdraw(44);
				
			default:
				//error transis not suppore
		}
		return null;
	}
	
	public void  withdraw(int amt) {
		
	}
}

class Withdraw {
	void withdraw(int amt) {}
}

class Deposit {
	void depost(int amt) {}
}
