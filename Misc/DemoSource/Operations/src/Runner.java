
public class Runner {

	public static void main(String[] args) {
		Person bob = new Person("Bob", 40);
		Person raj = new Person("Raj", 34);

		Person robby = new Person("Bob", 40);
		
		Person robert  = bob.clone();
        
		System.out.println(bob.equals(robert));
		System.out.println(bob == robert);
		// in our system Person object with the same name and age are the same person.
		// order person object by name and if the same name then by age


	}

}

class Person {
	String name = null;
	int age = 0;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public boolean equals(Person other) {
		if (this.name != other.name) return false;
		if (this.age != other.age) return false;
		return true;
	}
	public Person clone() {
		 return new Person(this.name, this.age);
	}
	
	public int compareTo(Person other) {
		int c = this.name.compareTo(other.name);
		if (c != 0) return c;
		if (this.age > other.age) return 1;
		if (this.age < other.age) return -1;
		return 0;
		
	}
	/*public String toString() {
		return "This is " + this.name + " who is " + this.age +"  years old";
	}*/
}
