package test.datastructures;

import java.util.LinkedList;
import java.util.Scanner;

public class Trie {

	TrieNode root;

	Trie() {
		this.root = new TrieNode(' ');
	}

	public void insert(String word) {
		TrieNode current = root;

		for (char c : word.toCharArray()) {
			TrieNode child = current.subNode(c);
			if (child != null)
				current = child;
			else {
				current.childList.add(new TrieNode(c));
				current = current.subNode(c);
			}

		}
		current.isEnd = true;
	}

	public boolean search(String word) {
		TrieNode current = this.root;
		for (char c : word.toCharArray()) {
			if (current.subNode(c) == null)
				return false;
			else
				current = current.subNode(c);
		}
		return current.isEnd;
	}

	public static void main(String[] args) {
		Trie t = new Trie();
		Scanner s = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			System.out.println("1. Insert\n2. Search");
			switch (s.nextInt()) {
			case 1:
				t.insert(s.next());
				break;
			case 2:
				System.out.println(t.search(s.next()));
				break;
			default:
				exit = true;
				;
			}
		}
		s.close();
	}
}

class TrieNode {
	char data;
	LinkedList<TrieNode> childList;
	boolean isEnd;

	TrieNode(char c) {
		childList = new LinkedList<TrieNode>();
		this.data = c;
	}

	TrieNode subNode(char c) {
		if (childList != null)
			for (TrieNode eachChild : childList)
				if (eachChild.data == c)
					return eachChild;
		return null;
	}
}