package com.java.linkedList;

public class InsertIntoLinkedList {

//A complete working Java program to demonstrate all insertion methods
//on linked list

 Node head;  // head of list

 /* Linked list Node*/
 class Node
 {
     int data;
     Node next;
     Node(int d) {data = d; next = null; }
 }

public void append(int data){
	
	if(head == null){
		head = new Node(data);
		//head.next = null;
		return;
	}
	Node new_node = new Node(data);
	Node last = head;
	while(last.next != null){
		last = last.next;
	}
	last.next = new_node;
}

public void push(int data){
	Node newNode = new Node(data);
	newNode.next = head;
	head = newNode;
	
}

public void insertAfter(Node prev_Node,int data){
	if(prev_Node == null){
		System.out.println("no data ");
		return;
	}
	Node newNode = new Node(data);
	newNode.next = prev_Node.next;
	prev_Node.next = newNode;
	return;
}
 /* This function prints contents of linked list starting from
     the given node */
 public void printList()
 {
     Node tnode = head;
     while (tnode != null)
     {
         System.out.print(tnode.data+" ");
         tnode = tnode.next;
     }
 }

 /* Drier program to test above functions. Ideally this function
    should be in a separate user class.  It is kept here to keep
    code compact */
 public static void main(String[] args)
 {
     /* Start with the empty list */
	 InsertIntoLinkedList llist = new InsertIntoLinkedList();

     // Insert 6.  So linked list becomes 6->NUllist
     llist.append(6);

     // Insert 7 at the beginning. So linked list becomes
     // 7->6->NUllist
     llist.push(7);

     // Insert 1 at the beginning. So linked list becomes
     // 1->7->6->NUllist
     llist.push(1);

     // Insert 4 at the end. So linked list becomes
     // 1->7->6->4->NUllist
     llist.append(4);

     // Insert 8, after 7. So linked list becomes
     // 1->7->8->6->4->NUllist
     llist.insertAfter(llist.head.next, 8);

     System.out.println("\nCreated Linked list is: ");
     llist.printList();
 }
}
//This code is contributed by Rajat Mishra
