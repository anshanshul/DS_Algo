package vectorAndStacks;




public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Vector<Integer> v=new Vector();
//		 v.add(21);
//		 System.out.println(v);
		
		MyStack<Integer>s=new MyStack<>();
		
		s.push(24);
		s.push(45);
		s.push(54);
		
		int popped= s.pop();
		System.out.println(popped);
		 
		 
		int peeked=s.peek();
		System.out.println(peeked);
		
	}
}
		 