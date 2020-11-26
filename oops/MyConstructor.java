package oops;

//No arguments/Default constructor hai
class Vehicle{
	int wheels;
	Vehicle(){
		wheels=4;
	}
	//Parametrized constructor
	Vehicle(int a){
		wheels=a;
	}
}
public class MyConstructor {
MyConstructor(){
	System.out.println("Object is now created");
}
	public static void main(String[] args) {
		//MyConstructor obj=new MyConstructor();//Automatic call hua dekha
		Vehicle car=new Vehicle();
		Vehicle car2=new Vehicle();
		System.out.println("Audi car wheels : "+car.wheels);
		System.out.println("Lamborghini car wheels : "+car2.wheels);
		
		Vehicle scooty=new Vehicle(2);
		Vehicle rickshaw=new Vehicle(3);
		System.out.println("Scooty wheels : "+scooty.wheels);
		System.out.println("Rickshaw wheels : "+rickshaw.wheels);
	}

}
