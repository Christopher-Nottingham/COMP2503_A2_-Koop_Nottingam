package model;
import controller.*;
import java.util.ArrayList;

import controller.DoublyLinkedList;
import model.Card;
import model.DoublyLinkedList.Node;

/**
 * 
 * @author Christopher Nottingham
 *
 */
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


  public void printCardDeck() {
    linkedListCards.printNodes();
  }
  

	public void createDeck() {


		String[] suits = { "Spades", "Diamond", "Clubs", "Hearts" };

		
		for (int x = 0; x < 4; x++) {
			for (int y = 1; y <= 13; y++) {
				aCard = new Card(y, suits[x]);
				deck.add(aCard);
				linkedListCards.addNode(aCard);
			}

		}

	}


	

}
