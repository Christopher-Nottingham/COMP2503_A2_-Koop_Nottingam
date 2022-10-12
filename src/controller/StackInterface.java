package controller;
/**
 * 
 * @author Ethan Koop
 * This is the stack interface
 * @param <T> Generic Type
 */
public interface StackInterface <T>{

	public void push (T x); //adds element
	public T pop (); //removes element
	public boolean isEmpty(); //checks if stack is empty
	public int size(); //checks size of stack
}
