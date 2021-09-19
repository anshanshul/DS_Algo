//Q1  Find sum of first N natural number using recursion

package recursion;

public class MainClass {
	static int stepCount=0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(sum(15));
//		System.out.println(pow(3,5));
//		System.out.println("Steps " + stepCount);
//		System.out.println(fastPow(3,10000));
//		System.out.println("Steps " + stepCount);
		System.out.println(path(4,4));
	}
	static int sum(int n) {
		if(n==1) {
			return 1;
			
		}
		return n+sum(n-1);
		
	}
//	Q2 Calculate power using recursion a^b.+ Fast power
	static int pow(int a,int b) {
		stepCount++;
		
		if(b==0) { 
			return 1;
		}
		
		return a*pow(a,b-1);
	}
	static int fastPow(int a, int b) {
		System.out.println(b);
		stepCount++;
		
		if(b==0) {
			return 1;
			
		}
		if(b%2==0) {
			return fastPow(a*a,b/2);
			
		}
		return a*fastPow(a,b-1);
		
	}
//Q3	 path find out
	
	static int path(int n ,int m) {
		if(n==1|m==1) return 1;
		return path(n,m-1)+path(m,n-1);
	}

}
