package day23;

import java.util.Scanner;

public class LinkedList {
static Node head;
static Node tail;
static int counter=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your No of nodes");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter your Data:");
			int data=sc.nextInt();
			addToList(data);	//this function by default adds to the end of list.
		}
		display();
	}
	private static void addToList(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			
		}
		else {
			tail.next=node;
			tail=node;
		}
		counter++;
	}
	private static void display() {

	    if (isEmpty()) {
	        System.out.println("List is empty");
	        return;
	    }

	    Node temp = head;

	    while (temp != null) {
	        System.out.print(temp.data + " -> ");
	        temp = temp.next;
	    }

	    System.out.println("null");
	}
	//AddFirst Function
	private static void AddFirst(int data) {
		Node n = new Node(data);

	    if (head == null) {
	        head = n;
	        tail = n;
	    } 
	    else {
	        n.next = head;
	        head = n;
	    }

	    counter++;
		
	}
	private static boolean isEmpty() {
		return head==null;
	}
	//AddAtIndex
	private static void AddAtIndex(int idx,int data) {
		if(idx>0 || idx >counter) {
			 System.out.println("Invalid index");
		        return;
		}
		 if (idx == 0) {
		        AddFirst(data);
		        return;
		    }
		 Node temp = head;

		    for (int i = 0; i < idx - 1; i++) {
		        temp = temp.next;
		    }

		    Node n = new Node(data);

		    n.next = temp.next;
		    temp.next = n;

		    if (n.next == null) {
		        tail = n;
		    }

		    counter++;
		
	}
	//DeleteFirst
	private static void DeleteFirst() {
		
		if(isEmpty()) {
			System.out.print("Cannot delete from List");
			return;
		}
		Node temp=head;
		head=head.next;
		temp.next=null;
		counter--;
		if (head == null) {
	        tail = null;
	    }
		
	}
	//DeleteAtLat
	private static void DeleteLast() {
		
		if(isEmpty()) {
			System.out.print("Cannot delete from List");
			return;
		}
		if (head == tail) {
	        head = null;
	        tail = null;
	    }
	    else {

	        Node temp = head;

	        while (temp.next != tail) {
	            temp = temp.next;
	        }

	        tail = temp;
	        tail.next = null;
	    }

	    counter--;
		
		
	}
	//DeleteAtIndex
	private static void deleteIndex(int idx) {

	    if (idx < 0 || idx >= counter) {
	        System.out.println("Invalid index");
	        return;
	    }

	    if (idx == 0) {
	        DeleteFirst();
	        return;
	    }

	    Node temp = head;

	    for (int i = 0; i < idx - 1; i++) {
	        temp = temp.next;
	    }

	    Node stemp = temp.next;

	    temp.next = stemp.next;
	    stemp.next = null;

	    if (temp.next == null) {
	        tail = temp;
	    }
	    counter--;
	}
	
}
