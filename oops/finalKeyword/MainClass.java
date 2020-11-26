package oops.finalKeyword;

public class MainClass extends Student{

	//public void getDescription() { System.out.println("inside the class"); } //->Ovveride nahi kar sakte hai, error ayega
		String rollNo;
		//final int rollNo1; //->Ye error dikhayega, so plz initialize karo
		final int rollNo1=11; //Ab initialize ke baad sahi hua....Yo
	
	public static void main(String[] args) {
	//1. Final variable
			String name="Anuj";
			name="Kumar";
			
			final String name1="Anuj";
			//name1="Kumar"; //->Ab ye error show karega samjha,Dobara value nahi de skate hai
			
			final int rollNo2;//Iss mein error nahi aaya,Because ye local variable hai,But use karte waqt Initialize karna hi padega
			//System.out.println(rollNo2); //->Dekha error diya
			System.out.println(rollNo2=2); //->Ab chalega
	//2. Final method
			MainClass obj=new MainClass();
			obj.getDescription();
	}

}
