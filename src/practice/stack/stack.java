package practice.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stack {

	static int[] stack;
	static int size;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		stack = new int[N];
		size = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			String a = br.readLine();
			
			if(a.contains("push")) {
				StringTokenizer st = new StringTokenizer(a);
				st.nextToken();
				push(Integer.parseInt(st.nextToken()));
			}else if(a.contains("pop")) {
				sb.append(pop()).append('\n');
			}else if(a.contains("size")) {
				sb.append(size()).append('\n');
			}else if(a.contains("empty")) {
				sb.append(empty()).append('\n');
			}else if(a.contains("top")) {
				sb.append(top()).append('\n');
			}
		}
		
		System.out.println(sb);
	}

	
	static void push(int num) {
		stack[size] = num;
		size++;
	}
	
	static int pop() {
		if(empty() == 1) {
			return -1;
		}else {
			int res = stack[size-1];
			stack[size-1] = 0;
			size--;
			return res;
		}
	}
	
	static int size() {
		return size;
	}
	
	static int empty() {
		if(size == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	static int top() {
		if(size == 1) {
			return -1;
		}else {
			return stack[size-1];
		}
	}
}
