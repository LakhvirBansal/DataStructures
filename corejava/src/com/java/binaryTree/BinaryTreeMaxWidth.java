package com.java.binaryTree;

class BinaryTreeNode{
	
	int key;
	BinaryTreeNode left, right;
	
	BinaryTreeNode(int val){
		key = val;
		left = right = null;
	}
	
}
public class BinaryTreeMaxWidth {
	
	BinaryTreeNode root;
	
	public static void main(String[] args) {
		BinaryTreeMaxWidth tree = new BinaryTreeMaxWidth();
		tree.root = new BinaryTreeNode(1);
		tree.root.left = new BinaryTreeNode(1);
	} 
	
	
}
