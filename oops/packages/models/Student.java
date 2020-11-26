package oops.packages.models;

public class Student {
	private String name;
	private String pwd;
	public Student(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return "Password@123";
	}
}
