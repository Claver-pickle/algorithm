package practice.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<size; i++) {
			String a = br.readLine();
			stack.add(a);
		}
		
		for(int i=0; i<size; i++) {
			String b = stack.get(i);
			int c = 0;
			int d = 0;
			for(int j=0; j<b.length(); j++) {
				if(b.charAt(j) == '(') {
					c++;
				}else {
					d++;
				}
			}
			if(c == d) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
	}

	

}
