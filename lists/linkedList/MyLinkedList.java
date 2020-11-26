package lists.linkedList;

//Khudka linkedList banate hai
public class MyLinkedList<E> {
	
	Node<E> head;
	public void add(E data){
		Node<E> toAdd=new Node<E>(data);
	
		if(isEmpty()) {
			head=toAdd;
			return;
		}
		Node<E> temp=head; //for traversal
		while(temp.next!=null) { //Last ke baad null hota hai...and mujhe last mein jaana hai
			temp=temp.next;
		}		
		temp.next=toAdd;
	}
	void print() {
		Node<E> temp=head; 
		while(temp!=null) { 
			System.out.print(temp.data+" ");
			temp=temp.next;
		}		
	}

	public boolean isEmpty() { //List empty hai ya nahi
		return head==null;
	}
	public E removeLast() throws Exception{ //Ye MyStack.java file ke liye
		Node<E> temp=head; 
		
		if(temp==null) {
			throw new Exception("Cannot remove last element from Empty LinkedList");
		}
		
		if(temp.next == null) {
			Node<E> toRemove=head;
			head=null;
			return toRemove.data;
		}
		while(temp.next.next!=null) { //Second last element
			temp=temp.next;
		}
		Node<E> toRemove=temp.next; //Last element khatam karna hai
		temp.next=null;
		return toRemove.data;
	}
	
	public E getLast() throws Exception{
		Node<E> temp=head; 
		
		if(temp==null) {
			throw new Exception("Cannot peek last element from Empty LinkedList");
		}
		while(temp.next!=null) { //Second last element
			temp=temp.next;
		}
		return temp.data;
	}
	static public class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data=data;
			next=null;
		}
	}
	//Bakki aur practise karna neeche waale link se
	//https://www.hackerrank.com/domains/data-structures?filters%5Bsubdomains%5D%5B%5D=linked-lists
}
