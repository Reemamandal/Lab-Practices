package day20_25th_june;
import java.util.*;

public class QueueEx {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("first");
		queue.offer("second");
		queue.offer("third");
        System.out.println(queue);
	
		/* System.out.println(queue.poll()); // Output: first
		 System.out.println(queue.poll()); 
		 System.out.println(queue.poll());
		 System.out.println(queue.poll());//null*/
		
		
		 System.out.println(queue.remove()); // Output: first
		 System.out.println(queue.remove()); 
		 System.out.println(queue.remove());
		 //System.out.println(queue.remove()); //exception
		 	
        System.out.println(queue.peek()); // Output: second

	}


}
