package com.java.linkedList;
public class LinkedListCount {
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
		 LinkedListCount llist = new LinkedListCount();

	     llist.push(7);
	     llist.push(1);
	     llist.push(3);
	     llist.push(2);
	     llist.push(4);
	     llist.push(5);
	     llist.push(6);
	     

	     System.out.println("\nCreated Linked list is:");
	     llist.printList();

	     //int count = llist.LinkedListDataCount(); // Delete node at specified position
	     int count = llist.getCount();
	     System.out.println("The linkedList size is "+count);
	     llist.printList();
	 }

	private int LinkedListDataCount() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	 /* Returns count of nodes in linked list */
    public int getCountRec(Node node)
    {
        // Base case
        if (node == null)
            return 0;
 
        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }
 
    /* Wrapper over getCountRec() */
    public int getCount()
    {
        return getCountRec(head);
    }
}
