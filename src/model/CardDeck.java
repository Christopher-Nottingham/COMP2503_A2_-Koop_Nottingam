package model;
import controller.*;
import java.util.ArrayList;

import controller.DoublyLinkedList;
import model.Card;

public class CardDeck extends DoublyLinkedList<Card> {

	private Card aCard;

	public ArrayList <Card> deck;

	public DoublyLinkedList<Card> linkedListCards;
	
	
	
	
	

	public CardDeck() {

		super();

		linkedListCards = new DoublyLinkedList<Card>();
		deck = new ArrayList<>();
		createDeck();
	}

	public void createDeck() {


		String[] suits = { "Spades", "Diamond", "Clubs", "Hearts" };

		/*
		 * The for loop creates a whole new deck based on their suit and rank
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				aCard = new Card(j, suits[i]);
				deck.add(aCard);
				linkedListCards.addNode(aCard);
			}

		}

	}


	public void printCardDeck() {
		linkedListCards.printNodes();
	}
}
