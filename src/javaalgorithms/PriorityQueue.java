package javaalgorithms;

public class PriorityQueue<T extends Comparable> {
	private java.util.LinkedList<T> queue = new java.util.LinkedList<T>();
	
	public void enqueue(T value){
		if(queue.size() == 0){
			queue.addLast(value);
		}else{
			
			T existingValue = queue.getFirst();
			
			//Index where new value will be inserted
			int index = 0;
			
			while(index<queue.size()){
				if(existingValue.compareTo(value)<0){
					break;
				}
				
				
				existingValue = queue.get(index);
				index++;
			}
			
			queue.add(index, value);
			
			
		}
		
		
	}
	
	public void printQueue(){
		System.out.println(queue);
	}
}
