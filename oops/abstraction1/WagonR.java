package oops.abstraction1;

public class WagonR extends Car{
	public void accelerate(){
		System.out.println("WagonR is accelerating");
	}

	@Override//->Ye annotation hai Hata sakte hai....Okk
	public void breaking() {
		System.out.println("WagonR is breaking");
		
	}
	
}
