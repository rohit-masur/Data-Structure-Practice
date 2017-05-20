package ds.DoublyLinkedList;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList ll = new DoublyLinkedList();

		ll.insertFirst(1);
		ll.insertFirst(2);
		ll.insertFirst(3);
		ll.insertFirst(4);
		ll.insertFirst(5);

		ll.displayForward();

		ll.insertLast(9);
		ll.displayForward();

		ll.insertAfter(2, 10);
		ll.displayForward();

		ll.deleteKey(10);
		ll.displayForward();

		ll.displayForward();

		ll.displayForward();

		ll.displayBackward();

	}

}
