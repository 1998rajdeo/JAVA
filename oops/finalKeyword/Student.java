package oops.finalKeyword;


public class Student {
	//Final variable pe hai sab
			final int rollNo;
			final static String name;
			final String name1;	
			//Neeche waala/Initializer block= Variable ko initialize karta hai
			{
				rollNo=4;
			}
			//Satic hai same to initialize variable
			static {
				name="Rajdeo";
			}
			//Ya constructor mein initialize kar sakte hai
			public Student(){
				name1="Rajdeo";
			}
	//Final Method
		String sname="APUN bola";
		public final void getDescription() {
			System.out.println("The student name is "+name);
		}
}
