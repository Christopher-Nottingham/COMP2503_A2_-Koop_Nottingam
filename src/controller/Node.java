package controller;

//import controller.DoublyLinkedList.Node;
/**
 * 
 * @author Christopher Nottingham
 *
 * @param <type>
 */
public class Node<type> {

    type item;
    Node<type> previous, next = null;


    /**
     * Gets next node
     * @return next node
     */
    public Node<type> getNext() {
      return next;
    }


    /**
     * sets next node
     * @param next node
     */
    public void setNext(Node<type> next) {
      this.next = next;
    }


    /**
     * Node constructor
     * @param item data that the node holds
     */
    public Node(type item) {
      this.item = item;
    }

    /**
     * Copy constructor
     */
    public Node() {

    }
    
 
    /**
     * Checks if a node equals another node.
     * @param node node to test.
     * @return true if they do equal, and false if they don't.
     */
    public Boolean equals(Node <type> node) {
    if (node.item==this.item) {
    	return true;
    } else {
    	return false;
    }
    }



  }