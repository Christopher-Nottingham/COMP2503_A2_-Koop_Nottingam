package controller;

import java.util.Scanner;

import model.Card;
import model.CardDeck;
import view.MenuDriver;
import model.*;

/**
 * 
 * @author Christopher Nottingham
 *
 */
public class GameManager {

	private MenuDriver menu;

	private Card popCard;
	private Card anotherPopCard;

	private Scanner gameReader;

	private LinkedListStack<Card> player1Cards;
	private LinkedListStack<Card> player2Cards;
	private String input;

	private boolean flag = true;
	private char choice;

	private int menuChoice;

	private int mainMenuChoice;

	private Shuffler shuffler;
	private int toDeal;

	private CardDeck deckOfCards;

	/**
	 * GameManager Constructor
	 */
	public GameManager() {
		deckOfCards = new CardDeck();
		menu = new MenuDriver();
		player1Cards = new LinkedListStack<>();
		player2Cards = new LinkedListStack<>();
		popCard = new Card();
		anotherPopCard = new Card();
		gameReader = new Scanner(System.in);
		shuffler = new Shuffler();
	}

	/**
	 * Checks if the players lists are empty
	 */
	public void emptyList() {
		if (player1Cards.isEmpty() && player2Cards.isEmpty()) {
			deckOfCards.createDeck();
		}
	}

	/**
	 * Main method to the game. Loads all required methods to run the program.
	 */
	public void loadApp() {
		menu.welcomeMsg();

		while (flag == true) {

			menu.printMainMenu();

			menuChoice = gameReader.nextInt();

			if (menuChoice >= 1 && menuChoice <= 3) {

			} else {
				while (!gameReader.hasNextInt()) {
					System.out.println("Please enter an integer between 1 and 3");
					System.out.println("Enter your choice: ");
					menuChoice = gameReader.nextInt();
				}
			}

			switch (menuChoice) {
			case 1:
				startGame();

				break;

			case 2:
				System.out.println("The deck has been shuffled, printing top 5 cards:");
				shuffler.shuffle();

				flag = true;
				break;

			case 3:

				System.out.println("Thank you for playing");
				System.out.println("Exiting the game......");

				flag = false;
				break;

			}

		}
	}

	/**
	 * Runs the game. Asks the user how many cards to deal to each player. Then
	 * deals said number to each player. Then decides the winner by calculating
	 * which player had the most wins.
	 */
	private void startGame() {

		Scanner menuScanner = new Scanner(System.in);
		Scanner dealNumber = new Scanner(System.in);

		boolean playAgain = true;
		System.out.println("Let the games begin!!!\n\n");

		while (playAgain == true) {
			System.out.println("How many cards would you like to deal");

			if (dealNumber.hasNextInt()) {

				if (toDeal < 25) {

					toDeal = dealNumber.nextInt();

				} else {
					while (toDeal >= 25) {
						System.out.println("Please enter a integer value bigger than 0 and less than 26.");
						System.out.println("Enter your choice:");
						toDeal = dealNumber.nextInt();

					}

				}

				dealNumber = dealNumber.reset();

				int player1Result = 0;
				int player2Result = 0;

				for (int i = 0; i < shuffler.deck.size(); i++) {

					player1Cards.push(shuffler.deck.get(i));
					shuffler.deck.remove(i);

				}

				for (int i = 0; i < shuffler.deck.size(); i++) {
					player2Cards.push(shuffler.deck.get(i));
					shuffler.deck.remove(i);
				}
				shuffler.createDeck();

				popCard = player1Cards.pop();
				player1Result = popCard.getRank();

				anotherPopCard = player2Cards.pop();
				player2Result = anotherPopCard.getRank();
				int counter = 0;
				while (counter != toDeal) {
					System.out.println("\nPlayer 1 has dealed card: " + popCard.toString());
					System.out.println("Player 2 has dealed card: " + anotherPopCard.toString() + "\n");

					popCard = player1Cards.pop();
					player1Result = player1Result + popCard.getRank();
					anotherPopCard = player2Cards.pop();
					player2Result = player2Result + anotherPopCard.getRank();
					counter++;

				}
				
				
				System.out.println("\nPlayer 1 has a score of " + player1Result);
				System.out.println("Player 2 has a socre of :" + player2Result);
				if (player1Result > player2Result) {
					System.out.println("Player 1 wins!!!");
				} else if (player2Result > player1Result) {
					System.out.println("Player 2 wins!!!");
				} else {
					
					System.out.println("There was a tie");
				}

				System.out.println("Would you like to play again? (Y/N)");
				char choice = menuScanner.next().charAt(0);

				if (choice == 'y') {
					playAgain = true;
				} else if (choice == 'n') {
					playAgain = false;
				}

			} else {
				while (toDeal > 0 && !dealNumber.hasNextInt() && toDeal < 25) {
					System.out.println("Please enter a integer value greater than 0 but less than 26");
					System.out.println("Enter your choice: ");
					toDeal = dealNumber.nextInt();
				}
			}

		}
	}

}
