package amazon;

public class Book extends Item {
	String title, author;
	
	public Book (String title, String author, int price) {
		super(price);
		this.title = title;
		this.author = author;
	}

	@Override
	public String getDescription() {
		return "Book [title: " + title + ", author: " + author + "]";
	}

	@Override
	public int getPrice() {
		return this.price / 2;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}
