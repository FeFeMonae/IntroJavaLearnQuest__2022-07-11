
public class Runner {

	public static void main(String[] args) {
		try {
		   Person bob = new Person(-1);
		} catch (CreationFailureException e) {
			System.out.println(e);
			System.exit(1);
		}

	}

}

class CreationFailureException extends Exception {};

class Person {
	int age;
	Person(int age) throws CreationFailureException {
		if (age >=0) {
			this.age = age;
		} else {
			throw new CreationFailureException();
		}
		
	}
}