package practice.queDeck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Card2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		int num = 0;
		
		Deque<Integer> deque = new LinkedList<Integer>();
		
		for(int i=0; i<cnt; i++) {
			deque.add(i+1);
		}

		if(deque.size() == 1) {
			num = 1;
		}else {
			deque.poll();
			while(deque.size() > 1) {
				if(num == deque.peekLast()) {
					num = deque.poll();
				}else {
					num = deque.poll();
					deque.addLast(num);
				}
			}
			num = deque.peek();
		}

		System.out.println(num);
	}

}
