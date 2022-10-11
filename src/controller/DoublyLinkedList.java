package controller;



import java.util.ListIterator;


import model.Card;
import model.CardDeck;


/**
 * 
 * @author Christopher Nottingham
 *
 * @param <T>
 */
public class DoublyLinkedList<T> {

	private Node<T> current;

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public DoublyLinkedList() {
		this.size = 0;
	}

	private T data;

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

	public void removeNodePostion(int index) {
		current = head;
		for(int i = 0; i < index; i++) {
			current = current.next;
		}
		
		T removalNodeData = current.item; 
		
		current.previous.next = null;
		

	}

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

	public void removeStartNode() {
		if (getHead() == null) {
			System.out.println("The list is empty ");
		} else {
			head = getHead().next;
			getHead().previous.next = null;
		}
		size++;

	}

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

	// return aCard;

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

	public int size() {
		return size;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

}



