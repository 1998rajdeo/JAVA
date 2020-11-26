package priorityQueue;
import java.util.PriorityQueue;
public class MainClass {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Kiwi");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Banana");
		System.out.println(pq); //Store Unsorted/Random hota hai
		System.out.println(pq.remove()); //But, Sorted Remove hot hai,Based on Chronology Order in Dictionary
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		//For Integers
		PriorityQueue<Integer> pq1=new PriorityQueue<>();
		pq1.add(45);
		pq1.add(100);
		pq1.add(12);
		pq1.add(1);
		System.out.println(pq1); //Store Unsorted/Random hota hai
		System.out.println(pq1.remove()); //But, Sorted Remove hot hai,Based on Chronology Order in Dictionary
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
	}

}
