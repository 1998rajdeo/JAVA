package oops.packages;

import java.util.Scanner;

import oops.packages.models.*;

public class MainClass {

	public static void main(String[] args) {

		//USer defined Classes
		Student obj=new Student("Tom");
		//obj.name="RAJDEO"; //->Private hai
		obj.getPassword();
		Teacher teacher=new Teacher(); //-> Public hai
		
		//Inbuilt classes
		Scanner sc=new Scanner(System.in);
	}

}
