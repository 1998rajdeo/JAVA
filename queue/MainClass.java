package queue;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		//Inbuilt Queue
			Queue<Integer> q=new LinkedList<>();		
			//q.remove();    //Ye Exception thrwo karegaa
			System.out.println(q.poll()); //Ye null print karega..Bass bakki both have same function
			
			q.add(12);
			q.add(23);
			q.add(34);
			System.out.println(q);		
			System.out.println(q.remove());
			System.out.println(q.remove());
		//Mera khudka Queue
			System.out.println("-----Mera Queue----");
		MyQueue<Integer> q1=new MyQueue<>();
		q1.enqueue(12);
		q1.enqueue(2);
		q1.enqueue(123);
		q1.enqueue(45);
		System.out.println("[12, 2, 123, 45]");
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
	}

}
