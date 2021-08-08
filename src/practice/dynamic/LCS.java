package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		char[] ac = br.readLine().toCharArray();
		char[] bc = br.readLine().toCharArray();
		
		int length_1 = ac.length;
		int length_2 = bc.length;
		
		int[][] dp = new int[length_1+1][length_2+1];
		
		for(int i=1; i<=length_1; i++) {
			for(int j=1; j<=length_2; j++) {
				
				if(ac[i-1] == bc[j-1]) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
				
			}
		}
		
		System.out.println(dp[length_1][length_2]);
	}

}
