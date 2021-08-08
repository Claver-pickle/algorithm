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
		StringTokenizer st = new StringTokenizer(a);
		
		Queue<Integer> que = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int cnt = Integer.parseInt(st.nextToken());
		int killFirst = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<cnt; i++) {
			que.add(i+1);
		}
		
		while(que.size()>1) {
			for(int j=0; j<killFirst-1; j++) {
				que.poll();
				que.offer(que.poll());
				if(que.size()>=2) {
					sb.append(que.poll()).append(",");
				}
			}

		}
		sb.append(que.peek()).append(">");
		System.out.println(sb);
	}

}
