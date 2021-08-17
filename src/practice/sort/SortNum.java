package practice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortNum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] num = new int[N];
		
		for(int i=0; i<N; i++) {
			num[i]= Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(num);
		
		for(int i=0; i<N; i++) {
			System.out.println(num[i]);
		}
		
	}

}
