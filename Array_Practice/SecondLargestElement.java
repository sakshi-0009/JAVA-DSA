package Array_Practice;

import java.io.*;

public class SecondLargestElement {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = Integer.MIN_VALUE;
		int sec_max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				sec_max = max;
				max = arr[i];
			}
			if(arr[i]>sec_max && arr[i]!= max) {
				sec_max = arr[i];
			}
		}
		System.out.println("Second maximum element: "+sec_max);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)