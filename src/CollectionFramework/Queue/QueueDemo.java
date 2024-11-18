package CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue<Integer> que = new PriorityQueue<Integer>();
		
		que.add(2);
		que.add(600);
		que.add(700);
		que.add(50);
		que.add(40);
		que.add(30);
		que.add(1);
		que.add(5);
		que.add(11);
		que.add(8);
		que.add(3);
		
		System.out.println("PriorityQueue "+que);
		System.out.println("size "+que.size());
		System.out.println("remove1 "+que.remove());
		System.out.println("remove2 "+que.remove());
		System.out.println(que);
		
		System.out.println("poll "+que.poll());
		System.out.println("peek "+que.peek());
		
		System.out.println(que);
		

//		queue me peek mean it's show first value give
//		in queue remove me value pass krni rhti h kaun si remove krni h by default remove behaviour remove first
		
		
		
	}

}
