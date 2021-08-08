package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Padoban {

	static Long[] seq = new Long[101];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		seq[0] = 0L;
		seq[1] = 1L;
		seq[2] = 1L;
		seq[3] = 1L;
		
		int num = Integer.parseInt(br.readLine());
		
		while(num -->0) {
			sb.append(padoban(Integer.parseInt(br.readLine()))).append('\n');
		}
		System.out.println(sb);
	}
	
	public static long padoban(int n) {
		
		if(seq[n] == null) {
			seq[n] = padoban(n-2)+padoban(n-3);
		}
		
		return seq[n];
	}

}

//¹Ýº¹¹®ver