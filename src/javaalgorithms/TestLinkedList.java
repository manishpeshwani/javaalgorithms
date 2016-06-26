package javaalgorithms;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
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
		
		//linkedList.remove(5);

	}

}
