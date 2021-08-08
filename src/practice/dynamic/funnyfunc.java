package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class funnyfunc {

	static int a;
	static int b;
	static int c;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		
		System.out.println(w(a,b,c));
	}

	public static int w(int a, int b, int c) {
		
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		} 
		if (a>20 || b> 20 || c>20) {
			return w(20,20,20);
		}
		
		if(a<b && b<c) {
			return w(a,b,c-1) + w(a,b-1,c-1)-w(a,b-1,c);
		}
			
		return w(a-1,b,c)+w(a-1,b-1,c)+w(a-1,b,c-1)-w(a-1,b-1,c-1);
		
		
	}
	
	
	
}
