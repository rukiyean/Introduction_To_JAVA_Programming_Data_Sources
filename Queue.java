package Bolum10;

public class Queue {
   private int[] elements;
   private int size;
   public static final int DEFAULT_CAPACITY = 8;
   
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		for(int i=1;i<20;i++)	
				queue.enqueue(i);
		
		 System.out.print("Queue elements in order: ");
	        while (!queue.empty()) 
	            System.out.print(queue.dequeue() + " ");
	      
	}
	public Queue() {
		 this(DEFAULT_CAPACITY);
	}

	public Queue(int capacity) {
		 elements = new int[capacity];
	}
	
	
	public void enqueue(int v) {
		 if (size >= elements.length) {
			 int[] temp = new int[elements.length * 2];
			 System.arraycopy(elements, 0, temp, 0, elements.length);
			 elements = temp;
		 }
		 elements[size++] = v;
	}
	
	public int dequeue()
	{
		 if (empty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        int removed = elements[0];
	        for (int i = 1; i < size; i++) {
	            elements[i - 1] = elements[i];
	        }
	        size--;
	        return removed;
	}
	
	
	public boolean empty() {
		 return size == 0;
	 }
	
	public int getSize() {
		return size;
	}
}
