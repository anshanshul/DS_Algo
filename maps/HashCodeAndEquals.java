package maps;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen pen1 =new Pen(10,"blue");
		Pen pen2 =new Pen(10,"blue");
	    System.out.println(pen1);
	    System.out.println(pen2);
//		System.out.println(pen1.equals(pen2));
	    Set<Pen>pens=new HashSet<>();
	    pens.add(pen1);
	    pens.add(pen2);
	    System.out.println(pens);

	}

}
class Pen{
	int price;
	String color;
	
	public Pen( int price, String color) {
		this.price= price;
		this.color= color;
	}
	@Override
	public boolean equals(Object obj) {
		Pen that=(Pen)obj;
		boolean isEquals=this.price==that.price&& 
				this.color.equals(that.color);
		return isEquals;
	}
	@Override
	public int hashCode() {
		return price+color.hashCode();
		
	}
	
}