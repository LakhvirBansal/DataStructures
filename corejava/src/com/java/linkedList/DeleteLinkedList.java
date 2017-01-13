package com.java.linkedList;

public class DeleteLinkedList {

 Node head; // head of list

 /* Linked list Node*/
 class Node
 {
     int data;
     Node next;
     Node(int d)
     {
         data = d;
         next = null;
     }
 }

public void deleteNode(int data){
	Node temp = head, prev = null;
	if(temp!= null && temp.data == data){
		head = temp.next;
		return;
	}
	while(temp != null && temp.data != data){
		prev = temp;
		temp = temp.next;
	}
	if(temp == null){
		System.out.println(" no node with particular key "+data);
		return;
	}
	prev.next = temp.next;
}

 /* Inserts a new Node at front of the list. */
 public void push(int new_data)
 {
     Node new_node = new Node(new_data);
     new_node.next = head;
     head = new_node;
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
     System.out.println("");
 }

 /* Drier program to test above functions. Ideally this function
 should be in a separate user class. It is kept here to keep
 code compact */
 public static void main(String[] args)
 {
	 DeleteLinkedList llist = new DeleteLinkedList();

     llist.push(7);
     llist.push(1);
     llist.push(3);
     llist.push(2);

     System.out.println("\nCreated Linked list is:");
     llist.printList();

     llist.deleteNode(1); // Delete node at position 4

     System.out.println("\nLinked List after Deletion data :1");
     llist.printList();
 }
}
