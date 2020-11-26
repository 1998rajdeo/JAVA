package strings;

public class StringsIntroduction {

	public static void main(String[] args) {
		
		String name="Rajdeo";
		String name2="Rajdeo";
		String anotherName=new String("Rajdeo"); //2nd way to use string
		System.out.println(name==anotherName); //1st literal waala hai, 2nd New object waala
		System.out.println(name.equals(name2));//Andar ke value ko check kar sakte hai
		System.out.println(name==name2); //Ab dono literal hai true okk
		
		System.out.println("Empty waala : "+name.isEmpty());
		System.out.println("Concat : "+name+" is hero");
		System.out.println(name.concat(" bro")); //2nd tarika
		
		System.out.println(name.replace('R','C'));
		
		String cars= "Hyundai, Maruti, Swift, Ferrari";
		String allCars[]=cars.split(","); //comma/, ke around split hoga
		
		for(String car:allCars) {
			System.out.print(car);
			
			//IndexOf -> char position
		//System.out.println(cars.indexOf('M'));
			System.out.println(cars.toLowerCase());
			System.out.print(cars.toUpperCase());
		//trim -> aage peeche Space trim/Delete kar dega okk
			String nameji="    RajdeoPrasad   ";
			System.out.println();
			System.out.println(nameji);
			System.out.println(nameji.trim());
	
		
		}
	}

}
