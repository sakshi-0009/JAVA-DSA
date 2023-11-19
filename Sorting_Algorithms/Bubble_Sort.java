package Sorting_Algorithms;

public class Bubble_Sort {

	public static void main(String[] args) {
		int arr[] = new int[]{7,3,9,4,2,5,6};
		int itr = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				itr++;
				if(arr[j]>arr[j+1]) {
					//swap:
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Iterations: "+itr); 	//Number of iterations: 42 (condition : j<arr.length-1)
	}
}
//Time complexity : O(N^2)
//Space complexity : O(1)
