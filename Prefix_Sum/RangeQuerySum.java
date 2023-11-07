package Prefix_Sum;

import java.io.*;

public class RangeQuerySum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Query: ");
		int Query = Integer.parseInt(br.readLine());
		for(int i=1; i<=Query; i++) {
			System.out.println("Enter array size : ");
			int size = Integer.parseInt(br.readLine());
			int arr[] = new int[size];
			
			System.out.println("Enter array elements : ");
			for(int j=0; j<arr.length; j++) {
				arr[j] = Integer.parseInt(br.readLine());
			}
			System.out.println("Enter start: ");
			int start = Integer.parseInt(br.readLine());
			System.out.println("Enter end: ");
			int end = Integer.parseInt(br.readLine());
			
			int sum = 0;
			for(int j=start; j<end; j++) {
				sum = sum+arr[j];
			}
			System.out.println(sum);
		}
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)
