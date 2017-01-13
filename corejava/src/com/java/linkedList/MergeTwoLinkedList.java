package com.java.linkedList;

class MergeList{
	
	int data;
	MergeList next;
	
	MergeList(int value){
		data = value;
		next = null;
	}
}

public class MergeTwoLinkedList {

	MergeList head;
	public static void main(String[] args) {
		MergeTwoLinkedList llist = new MergeTwoLinkedList();
		llist.push(5);
		llist.push(3);
		llist.push(1);
		
		MergeTwoLinkedList llist2 = new MergeTwoLinkedList();
		llist2.push(6);
		llist2.push(4);
		llist2.push(2);
		
		//printList(llist, llist2);
		
		mergeList(llist, llist2);
	}
	
	private static void mergeList(MergeTwoLinkedList llist, MergeTwoLinkedList llist2) {
		MergeTwoLinkedList mergedList = new MergeTwoLinkedList();
		MergeList firstList = llist.head;
		MergeList SecondList = llist2.head;
		
		while(firstList != null && SecondList != null){
			
			if(firstList.data <= SecondList.data){
				mergedList.push(firstList.data);
				firstList = firstList.next;
			}
			else{
				mergedList.push(SecondList.data);
				SecondList = SecondList.next;
			}
		}
		
		if(firstList != null){
			mergedList.push(firstList.data);
			firstList = firstList.next;
		}
		

		if(SecondList != null){
			mergedList.push(SecondList.data);
			SecondList = SecondList.next;
		}
		if(mergedList != null){
			MergeList current = mergedList.head;
			while(current != null){
				System.out.println(current.data);
				current = current.next;
			}
		}
		
	}
	
	private void push(int i) {
		MergeList new_node = new MergeList(i);
		new_node.next = head;
		head = new_node;
	}

	/*private static void printList(MergeTwoLinkedList llist,
			MergeTwoLinkedList llist2) {
		MergeList current = llist.head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
		MergeList current2 = llist2.head;
		while(current2 != null){
			System.out.println(current2.data);
			current2 = current2.next;
		}
	}*/
}
