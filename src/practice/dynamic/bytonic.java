package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bytonic {
	
	static int len;
	static int[] list;
	static int[] list2;
	static int[] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		len = Integer.parseInt(br.readLine());
		
		list = new int[len]; //오름차순
		list2 = new int[len]; //내림차순
		dp = new int[len];
		
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a);
		
		for(int i=0; i<len; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		list();
		list2();
		
		int max = 0;
		for(int i=0; i<len; i++) {
			if(max < list[i]+list2[i]) {
				max = list[i]+list2[i];
			}
		}
		
		System.out.println(max-1);
		
	}
	
	static void list() {
		for(int i=0; i<len; i++) {
			list[i]=1;
			
			for(int j=0; j<i; j++) {
				
				if(dp[j]<dp[i]&&list[i]<list[j]+1) {
					list[i]= list[j]+1;
				}
			}
		}
	}

	static void list2() {
		for(int i=len-1; i>=0; i--) {
			list2[i] = 1;
			for(int j=len-1; j>i; j--) {
				
				if(list[j]<list[i] && dp[i]<dp[j]+1) {
					dp[i] = dp[j]+1;
				}
			}
		}
	}
}
