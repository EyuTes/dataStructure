package testStack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import stack.*;

public class TestStack {
	
	int count = 0;
	
	IntArrayStack intArrayStack = new IntArrayStack(10);// Array with size=10

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

		boolean expected = true;

		assertEquals(expected, intArrayStack.isEmpty());

	}

	@Test
	public void testStackSize() {

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
	}

}
