package javaalgorithms;

public class DoublyLinkedList<T> {
	
	private Node<T> head;
	
	private Node<T> tail;
	
	private int count;
	
	public void add(T value){
		Node<T> newNode = new Node<T>(value,null, null);
		
		//If the list has no element present, then this element becomes first
		if(getCount() == 0){
			head = newNode;
			tail = head;
		}else{
			Node<T> tempNode = tail;
			tail.setNext(newNode);
			tail = newNode;
			tail.setPrevious(tempNode);
		}
		
		count++;
		
	}
	
	public void remove(int index){
		if(index < 0 || index > getCount()){
			throw new IllegalArgumentException();
		}
		
		//First element being removed
		if(index == 0){
			Node<T> temp = head;
			head = head.getNext();
			head.setPrevious(null);
		}
		
		//Last element being removed
		if(index == getCount()-1){
			Node<T> temp = tail;
			System.out.println(tail.getPrevious().getValue());
			System.out.println();
			tail.getPrevious().setNext(null);
			tail = temp.getPrevious();
		}else{
			Node<T> currentNode = head;
			for(int i=0; i<index-1; i++){
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(currentNode.getNext().getNext());
			currentNode.getNext().setPrevious(currentNode);
			
		}
		
		
		count--;
	}
	
	public void printList() {
		Node<T> currentNode = tail;
		while(currentNode != null){
			System.out.println(currentNode.getValue());
			currentNode = currentNode.getPrevious();
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
