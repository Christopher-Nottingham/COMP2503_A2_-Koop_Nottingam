package model;


/**
 * 
 * @author Christopher Nottingham
 *
 */
public class Card {

  private String suit;
  private int rank;
public Card next;
public Card prev;


  public Card(int rank, String suit) {
    this.rank = rank;
    this.suit = suit;

  }
  


  public Card() {
	// TODO Auto-generated constructor stub
	  
}



public String getSuit() {
    return suit;
  }


  public void setSuit(String suit) {
    this.suit = suit;
  }


  public int getRank() {
    return rank;
  }


  public void setRank(int rank) {
    this.rank = rank;
  }


  @Override
  public String toString() {

    String name = "King of ";

    if (rank >= 2 && rank <= 10) {
      name = rank + " of ";
    } else if (rank == 1) {
      name = "Ace of ";
    } else if (rank == 13) {
      name = "King of ";
    } else if (rank == 12) {
      name = "Queen of ";
    } else if (rank == 11) {
      name = "Jack of ";
    }return name + suit;



  }
  
  public void printCard(Card cardToPrint) {
    System.out.println(cardToPrint.toString());
  }
  
  
  
  public boolean equals (Card checkingCard) {
    if (this.rank == checkingCard.rank && this.suit == checkingCard.suit) {
      return true;
    } else {
      return false;
    }
    
  }
  
  



}
