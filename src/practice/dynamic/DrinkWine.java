package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrinkWine {

	static Integer[] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		dp = new Integer[num];
		
		for(int i=0; i<num; i++) {
			dp[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(drink(num));
	}

	public static int drink(int n) {
		
		if(n == 1) {
			return dp[0];
		}else if(n == 2){
			return dp[0]+dp[1];
		}else if(n >=3 ){
			
		}
		int sum = 0;
		sum = dp[0]+dp[1];
		dp[0]= 0; dp[1]=0;
		for(int i=2; i<=n-1; i++) {
			if(dp[i-1] == 0) {
				continue;
			}else {
				sum += dp[i]+dp[i+1];
				dp[i]=0; dp[i+1]=0;
			}
		}
		int sum2=0;
		sum2 = dp[1]+dp[2];
		dp[1]= 0; dp[2]=0;
		for(int i=3; i<=n-1; i++) {
			if(dp[i-1] == 0) {
				continue;
			}else {
				sum2 += dp[i]+dp[i+1];
				dp[i]=0; dp[i+1]=0;
			}
		}
		if(sum > sum2) {
			return sum;
		}else {
			return sum2;
		}
	}
}
