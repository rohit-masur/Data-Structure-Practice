package ds.stack;

public class Stack {
	private int stackSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size){
		super();
		this.stackSize = size;
		this.stackArray = new char[size];
		this.top = -1;
	} 
	
	public void push(char j){
		if (isFull()){
			System.out.println("Full");
		}else{
		top++;
		stackArray[top] =j;
		}
	}
	
	public char pop(){
		if(isEmpty()){
			System.out.println("Empty");
			return 1;
		}else{
		int old_top = top;
		top--;
		return stackArray[old_top];
		}
	} 
	public long peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return(top == -1);
	}
	
	public boolean isFull(){
		return(top == stackSize-1); // top is -1
	}
}
