package methods;

public class PassByValue {

	public static void main(String[] args) {		
		//to check pass by value hai ki nahi ?
//		int c=34;
//		int d=12;
//		System.out.println("Before swap : "+"C= "+c+" D= "+d);
//		swap(c,d);
//		System.out.println("After swap  : "+"C= "+c+" D= "+d);
		
		Dog c=new Dog();
		c.legs=4;
		Dog d=new Dog();
		d.legs=3;
		System.out.println("Before swap-> C : "+c.legs+" & D : "+d.legs);
		swap(c,d);
		System.out.println("After swap -> C : "+c.legs+" & D : "+d.legs);
		
		d.legwa=5;
		System.out.println("Ab leg change hua "+d.legwa);
	}
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	static void swap(Dog a,Dog b) {
		Dog temp=a;
		a=b;
		b=temp;
	}
	static void changeLegs(Dog a) {
		a.legwa=6;
	}
}
class Dog{
	int legs, legwa=2;
}
