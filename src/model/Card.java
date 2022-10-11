package model;



public class Card {

  private String suit;
  private int rank;
public Card next;
public Card prev;



/**
 * Card Constructor
 * @param rank rank of the card.
 * @param suit suit of the card.
 */
  public Card(int rank, String suit) {
    this.rank = rank;
    this.suit = suit;

  }


/**
 * Getter method used to get the suit of a card.
 * @return suit of card.
 */
public String getSuit() {
    return suit;
  }

/**
 * Setter method used to set the suit of a card.
 * @param suit that the card is to be set to.
 */
  public void setSuit(String suit) {
    this.suit = suit;
  }

/**
 * Getter method used to get the rank of a card.
 * @return the rank of the card.
 */
  public int getRank() {
    return rank;
  }

/**
 * Setter method used to set the rank of a card.
 * @param rank that the card is to be set to.
 */
  public void setRank(int rank) {
    this.rank = rank;
  }


  /**
   * toString method used to set the format of the printed cards.
   */
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
  
  /**
   * Prints one card.
   * @param cardToPrint the card to print.
   */
  public void printCard(Card cardToPrint) {
    System.out.println(cardToPrint.toString());
  }
  
  
  /**
   * Checks if the card is the correct value.
   * @param checkingCard card to be checked.
   * @return true if the card is correct.
   * @return false if the card is incorrect.
   */
  public boolean equals (Card checkingCard) {
    if (this.rank == checkingCard.rank && this.suit == checkingCard.suit) {
      return true;
    } else {
      return false;
    }
    
  }
  
  



}
