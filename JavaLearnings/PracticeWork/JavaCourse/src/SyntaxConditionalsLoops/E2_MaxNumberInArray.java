
package SyntaxConditionalsLoops;

public class E2_MaxNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,55,88,662,63,6,4,2};
		
		int max = arr[0];
		
		for(int i =1; i<arr.length;i++) {
			if(arr[i]>max) {
				max= arr[i];
				
			}
		}
		System.out.println(max + " Is the maximum of the array");

	}

}
