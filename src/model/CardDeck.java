package model;
import model.Card;



public class CardDeck extends Card{
	
	





public  Card aCard;
	
	
	

 
private DoublyLinkedList <Card> linkedListCards;



  public  CardDeck() {
	super("0",0);
    linkedListCards = new DoublyLinkedList<Card>();
    createDeck();
  }
  public void createDeck() {
    String suits[] = {"Dimonds", "Hearts", "Spades", "Clubs"};
    for (int x = 0; x < 4; x++) {
      for (int y = 1; y <= 13; y++) {
    	  
    	  //aCard = new Card(suits[x].toString(), y);
        System.out.println(aCard.getSuit());
    	  aCard.setSuit(suits[x].toString());
        
//        String suit = aCard.getSuit();
//        aCard = new Card(suit, y);
        
        
       
      //  linkedListCards.addNode(aCard);
       // System.out.println(aCard);
      }
    }
  }
  public void printCardDeck() {
    linkedListCards.printNodes();
  }
}
