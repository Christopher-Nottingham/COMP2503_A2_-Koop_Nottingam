package controller;



import java.util.ListIterator;


import model.Card;
import model.CardDeck;


/**
 * 
 * @author Christopher Nottingham
 *
 * @param <T> Generic Type
 */
public class DoublyLinkedList<T> {
	
	private Node<T> start; // reference to the first node of the list 
	private Node<T> end; // reference to the last node of the list //you can keep track of the current node if you want
	
	
	
	
	
	
	

	private Node<T> current;

	private Node<T> head;
	private Node<T> tail;
	private int size;

	/**
	 * DLL Constructor
	 */
	public DoublyLinkedList() {
		this.size = 0;
	}

	private T data;

	/**
	 * Adds a card to the DLL.
	 * @param nodeTobeAdded the node to be added. 
	 */
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

	/**
	 * Removes the card position.
	 * @param index index of requested position to be removed. 
	 */
	public void removeNodePostion(int index) {
		current = head;
		for(int i = 0; i < index; i++) {
			current = current.next;
		}
		
		T removalNodeData = current.item; 
		
		current.previous.next = null;
		

	}

	/**
	 * Removes a card from the DLL.
	 * @param nodeToRemove node to be removed from DLL.
	 */
	public void removeNode(Node<T> nodeToRemove) {

		T currentNodeData;

		if (getHead() == null) {
			System.out.println("The list is empty ");

		}

		else {
			if (head != tail) {
				Node<T> currentNode = head;
				Node newNode = new Node();
				while (head != null) {
					if (head.item == nodeToRemove.item) {
						// currentNode.item== nodeToRemove.item
						// Saveing the item data
						currentNodeData = currentNode.item;
						// The previous fild of the node to delete is set to current node
						newNode.previous = currentNode;

						// the next node of current node is equal to the nod
						currentNode.next = newNode.previous;

						// getting the node after the newNode
						newNode = newNode.next;

						head = head.next;
						// newNode.previous = currentNode;
						// head.next = newNode;

					} else {
						currentNode = head.next;
						head = head.next;
					}

				}

			} else {

				removeEndNode();
			}
		}
		size--;
	}

	/**
	 * Removes a card from the end of the DLL.
	 */
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
		size--;
	}

	/**
	 * Removes a card from the start of the DLL.
	 */
	public void removeStartNode() {
		if (getHead() == null) {
			System.out.println("The list is empty ");
		} else {
			head = getHead().next;
			getHead().previous.next = null;
		}
		size++;

	}

	/**
	 * Removes a card from a certain position. 
	 * @param index of the card to be removed
	 * @return the card that is removed.
	 */
	public Node removeNodeAtPosition(int index) {
		Node<T> aNode = null;
		Node<T> current = getHead();

		for (int i = 0; i < index; i++) {

			current = current.next;

		}

		Node<T> theCardToDelete = current;
		current.next.previous = null;

		size--;

		removeNode(theCardToDelete);
		return theCardToDelete;

	}

	

	/**
	 * Prints the cards.
	 */
	public void printNodes() {
		Node<T> current = getHead();
		while (current != null) {
			System.out.println(current.item);
			current = current.next;
		}
	}

	/**
	 * Adds a card to the start of the DLL.
	 * @param endNewNode Card to be added to the end.
	 */
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

	/**
	 * Adds a card to the start of the DLL.
	 * @param newNodeStart Card to be added to the start of the DLL.
	 */
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

	/**
	 * Gets a certain card
	 * @param index of the card wanted
	 * @return card to corresponding index
	 */
	public T get(int index) {

		int length = size();

		Node<T> current = getHead();
		if (index <= length && index >= 0) {
			current = getHead();
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
				data = current.item;
				System.out.println(data);
			}

		}
		return data;

	}

	/**
	 * checks the size of the DLL.
	 * @return the size of the DLL.
	 */
	public int size() {
		return size;
	}

	/**
	 * getter method used to get the Card at the top of the DLL.
	 * @return the top card. 
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * Getter method used to get the Card at the bottom of the DLL.
	 * @return the bottom Card.
	 */
	public Node getTail() {
		return tail;
	}

}



