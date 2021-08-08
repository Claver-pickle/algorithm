package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class triangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int sum=Integer.parseInt(br.readLine()); //첫번째 수가 담긴 합계
		
		for(int i=2; i<size+1; i++) {
			int []list = new int[i];
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			
			for(int j=0; j<st.countTokens(); j++) {
				list[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(list);
			sum+= list[i-1];
		}
		
		System.out.println(sum);

	}

}
