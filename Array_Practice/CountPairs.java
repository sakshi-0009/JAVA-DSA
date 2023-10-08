package Array_Practice;

import java.io.*;

public class CountPairs {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter sum : ");
		int sum = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i!=j) {
					if(arr[i]+arr[j]==sum) {
						count++;
					}
				}
			}
		}
		System.out.println("Count of Pairs : "+count);
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)