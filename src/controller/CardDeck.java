package controller;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
  private ArrayList<Card> deck;

  public CardDeck() {

    deck = new ArrayList<Card>();
    createDeck();
  }



  public void createDeck() {

    String suits[] = {"Dimonds", "Hearts", "Spades", "Clubs"};


    for (int x = 0; x < 4; x++) {
      for (int y = 1; y <= 13; y++) {
        deck.add(new Card(suits[x], y));
      }
    }
  }



  public ArrayList<Card> getDeck() {
    return deck;
  }



}
