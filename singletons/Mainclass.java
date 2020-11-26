package singletons;

public class Mainclass {

	public static void main(String[] args) {

		AppConfig obj=AppConfig.getInstance();
		AppConfig obj2=AppConfig.getInstance();
		AppConfig obj3=AppConfig.getInstance();
		//Sab ek hi object hai...Ab independent Module code edit kar sakte hai
	}

}
