package com.java.linkedList;

class MiddleElement{
	
	int data;
	MiddleElement next;
	
	MiddleElement(int i){
		data =i;
		next = null;
	}
	
}

public class MiddleElementInLinkedList {

	MiddleElement head;
	
	public static void main(String[] args) {
		MiddleElementInLinkedList llist = new MiddleElementInLinkedList();
		
		for (int i = 6; i > 0; i--) {
			llist.push(i);
		}
		
		int middleElement = llist.getMiddleElement(llist);
		System.out.println(middleElement);
	}

	private int getMiddleElement(MiddleElementInLinkedList llist) {
		int linkedListSize = llist.findllistSize(llist);
		int middleIndex  = 0;
		if(linkedListSize % 2 == 0){
			middleIndex = (linkedListSize/2) + 1;
		} else{
			middleIndex = (linkedListSize/2) + 1;
		}
		int value = getElementAtIndex(middleIndex,llist);
		return value;
	}

	private int getElementAtIndex(int middleIndex, MiddleElementInLinkedList llist) {
		MiddleElement node = head;
		int count = 0;
		while(node != null){
			count++;
			if(count == middleIndex){
				return node.data;
			}
			node = node.next;
		}
		return 0;
	}

	private int findllistSize(MiddleElementInLinkedList llist) {
		MiddleElement node = head;
		int count = 0;
		while(node != null){
			count++;
			node = node.next;
		}
		return count;
	}

	private void push(int i) {
		
		MiddleElement node = new MiddleElement(i);
		node.next = head;
		head = node;
	}
}
