package ds.queue;

public class queue {
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int back;
	private int numItems;

	public queue(int size) {
		super();
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0;
		this.back = -1;
		this.numItems = 0;
	}

	public void insret(long l) {
		
		if(back == maxSize -1){
			back = -1;
		}
		back++;
		queueArray[back] = l; // putting data at 0th position
		numItems++;
	}

	public void view() {
		System.out.print("[");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}

	public long remove() {
		long temp = queueArray[front];
		front++;
		numItems--;
		return temp;

	}

	public long peek() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return (numItems == 0);
	}

	public boolean isfull() {
		return (numItems == maxSize);
	}

}
