package oops.abstraction1;

public abstract class Car {
	//public void accelerate(); ->Ye dono error dengee not allowed
	//public void breaking(); ->For that use abstract keyword
	
	public abstract void accelerate();
	public abstract void breaking();
	
	//Non abstract method abstract class mein bana sakte hai
	public void honk() {
		System.out.println("Car is honking");
	}
}
