package Sorting_Algorithms;

public class Bubble_Sort_Recursion {

	static int count = 0;
	static void bubbleSort(int arr[], int n) {
		if(n==1) {
			return;
		}
		boolean swapped = false;
		for(int j=0; j<n-1; j++) {
			count++;
			if(arr[j]> arr[j+1]) {
				//swap: 
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
				swapped = true;
			}
		}
		if(swapped==false) {
			return;
		}
		bubbleSort(arr,n-1);
	}
	public static void main(String[] args) {
		int arr[] = new int[] {2,3,4,5,6,9,7};
		bubbleSort(arr,arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(count);
	}
}
//Time complexity : O(N)
//Space complexity : O(1)
