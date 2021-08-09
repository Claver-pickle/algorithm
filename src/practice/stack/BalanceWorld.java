package practice.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalanceWorld {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		StringBuilder sb = new StringBuilder();
		
		String a = "";
		
		while(true) {
			
			a = br.readLine();
			if(a.equals(".")) {
				break;
			}

			sb.append(check(a)).append('\n');
		}
		
		System.out.println(sb);
		
	}

	private static String check(String a) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<a.length(); i++) {
			
			char c = a.charAt(i);
			
			if(c == '(' || c == '[') {
				stack.push(c);
				
			}else if(c == ')') {
				
				if(stack.isEmpty() || stack.peek() != '(') {
					return "no";
				}else {
					stack.pop();
				}
			}else if(c == ']') {
				
				if(stack.isEmpty() || stack.peek() != '[') {
					return "no";
				}else {
					stack.pop();
				}
			}
		}
		
		if(stack.empty()) {
			return "yes";
		}else {
			return "no";
		}
	}

}
