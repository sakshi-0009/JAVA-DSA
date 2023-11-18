package Array_Leetcode;

import java.io.*;

public class Two_Sum {
	public static int[] twoSum(int[] nums, int target) {
        int[] arr = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size : ");
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter target : ");
        int target = Integer.parseInt(br.readLine());
        int[] result = twoSum(arr, target);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("No such pair found.");
        } else {
            System.out.println("Indices of the pair: " + result[0] + ", " + result[1]);
        }
    }
}
