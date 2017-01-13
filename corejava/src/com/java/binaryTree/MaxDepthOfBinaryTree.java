package com.java.binaryTree;

class TreeNode{
	
	int key;
	TreeNode left,right;
	
	TreeNode(int val){
		key = val;
		left = right = null;
	}
}
public class MaxDepthOfBinaryTree {
	
	TreeNode root;
	
	MaxDepthOfBinaryTree(){
		root = null;
	}
	
	public static void main(String[] args) {
		MaxDepthOfBinaryTree tree = new MaxDepthOfBinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.left.right = new TreeNode(5);
		
		int maxDepth = maxDepth(tree.root);
		System.out.println(maxDepth);
	}

	private static int maxDepth(TreeNode root) {
		if(root == null){
			return 0;
		}
		
		int leftHeight = maxDepth(root.left);
		int rightHeight = maxDepth(root.right);
		
		if(leftHeight > rightHeight){
			return leftHeight + 1;
		} else{
			return rightHeight + 1;
		}
	}
}
