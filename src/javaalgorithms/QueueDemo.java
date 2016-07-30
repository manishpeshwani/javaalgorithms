package javaalgorithms;

public class QueueDemo {
	public static void main(String[] args){
		Queue queue = new Queue();
		queue.enqueue(9);
		queue.enqueue(5);
		queue.enqueue(4);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		System.out.println("Printing queue" );
		queue.printQueue();
		
		System.out.println("Dequeueing...");
		queue.dequeue();
		
		System.out.println("Printing queue" );
		queue.printQueue();
		
		System.out.println("Dequeueing...");
		queue.dequeue();
		System.out.println("Dequeueing...");
		queue.dequeue();
		System.out.println("Dequeueing...");
		queue.dequeue();
		System.out.println("Dequeueing...");
		queue.dequeue();
		System.out.println("Dequeueing...");
		queue.dequeue();
		System.out.println("Enquue...");
		queue.enqueue(100);
		queue.enqueue(100);
		queue.enqueue(100);
		queue.enqueue(100);
		queue.enqueue(100);
		queue.enqueue(100);
		queue.enqueue(100);
		queue.enqueue(100);
		queue.enqueue(100);
		queue.enqueue(100);
		queue.enqueue(100);
		
		
		System.out.println("Printing queue" );
		queue.printQueue();
		
		

		
		
	}
}
