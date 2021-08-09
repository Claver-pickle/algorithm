package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SeqSum {

	static int[] arr;
	static Integer[] dp;
	static int max;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a);
		
		arr = new int[cnt];
		dp = new Integer[cnt];
		
		for(int i=0;i<cnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		max = arr[0];
		
		recur(cnt-1);
		
		System.out.println(max);
		
	}

	private static Integer recur(int i) {
		
		if(dp[i] == null) {
			dp[i] = Math.max(recur(i - 1) + arr[i], arr[i]);
			
			max = Math.max(dp[i], max);
		}
		
		return dp[i];
	}

}
