package Array_Leetcode;

import java.io.*;

public class Two_Sum {
	public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int leftNumber = numbers[left];
            int rightNumber = numbers[right];
            
            if (leftNumber + rightNumber == target) {
                return new int[]{left + 1, right + 1};
            } else if (leftNumber + rightNumber < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter target : ");
		int target = Integer.parseInt(br.readLine());
		int[] result = twoSum(arr, target);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("No such pair found.");
        } else {
            System.out.println("Indices of the pair that sums up to the target: " + result[0] + ", " + result[1]);
        }	}

}
