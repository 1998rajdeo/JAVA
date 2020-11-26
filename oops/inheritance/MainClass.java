package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {

		Teacher t=new Teacher("Mr Raj");
		t.eat(); //Person class se aa raha hai->Parent class
		t.walk();//Person class se aa raha hai->Parent class
		t.teach(); //Teacher se hi aa raha hai ->Child class
		
		Singer s=new Singer("HOney");
		s.name="Sonu";
		s.sing();
		s.eat();//Override waala lega->child class ka
		
		//UPcasting and Downcasting->Object ke saath hota hai
		Teacher teacher=new Teacher("Mr raj");
		Person p=t; //Implicit or Upcasting
		Person p1=new Person("Mr raj");
		//Teacher teacher1=(Teacher)p1; //Explicit or Downcasting->Person ko teacher bnaya diya,Wo singer bhi ho sakta hai
									//->Runtime error dega, compile mein nahi dega
		boolean yo=teacher instanceof Teacher; //To check object hai kya uss class ka
		System.out.println(teacher instanceof Teacher);
	}

}
