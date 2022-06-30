
public class Runner {

	public static void main(String[] args) {
	//	Employee[] staff = { new Contractor(), new Hourly(), new Salaried(), new Executive() };
	//	for (Employee e : staff) {
	//		System.out.println(e.toString());
	//	}
		Employee e = new Contractor();
		Contractor c;
		c = e;
		c.f();
		

	}

}

class Employee {
	public String toString(){return null;};

}

class Contractor extends Employee {
	public String toString() {
		return "I am a contractor";
	}
	public void f() {
		System.out.println("Special");
	}
}

class Salaried extends Employee {
	public String toString() {
		return "I am salaried";
	}
}

class Hourly extends Employee {
	public String toString() {
		return "I am paid by the hour";
	}
}

class Executive extends Employee {
	public String toString() {
		return "I am literally like a god";
	}
}

/*
 * shadowing - ambiguous variable reference
 * 
 * class Granny { private String message; public Granny() {
 * System.out.println("    Granny const"); } public Granny(String s) {
 * this.message =s; System.out.println("    Granny const with " + s); }
 * 
 * }
 * 
 * class Parent extends Granny { public Parent() {
 * System.out.println("    Parent const"); } public Parent(String s) { super(s);
 * System.out.println("    Parent const with " + s); }
 * 
 * }
 * 
 * class Child extends Parent { public Child() {
 * System.out.println("    Child const"); } public Child(String s) { super(s);
 * System.out.println("    Child const with " + s); } }
 */
