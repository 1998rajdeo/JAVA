package lists.linkedList;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		//Mera LinkedList se karta hoon,Generic hai...okk->MyLinkedList.java
		
		MyLinkedList<Integer> myLL=new MyLinkedList();
		for(int i=0;i<10;i++) {
			myLL.add(i);
		}
		myLL.print();
		System.out.println();
		
		//Inbuilt ki madat se
		List<Integer> ll=new LinkedList<>();
		List<Integer> al=new ArrayList<>();	
		
		//Lets check which List take long time->LinkedList best hai,Less time leta hai
		getTimeDiff(ll);
		getTimeDiff(al);
	}
	static void getTimeDiff(List<Integer> list) {
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			//list.add(i);
			list.add(0,i); //Insertion in initial->Mein LinkedList baazi maar jayegii
						//Ab ArrayList ko sab side karna padega, But LinkedList ko aisa kuch nahi
						//Matlab ab ArrayList bohut jaada slow..Hahahahaha
		}
		long end=System.currentTimeMillis();
		System.out.println(list.getClass().getName()+" = "+(end-start));
	}
}
