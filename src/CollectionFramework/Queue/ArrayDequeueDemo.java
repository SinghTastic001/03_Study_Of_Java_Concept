package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {
	
	public static void main(String[] args) {
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.add(1);
		deque.add(500);
		deque.add(400);
		deque.add(300);
		deque.add(200);
		deque.add(5);
		deque.add(3);
		deque.add(2);
		deque.add(1000);
		deque.add(5000);
		deque.add(4000);
		
		System.out.println("Dequeue "+deque);
		System.out.println("Dequeue size "+deque.size());	
		System.out.println("Dequeue remove"+deque.remove());
		System.out.println("Dequeue fistremove"+deque.removeFirst());
		System.out.println("Dequeue lastremove "+deque.removeLast());
		System.out.println("peek first"+deque.peekFirst());
		System.out.println("peek last"+deque.peekLast());
		
		System.out.println("poll first "+deque.pollFirst());
		System.out.println("poll last "+deque.pollLast());
		
		System.out.println(deque);
		
		
		
	}

}
