package com.java.binaryTree;

class InsertNode{
	
	int key;
	InsertNode left, right;
	
	public InsertNode(int val){
		key = val;
		left = right = null;
	}
}
public class InsertIntoBinaryTree {

	InsertNode root;
	
	InsertIntoBinaryTree(int key){
		root = new InsertNode(key);
	}
	
	InsertIntoBinaryTree(){
		root = null;
	}
	
	public static void main(String[] args) {
		InsertIntoBinaryTree insert = new InsertIntoBinaryTree();
		insert.root = new InsertNode(1);
		insert.root.left = new InsertNode(2);
		insert.root.right = new InsertNode(3);
		insert.root.right.right = new InsertNode(4);
		
		System.out.println("print preorder");
		printPreOrder(insert.root);
		
		System.out.println("print Inorder");
		printInOrder(insert.root);
		
		System.out.println("print postOrder");
		printPostOrder(insert.root);
	}

	private static void printPostOrder(InsertNode root) {
		if(root == null){
			return;
		}
		if(root != null){
			printPostOrder(root.left);
			printPostOrder(root.right);
			System.out.println("the value is "+root.key);
			
		}
		
	}

	private static void printInOrder(InsertNode root) {
		if(root != null){
			printInOrder(root.left);
			System.out.println("the value is "+root.key);
			printInOrder(root.right);
		}
	}

	private static void printPreOrder(InsertNode rootData) {
		if(rootData != null){
			System.out.println("the value is "+rootData.key);
			printPreOrder(rootData.left);
			printPreOrder(rootData.right);
		}
		
	}
}
