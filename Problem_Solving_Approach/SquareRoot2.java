package Problem_Solving_Approach;

import java.io.*;

public class SquareRoot2 {

	static int sqrt(int num) {
		int val = 0;
		for(int i=1; i<=num; i++) {
			if(i*i<=num) {
				val = i;
			}
		}
		return val;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Integer value: ");
		int num = Integer.parseInt(br.readLine());
		int ret = sqrt(num);
		System.out.println(ret);
	}
}
