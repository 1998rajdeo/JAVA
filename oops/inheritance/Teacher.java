package oops.inheritance;

public class Teacher extends Person{
	public Teacher(String name) {
		super(name);
		System.out.println("inside teacher constructor");
	}
	public void teach() {
		System.out.println(name+" is teaching");
	}
	public void eat() {
		super.eat(); //Parent mein eat pehla call hoga then neeche waala...okk
		System.out.println(name+" is eating->Child class");
	}
}
