package model;
import controller.*;

import java.util.ArrayList;

import controller.DoublyLinkedList;
import model.Card;
import model.DoublyLinkedList.Node;

public class CardDeck extends DoublyLinkedList<Card> {

	private Card aCard;

	public ArrayList <Card> deck;

	public DoublyLinkedList<Card> linkedListCards;
	
	
	
	
	

	/**
	 * CardDeck Constructor
	 */
	public CardDeck() {

		super();

		linkedListCards = new DoublyLinkedList<Card>();
		deck = new ArrayList<>();
		createDeck();
	}

	/**
	 * prints the card Deck
	 */
  public void printCardDeck() {
    linkedListCards.printNodes();
  }
  


  /**
   * 
   */
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


	

}
