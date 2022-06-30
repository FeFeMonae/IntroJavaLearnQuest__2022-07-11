
public class Runner {

	public static void main(String[] args) {
		int limit = 8;
		int i = -2;

		for (;;) {
			i++;

			if (i >= 8)
				break;

			System.out.println("Loop iteration = " + i);
		}

		System.out.println("Final value of i is " + i);
	}
}
