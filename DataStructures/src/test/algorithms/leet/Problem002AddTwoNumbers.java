package test.algorithms.leet;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Problem002AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode output = null;
		ListNode copy = null;
		int carry = 0;
		int l1data = 0;
		int l2data = 0;
		int insert = 0;
		while (l1 != null || l2 != null) {

			l1data = (l1 == null) ? 0 : l1.val;
			l2data = (l2 == null) ? 0 : l2.val;
			insert = (l1data + l2data + carry) % 10;

			if (output == null) {
				output = new ListNode(insert);
				copy = output;
			} else {
				output.next = new ListNode(insert);
				output = output.next;
			}
			carry = (l1data + l2data + carry) / 10;
			l1 = (l1 == null) ? l1 : l1.next;
			l2 = (l2 == null) ? l2 : l2.next;
		}

		if (carry > 0)
			output.next = new ListNode(carry);
		return copy;
	}

	public static void main(String[] args) {
		/*
		 * ListNode first = new ListNode(2); first.next = new ListNode(4);
		 * first.next.next = new ListNode(3); ListNode second = new ListNode(5);
		 * second.next = new ListNode(6); second.next.next = new ListNode(4);
		 */

		ListNode first = new ListNode(5);
		ListNode second = new ListNode(5);

		/*
		 * ListNode first = new ListNode(2); first.next = new ListNode(4);
		 * first.next.next = new ListNode(3); ListNode second = new ListNode(5);
		 * second.next = new ListNode(6);
		 */

		display(first);
		System.out.println();
		display(second);
		System.out.println();
		display(addTwoNumbers(first, second));
	}

	public static void display(ListNode l) {
		while (l != null) {
			System.out.println(l.val);
			l = l.next;
		}
	}

}
