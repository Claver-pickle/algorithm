package practice.programmers.stackQue;

import java.util.LinkedList;

public class FuncDevelop {

	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		LinkedList<Integer> answer = new LinkedList<Integer>();
		
		int[] dp = new int[speeds.length];
		int count = 0;
		
		for(int i=0; i<progresses.length; i++) {
			while(progresses[i] >= 100) {
				progresses[i] += speeds[i];
				count++;
			}
			dp[i] = count;
			count = 0;
		}
		
		for(int i = 0; i<dp.length; i++) {
			
		}
		
	}

}
