package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CardDeck  {
  

  private DoublyLinkedList<Card> linkedListCards;

  public CardDeck() {
    linkedListCards = new DoublyLinkedList<Card>();
    createDeck();
  }



  public void createDeck() {
    Card card = new Card(null, 0);
    String suits[] = {"Dimonds", "Hearts", "Spades", "Clubs"};
    for (int x = 0; x < 4; x++) {
      for (int y = 1; y <= 13; y++) {
        String suit = suits[x];
        card.setSuit(suit);
        card.setRank(y);
        card.printCard(card);
        
        
        linkedListCards.addNode(card);
      }
    }
  }



  public void printCardDeck() {
    linkedListCards.printNodes();
  }



}
