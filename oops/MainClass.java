package oops;

class Cat{
	boolean hasFur;
	String color,breed;
	int legs,eyes;
	
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description(){
		System.out.println("My cat has "+legs+" legs and "+eyes+" eyes");
	}
}
class Dog{
	String breed,name;
	public void jump() {
		System.out.println("my dog "+name+" jumped");
	}
	public void description() {
		System.out.println("my dog name is "+name+" and breed is "+breed);
	}
}
public class MainClass {

	public static void main(String[] args) {
		Cat cat1=new Cat();
		cat1.walk();
		
		cat1.legs=2;
		cat1.eyes=2;
		cat1.description();
		
		Cat cat2=new Cat();
		cat2.legs=4;
		cat2.eyes=4;
		cat2.description();		
		
		cat2.eat();
		
		Dog husky=new Dog();
		Dog poodle=new Dog();
		husky.breed="Husky";
		husky.name="Tomy";
		
		poodle.breed="poodle";
		poodle.name="Simba";
		
		husky.jump();
		husky.description();
		
		poodle.jump();
		poodle.description();
	}

}
