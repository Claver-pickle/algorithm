package practice.arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Least_Maximum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		int least = arr[0];
		int max = arr[0];
		
		for(int i=0; i<N; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}else if(arr[i]<least) {
				least = arr[i];
			}
		}
		
		sb.append(least).append(" ").append(max);
		
		System.out.println(sb);
	}

}
