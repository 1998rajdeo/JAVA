package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {

	static {
		System.out.println("in block 1");
	}
	static {
		System.out.println("in block 2");
	}
	public static void main(String[] args) {

		System.out.println("Inside main method"); //Pehle static block then Ye run hoga...YO
		A objA=new A();
		B objB=objA.new B(); //Normal Nested/Inner class
		C objC=new A.C();	 //Static Nested/Inner class(Like A class hogaya MAST hai)
	}
	static {
		System.out.println("in block 3");//Farak nahi padhta static kaha hai...Wo main se pehle hi hoga
	}
}
