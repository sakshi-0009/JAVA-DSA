package Prefix_Sum;
import java.io.*;
public class Prefix_Sum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter array size: ");
//		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[]{1,2,3,4,5};
		
//		System.out.println("Enter array elements: ");
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
		int N = arr.length;
		System.out.println("Enter Queries: ");
		int Query = Integer.parseInt(br.readLine());
		int psArr[] = new int[N];
		psArr[0] = arr[0];
		for(int i=1; i<N; i++) {
			psArr[i] = psArr[i-1]+arr[i];
		}
		int sum = 0;
		for(int i=1; i<=Query; i++) {
			int start = Integer.parseInt(br.readLine());
			int end = Integer.parseInt(br.readLine());
			if(start==0) {
				sum = psArr[end];
			}else {
				sum = psArr[end] - psArr[end-1];
			}
			System.out.println(sum);
		}
	}
}
