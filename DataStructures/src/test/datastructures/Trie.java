package test.datastructures;

import java.util.LinkedList;

public class Trie {

	TrieNode root;
	Trie() {
		this.root = new TrieNode(' ');
	}
	public void insert(String word) {
		TrieNode current=root;
		
		for(char c:word.toCharArray()){
			TrieNode child=current.subNode(c);
			if(child!=null)
				current=child;
			else
				{
					current.childList.add(new TrieNode(c));
					current=current.subNode(c);
				}
			
		}
		current.isEnd=true;
	}
	public boolean search(String word){
		TrieNode current=this.root;
		for(char c:word.toCharArray()){
			if(current.subNode(c)==null)
				return false;
			else
				current=current.subNode(c);
		}
		return current.isEnd;
	}
	
	
	public static void main(String[] args) {
		Trie t= new Trie();
		
		t.insert("surya");
		t.insert("suraj");
		t.insert("sur");


		System.out.println(t.search("sur"));
		System.out.println(t.search("suraj"));
		System.out.println(t.search("surya"));

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