package javaalgorithms;

public class Queue {
	
	int[] queue = new int[0];
	
	int head = 0;
	int tail = -1;
	int size = 0;
	
	public void enqueue(int value){
		//If the queue is full then create a new array and copy the items
		if(queue.length == size){
			int size = (queue.length == 0) ? 5 : queue.length*2;
			int[] newQueue = new int[size];
			
			//if the tail index is less than head index then copy from head to the end of the array first 
			//and then from first element to the tail element
			if(tail < head){
				int currentIndex = 0;
				for(int i=head; i<queue.length -1; i++){
					newQueue[currentIndex] = queue[i];
					currentIndex++;
				}
				
				for(int i=0; i<tail; i++){
					newQueue[currentIndex] = queue[i];
					currentIndex++;
				}
				
				head = 0; 
				tail = currentIndex;
				
			}else{
				int currentIndex = 0;
				for(int i=head; i<tail; i++){
					newQueue[currentIndex] = queue[i];
					currentIndex++;
				}
				
				head = 0; 
				tail = currentIndex;
			}
			
			queue = newQueue;
			
			
		}//Now the new expanded queue is ready
		
		if(tail < queue.length && size < queue.length){
			queue[tail++] = value;
			size++;
		}else{
			tail = 0;
			queue[tail] = value;
			size++;
		}
		
	}
	
	public int dequeue(){
		if(queue.length == 0){
			return 0;
		}
		int value = queue[head];
		queue[head] = 0;
		
		if(head == queue.length -1){
			head = 0;
		}else{
			head++;
		}
		
		size--;
		return value;
		
	}
	
	public void printQueue(){
		for(int i=0; i<queue.length; i++ ){
			System.out.println(queue[i]);
		}
	}

}
