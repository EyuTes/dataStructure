package testStack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import stack.*;

public class TestStack {

	int count = 0;

	IntArrayStack intArrayStack = new IntArrayStack(6);// Array with size=6
	DoubleArrayStack doubleArrayStack = new DoubleArrayStack(8);// Array with size=8
	StringArrayStack stringArrayStack = new StringArrayStack(4);// Array with size=4

	/* Executed before every test method. */
	@Before
	public void setUp() {
		System.out.println("Run test method: " + (++count));
	}

	/* Executed after every test method. */
	@After
	public void tearDown() {
		System.out.println(" --- done with test " + count);
	}

	@Test
	public void testIsStackEmpty() {

		boolean isEmpty = true;// Expected
		boolean isFull = false;// Expected

		assertEquals(isEmpty, intArrayStack.isEmpty());
		assertEquals(isEmpty, doubleArrayStack.isEmpty());
		assertEquals(isEmpty, stringArrayStack.isEmpty());
		
		assertEquals(isFull, intArrayStack.isFull());
		assertEquals(isFull, doubleArrayStack.isFull());
		assertEquals(isFull, stringArrayStack.isFull());
	}

	@Test
	public void testStackSize() {
		/* for integer data type */
		intArrayStack.push(2);
		intArrayStack.push(4);
		intArrayStack.push(6);
		intArrayStack.push(8);
		intArrayStack.push(10);
		intArrayStack.push(12);
		
		int expected = 6;
		assertEquals(intArrayStack.size(), expected);
		assertEquals(intArrayStack.top(), 12);
		assertEquals(intArrayStack.pop(), 12);
		assertEquals(intArrayStack.pop(), 10);
		assertEquals(intArrayStack.pop(), 8);
		assertEquals(intArrayStack.pop(), 6);
		assertEquals(intArrayStack.pop(), 4);
		assertEquals(intArrayStack.pop(), 2);

		boolean isEmpty = false;
		/* Test that throws exception */
		try {
			intArrayStack.pop();
		} catch (IndexOutOfBoundsException e) {
			isEmpty = true;
		}
		assertTrue(isEmpty);
		
		/* for double data type */
		doubleArrayStack.push(2.2);
		doubleArrayStack.push(4.3);
		doubleArrayStack.push(6.4);
		doubleArrayStack.push(8.5);
		doubleArrayStack.push(10.6);
		doubleArrayStack.push(12.8);
		doubleArrayStack.push(14.2);
		doubleArrayStack.push(16.5);
		expected = 8;
		assertEquals(doubleArrayStack.size(), expected);
		assertEquals(doubleArrayStack.top(), 16.5,0.00);
		assertEquals(doubleArrayStack.pop(), 16.5,0.00);
		assertEquals(doubleArrayStack.pop(), 14.2,0.00);
		assertEquals(doubleArrayStack.pop(), 12.8,0.00);
		assertEquals(doubleArrayStack.pop(), 10.6,0.00);
		assertEquals(doubleArrayStack.pop(), 8.5,0.00);
		assertEquals(doubleArrayStack.pop(), 6.4,0.00);
		assertEquals(doubleArrayStack.pop(), 4.3,0.00);
		assertEquals(doubleArrayStack.pop(), 2.2,0.00);

		/* Test that throws exception */
		boolean isDoubleArrayStackEmpty=false;
		try {
			doubleArrayStack.pop();
		} catch (IndexOutOfBoundsException e) {
			isDoubleArrayStackEmpty = true;
		}
		assertTrue(isDoubleArrayStackEmpty);
		
		/* for String data type */
		stringArrayStack.push("Java");
		stringArrayStack.push("C#");
		stringArrayStack.push("Node js");
		stringArrayStack.push("C++");
		expected=4;
		assertEquals(stringArrayStack.size(), expected);
		assertEquals(stringArrayStack.top(), "C++");
		assertEquals(stringArrayStack.pop(), "C++");
		assertEquals(stringArrayStack.pop(), "Node js");
		assertEquals(stringArrayStack.pop(), "C#");
		assertEquals(stringArrayStack.pop(), "Java");
		boolean isStringArrayStackEmpty=false;
		try {
			stringArrayStack.pop();
		} catch (IndexOutOfBoundsException e) {
			isStringArrayStackEmpty = true;
		}
		assertTrue(isStringArrayStackEmpty);
	}

	@Test
	public void testStackIsFull() {
		/* for integer data type */
		boolean isFull = false;// Expected
		assertEquals(isFull, intArrayStack.isFull());
		
		intArrayStack.push(10);
		intArrayStack.push(20);
		intArrayStack.push(30);
		intArrayStack.push(40);
		intArrayStack.push(50);
		intArrayStack.push(60);
		
				
		/* Test that throws exception */
		try {
			intArrayStack.push(70);
		} catch (IndexOutOfBoundsException e) {
			isFull = true;
		}
		assertTrue(isFull);
		
		/* for double data type */
		boolean isDoubleArrayStackFull=false;
		doubleArrayStack.push(1.2);
		doubleArrayStack.push(3.3);
		doubleArrayStack.push(5.4);
		doubleArrayStack.push(7.5);
		doubleArrayStack.push(9.6);
		doubleArrayStack.push(10.8);
		doubleArrayStack.push(10.2);
		doubleArrayStack.push(13.5);
		try {
			doubleArrayStack.push(70);
		} catch (IndexOutOfBoundsException e) {
			isDoubleArrayStackFull = true;
		}
		assertTrue(isDoubleArrayStackFull);
		
		/* for String data type */
		boolean isStringArrayStackFull=false;
		stringArrayStack.push("english");
		stringArrayStack.push("geez");
		stringArrayStack.push("spanish");
		stringArrayStack.push("svenska");
		try {
			stringArrayStack.push("zulu");
		} catch (IndexOutOfBoundsException e) {
			isStringArrayStackFull = true;
		}
		assertTrue(isStringArrayStackFull);
	}
}
