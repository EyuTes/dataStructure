package simpleStack;

public class GenericArrayStack<T> {
	
	private T values[];
	private int top = 0;

	@SuppressWarnings("unchecked")
	public GenericArrayStack(int size) {

		values =(T[]) new Object[size];
	}

	public void push(T num) {
		values[top++] = num;
	}

	public T pop() {
		return values[--top];
	}

	public T top() {
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
