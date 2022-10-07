package controller;

public class Shuffler {

	public Card head;
    public Card tail;
    public Card current;
    
	public void shuffle(){
		
		CardDeck shuffledDeck = new CardDeck();
		shuffledDeck.createDeck();
		
		for (int i=0; i<52; i++) {
			int card = (int) (Math.random() * (52-i));
			//shuffledDeck.addNode(shuffledDeck.removeNode(card));
		}
		
		
		
		
	        
}
}