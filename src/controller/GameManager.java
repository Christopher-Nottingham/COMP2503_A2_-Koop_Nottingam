package controller;

import java.util.Scanner;

import model.Card;
import model.CardDeck;
import view.MenuDriver;

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

	private CardDeck deckOfCards;

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

	public void loadApp() {

		while (flag == true) {

			menu.printMainMenu();
			
			menuChoice = gameReader.nextInt();

			if (menuChoice >= 1 && menuChoice <= 3) {
				//return aChoice;

			} else {
				while (!gameReader.hasNextInt()) {
					System.out.println("Please enter an integer between 1 and 3");
					System.out.println("Enter your choice: ");
					menuChoice = gameReader.nextInt();
				}
			}
			
			// print main menu

			switch (menuChoice) {
			case 1: {
				startGame();
				menu.printMainMenu();
				// playGame();

			}

			case 2: {
				shuffler.shuffle();
				System.out.println("The deck has been shuffled");
				menu.printMainMenu();

				// shuffleCards();
				flag = true;

			}

			case 3: {
				// wait(2000);
				System.out.println("Thank you for playing");
				System.out.println("Exiting the game......");

				flag = false;
			}

			}

		}
	}

	private void startGame() {

		Scanner dealNumber = new Scanner(System.in);

		System.out.println("Let the games begin!!!\n\n");
		System.out.println("How many cards would you like to deal");

		int toDeal;
		int counter = 0;
		toDeal = dealNumber.nextInt();

		if (dealNumber.hasNextInt()) {
			toDeal = dealNumber.nextInt();

			// dealNumber.nextInt();
			int player1Result;
			int player2Result;

			for (int i = 0; i < 26; i++) {

				player1Cards.push(shuffler.deck.get(i));
				shuffler.deck.remove(i);

			}

			for (int i = 0; i < shuffler.deck.size(); i++) {
				player2Cards.push(shuffler.deck.get(i));
			}

			popCard = player1Cards.pop();
			player1Result = popCard.getRank();

			anotherPopCard = player2Cards.pop();
			player2Result = anotherPopCard.getRank();

			while (counter != toDeal) {
				System.out.println("\nPlayer 1 has dealed a " + popCard.toString());
				System.out.println("Player 2 has dealed card: " + anotherPopCard.toString() + "\n");

				popCard = player1Cards.pop();
				player1Result = player1Result + popCard.getRank();
				anotherPopCard = player2Cards.pop();
				player2Result = player2Result + anotherPopCard.getRank();
				counter++;

			}
		} else {
			while (!(toDeal >= 1) && !(dealNumber.hasNextInt())) {
				System.out.println("Please enter an integer value greater than 0");
				System.out.println("Enter your choice");
				toDeal = dealNumber.nextInt();

			}
		}

	}
}
