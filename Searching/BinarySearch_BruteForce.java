//Binary Search without recursion :

package Searching;

import java.io.*;

public class BinarySearch_BruteForce {
	
	static int binarySearch(int arr[], int search) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==search) {
				return mid;
			}
			if(arr[mid]<search) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
		
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
		
		int index = binarySearch(arr,search);
		if(index==-1) {
			System.out.println("Element not found!");
		}else {
			System.out.println("ELements found at index: "+index);
		}
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
