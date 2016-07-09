package javaalgorithms;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		System.out.println("Size::" + linkedList.getCount());
		linkedList.add(2);
		System.out.println("Size::" + linkedList.getCount());
		linkedList.add(3);		
		System.out.println("Size::" + linkedList.getCount());
		
		linkedList.printList();
		
		linkedList.remove(1);
		
		System.out.println("Size::" + linkedList.getCount());
		linkedList.printList();
		
		linkedList.remove(1);
		
		linkedList.printList();
		
		System.out.println("Size::" + linkedList.getCount());
		
		linkedList.remove(0);
		
		linkedList.printList();
		
		System.out.println("Size::" + linkedList.getCount());
		
		//Test removing node from middle
		
		linkedList.add(9);
		linkedList.add(19);
		linkedList.add(29);
		
		System.out.println("Size::" + linkedList.getCount());
		
		linkedList.printList();
		
		//Remove the 2nd element from the list
		linkedList.remove(1);
		
		//Check the remaining elements
		linkedList.printList();
		

	}

}
