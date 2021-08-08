package practice.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<cnt; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a>0) {
				stack.add(a);
			}else {
				stack.pop();
			}
		}
		System.out.println("stack : "+ stack);
		int sum = 0;
		if(stack.size()>0) {
			for(int i=0; i<stack.size(); i++) {
				sum += stack.get(i);
			}
		}
		
		System.out.println(sum);
	}

}
