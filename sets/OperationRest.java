package sets;

import java.util.*;
public class OperationRest {

	public static void main(String[] args) {

		Set<Integer> x=new HashSet<>();
		x.add(23);
		x.add(1);
		x.add(6);
		
		Set<Integer> y=new HashSet<>();
		y.add(3);
		y.add(1);
		y.add(16);
		
		Set<Integer> y1=new HashSet<>();
		y1.add(3);
		y1.add(1);
		y1.add(16);
		
		Set<Integer> z=new HashSet<>();
		z.add(1);
		
		System.out.println(x.containsAll(z)); //x subset of y, Hai ki nahi
		x.addAll(y); //a waale y mein aayenge, with avoid repeated element
		System.out.println(x);
		
		x.retainAll(y1); 
		System.out.println(x);//Intersection,Common x and y mein dega
	}

}
