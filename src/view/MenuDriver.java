package view;

import java.util.*;
/**
 * 
 * @author christopher nottingham
 *
 */
public class MenuDriver {

	Scanner input;
	
	private int choice;

	/**
	 * MenuDriver Constructor
	 * Gets user input.
	 */
	public MenuDriver() {
		input = new Scanner(System.in);

	}

	/**
	 * Prints welcome message.
	 */
	public void welcomeMsg() {
		System.out.println("*** Welcome to the War Game ***");

	}

	/**
	 * Prints the Main Menu. 
	 */
	public void printMainMenu() {
		System.out.println("Select one of these options: ");
		System.out.println("\t1. Play War Game");
		System.out.println("\t2. Shuffle Cards");
		System.out.println("\t3. Exit Game");
		System.out.println("Enter your choice: ");
		
		
	}

}
