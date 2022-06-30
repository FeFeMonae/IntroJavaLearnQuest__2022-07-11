package blue;

import java.sql.Connection;



public class CarImpl implements Car {

	private int speed; 
	public static int numOfCars = 0;
	
	public static void printNum() {
		System.out.println(CarImpl.numOfCars);
	}
	
	public CarImpl() {
		CarImpl.numOfCars++;
		System.out.println("Hi");
	
	}
	
	public CarImpl(int newSpeed) {
		this();
		if (this.isValidSpeed(newSpeed)) {
			this.speed = newSpeed;
			
		}
		

	}
	
	
	@Override
	public int getSpeed() {
		return this.speed;
	}

	@Override
	public void setSpeed(int newSpeed) {
		if (this.isValidSpeed(newSpeed)) {
			this.speed = newSpeed;
		}
        return;
	}
	
	@Override
	public void setSpeed(double newSpeed) {
		int intSpeed = (int) newSpeed;
		this.setSpeed(intSpeed);
	}
	
	private boolean isValidSpeed(int newSpeed) {
		if (newSpeed < Car.MAX_SPEED && newSpeed >= Car.MIN_SPEED) return true;
			return false;
	}

}
