package model;



import java.util.ListIterator;



// class Node<T> {
//
//
//
// T item;
// Node prev = null;
// Node next = null;
//
// public Node() {
//
// }
//
// public Node(T item) {
// this.item = item;
//
// }



// public void setNext(Node next) {
// this.next = next;
// }
//
// public Node getNext() {
// return next;
// }
//
//
//
// }


public class DoublyLinkedList<T> {

  class Node<type> {

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
  // Node<T> newNodeStart = new Node(newNode);
  //
  // if(head==null) {
  // head = tail = newNodeStart;
  // } else {
  // head = head.next;
  // head = newNodeStart;
  // }


  // public void addNode(Card aCard) {
  //
  // Node newNode = new Node(aCard);
  // if (head == null) {
  // head = newNode;
  // tail = newNode;
  // head.setPrev(newNode);
  // tail.next = null;
  // } else {
  //
  // tail.next = newNode;
  // // newNode.prev = tail;
  // tail = newNode;
  // tail.next = null;
  // }
  // }
  //
  //
  //
  //
  //
  // public void removeNode() {
  // if (head == null) {
  // System.out.print("The doubly linked list is empty");
  // } else {
  //
  // head= head.next;
  //
  // }
  // size++;
  // }
  //
  //
  //
  // public void addToStart(T data) {
  // Node<T> newNode = new Node();
  //
  // if (isEmpty() == true) {
  // newNode = head;
  // } else {
  // newNode.setNext(head);
  // head = newNode;
  // }
  // size++;
  // }
  //
  //
  // public void addAt(int index, T data) {
  // int length = getSize();
  //
  // if (length == 0 || index <= 0) {
  // addToStart(data);
  // } else if (length <= index) {
  // addNodeEnd(data);
  // } else {
  // Node newNode = new Node();
  // Node currentNode = head;
  //
  //
  // for (int i = 0; i < index - 1; i++) {
  // currentNode = currentNode.getNext();
  // currentNode.setNext(currentNode.getNext());
  // currentNode.setNext(newNode);
  //
  // }
  //
  //
  // }
  //
  // size++;
  //
  // }
  //
  //
  //
  // public void addNodeEnd(T data) {
  // Node<T> newNode = new Node(data);
  //
  // if (isEmpty() == true) {
  // newNode = head;
  // } else {
  // tail.next = newNode;
  // tail = newNode;
  // }
  // size++;
  // }
  //
  //
  // public boolean isEmpty() {
  // Node currentNode = head;
  // if (currentNode == null) {
  // return true;
  // } else {
  // return false;
  // }
  // }
  //
  // public void removeNodeAt(int index, Node nodeToRemove) {
  //
  // int length = getSize();
  //
  // if (isEmpty() == true) {
  // System.out.println("There is no data in the list.");
  // } else if (length <= index) {
  // removeNodeEnd();
  // } else {
  // Node<T> current = head;
  //
  // while (current != null) {
  // if (current.item == nodeToRemove.item) {
  //
  // System.out.println(current.getPrev().item);
  //
  // head = head.getPrev().prev;
  // current = head;
  // break;
  // } else {
  // tail = current;
  // current = current.next;
  // }
  // }
  //
  //
  // }
  //
  // size--;
  //
  //
  // }
  //
  // public void removeNodeEnd() {
  // if (head == null) {
  // System.out.println("The list is empty ");
  //
  // }
  //
  // else {
  //
  // if (head == tail) {
  // head = null;
  // } else {
  // Node<T> temp = head;
  // Node<T> second_to_last = null;
  //
  //
  //
  // while (temp.next != null) {
  // second_to_last = temp;
  // temp = temp.next;
  // }
  // second_to_last.next = null;
  //
  // }
  // }
  //
  //
  //
  // }
  //
  //
  // public void removeNodeStart() {
  //
  //
  // if (head == null) {
  // System.out.println("The list is empty ");
  //
  // }
  //
  // else {
  //
  // if (head != tail) {
  // head = head.next;
  // head.setPrev(null);
  // } else {
  // head = tail = null;
  // }
  //
  //
  //
  // }
  // size--;
  // }
  //
  //
  // public void printNodes() {
  // Node currentNode = head;
  // if (isEmpty() == true) {
  // System.out.println("The doublylist is empty");
  // } else {
  // while (currentNode != null) {
  // System.out.println(currentNode.item + " ");
  // currentNode = currentNode.next;
  // }
  // }
  //
  //
  //
  // }
  //
  //
  // public void searchFor(T data) {
  // Node searchNode = new Node(data);
  // int counter = 0;
  // if (isEmpty() == true) {
  // System.out.println("Cannot search for " + searchNode.item + ". Please add some data.");
  // } else {
  // Node currentNode = head;
  // while (currentNode.next != null) {
  // if (currentNode == searchNode) {
  // System.out.print("The current node was found at index " + counter + ".");
  // } else {
  // currentNode = currentNode.next;
  // }
  //
  // }
  // counter++;
  // }
  // }

  public int size() {
    return size;
  }



}


