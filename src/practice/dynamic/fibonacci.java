package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci {

	static int[] zero = new int[41];
	static int[] one = new int[41];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		zero[0] = 1;
		one[0] = 0;
		zero[1] = 0;
		one[1] = 1;
		
		
		for(int i=2; i<41; i++) {
			zero[i] = zero[i-2]+zero[i-1];
			one[i] = one[i-2]+one[i-1];
		}
		for(int i=0; i<cnt; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(zero[num]+" "+one[num]);
		}
		br.close();
		
	}

}
