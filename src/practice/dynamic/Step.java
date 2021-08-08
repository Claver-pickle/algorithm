package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step {

	static Integer dp[];
	static int stair[];
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		dp =  new Integer[num+1];
		stair = new int[num+1];
		
		for(int i=1; i<=num; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = stair[0];
		dp[1] = stair[1];
		
		if(num >= 2) {
			dp[2] = stair[1]+ stair[2];
		}
		
		System.out.println(find(num));
	}
	
	public static int find(int n) {
		if(dp[n] == null) {
			dp[n]= Math.max(find(n-2), find(n-3)+ stair[n-1])+stair[n];
		}
		return dp[n];
	}

}
