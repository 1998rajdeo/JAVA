package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

		List<String> fruit1=new ArrayList();  //Ye tarika [best] hai,Kyuki List ke andar hi (ArrayList, Stack, LinkedList)- aati hai
												//List ka object banta hi nahi, Wo indirectly ArrayList ka Object ban raha hai
		
		//or
		List<String> fruit2=new LinkedList(); //Dekha LinkedList ki tarah kaam kar raha hai...Code ko koi farak nahi padhta
		//or
		ArrayList<String> fruits=new ArrayList(); //Generic ye <String> hi hai dataType ke General...Okk
		fruits.add("Apple");
		fruits.add("Mango");
		
		System.out.println(fruits);
		
		ArrayList<Integer> marks=new ArrayList();
		
		//Neeche dekh multipe dataType ke pair le sakte hai
		Pair<String, Integer>p1=new Pair("Rajdeo",44);//Small int nahi chalega, Big Integer->Lena wo Wrapper Class
													//Non primitive hai jo extends karta hai
		Pair<Boolean, String>p2=new Pair(true,"Hello");
		p1.getDescription();
		p2.getDescription();
	}

}
