package Problem_Solving_Approach;

import java.io.*;

public class SquareRoot3 {

	static int sqrt(int num) {
		int start = 1;
		int end = num;
		int ans = 0;
		int itr = 0;
		while(start<=end) {
			itr++;
			int mid = (start+end)/2;
			int sqr = mid*mid;
			if(sqr==num) {
				System.out.println(itr);
				return mid;
			}
			if(sqr>num) {
				end = mid-1;
			}else {
				ans = mid;
				start = mid+1;
			}
		}
		System.out.println(itr);
		return ans;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Integer Value : ");
		int num = Integer.parseInt(br.readLine());
		int ret = sqrt(num);
		System.out.println(ret);
	}
}
