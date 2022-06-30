package inter;

public class Runner {

	public static void main(String[] args) {
		m [] mystuff = {new a(), new b(), new c()};
		for (m thing: mystuff) {
			thing.print();
		}

	}

}

class a implements m {
	 public void print() {
		 System.out.println("A");
	 }
}
class b implements m{
	 public void print() {
		 System.out.println("B");
	 }
}
class c implements m{
	 public void print() {
		 System.out.println("C");
	 }
}
// marker or generalization
interface m {
	void print();
}
/// -----------------------------------------------------------
abstract class Bird {
	 // common bird
	 public void sing() {
		 // stuff
	 }
 }
 
 class Penguin extends Bird implements Swimmer {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDepth() {
		// TODO Auto-generated method stub
		return 0;
	}

 }
 
 class Goose extends Bird implements Swimmer, Flyer {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDepth() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
 }
 
 interface Flyer{
	 void fly();
	 int getHeight();
 }
 
 interface Fish extends Swimmer, Pet {
	 void breatheWater();
 }
 
 
 interface Swimmer {
	 void swim();
	 int getDepth();
 }
 
 interface Pet {
	 void feed();
 }
 
 
 //--------------------
 
 
 
 