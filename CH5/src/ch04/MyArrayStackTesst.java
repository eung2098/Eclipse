package ch04;

public class MyArrayStackTesst {

	public static void main(String[] args) {

		MyArrayStack stack = new MyArrayStack(4);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		
		stack.printAll();
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
	}

}
