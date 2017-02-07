package test.datastructures;


public class BinaryTree {

	class Node{
		
		Node left;
		Node right;
		int data;
		
		Node(int data){
			this.data=data;
		}
	}
	
	Node root;
	
	BinaryTree(int data){
		this.root=new Node(data);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree tree= new BinaryTree((int) (Math.random() * 50));

		

		
		for (int i = 0; i < 15; i++)
			tree.insert((int) (Math.random() * 500));
		
		
		

		tree.printOrder( "p1");
		tree.printOrder( "p2");
		tree.printOrder( "l");
		 

		// System.out.println(tree.root.left.data);
		// System.out.println(tree.root.right.data);

	}
	
	
	
	public void insert(int data){
		insert(this.root,new Node(data));
	}
	
	public Node insert(Node currentNode,Node newNode)
	{
	
		System.out.println("hello");

		if(currentNode==null){
			return newNode;
		}
		else if(newNode.data<currentNode.data){
			currentNode.left=insert(currentNode.left, newNode);
			}
		else if(newNode.data>=currentNode.data){
			currentNode.right=insert(currentNode.right,newNode);
			}
		return currentNode;
			
	}

	public  void findBinarySum(Node root, int sum) {
		int internalSum = 0;
		if (internalSum == sum)
			System.out.println("Sum Found");
		if (root != null) {
			// internalSum=findBinarySum(root.left, internalSum);

		}
	}

	public  void preOrder(Node root) {

		if (root != null) {

			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}

	}

	public  void postOrder(Node root) {

		if (root != null) {

			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}

	}

	public void printOrder(String order) {
		System.out.println();
		if (order.equals("i")) {
			System.out.println("=================");
			System.out.println("InOrder Traversal");
			System.out.println("=================");
			inOrder(root);
			System.out.println();
		} else if (order.equals("p1")) {
			System.out.println("==================");
			System.out.println("PreOrder Traversal");
			System.out.println("==================");
			preOrder(root);
			System.out.println();
		} else if (order.equals("p2")) {
			System.out.println("===================");
			System.out.println("PostOrder Traversal");
			System.out.println("===================");
			postOrder(root);
			System.out.println();
		} else if (order.equals("l")) {
			System.out.println("====================");
			System.out.println("LevelOrder Traversal");
			System.out.println("====================");
			levelOrder(root);
			System.out.println();
		}

	}

	public  void inOrder(Node root) {

		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}

	}

	public  void levelOrder(Node root) {

		int height = getHeight(root);
		System.out.println("height "+height);
		for (int i = 0; i <=height; i++) {
			// System.out.print(returnTabs(height-i));
			
			printGivenLevel(root, i);

			System.out.println("------");
		}

	}

	public static String returnTabs(int n) {
		StringBuilder s = new StringBuilder("");
		for (int i = 0; i < n; i++) {
			s.append("\t");
		}

		return s.toString();
	}

	public  void printGivenLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 0) {
			System.out.print(root.data + " ");
		} else if (level > 0) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);

		}

	}

	public static int getHeight(Node root) {
		if (root == null)
			return -1;
		else
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}

	public static void topView(Node root) {
		printLeftView(root.left);
		System.out.print(root.data + " ");
		printRightView(root.right);
	}

	public static void printLeftView(Node root) {
		if (root != null) {
			printLeftView(root.left);
			System.out.print(root.data + " ");
		}
	}

	public static void printRightView(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			printRightView(root.right);

		}
	}

}