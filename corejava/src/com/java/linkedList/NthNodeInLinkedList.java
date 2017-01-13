package com.java.linkedList;

class NthNode{
	int data;
	NthNode next;
	
	NthNode(int val){
		data = val;
		next = null;
	}
}
public class NthNodeInLinkedList {
	
	NthNode head;
	
	public static void main(String[] args) {
		NthNodeInLinkedList llist = new NthNodeInLinkedList();
		
		llist.push(1);
        llist.push(4);
        llist.push(1);
        llist.push(12);
        llist.push(1);
		
		int value = llist.dataAtSpecifiedIndex(3);
		System.out.println(value);
		
	}

	private int dataAtSpecifiedIndex(int index) {
		NthNode current = head;
		int count = 0 ;
		while(current != null){
			
			if(index == count){
				return current.data;
			}
			
			current = current.next;
			count++;
		}
		return -1;
	}

	private void push(int i) {
		NthNode node = new NthNode(i);
		node.next = head;
		head = node;
	}
}
