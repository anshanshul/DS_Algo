package sets;
import java .util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String>fruits=new TreeSet<>();
//		 fruits.add("Banana");
//		 fruits.add("Apple");
//		 fruits.add("Kiwi");
		
		
		Set<Integer>x=new HashSet<>();
		x.add(12);
		x.add(1);
		x.add(18);
		Set<Integer>y=new HashSet<>();
		 y.add(3);
		 y.add(1);
		 y.add(16);
		 
		 System.out.println(x.containsAll(y));
		 System.out.println(x);

	}

}
