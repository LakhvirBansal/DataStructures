package com.java.linkedList;

import java.util.HashMap;
import java.util.Map;

class detectLinkList{
	
	int data;
	detectLinkList next;
	
	detectLinkList(int val){
		data = val;
		next = null;
	}
}
public class DetectLoopInLinkedList {

	detectLinkList head;
	
	public static void main(String[] args) {
		DetectLoopInLinkedList llist = new DetectLoopInLinkedList();
		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(20);
		
		detectLoop(llist);
	}

	private static void detectLoop(DetectLoopInLinkedList llist) {
		Map<Integer,Integer> valueMap = new HashMap<Integer,Integer>();
		detectLinkList node = llist.head;
		boolean loop = false;
		while(node != null){
			if(valueMap.containsKey(node.data)){
				System.out.println("loop is there");
				loop = true;
				break;
			} else{
				valueMap.put(node.data, 1);
			}
			node = node.next;
		}
		if(!loop){
			System.out.println("loop is not there");
		}
	}

	private void push(int i) {
		detectLinkList new_node = new detectLinkList(i);
		new_node.next = head;
		head = new_node;
		
	}
}
