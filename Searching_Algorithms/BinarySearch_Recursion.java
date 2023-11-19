//Binary Search using recursion :

package Searching_Algorithms;
import java.io.*;

public class BinarySearch_Recursion {
	
	static int binarySearch(int arr[], int search, int start, int end) {
		 
		if(start>end) {
			return -1;
		}
		int mid = (start+end)/2;
		if(arr[mid]==search) {
			return mid;
		}
		if(arr[mid]<search) {
			return binarySearch(arr,mid+1,end,search);
		}else {
			return binarySearch(arr,start,mid-1,search);
		}	
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter Search element: ");
		int search = Integer.parseInt(br.readLine());
		int start = 0;
		int end = arr.length-1;
		int index = binarySearch(arr,search,start,end);
		if(index==-1) {
			System.out.println("Element not found!");
		}else {
			System.out.println("Elements found at index: "+index);
		}
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
