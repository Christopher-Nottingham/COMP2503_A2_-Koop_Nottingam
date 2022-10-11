package controller;

import java.util.EmptyStackException;

/**
 * 
 * @author Ethan Koop
 *
 * @param <T>
 */
public class LinkedListStack<T> implements StackInterface<T> {

	/**
	 * 
	 * @author Ethan Koop
	 * Node class, used for creating the node
	 * @param <T>
	 */
	private class StackNode<T> {
		private T data;
		private StackNode <T> next;
		
		private StackNode (T x, StackNode <T> a) {
			data = x;
			next = a;
		}
		
	}
	
	private int size; //size of list
	private StackNode <T> top; // creates top node
	
	/**
	 * Constructor
	 */
	public LinkedListStack() {
		size=0;
		top = null;
	}
	
	/**
	 * Push method meant to add a node to the top of the stack
	 */
	@Override
	public void push(T x) {
		size++;
		top = new StackNode<T> (x, top);
	}

	/**
	 * Pop method used to remove a node from the top of the list
	 */
	@Override
	public T pop() {
		
		if (isEmpty()) throw new EmptyStackException();
		T x = top.data;
		top = top.next;
		size--;
		return x;
	
		
	}

	/**
	 * isEmpty method checks if the stack is empty
	 */
	@Override
	public boolean isEmpty() {
			
		return (size==0);
	}

	/**
	 * size method checks the size of the stack.
	 */
	@Override
	public int size() {
		return size;
	}
	

	
}
