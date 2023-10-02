package Array;

import java.io.*;

public class GreaterThanItself_Optimized {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int N = arr.length;
		int count = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<N; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		for(int i=0; i<N; i++) {
			if(arr[i]==max) {
				count++;
			}
		}
		System.out.println("The no. of elements having at least 1 element greater than itself is : "+(N-count));
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)