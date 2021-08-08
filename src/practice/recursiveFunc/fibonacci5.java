package practice.recursiveFunc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci5 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(pivot(num));
	}
	
	public static int pivot(int n) {
		int[] list = new int[n+1];
		list[0] = 0;
		if(n>0) {
			list[1] = 1;
		}
		for(int i=2; i<n+1; i++) {
			list[i] = list[i-2]+list[i-1];
		}
		
		return list[n];
	}

}
