package ds.CircularLinkedList;

import ds.SinglyLinkedList.Node;

public class CircularLinkedList {

	private Node first;
	private Node last;

	public CircularLinkedList() {
		this.first = null;
		this.last = null;
	}

	private boolean isEmpty() {

		return (first == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;

	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			newNode = last;
		}
	}

	public int deleteFirst() {
		int temp = first.data;

		if (first.next == null) {
			last = first;
		}
		first = first.next;
		return temp;

	}

	public void displayList() {
		System.out.println("List (First --> Last)");
		Node current = first;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

	}
}
