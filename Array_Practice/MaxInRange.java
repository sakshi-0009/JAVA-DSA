package Array_Practice;

import java.io.*;

public class MaxInRange {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter range : ");
		int Range = Integer.parseInt(br.readLine());
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<=Range; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element upto given range is : "+max);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
