package vectorAndStacks;

import java.util.*;

public class MainClass {

	public static void main(String[] args) throws Exception{
		//Vector utna use nahi hota...Bro
		//		Vector<Integer> v=new Vector();
		//		v.add(24);
		//		v.add(12);
		//		System.out.println(v);
			//Inbuilt stack waala
		Stack<Integer> stack=new Stack();
		stack.push(12);
		stack.push(23);
		stack.push(36);
		System.out.println(stack);
		int popped=stack.pop();
		System.out.println(popped);
		
		int peeked=stack.peek();
		System.out.println(peeked); //sabse upper waala element
		
		//Meine banaya Stack
			System.out.println("Mera waala Stack...Bro");
		MyStack<Integer> stack1=new MyStack<>();
		stack1.push(12);
		stack1.push(23);
		stack1.push(36);
		int popped1=stack1.pop();
		System.out.println(popped1);
		
		int peeked1=stack1.peek();
		System.out.println(peeked1); //sabse upper waala element
	}
}
//Imp question neeche hai...Practise karna
//https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
