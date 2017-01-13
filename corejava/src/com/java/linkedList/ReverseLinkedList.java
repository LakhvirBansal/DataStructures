package com.java.linkedList;

class ReverseList{
	
	int data;
	ReverseList next;
	
	ReverseList(int val){
		data = val;
		next = null;
	}
}
public class ReverseLinkedList {
	ReverseList head;
	
	public static void main(String[] args) {
		ReverseLinkedList llist = new ReverseLinkedList();
		
		for(int i = 1; i<=5; i++){
			llist.push(i);
		}
		
		printList(llist);
		reverseLinkedList(llist);
	}

	private static void reverseLinkedList(ReverseLinkedList llist) {
		ReverseList prev= null;
		ReverseList current = llist.head;
		ReverseList next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		System.out.println("");
		current = prev;
		System.out.print("reverse list : ");
		while(current != null){
			
			System.out.print(current.data+" ");
			current = current.next;
		}
	}

	private static void printList(ReverseLinkedList llist) {
		ReverseList current = llist.head;
		System.out.print("current list : ");
		while(current != null){
			System.out.print(current.data+" ");
			current = current.next;
		}
		
	}

	private void push(int i) {
		ReverseList new_node = new ReverseList(i);
		new_node.next = head;
		head = new_node;
	}
}
