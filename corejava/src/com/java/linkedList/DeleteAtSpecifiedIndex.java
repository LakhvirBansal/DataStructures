package com.java.linkedList;

public class DeleteAtSpecifiedIndex {


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

public void deleteNode(int position){
	if (head == null){
		return;
	}
	Node temp = head, prev = null;
	if(temp!= null && position == 0){
		head = temp.next;
		return;
	}
	int countPosition = 0;
	while(temp != null && countPosition != position){
		countPosition++;
		prev = temp;
		temp = temp.next;
	}
	if(temp == null){
		System.out.println(" no node with particular key ");
		return;
	}
	prev.next = temp.next;
}

/* another way to delete the specified index.
 void deleteNode(int position)
{
    // If linked list is empty
    if (head == null)
        return;

    // Store head node
    Node temp = head;

    // If head needs to be removed
    if (position == 0)
    {
        head = temp.next;   // Change head
        return;
    }

    // Find previous node of the node to be deleted
    for (int i=0; temp!=null && i<position-1; i++)
        temp = temp.next;

    // If position is more than number of ndoes
    if (temp == null || temp.next == null)
        return;

    // Node temp->next is the node to be deleted
    // Store pointer to the next of node to be deleted
    Node next = temp.next.next;

    temp.next = next;  // Unlink the deleted node from list
}*/
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
	 DeleteAtSpecifiedIndex llist = new DeleteAtSpecifiedIndex();

     llist.push(7);
     llist.push(1);
     llist.push(3);
     llist.push(2);

     System.out.println("\nCreated Linked list is:");
     llist.printList();

     llist.deleteNode(1); // Delete node at specified position

     System.out.println("\nLinked List after Deletion data :");
     llist.printList();
 }
}
