package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CardDeck extends Node<Card> {
  private ArrayList<Card> deck;
  
   private DoublyLinkedList<Card> linkedListCards;
   
   //Node<Card>  nodeToAdd = new Node (data);
   
   
  
  
  //for the doublyLinked list
  
  
 
  
 

  public CardDeck() {
    linkedListCards = new DoublyLinkedList<>();
//    T x;
//    Node prev,next;
//    dummyCard = new Card(null, 0);;
    deck = new ArrayList<Card>();
    createDeck();
  }



  public void createDeck() {

    String suits[] = {"Dimonds", "Hearts", "Spades", "Clubs"};


    for (int x = 0; x < 4; x++) {
      for (int y = 1; y <= 13; y++) {
        
        linkedListCards.addNode(new Card(suits[x], y));
        
       
      }
    }
  }



  public void printCardDeck() {
    linkedListCards.printNodes();
  }




}
