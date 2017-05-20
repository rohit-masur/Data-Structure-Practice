package ds.stack;

public class App {

	public static void main(String[] args) {
 /*
		Stack myStack = new Stack(3);
		
		Stack<String> = new Stack();

		myStack.push(20);

		while (!myStack.isEmpty()) {
			long value = myStack.pop();
			System.out.println(value);
		}*/
		
		System.out.println(reverseString("HELLO"));

	}

	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		Stack myStack1 = new Stack(str.length());
		
		for(int i=0;i<str.length();i++){
			myStack1.push(str.charAt(i));
		}
		for(int i=0;i<str.length();i++){
			sb.append((myStack1.pop()));
		}
		return sb.toString();
		
	}
}
