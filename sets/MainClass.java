package sets;

import java.util.*;
public class MainClass {

	public static void main(String[] args) {

		Set<String> fruits=new HashSet<>(); //HashSet->stores and return Unordered like, bag mein boll daalte hai		
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println(fruits.add("Kiwi")); //add()->Boolean return karta hai, If element is present then true else false.
		System.out.println(fruits.add("Banana"));//Ye false dikhega o/p.Because, Duplicate nahi leta hai, Ye output mein nahi dikhega,Ye allow nahi karta
		System.out.println(fruits); //Unordered o/p aayega
		
		Set<String> vegetables=new LinkedHashSet<>();//LinkedHashSet->Store and return in Order,But Timeconstant nahi hota
		vegetables.add("Tomato");
		vegetables.add("Gobi");
		vegetables.add("Kohra");
		System.out.println(vegetables); //Order mein o/p aayega...But Constant time property maintain nahi karegii
										
		Set<String> animals=new LinkedHashSet<>();//Sorting+Time constant=TreeSet
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Lion");
		System.out.println(animals);//Sorted with Time constant
		
		
		
	}

}
