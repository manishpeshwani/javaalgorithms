package javaalgorithms;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add(3);
		
		doublyLinkedList.add(5);
		doublyLinkedList.add(7);
		doublyLinkedList.add(9);
		
		//doublyLinkedList.printList();
		System.out.println(doublyLinkedList.getCount());
		System.out.println();
		doublyLinkedList.printList();
		
		
		doublyLinkedList.remove(1);
		
		System.out.println();
		doublyLinkedList.printList();
		
		System.out.println();
		
		doublyLinkedList.remove(2);
		
		doublyLinkedList.printList();
		System.out.println(doublyLinkedList.getCount());

	}

}
