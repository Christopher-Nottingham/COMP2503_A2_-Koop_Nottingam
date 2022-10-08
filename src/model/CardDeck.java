package model;
import model.Card;



public class CardDeck extends Card{
	
	





public  Card aCard;
	
	
	

 
private DoublyLinkedList <Card> linkedListCards;



  public  CardDeck() {
	  super();
	  
	
	linkedListCards = new DoublyLinkedList();
    createDeck();
    
  }
  
public void createDeck() {
	
	String[] suits = {"Spades", "Diamond", "Clubs", "Hearts"};
	
	/*
	 * The for loop creates a whole new deck based on their suit and rank
	 */
	for (int i = 0 ; i < 4; i++) {
		for (int j = 1 ; j <=13 ; j++) {
			linkedListCards.addNode(aCard = new Card (j,suits[i]));
		}
	}
//    String suits[] = {"Dimonds", "Hearts", "Spades", "Clubs"};
//    for (int x = 0; x < 4; x++) {
//      for (int y = 1; y <= 13; y++) {
//    	  
//    	  
//    	  
//    	  
//       
//    	  //aCard.setSuit(suits[x].toString());
//    	 // System.out.println(aCard.getSuit());
//    	  setRank(y);
//        setSuit(suits[x]);
//        int rank = getRank();
//        
//        
//      //  String suit = aCard.getSuit().toString();
//       // aCard = new Card(suit, rank);
//        
//        //System.out.println(aCard.toString());
//        
//        
//       
//        linkedListCards.addNode(aCard = new Card (y, suits[x]));
//       // System.out.println(aCard);
      }
    //}
 // }
  public void printCardDeck() {
    linkedListCards.printNodes();
  }
}
