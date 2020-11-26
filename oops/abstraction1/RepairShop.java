package oops.abstraction1;

public class RepairShop {
//	public static void repairCar(WagonR car) {
//		System.out.println("car is repaired");
//	}
//	public static void repairCar(Audi car) {
//		System.out.println("car is repaired");
//	}
	
	//Ab abstract ki help se ek hi baar likhna..YO
	public static void repairCar(Car car) {
		System.out.println("car is repaired");
	}
	public static void main(String[] args) {
		WagonR wagonR=new WagonR();
		Audi audi=new Audi();
		
		repairCar(wagonR);
		repairCar(audi);
	}

}
