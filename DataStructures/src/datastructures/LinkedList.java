package datastructures;

public class LinkedList<E> {

	private int size = 0;

	Node<E> first;
	Node<E> last;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> x = new LinkedList<Integer>();

		System.out.println(x.isEmpty());

		x.add(5);

		x.add(10);

		x.add(15);

		x.add(22);

		x.add(34);

		x.add(90);

		System.out.println("Current : " + x + " size " + x.size);

		x.remove(2);
		System.out.println("After Removing 3rd Element : " + x + " size " + x.size);

	}

	void remove(int index) {
		Node<E> tempBefore = this.first;

		for (int i = 0; i < index - 1; i++)
			tempBefore = tempBefore.next;

		Node<E> tempAfter = tempBefore.next.next;

		tempBefore.next = tempAfter;
		tempAfter.prev = tempBefore;

		this.size--;

	}

	public String toString() {

		String out = "";
		Node<E> temp = first;

		while (temp != null) {
			out = out + " " + temp.value;
			temp = temp.next;
		}

		return "{ " + out + " }";
	}

	E get(int index) {

		Node temp = this.first;

		for (int i = 0; i < index; i++)
			temp = temp.next;

		return (E) temp.value;
	}

	void add(E value) {
		if (isEmpty()) {
			this.first = new Node(null, value, null);
			this.last = this.first;
		} else {
			this.last.next = new Node(this.last, value, null);
			this.last = this.last.next;
		}
		size++;

	}

	boolean isEmpty() {

		if (this.size == 0)
			return true;

		return false;

	}

	class Node<E> {

		Node<E> prev;
		Node<E> next;
		E value;

		Node(Node<E> previous, E value, Node<E> nextElement) {
			this.prev = previous;
			this.value = value;
			this.next = nextElement;

		}

	}

}
