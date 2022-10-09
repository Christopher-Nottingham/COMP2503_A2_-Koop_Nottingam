package controller;


import model.Card;
import model.CardDeck;
import model.DoublyLinkedList;
import model.*;
import model.DoublyLinkedList.Node;
import model.*;



public class Shuffler{
	


	public Card head;
    public Card tail;
    public Card current;
    
		
public void shuffle() {

		
		
		CardDeck shuffledDeck = new CardDeck();
		
		
		
		shuffledDeck.createDeck();
		
	//	tail = shuffledDeck.linkedListCards.getTail();
	//	head = shuffledDeck.linkedListCards.getHead();
		
		shuffledDeck.printCardDeck();
		
		
		

		
		//System.out.println(head.item);
		
		System.out.println("/n/n/n");
//		shuffledDeck.removeEndNode();
//		shuffledDeck.removeEndNode();
//		shuffledDeck.removeEndNode();
//		shuffledDeck.printCardDeck();
//	
		
}



}



