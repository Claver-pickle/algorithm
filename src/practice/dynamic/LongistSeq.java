package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongistSeq {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		int[] memo = new int[N];
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a," ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=0; i<N; i++) {
			memo[i] = 1;
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[i] && memo[i]<memo[j]+1) {
					memo[i] = memo[j]+1;
				}
			}
		}
		int max = -1;
		for(int i=0; i<N; i++) {
			max= arr[i]>max? memo[i]:max;
		}
		System.out.println(max);
		
	}

}
