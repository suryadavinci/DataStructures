package datastructures;

public class Queue<E> {

	Node<E> head;
	Node<E> tail;

	int length = 0;

	public static void main(String[] args) {

		Queue q = new Queue();

		System.out.println(q.isEmpty());
		q.add("Hi");
		q.add("Hii");
		q.remove();
		q.add("Hiii");
		q.add("Hiiii");
		System.out.println(q.length);
		System.out.println(q.isEmpty());
		System.out.println(q.head.value);

		System.out.println("Here we go again!!!!!");
		while (!q.isEmpty()) {
			System.out.println(q.head.value);
			q.remove();
		}

	}

	void add(E value) {
		if (isEmpty()) {
			this.head = new Node<E>(null, value, null);
			this.tail = this.head;
		} else {
			this.tail.next = new Node<E>(this.tail, value, null);
			this.tail = this.tail.next;

		}
		this.length++;

	}

	void remove() {

		this.head = this.head.next;
		this.length--;

	}

	boolean isEmpty() {
		if (length == 0)
			return true;

		return false;
	}

	class Node<E> {

		Node<E> prev;
		Node<E> next;
		E value;

		Node(Node<E> prev, E value, Node<E> next) {
			this.prev = prev;
			this.next = next;
			this.value = value;

		}

	}
}
