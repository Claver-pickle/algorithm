package practice.recursiveFunc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int i = Integer.parseInt(br.readLine());
//		int sum = 1;
//		
//		while(n >=0 || n<=12) {
//			if(n == 0) {
//				sum *= 1;
//				break;
//			}else{
//				sum *= n;
//				n = n-1;
//			}
//		}
//		System.out.println(sum);
		
		System.out.println(factorial(i));
	}
	
	
	public static int factorial(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
}