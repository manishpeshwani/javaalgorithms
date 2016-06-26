package javaalgorithms;

public class Node<T> {
	
	private Node<T> next;
	
	private T value;
	
	public Node(){
		next = null;
		value = null;
	}
	
	public Node(T value, Node<T> nextNode){
		this.value = value;
		this.next  = nextNode;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	

}
