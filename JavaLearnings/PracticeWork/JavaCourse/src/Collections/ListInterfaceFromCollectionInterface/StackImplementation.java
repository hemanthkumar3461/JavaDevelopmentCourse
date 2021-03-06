package Collections.ListInterfaceFromCollectionInterface;
//Iterable -> Collection -> List -> Linkedlist -> Stack
import java.util.Stack;

public class StackImplementation {

	public static void main(String[] args) {
		//Stack is ordered collection that allows us adding and removing last element.
		//Stack follows LIFO principle
		String[] arr = {"hemanth","hanish","hanny","jun"};
		Stack<String> stack = new Stack();
		//Adding data into stack
		for(String str: arr) {
			stack.push(str);
		}
		
		//Adding behaviours to stack
		System.out.println("Stack: " + stack);
		System.out.println("Stack: " + stack.size());
		System.out.println("Stack: " + stack.peek());
		//System.out.println("Stack: " + stack);

		
		//Removing elements from stack
		stack.remove(1);
		System.out.println(stack);
		
		
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop() + " ");
		}
		System.out.println(" ");
	}

}
