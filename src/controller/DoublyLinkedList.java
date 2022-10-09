package controller;



import java.util.ListIterator;

import controller.DoublyLinkedList.Node;
import model.Card;
import model.CardDeck;



public class DoublyLinkedList<T>   {

  public class Node<type> {

    type item;
    Node<type> previous, next = null;


    public Node<type> getNext() {
      return next;
    }


    public void setNext(Node<type> next) {
      this.next = next;
    }


    public Node(type item) {
      this.item = item;
    }

    public Node() {

    }



  }

  
  private Node<T> current;

  private Node<T> head;
  private Node<T> tail;
  private T data;
  private int size;

  public DoublyLinkedList() {
    this.size = 0;
  }



  public void addNode(T nodeTobeAdded) {
    Node<T> newNode = new Node(nodeTobeAdded);
    if (getHead() == null) {

      head = tail = newNode;
      getHead().previous = null;
      tail.next = null;

    } else {
      tail.next = newNode;
      newNode.previous = tail;
      tail = newNode;
      tail.next = null;

    }
    size++;


  }

  public void removeNode(Node<T> nodeToRemove) {

    if (getHead() == null) {
      System.out.println("The list is empty ");

    }

    else {
      if (getHead() != tail) {
        head = getHead().next;
        getHead().previous = null;
      } else {
        head = tail = null;
      }
    }
    size--;
  }

  public void removeEndNode() {
    if (getHead() == null) {
      System.out.println("The list is empty ");
    } else {
      if (getHead() == tail) {
        head = tail = null;
      } else {
        tail = tail.previous;
        tail.next = null;
      }
    }
    size --;
  }

  public void removeStartNode() {
    if (getHead() == null) {
      System.out.println("The list is empty ");
    } else {
      head = getHead().next;
      getHead().previous.next = null;
    }
    size--;

  }
  public DoublyLinkedList<T>.Node<T> removeNodeAtPosition(int index) {
	  Node <T> aNode = null;
	  Node <T> current = getHead();
	  
	  for (int i = 0; i < index; i++) {
		  
		  current = current.next;
		  
	  }
	  
	  Node<T> theCardToDelete = current;
	  theCardToDelete.previous.next=null;
	  
	  
	  return theCardToDelete;
	  
	

	  
	 
	  
	  
	  

    }
	  
	  
	  
	  
	  
	  
	  
	//return aCard;
	  
  
  
  
  
  


  public void printNodes() {
    Node<T> current = getHead();
    while (current != null) {
      System.out.println(current.item);
      current = current.next;
    }
  }

  public void addEndNode(T endNewNode) {
    Node<T> newNode = new Node(endNewNode);

    if (getHead() == null) {

      addNode(endNewNode);

    } else {
      Node<T> temp = new Node();
      temp = getHead();
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
      newNode.previous = temp;
    }

    size++;
  }



  public void addNodeStart(T newNodeStart) {
    Node<T> newNode = new Node(newNodeStart);
    if (getHead() == null) {
      newNode = getHead();
    } else {
      newNode.setNext(getHead());
      head = newNode;
    }
    size++;
  }
  
  
  public T get (int index) {
	    
	    int length = size();
	    
	    Node <T> current = getHead();
	    if (index<=length && index >=0) {
	      current = getHead();
	      for (int i = 0; i <index-1; i++) {
	        current = current.getNext();
	        data = current.item;
	        System.out.println(data);
	      }

	    }
	    return data;  
	    
	  }
  

  public int size() {
    return size;
  }



public Node  getHead() {
	return head;
}



public Node getTail() {
	return tail;
}



}


