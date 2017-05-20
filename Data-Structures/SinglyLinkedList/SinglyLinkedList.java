package ds.SinglyLinkedList;

public class SinglyLinkedList {
	private Node first;

	public SinglyLinkedList() {

	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}

	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		current.next = newNode;

	}

	public Node deleteFirst() {
		Node temp = first;
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
