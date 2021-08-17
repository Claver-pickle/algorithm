package practice.queDeck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus0 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a," ");
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=N; i++) {
			que.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		
		while(que.size()>1) {
			
			for(int i =0; i<K-1; i++) {
				que.offer(que.poll());
			}
			
			sb.append(que.poll()).append(',').append(" ");
		}
		
		sb.append(que.poll()).append('>');
		System.out.println(sb);
	}

}
