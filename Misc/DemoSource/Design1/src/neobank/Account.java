package neobank;

public interface Account {

}

interface IBank {
	Report perform(Transaction t);
}

class Currency {
	int amount = 0;
	String type = null;
}

// Data DTO an object thats a chunk of meaningful

abstract class Transaction {
	int id;
	String type = null;
	Transaction(String s) {
		this.type = s;
	}
}

class Withdraw extends Transaction {
    Withdraw() {
    	super("Withdraw");
    }
}
class Deposit extends Transaction {}
class Query extends Transaction {}
class LoanPayment extends Transaction {}


abstract class Report {
	Transaction t;
}

class DepositReport extends Report {}