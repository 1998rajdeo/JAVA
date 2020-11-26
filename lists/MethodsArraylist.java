package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MethodsArraylist {

	public static void main(String[] args) {

		//Best way to declare and use List...Yo
		List<String> fruits=new LinkedList();
		List<String> vegetables=new ArrayList();
		
		fruits.add("Apple");
		fruits.add("Mango");	
		fruits.add("Hii");
		
		//toArray()->Array mein list ka value daala hai
		String temp[]=new String[fruits.size()];
		fruits.toArray(temp);
		System.out.println("Array hai : ");
		for(String e:temp) {
			System.out.print(e+", ");
		}
		
		System.out.println("Size of fruits= "+fruits.size());
		System.out.println(fruits.contains("Gauava"));
		System.out.println(fruits.contains("Apple"));
		
		System.out.println("Khali hai kya="+fruits.isEmpty());
		
		System.out.println("Index 1st pe hai= "+fruits.get(1)); //get() -> For get value stored at that indexNo
		
		fruits.set(1, "Papaya"); //set()->To update
		System.out.println("Index 1st Update hua hai= "+fruits.get(1));
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		
		fruits.addAll(vegetables); //Mixed two diff collection with addAll() function
		System.out.println("Dekha Mix hua hai= "+fruits);
		
		fruits.remove(2); //To delete
		System.out.println("Dekha Mix mein se index 3/Hii remove hua hai= "+fruits);
		
		List<String> toRemove=new ArrayList();
		toRemove.add("Apple");
		toRemove.add("Hi");
		
		fruits.removeAll(toRemove);	//Bade fruits ka subset banaya then remove kiya,Superset-subset...Okk
		System.out.println("toRemove= "+toRemove+" Fruits= "+fruits);
		
		fruits.clear();//Delete all
		System.out.println("Sab Fuits delete hua= "+fruits);
		System.out.println("Khali hai kya="+fruits.isEmpty());
		
		
	}

}
