package SyntaxConditionalsLoops;

public class E2_ReversingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,5,6,4,8};
		
		for(int i=0;i<arr.length/2;i++) {
			int temp = arr[i];
			
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
			
			
		}
		System.out.println(arr);

	}
	

}
