package Recursion;
/*
 * Till here he have seen so called iterative approach 
 * In order to achieve iteration(Repeating things multiple times) we use loops
 * So what is recursion, a programming technique like iteration where function calls itself recursively
 * 
 * A function calling itself is known as recursion 
 * Here in recursion we describe actions to be repeated using a methods that calls itself
 * 
 * 
 */
public class RecursionTheory {

	public static void main(String[] args) {//Main method
		
		SayHello(3);

	}
	
	//Recursive method
	public static void SayHello(int n) {
		if(n==0) {
			System.out.println();
		}else {
			System.out.println("Hello world");
			//Calling myself
			SayHello(n-1);//Defining (increment/decrement) is very important for recursive flow control
		}
		
	}

}
