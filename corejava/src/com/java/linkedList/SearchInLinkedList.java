package com.java.linkedList;



class SearchNode{
	
	int data;
	SearchNode next;
	
	SearchNode(int val){
		data = val;
		next = null;
	}
	
}

public class SearchInLinkedList {

	SearchNode head;
	
	public void push(int val){
		SearchNode new_node = new SearchNode(val);
		new_node.next = head;
		head = new_node;
	}
	
	/*public void printList()
	 {
		SearchNode tnode = head;
	     while (tnode != null)
	     {
	         System.out.print(tnode.data+" ");
	         tnode = tnode.next;
	     }
	     System.out.println("");
	 }*/
	public static void main(String[] args)
	 {
		SearchInLinkedList llist = new SearchInLinkedList();

	     llist.push(7);
	     llist.push(1);
	     llist.push(3);
	     llist.push(2);
	     llist.push(4);
	     llist.push(5);
	     llist.push(6);
	     
	     //llist.printList();
	     boolean returnValue = llist.search(7);
	     System.out.println("search number is :"+returnValue);

	 }

	private boolean search(int i) {
		SearchNode tnode = head;
		 while (tnode != null)
	     {
	        if(tnode.data == i){
	        	return true;
	        }
	         tnode = tnode.next;
	     }
	     return false;
	}
}
