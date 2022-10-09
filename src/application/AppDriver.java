package application;

import model.Card;

import java.util.ArrayList;

import controller.*;
import model.CardDeck;

public class AppDriver {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//ArrayList <Integer> i = new ArrayList<>();
//i.add(1);
//i.add(2);
//
//
//System.out.println(i.get(0));
//System.out.println(i);
	  
	  
	  
	  
CardDeck cd = new CardDeck();
Shuffler s = new Shuffler ();
//System.out.println(cd.deck.toString());

System.out.println("Original Card Deck");
System.out.println(cd.deck.toString());
System.out.println("\nShuffled Deck \n");
s.shuffle();

//cd.createDeck();


//cd.printArrayList();
//System.out.println(cd.get(2));
//
//cd.get(2);
//
//Card c = new  Card(3, "Spades");
//Card c1 = new  Card(4, "King");


//cd.addNodeStart(c1);
//cd.addNodeStart(c);
//cd.printCardDeck();

//System.out.println(cd.get(3));


//    cd.createDeck();
//    
//    
//    cd.printCardDeck();
	// cd.removeNode();
	  
//	  Shuffler sc = new Shuffler();
//	  sc.shuffle();
//	  
	  
	  
	 // sc.
    
    
   
    
  }

}
