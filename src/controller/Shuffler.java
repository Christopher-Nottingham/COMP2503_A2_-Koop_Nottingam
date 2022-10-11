package controller;


import model.CardDeck;
import java.util.Collections;


/**
 * 
 * @author Ethan Koop
 *
 */
public class Shuffler extends CardDeck {
    
    private CardDeck shuffledDeck = new CardDeck();
		

    /**
     * Shuffle Method
     * Gets the index's of two random cards from a deck.
     * Swaps the two cards, and repeats until all cards have been swapped.  
     */
	public void shuffle(){

		for (int i=0; i<52; i++) {
			int card = (int) (Math.random() * (52-i));
			int card1 = (int) (Math.random() * (52-i));		
			Collections.swap( deck, card, card1);	
		}
		
		System.out.println(deck.get(0) + "\n" + deck.get(1) + "\n" + deck.get(2) + "\n" + deck.get(3) + "\n" + deck.get(4));        


}



	/**
	 * toString method used to print shuffled cards. 
	 */
	@Override
	public String toString() {
		return "Shuffler [shuffledDeck=" + deck + "]";
	}

	


}



