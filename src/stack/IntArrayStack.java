package stack;


public class IntArrayStack {

	private int values[];
	private int top = 0;

	public IntArrayStack(int size) {

		values = new int[size];
	}

	public void push(int num) {
		values[top++] = num;
	}

	public int pop() {
		return values[--top];
	}

	public int top() {
		return values[top - 1]; // assign,decrement top then return
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top == 0;
	}
	public boolean isFull(){
		return top==values.length-1;
	}
}
