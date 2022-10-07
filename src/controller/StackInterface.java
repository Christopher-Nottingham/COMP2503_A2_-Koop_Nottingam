package controller;
/**
 * 
 * @author Ethan Koop
 * This is the stack interface
 * @param <T>
 */
public interface StackInterface <T>{

	public void push (T x); //adds element
	public T pop (); //removes element
	public T peek(); //top of stack
	public boolean isEmpty(); //checks if stack is empty
	public int size(); //checks size of stack
}
