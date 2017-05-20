package ds.CircularLinkedList;

public class App {

	public static void main(String[] args) {
		CircularLinkedList ll = new CircularLinkedList();
		ll.insertFirst(1);
		ll.insertFirst(2);
		ll.insertFirst(3);
		ll.insertFirst(4);
		ll.insertFirst(5);

		ll.displayList();

		ll.insertLast(9);

		ll.displayList();
		
		
	}
}
