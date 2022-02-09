package Recursion;

public class FibonacciRecursion {

	public static void main(String[] args) {
		
		long result = fiboCal(5);
		System.out.println(result);

	}
	
	public static long fiboCal(int n) {
		
		if(n<=1) {
			return n;
		}
		else {
			return fiboCal(n-1) + fiboCal(n-2);
		}
	}

}
