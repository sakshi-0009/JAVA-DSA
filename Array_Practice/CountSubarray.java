//WAP to count number of subarrays : 

package Array_Practice;
import java.io.*;
public class CountSubarray {

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
			for(int j=i; j<arr.length; j++) {
				count++;
			}
		}
		System.out.println("Count of subarrays in given array : "+count);
	}
}
//Time complexity : O(N^2)
//Space Complexity : O(1)