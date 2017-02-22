package test.datastructures;

import java.util.HashMap;
import java.util.Scanner;

public class Stack<E> {

	int top = -1;
	E[] stack;
	HashMap<Character, Integer> precedenceTable;

	@SuppressWarnings("unchecked")
	Stack(int size) {
		this.stack = (E[]) new Object[size];
	}

	public void loadPrecedence() {
		precedenceTable = new HashMap<Character, Integer>();
		precedenceTable.put('(', 1);
		precedenceTable.put(')', 1);
		precedenceTable.put('+', 2);
		precedenceTable.put('-', 2);
		precedenceTable.put('*', 3);
		precedenceTable.put('/', 3);

	}

	public static void infixToPostfix(String[] args) {
		Stack<Character> infixToPostfix = new Stack<Character>(100);
		// String input="(A-B)+(D*E-F)";

		System.out.println("Enter an expression with variables A-Z and operators ()+-*/");
		Scanner s = new Scanner(System.in);
		String input = s.next();
		StringBuilder output = new StringBuilder();
		infixToPostfix.loadPrecedence();
		Character current = ' ';

		for (int i = 0; i < input.length(); i++) {

			current = input.charAt(i);

			if (current < 65 + 26 && current >= 65) {
				output.append(current);
			} else if (current == ')') {
				while (!infixToPostfix.isEmpty() && infixToPostfix.peek() != ')') {
					output.append(infixToPostfix.peek());
					infixToPostfix.pop();
				}
				infixToPostfix.pop();
			} else {
				// System.out.println(infixToPostfix.peek()+" "+current);

				// System.out.println(infixToPostfix.precedenceTable.get(infixToPostfix.peek())
				// +" "+infixToPostfix.precedenceTable.get(current) );

				if (current != '(') {
					while (!infixToPostfix.isEmpty() && infixToPostfix.precedenceTable
							.get(infixToPostfix.peek()) >= infixToPostfix.precedenceTable.get(current)) {
						output.append(infixToPostfix.peek());
						infixToPostfix.pop();
					}

					infixToPostfix.push(current);
				}
			}
		}

		while (!infixToPostfix.isEmpty()) {
			output.append(infixToPostfix.peek());
			infixToPostfix.pop();
		}

		System.out.println(output);
	}

	public static void balancedBracket(String[] args) {
		Stack<Character> balancedBracket = new Stack<Character>(100000);
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			balancedBracket = new Stack<Character>(100000);
			balancedBracket.bracketOperations(s);

		}

	}

	public void bracketOperations(String s) {

		int length = s.length();
		Character c;
		Character ithChar = s.charAt(length - 1);
		if (ithChar == '{' || ithChar == '[' || ithChar == '(') {
			System.out.println("NO");
			return;
		}

		for (int i = 0; i < length; i++) {

			ithChar = s.charAt(i);

			if (ithChar == '{' || ithChar == '[' || ithChar == '(') {
				c = s.charAt(i);
				this.push((E) c);
			} else if (isEmpty()) {
				System.out.println("NO");
				return;
			} else if (ithChar == '}' || ithChar == ']' || ithChar == ')') {
				c = (Character) this.peek();

				if (ithChar == '}' && c != '{') {
					System.out.println("NO");
					return;
				} else if (ithChar == ']' && c != '[') {
					System.out.println("NO");
					return;
				} else if (ithChar == ')' && c != '(') {
					System.out.println("NO");
					return;
				}

				this.pop();

			}

		}
		System.out.println("YES");

	}

	public boolean isEmpty() {
		if (this.top < 0)
			return true;
		return false;
	}

	public static void maximumElement() {

		Stack stac = new Stack(100000);
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int oper = 0;
		for (int i = 0; i < n; i++) {
			oper = s.nextInt();

			if (oper == 1) {
				stac.push((Integer) s.nextInt());
			} else if (oper == 2) {
				stac.pop();
			} else if (oper == 3) {
				stac.printMax();
			}

		}

	}

	void push(E value) {
		this.stack[++top] = value;
	}

	E peek() {
		if (top < 0)
			return null;
		else
			return this.stack[top];
	}

	void pop() {
		if (top < 0)
			return;
		this.stack[top] = null;
		top--;
	}

	void printMax() {
		// System.out.println(this.stack);
		if (this.stack[0] instanceof Integer) {
			Integer max = 0;
			for (int i = 0; i <= top; i++) {
				if (max < (Integer) stack[i])
					max = (Integer) stack[i];
			}

			System.out.println(max);
		}
	}

}
