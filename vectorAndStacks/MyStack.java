package vectorAndStacks;

import lists.linkedList.MyLinkedList;

public class MyStack<E>{

	private MyLinkedList<E> ll=new MyLinkedList<>(); //MylinkedList humne previous LinkedList code mein banaya hai
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from Empty is not allowed");
		}
		return ll.removeLast();
	}
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Peeking from Empty is not allowed");
		}
		return ll.getLast();
	}
}
