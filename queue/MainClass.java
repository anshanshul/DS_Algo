package queue;


import java.util.Queue;

public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer> mq=new MyQueue<>();
		mq.enqueue(24);
		mq.enqueue(2);
		mq.enqueue(123);
		mq.enqueue(45);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(451);
		System.out.println(mq.dequeue());
	
	

	
		
		


		
		

	}

}
