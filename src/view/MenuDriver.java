package view;

import java.util.*;

public class MenuDriver {

	Scanner input;
	
	private int choice;

	public MenuDriver() {
		input = new Scanner(System.in);

	}

	public void welcomeMsg() {
		System.out.println("Welcome to the War Game");

	}

	public void printMainMenu() {

		System.out.println("Select one of these options: ");
		System.out.println("\t1. Play War Game");
		System.out.println("\t2. ShuffleCards");
		System.out.println("\t3. Exit Game");
		System.out.println("\tExit");

		System.out.println("Enter your choice: ");
		
		
	}

}
