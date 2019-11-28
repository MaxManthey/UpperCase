package de.hfu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	private Queue test;
	
	@Before
	public void queueInit() {
		test = new Queue(3);
	}
	
	@Test
	public void dequeueTest_1() {
		final int eingabe = 3;
		test.enqueue(eingabe);
		assertEquals("Falsch", eingabe, test.dequeue());
	}
	
	@Test
	public void dequeueTest_2() {
		final int e1 = 1;
		final int e2 = 2;
		final int e3 = 3;
		
		test.enqueue(e1);
		test.enqueue(e2);
		test.enqueue(e3);
		assertEquals("Falsch", e1, test.dequeue());
		assertEquals("Falsch", e2, test.dequeue());
		assertEquals("Falsch", e3, test.dequeue());
		
	}
	
	@Test
	public void dequeueTest_3() {
		final int e1 = 1;
		final int e2 = 2;
		final int e3 = 3;
		final int e4 = 4;
		
		test.enqueue(e1);
		test.enqueue(e2);
		test.enqueue(e3);
		test.enqueue(e4);
		assertEquals("Falsch", e1, test.dequeue());
		assertEquals("Falsch", e2, test.dequeue());
		assertEquals("Falsch", e4, test.dequeue());
	}
}
