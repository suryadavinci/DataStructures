package datastructures;

public class Stack {

	int length = 0;

	String name = "";

	Node top;

	Stack(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack("hello");

		System.out.println(s.isEmpty());
		s.push("1");
		s.push("2");
		System.out.println(s.peek());
		s.push("4");
		s.pop();
		s.push("3");
		System.out.println(s.isEmpty());

		for (int i = 0; !s.isEmpty(); i++) {
			System.out.println(s.peek());

			s.pop();
		}

	}

	boolean isEmpty() {
		if (this.length == 0)
			return true;

		return false;

	}

	public void push(Object x) {
		if (this.isEmpty()) {
			length++;
			top = new Node(null, x);
			return;
		}
		length++;
		top = new Node(top, x);

	}

	public void pop() {

		top = top.previous;
		length--;

	}

	public Object peek() {

		return top.value;
	}

}

class Node {

	Node previous;
	Object value;

	Node(Node prev, Object value) {
		this.previous = prev;
		this.value = value;

	}

}