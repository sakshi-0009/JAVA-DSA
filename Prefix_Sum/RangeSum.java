package Prefix_Sum;

import java.io.*;

public class RangeSum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter start: ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter end: ");
		int end = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i=start; i<end;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
