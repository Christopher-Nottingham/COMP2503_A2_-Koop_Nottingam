package controller;



import model.Card;
import model.CardDeck;
import model.DoublyLinkedList;
import model.*;
import model.DoublyLinkedList.Node;
import model.*;
import java.util.ArrayList;
import java.util.Collections;
import model.CardDeck;
import model.Card;

public class Shuffler extends CardDeck {
	
	
	

	


	public Card head;
    public Card tail;
    public Card current;
    

    public ArrayList <Card> deck1 = new ArrayList<Card>(); 
    
    private CardDeck shuffledDeck = new CardDeck();
    
    
    
    
    public void toArrayList() {
    	
    }
    
    
    public void swap (Card a, Card b) {
    	
    	
    	    	//Collections.swap(cardDeck, a, b);
    	
    	
    	
    	
    	
	}
    
    
    
	

public void shuffle() {



		

		for (int i=0; i<52; i++) {
			int card = (int) (Math.random() * (52-i));
			int card1 = (int) (Math.random() * (52-i));
			
			
			//System.out.println(card1 + card);
			Collections.swap(shuffledDeck.deck, card, card1);
			
		
			
			
			//shuffledDeck.addNode(shuffledDeck.removeNode(card));
		}
		
		System.out.println(shuffledDeck.deck.toString());



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

//		
//	 shuffledDeck = new CardDeck();
//		
//		
//		
//		shuffledDeck.createDeck();
//		
//	//	tail = shuffledDeck.linkedListCards.getTail();
//	//	head = shuffledDeck.linkedListCards.getHead();
//		

//		shuffledDeck.printCardDeck();

//	
		

//		
//		
//		
//		
//		//System.out.println(head.item);
//		
//		System.out.println("/n/n/n");
////		shuffledDeck.removeEndNode();
////		shuffledDeck.removeEndNode();
////		shuffledDeck.removeEndNode();
////		shuffledDeck.printCardDeck();
////	
//		
	        

}



}



