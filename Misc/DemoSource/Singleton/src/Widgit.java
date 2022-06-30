
public class Widgit {
	private static Widgit singleton = null;
 
// Factory method
public static Widgit widgitFactory() {
	if (Widgit.singleton == null) Widgit.singleton = new Widgit();
	return Widgit.singleton;
}
 private Widgit() {};
}
