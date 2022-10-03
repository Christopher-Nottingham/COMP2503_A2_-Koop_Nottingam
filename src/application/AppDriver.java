package application;

import controller.Card;
import controller.CardDeck;

public class AppDriver {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    CardDeck cd = new CardDeck();
    cd.createDeck();
    
    System.out.println(cd.getDeck());
   
    
  }

}
