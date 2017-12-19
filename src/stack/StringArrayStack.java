package stack;

public class StringArrayStack {
	
	private String values[];
	private int top = 0;

	public StringArrayStack(int size) {

		values = new String[size];
	}

	public void push(String num) {
		values[top++] = num;
	}

	public String pop() {
		return values[--top];
	}

	public String top() {
		return values[top - 1]; // assign,decrement then return  top
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
