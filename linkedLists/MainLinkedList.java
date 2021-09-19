package linkedLists;
 import java.util.*;
public class MainLinkedList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> ll =new LinkedList<>();   // LinkedList interface
//		List<Integer>al=new ArrayList<>();
//		
//		getTimeDiff(al);
//		getTimeDiff(ll);
//		
//		ll.add(12);  
//		ll.add(2);
//		ll.add(32);
//		
//		ll.set(2,14);
		
//		System.out.println(ll); 
		

//	}
//	static  void getTimeDiff(List<Integer>list) {
//		long start=System.currentTimeMillis();
//		
//		
//		for( int i=0; i<100000;i++) {
//			list.add(0,i);
//			
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(list.getClass().getName()+ "--> " +(end-start));
//		
//	}
//
//}
		
		MyLinkedList<String> myLL= new MyLinkedList();
		
//		myLL.add(24);
//		myLL.add(45);
		for(int i=0;i<10;i++) {
			myLL.add(i + " added ");
		}
		myLL.print();
		 
		
}
}