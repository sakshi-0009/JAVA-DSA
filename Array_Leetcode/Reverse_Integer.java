package Array_Leetcode;

import java.io.*;

public class Reverse_Integer {

	static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev;
    }
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number : ");
        int num = Integer.parseInt(br.readLine());
        int result = reverse(num);
        System.out.println("Reversed number is : "+result);
    }
}
