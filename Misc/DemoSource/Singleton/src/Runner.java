
public class Runner {

	public static void main(String[] args) {
		Widgit w = Widgit.widgitFactory();
		System.out.println(w);
		w = Widgit.widgitFactory();
		System.out.println(w);
		w = Widgit.widgitFactory();
		System.out.println(w);

	}

}
