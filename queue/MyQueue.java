package queue;
import lists.linkedList.MyLinkedList.Node;
public class MyQueue<E> {

	private Node<E> head, rear;
	public void enqueue(E e) {
		Node<E> toAdd=new Node<>(e);
		if(head==null) {	//To check kya Queue pehle se Empty hai
			head=rear=toAdd;
			return;
		}
		rear.next=toAdd;
		rear=rear.next;
	}
	public E dequeue() {
		if(head==null) { //To check pehle se Queue empty hai kya
			return null;
		}
		Node<E> temp=head;
		head=head.next;
		if(head == null) { //Head and Rear both should be Null
			rear =null;
		}
		return temp.data;
	}
	
}
