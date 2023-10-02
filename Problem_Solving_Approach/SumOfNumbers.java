// Optimised Approach

package Problem_Solving_Approach;

import java.io.*;

public class SumOfNumbers {

	static int Sum(int n) {
		return (n*(n+1)/2);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Integer Value : ");
		int num = Integer.parseInt(br.readLine());
		int ret = Sum(num);
		System.out.println("Sum upto "+num+" is = "+ret);
	}
}
