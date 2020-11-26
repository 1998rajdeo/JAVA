package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		//Dynamic/Runtime polymorphism
		Dog d=new Dog();
		Pet p=d;
		Animal a=d;
		
		//Variable override nahi hote,Dono neeche same aane chahiye but aisa nahi hoga,Bass Function Override hota hai
		System.out.println(d.name);
		System.out.println(p.name);
		
		d.walk();
		p.walk();
		
		//Static/Complie time ploymorphism
		greetings();
		greetings("Good Morning");
		greetings("Hello bro",5);
	}
	public static void greetings() {
		System.out.println("Hi, there");
	}
	public static void greetings(String s) {
		System.out.println(s);
	}
	public static void greetings(String s,int count) {
		for(int i=0;i<count;i++) {
		System.out.println(s);
		}
	}

}
