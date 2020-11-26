package oops.inheritance;

public class Person {

	protected String name; //Pass on hota hai Protected keyword se->Visible to itself and it's child
	public Person(String name) {
		this.name=name;
		System.out.println("Inside person constructor");
	}
	public void walk() {
		System.out.println("Person is walking");
	}
	public void eat() {
		System.out.println("Person is eating");
	}
}
