package test;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import controller.LinkedListStack;
import model.Card;

class LinkedListStackTest {

	@Test
	void testPop() {
		LinkedListStack testStack = new LinkedListStack();
		
		Card t1 = new Card(2, "Spades");
		Card t2 = new Card(3, "Hearts");
		Card t3 = new Card(4, "Clubs");
		Card t4 = new Card(5, "Diamonds");
		Card t5 = new Card(6, "Spades");
		
		testStack.push(t1);
		testStack.push(t2);
		testStack.push(t3);
		testStack.push(t4);
		testStack.push(t5);
		
		testStack.pop();
		testStack.pop();
		
		assertEquals(t3, testStack.pop());
	}
	
	@Test
	void testPush() {
		LinkedListStack testStack = new LinkedListStack();
		
		Card t1 = new Card(2, "Spades");
		Card t2 = new Card(3, "Hearts");
		Card t3 = new Card(4, "Clubs");
		Card t4 = new Card(5, "Diamonds");
		Card t5 = new Card(6, "Spades");
		
		testStack.push(t1);
		testStack.push(t2);
		testStack.push(t3);
		testStack.push(t4);
		testStack.push(t5);
		
		assertEquals(5, testStack.size());

	}

	@Test
	void testIsEmpty() {
		LinkedListStack testStack = new LinkedListStack();
		
		Card t1 = new Card(2, "Spades");
		Card t2 = new Card(3, "Hearts");
		Card t3 = new Card(4, "Clubs");
		Card t4 = new Card(5, "Diamonds");
		Card t5 = new Card(6, "Spades");
		
		testStack.push(t1);
		testStack.push(t2);
		testStack.push(t3);
		testStack.push(t4);
		testStack.push(t5);
		
		testStack.pop();
		testStack.pop();
		testStack.pop();
		testStack.pop();
		testStack.pop();
		
		
		assertEquals(0, testStack.size());
	}
}
