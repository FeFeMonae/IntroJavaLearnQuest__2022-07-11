
public class Bank {
	Currency balance;
	Receipt deposit(Currency amount) {
		this.balance = this.balance + amount;
		return new Receipt();
	}

}

class Currency {
	int amount;
	String type; //USD EUR
}

class Receipt {}