package Auto;

interface Pet {
	void feed();
}

interface ServiceAnimal {
	void work();
}

abstract class Animal {
	abstract String speak();
}

class Dog extends Animal implements Pet, ServiceAnimal{
	String speak() {
		return "Bark bark";
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	
}

class Tiger extends Animal {
	String speak() {
		return "Roar";
	}
}

class Fish extends Animal implements Pet{
	String speak() {
		return "Blub blub";
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		
	}
}