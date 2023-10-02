package Array;

import java.io.*;

public class PrintElements {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Array Elements are : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
