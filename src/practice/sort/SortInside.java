package practice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortInside {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		Integer[] arr = new Integer[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			String a = String.valueOf(s.charAt(i));
			arr[i] = Integer.parseInt(a);
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
		}

		System.out.println(sb);
	}

}
