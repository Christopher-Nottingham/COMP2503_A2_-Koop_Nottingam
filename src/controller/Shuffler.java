package controller;

import model.*;



import java.util.Collections;


import model.CardDeck;
import model.Card;

public class Shuffler extends CardDeck {
	
	
	
	

	public Card head;
    public Card tail;
    public Card current;
    
   
    
    private CardDeck shuffledDeck = new CardDeck();
    
    
	public void shuffle(){
		for (int i=0; i<52; i++) {
			int card = (int) (Math.random() * (52-i));
			int card1 = (int) (Math.random() * (52-i));		
			Collections.swap(shuffledDeck.deck, card, card1);	
		}
		
		
	        
}
}