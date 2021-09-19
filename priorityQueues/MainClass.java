package priorityQueues;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		pq.add(45);
		pq.add(15);
		pq.add(100);
		pq.add(95);
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		
	}

}
