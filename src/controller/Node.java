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
    
 
    public Boolean equals(Node <type> node) {
    if (node.item==this.item) {
    	return true;
    } else {
    	return false;
    }
    }



  }