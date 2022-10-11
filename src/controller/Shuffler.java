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
    

//    public ArrayList <Card> deck1 = new ArrayList<Card>(); 

    //private CardDeck shuffledDeck = new CardDeck();
    
    
	public void shuffle(){

		for (int i=0; i<52; i++) {
			int card = (int) (Math.random() * (52-i));
			int card1 = (int) (Math.random() * (52-i));		
			Collections.swap( deck, card, card1);	
		}
		

		System.out.println(deck.get(0) + "\n" + deck.get(1) + "\n" + deck.get(2) + "\n" + deck.get(3) + "\n" + deck.get(4));        

}


	@Override
	public String toString() {
		return "Shuffler [shuffledDeck=" + deck + "]";
	}


	


}



