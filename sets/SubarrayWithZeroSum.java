package sets;
import java .util.*;

/*
 *  given an array , find if there exits a subarray with sum equals to zero
 * n<10^5
 */
public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,1,3,-4,-2};
		int k=-3;                 
		boolean found=false;
////		 for(int i=0;i<a.length;i++) {
////			 int sum =0;
////			 for(int k=i;k<a.length ;k++) {
////				 sum+= a[k];
////				 if(sum==0) {
////					 found= true;
////					 break;
////					 
////				 }
////			 }
////			 if(found) break;
////			 
//		 }
		
		//// time complexitiy O(n)
		
		Set<Integer>set=new HashSet<>();
		int sum=0;
		for(int  element:a) {
			set.add(sum);
			sum+= element;
			if(set.contains(sum - k )) {
				found =true;
				break;
				
			}
		}
		 
		 System.out.println("found " + found);
		

	}

}
