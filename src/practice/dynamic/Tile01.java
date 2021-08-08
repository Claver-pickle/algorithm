package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile01 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int N = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		System.out.println(tile(N));
	}

	
	public static int tile(int num) {
		
		if(num == 1) {
			return 1;
		}
		if(num == 2) {
			return 2;
		}
		
		int val1 = 1;
		int val2 = 2;
		int sum =0;
		
		for(int i=2; i<num; i++) {
			sum = (val2+val1)%15746;
			val1 = val2;
			val2 = sum;
		}
		return sum;
	}
	
}
