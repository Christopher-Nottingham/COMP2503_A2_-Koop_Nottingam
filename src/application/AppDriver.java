package application;

import controller.Shuffler;
import model.Card;
import model.CardDeck;

public class AppDriver {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    CardDeck cd = new CardDeck();
    cd.createDeck();
    cd.printCardDeck();
    
   
    
  }

}
