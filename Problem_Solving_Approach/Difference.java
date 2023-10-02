// Optimised Approach

package Problem_Solving_Approach;

import java.io.*;

public class Difference {

	static int Diff(int num1, int num2) {
		return ((num2-num1)+1);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter num1 Value : ");
		int n1 = Integer.parseInt(br.readLine());
		System.out.println("Enter num2 Value : ");
		int n2 = Integer.parseInt(br.readLine());
		
		int ret = Diff(n1,n2);
		System.out.println("Difference between "+n1+" and "+n2+" including them is : "+ret);
	}
}
