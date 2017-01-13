package com.java.binaryTree;

class Node{
	
	int key;
	Node left, right;
	
	Node(int value){
		key = value;
		left = right = null;
	}
}
public class BinaryTreeRepersentation {
	
	Node root;
	
	BinaryTreeRepersentation() {
		root = null;
	}
	
	BinaryTreeRepersentation(int val){
		root = new Node(val);
	}
	
	public static void main(String[] args) {
		BinaryTreeRepersentation tree = new BinaryTreeRepersentation();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Tree PreOrder travarsal is: ");
		tree.printPreOrder();
		System.out.println("");
		System.out.println("Tree InOrder travarsal is: ");
		tree.printInOrder();
		System.out.println("");
		System.out.println("Tree PostOrder travarsal is: ");
		tree.printPostOrder();
	}

	private void printPostOrder() {
		printPostorder(root);
		
	}

	void printPostorder(Node node) {
		if (node == null)
			return;
		 
		// first recur on left subtree
		printPostorder(node.left);
	
		// then recur on right subtree
		printPostorder(node.right);
		 
		// now deal with the node
		System.out.print(node.key + " ");
	}
 
	private void printInOrder() {
		printInOrder(root);
	}

	private void printInOrder(Node root2) {
		// TODO Auto-generated method stub
		if (root2 == null)
			return;
		printPreOrder(root2.left);
		System.out.print(root2.key+" ");
		printPreOrder(root2.right);

	}

	private void printPreOrder() {
		printPreOrder(root);
		
	}

	private void printPreOrder(Node root2) {
		if (root2 == null)
			return;
		System.out.print(root2.key+" ");
		printPreOrder(root2.left);
		printPreOrder(root2.right);
	}
}
