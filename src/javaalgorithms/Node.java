package javaalgorithms;

public class Node<T> {
	
	private Node<T> next;
	
	private Node<T> previous;
	
	private T value;
	
	public Node(){
		next = null;
		value = null;
	}
	
	public Node(T value, Node<T> nextNode){
		this.value = value;
		this.next  = nextNode;
	}
	
	public Node(T value, Node<T> nextNode, Node<T> previousNode){
		this.value = value;
		this.next  = nextNode;
		this.previous = previousNode;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	

}
