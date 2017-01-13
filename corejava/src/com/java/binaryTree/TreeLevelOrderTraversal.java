package com.java.binaryTree;

class LevelOrderNode
{
    int data;
    LevelOrderNode left, right;
    public LevelOrderNode(int item)
    {
        data = item;
        left = right = null;
    }
}
 

public class TreeLevelOrderTraversal {

	LevelOrderNode root;
	  
	    public TreeLevelOrderTraversal()
	    {
	        root = null;
	    }
	 
	    /* function to print level order traversal of tree*/
	    void printLevelOrder()
	    {
	        int h = height(root);
	        int i;
	        for (i=1; i<=h; i++){
	        	  printGivenLevel(root, i);
	  	         System.out.println("");
	        }
	          
	    }
	 
	    /* Compute the "height" of a tree -- the number of
	    nodes along the longest path from the root node
	    down to the farthest leaf node.*/
	    int height(LevelOrderNode root)
	    {
	        if (root == null)
	           return 0;
	        else
	        {
	            /* compute  height of each subtree */
	            int lheight = height(root.left);
	            int rheight = height(root.right);
	             
	            /* use the larger one */
	            if (lheight > rheight)
	                return(lheight+1);
	            else return(rheight+1); 
	        }
	    }
	 
	    /* Print nodes at the given level */
	    void printGivenLevel (LevelOrderNode root ,int level)
	    {
	        if (root == null)
	            return;
	        if (level == 1)
	            System.out.print(root.data + " ");
	        else if (level > 1)
	        {
	            printGivenLevel(root.left, level-1);
	            printGivenLevel(root.right, level-1);
	        }
	        
	    }
	     
	    /* Driver program to test above functions */
	    public static void main(String args[])
	    {
	    	TreeLevelOrderTraversal tree = new TreeLevelOrderTraversal();
	       tree.root= new LevelOrderNode(1);
	       tree.root.left= new LevelOrderNode(2);
	       tree.root.right= new LevelOrderNode(3);
	       tree.root.left.left= new LevelOrderNode(4);
	       tree.root.left.right= new LevelOrderNode(5);
	       tree.root.right.right= new LevelOrderNode(6);
	        
	       System.out.println("Level order traversal of binary tree is ");
	       tree.printLevelOrder();
	    }
}
