package com.java.linkedList;

public class createLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int i){
			data  = i;
			next = null;
		}
	}
	public static void main(String[] args) {
		createLinkedList linkedList = new createLinkedList();
		linkedList.head = new Node(10);
		Node second = new Node(15);
		Node third = new Node(20);
		
		linkedList.head.next = second;
		second.next = third;
		
		//System.err.println(linkedList.head.data);
		linkedList.printList();
		
	}
	 public void printList()
	    {
	        Node n = head;
	        while (n != null)
	        {
	            System.out.print(n.data+" ");
	            n = n.next;
	        }
	    }
}
