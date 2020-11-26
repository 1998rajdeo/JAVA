package comparablesAndComparators;

//public class Student implements Comparable<Student>{
public class Student{ 	//Without implement mera waala
	int marks;
	String name;
	
	public Student(int marks, String name) {
		super();
		this.marks=marks;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [marks="+marks+", name="+name+"]";
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	//@Override //-<Bass comparator ke liye hataya hoon bhai, Comparable mein Uncomment kar dena
	public int compareTo(Student obj) {
		//For Decreasing order mein sort
//		if(this.marks>obj.marks) return -1;	
//		else if(this.marks<obj.marks) return 1;
//		return 0;
		//For Increasing order mein sort
		//		if(this.marks>obj.marks) return 1;	
		//		else if(this.marks<obj.marks) return -1;
		//		//return 0;
		//		return this.name.compareTo(obj.name); //Natural ordering
		
		return this.marks=obj.marks; //Mera banaya hua Comparators se
	}
}