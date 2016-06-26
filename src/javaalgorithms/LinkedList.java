package javaalgorithms;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int count;
	
	public LinkedList(){
		head = tail;
		count = 0;
	}
	
	public void add(T value){
		Node<T> newNode = new Node<T>();
		newNode.setValue(value);
		
		if(count == 0){
			head = newNode;
			tail = head;
		}else {
			Node<T> tempNode = tail;
			tail.setNext(newNode);
			tail = newNode;
		}
		
		count++;
	}
	
	public void remove(int index){
		if(index >= count){
			throw new IllegalArgumentException();
		}
		
		if(index == 0){
			head = null;
		}else if(index == count-1){
			Node<T> currentNode = head;
			for(int i=0; i< index-1; i++){
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(null);
		}else{
			Node<T> currentNode = head;
			for(int i=0; i< index; i++){
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(currentNode.getNext().getNext());
		}
		
		count--;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	public void printList() {
		Node<T> currentNode = head;
		while(currentNode != null){
			System.out.println(currentNode.getValue());
			currentNode = currentNode.getNext();
		}
	}
	
	
	
}
