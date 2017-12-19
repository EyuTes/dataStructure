package stack;

public class DoubleArrayStack {

	private double values[];
	private int top = 0;

	public DoubleArrayStack(int size) {

		values = new double[size];
	}

	public void push(double num) {
		values[top++] = num;
	}

	public double pop() {
		return values[--top];
	}

	public double top() {
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
