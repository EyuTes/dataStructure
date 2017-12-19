package simpleStack;

public class ObjectArrayStack {
	
	private Object values[];
	private int top = 0;

	public ObjectArrayStack(int size) {

		values = new Object[size];
	}

	public void push(Object num) {
		values[top++] = num;
	}

	public Object pop() {
		return values[--top];
	}

	public Object top() {
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
