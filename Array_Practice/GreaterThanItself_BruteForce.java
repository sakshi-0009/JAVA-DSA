package Array_Practice;

import java.io.*;

public class GreaterThanItself_BruteForce {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("The no. of elements having at least 1 element greater than itself is : "+count);
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)