package ds.queue;

public class app {

	public static void main(String[] args) {

		queue myQ = new queue(5);
		myQ.insret(1);
		myQ.insret(2);
		myQ.insret(3);
		myQ.insret(4);
		myQ.insret(5);
		
		myQ.view();
		System.out.println(myQ.remove());
		System.out.println(myQ.remove());
		System.out.println(myQ.remove());
		System.out.println(myQ.remove());
		System.out.println(myQ.remove());
	
		myQ.view();

	}

}
