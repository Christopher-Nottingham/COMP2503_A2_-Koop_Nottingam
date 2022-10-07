package controller;



public class Card {

  private String suit;
  private int rank;


  public Card(String suit, int rank) {
    this.rank = rank;
    this.suit = suit;

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
    }


    return name + rank;



  }
  
  
  



}
