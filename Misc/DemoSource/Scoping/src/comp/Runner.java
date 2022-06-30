package comp;

public class Runner {

	public static void main(String[] args) {
	Store myStore = new Store();
	myStore.start();
	

	}

}

// Store has items.
// Track inventory
// Managing suppliers - each suppler can supply a number of products at different warehouses
// emplyoees

class Store {
	private Inventory stock = null;
	private HR staff = null;
	public void start() {
		this.prep();
		this.open();
		this.close();
	}
	private void open() {}
	private void close() {}
	private void prep() {}
	
	public Item findItem() {
		return this.stock.findItem();
	}
	//Constructor dependency injection
	public Store() {}
	public Store(HR hr,Inventory inv) {
		this.stock = inv;
		this.staff = hr;
		
		
	} 
}

class Inventory {
	private Item [] inv = null;
	public Item findItem() {return null;}
}

class HR {
	
}

abstract class Item {}



}
