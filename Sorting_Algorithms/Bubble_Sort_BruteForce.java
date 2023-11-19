package Sorting_Algorithms;

public class Bubble_Sort_BruteForce {

	public static void main(String[] args) {
		int arr[] = new int[] {7,3,9,4,2,5,6};
//		int arr[] = new int[] {2,3,4,5,6,9,7};
		int itr = 0;
		for(int i=0; i<arr.length;i++){
			boolean swapped = false;
			for(int j=0; j<arr.length-i-1; j++) {
				itr++;
				if(arr[j]>arr[j+1]) {
					//swap:
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Iterations: "+itr);
	}
}
//Time complexity : O(N^2)
//Space complexity : O(1)