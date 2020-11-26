package encapsulations;

public class Student {

	private int age;
	private String name;
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if(age>20) { //Restriction for Modification Yo
			System.out.println("Aapki age jaada hai hum aapko admission anhi dengee");
		}else {
		this.age=age;
		}
	}
	//Tu automatic Getter and Setter method le sakta hai Inbuilt option hai
	//right click->Source->Create Getter and Setter->Checkbox name,etc->finish....Yo
}
