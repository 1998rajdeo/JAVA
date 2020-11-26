package deque;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.addFirst(12);
		ad.addFirst(23);
		ad.addFirst(24);
		System.out.println(ad);
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		//System.out.println(ad.peek());
		
		System.out.println("----ArrayDeque as a stack----");
		ArrayDeque<Integer> ad1=new ArrayDeque<>();
		ad1.push(12);
		ad1.push(23);
		ad1.push(24);
		System.out.println(ad1);
		System.out.println(ad1.pop());
		System.out.println(ad1.pop());
		System.out.println(ad1.pop());
	}

}
