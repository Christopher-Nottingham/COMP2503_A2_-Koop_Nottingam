package controller;



import java.util.ListIterator;


class Node<T> {



  T item;
  Node prev = null;
  Node next = null;

  public Node() {

  }

  public Node(T item) {
    this.item = item;

  }



  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return next;
  }



}


public class DoublyLinkedList<T> {
  Node<T> head = null;
  Node<T> tail = null;
  private int size;

  public DoublyLinkedList() {
    this.size = 0;
  }


  public void addNode(T item) {
    
    Node newNode = new Node(item);
    if (head == null) {
      head = newNode;
      tail = newNode;
      head.prev = newNode;
      tail.next = null;
    } else {

      tail.next = newNode;
      // newNode.prev = tail;
      tail = newNode;
      tail.next = null;
    }
    }
    
  



  public void removeNode() {
    if (head == null) {
      System.out.print("The doubly linked list is empty");
    } else {
      
      head= head.next;

    }
    size++;
  }



  public void addToStart(T data) {
    Node<T> newNode = new Node();

    if (isEmpty() == true) {
      newNode = head;
    } else {
      newNode.setNext(head);
      head = newNode;
    }
    size++;
  }


  public void addAt(int index, T data) {
    int length = getSize();

    if (length == 0 || index <= 0) {
      addToStart(data);
    } else if (length <= index) {
      addNodeEnd(data);
    } else {
      Node newNode = new Node();
      Node currentNode = head;


      for (int i = 0; i < index - 1; i++) {
        currentNode = currentNode.getNext();
        currentNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);

      }


    }

    size++;

  }



  public void addNodeEnd(T data) {
    Node<T> newNode = new Node(data);

    if (isEmpty() == true) {
      newNode = head;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }


  public boolean isEmpty() {
    Node currentNode = head;
    if (currentNode == null) {
      return true;
    } else {
      return false;
    }
  }

  public void removeNodeAt(int index, Node nodeToRemove) {

    int length = getSize();

    if (isEmpty() == true) {
      System.out.println("There is no data in the list.");
    } else if (length <= index) {
      removeNodeEnd();
    } else {
      Node<T> current = head;

      while (current != null) {
        if (current.item == nodeToRemove.item) {

          System.out.println(current.prev.item);

          head = head.prev.prev;
          current = head;
          break;
        } else {
          tail = current;
          current = current.next;
        }
      }


    }

    size--;


  }

  public void removeNodeEnd() {
    if (head == null) {
      System.out.println("The list is empty ");

    }

    else {

      if (head == tail) {
        head = null;
      } else {
        Node<T> temp = head;
        Node<T> second_to_last = null;



        while (temp.next != null) {
          second_to_last = temp;
          temp = temp.next;
        }
        second_to_last.next = null;
        // while (temp.next.next!=null) {
        // temp=temp.next;
        // }
        // temp.next=null;
        // head=head.prev.getNext();
        // tail=tail.prev.getNext();
        // tail = tail.prev.next= null;
      }
    }



  }


  public void removeNodeStart() {


    if (head == null) {
      System.out.println("The list is empty ");

    }

    else {

      if (head != tail) {
        head = head.next;
        head.prev = null;
      } else {
        head = tail = null;
      }



    }
    size--;
  }
  //
  // public void removeNodeMiddle(Node nodeToRemove) {
  // Node current = nodeToRemove;
  // }
  //
  // public int size() {
  // Node aNode = head;
  // int counter = 0;
  // while (aNode != null) {
  // counter++;
  // break;
  // }
  // System.out.println(counter);
  // return counter;
  //
  // }

  public void printNodes() {
    Node currentNode = head;
    if (isEmpty() == true) {
      System.out.println("The doublylist is empty");
    } else {
      while (currentNode != null) {
        System.out.println(currentNode.item + " ");
        currentNode = currentNode.next;
      }
    }



  }


  public void searchFor(T data) {
    Node searchNode = new Node(data);
    int counter = 0;
    if (isEmpty() == true) {
      System.out.println("Cannot search for " + searchNode.item + ". Please add some data.");
    } else {
      Node currentNode = head;
      while (currentNode.next != null) {
        if (currentNode == searchNode) {
          System.out.print("The current node was found at index " + counter + ".");
        } else {
          currentNode = currentNode.next;
        }

      }
      counter++;
    }
  }

  public int getSize() {
    return size;
  }



}

