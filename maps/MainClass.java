package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {

		Map<String, Integer> numbers=new HashMap<>(); //Map(Key, Value)=Map<String, Integer>...hai okk
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("five", 5);
		
		numbers.put("one", 10); //Unique key se Update hua, Duplicate nahi create hua...Okk
		numbers.putIfAbsent("one", 20); //Ab Update nahi hoga, Because wo pehke se hi hai
		System.out.println(numbers.get("one")); //To get its Corresponding values		
		System.out.println(numbers.containsKey("one")); //Presnt hai->True
		System.out.println(numbers.containsKey("six")); //Absent hai->False		
		System.out.println(numbers.containsValue(2));
		//		numbers.remove("five");
		//		System.out.println(numbers);
		System.out.println(numbers.keySet()); //Set mein daalke only Keys
		System.out.println(numbers.values()); //Set mein daalke only Values
		System.out.println("Entry set "+numbers.entrySet());
		
		System.out.println("Before entry set : "+numbers);
		Set<Entry<String, Integer>> entries=numbers.entrySet(); //Sab entry set milti hai
		for(Entry<String, Integer> entry: entries) {
			entry.setValue(entry.getValue()*100); //har entry mein value Update Kar rha hoon
		}
		System.out.println("After entry set Modify : "+numbers);
		
		System.out.println("GET HASH : "+getHash("GOD"));
	}
		
		public static int getHash(String s) { //Apne logic se Hash Function banaya
		int hash=0;
		for(int i=0;i<s.length();i++) {
			hash+=s.charAt(i);
		}
		return hash;
	}
}
