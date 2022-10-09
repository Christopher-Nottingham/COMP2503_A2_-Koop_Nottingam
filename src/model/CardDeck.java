package model;

import controller.DoublyLinkedList;
import model.Card;

public class CardDeck extends DoublyLinkedList<Card> {

	private Card aCard;

	public DoublyLinkedList<Card> linkedListCards;

	public CardDeck() {
		super();
		linkedListCards = new DoublyLinkedList<Card>();
		createDeck();
	}

	public void createDeck() {

		String[] suits = { "Spades", "Diamond", "Clubs", "Hearts" };

		/*
		 * The for loop creates a whole new deck based on their suit and rank
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				linkedListCards.addNode(aCard = new Card(j, suits[i]));
			}
		}

	}
	
	
	


	public void printCardDeck() {
		linkedListCards.printNodes();
	}
}
