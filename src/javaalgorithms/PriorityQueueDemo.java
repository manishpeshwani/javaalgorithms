package javaalgorithms;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(5);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(2);
		
		queue.printQueue();

	}

}
