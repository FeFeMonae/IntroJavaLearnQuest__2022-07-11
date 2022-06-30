package stringer;

public class Runner {

	public static void main(String[] args) {
	 StringBuilder b = new StringBuilder();
	 for (int i = 0; i < 3; i++) {
		 b.append(" " + i);
	 }
	System.out.println(b.toString()); 
	}

}

