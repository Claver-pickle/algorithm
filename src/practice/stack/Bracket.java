package practice.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		Stack<String> stack = new Stack<String>();
		
		while(size --> 0) {
			sb.append(solve(br.readLine())).append('\n');
		}
		
		System.out.println(sb);
		
	}

	private static String solve(String readLine) {
		
		int count = 0;
		
		for (char c : readLine.toCharArray()) {
			if(c == '(') {
				count++;
			}else if(count == 0) {
				return "NO";
			}else {
				count--;
			}
		}
		
		if(count == 0) {
			return "YES";
		}else {
			return "NO";
		}
	}

	

}
