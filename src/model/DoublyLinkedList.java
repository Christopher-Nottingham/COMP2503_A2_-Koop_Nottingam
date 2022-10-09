package model;



import java.util.ListIterator;



public class DoublyLinkedList<T> extends Card {

  public class Node<type> {

    type item;
    Node<type> previous, next = null;

    

    public Node<type> getPrevious() {
		return previous;
	}


	public void setPrevious(Node<type> previous) {
		this.previous = previous;
	}


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


  Node<T> head = null;
  Node<T> tail = null;
  private int size;

  public DoublyLinkedList() {
    this.size = 0;
  }



  public void addNode(T nodeTobeAdded) {
    Node<T> newNode = new Node(nodeTobeAdded);
    if (head == null) {

      head = tail = newNode;
      head.previous = null;
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

    if (head == null) {
      System.out.println("The list is empty ");

    }

    else {
      if (head != tail) {
        head = head.next;
        head.previous = null;
      } else {
        head = tail = null;
      }
    }
    size--;
  }

  public void removeEndNode() {
    if (head == null) {
      System.out.println("The list is empty ");
    } else {
      if (head == tail) {
        head = tail = null;
      } else {
        tail = tail.previous;
        tail.next = null;
      }
    }
    size --;
  }

  public void removeStartNode() {
    if (head == null) {
      System.out.println("The list is empty ");
    } else {
      head = head.next;
      head.previous.next = null;
    }
    size--;

  }


  public void printNodes() {
    Node<T> current = head;
    while (current != null) {
      System.out.println(current.item);
      current = current.next;
    }
  }

  public void addEndNode(T endNewNode) {
    Node<T> newNode = new Node(endNewNode);

    if (head == null) {

      addNode(endNewNode);

    } else {
      Node<T> temp = new Node();
      temp = head;
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
    if (head == null) {
      newNode = head;
    } else {
      newNode.setNext(head);
      head = newNode;
    }
    size++;
  }
  
  
  public T get (int index) {
    
    int length = size();
    T data = null;
    Node <T> current = head;
    if (index<length && index >=0) {
      current = head;
      for (int i = 0; i <index; i++) {
        current = current.getNext();
        data = current.item;
      }

    }
    return data;
    
    
    
    
    
    
    
    
    
    
  }
  

  public int size() {
    return size;
  }



}


