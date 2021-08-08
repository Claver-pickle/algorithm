package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeOne {
	static Integer[] list = new Integer[100001];

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(recur(num,0));
		
	}

	
//	public static int recur(int n) {
//		if(list[n] == null) {
//			if(n%6 == 0) {
//				list[n] = Math.min(recur(n-1), Math.min(recur(n/3), recur(n/2)))+1;
//			}else if(n%3 == 0) {
//				list[n] = Math.min(recur(n/3), recur(n/2))+1;
//			}else if(n%2 == 0) {
//				list[n] = Math.min(recur(n/2), recur(n-1))+1;
//			}
//			else {
//				list[n] = recur(n-1)+1;
//			}
//		}
//		return list[n];
//	}
	
	public static int recur(int n, int cnt) {
		if(n<2) {
			return cnt;
		}
		return Math.min(recur(n / 2, cnt + 1 + (n % 2)), recur(n / 3, cnt + 1 + (n % 3)));
	}
}
