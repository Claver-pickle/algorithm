package practice.arrangement;

import java.util.Arrays;

public class NumWithK {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		
		int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		int i = 0;
		int j = 0;
		int k = 0;
		
		int[] answer = new int[commands.length];
		
		for(int num=0; num<commands.length; num++) {
			i = commands[num][0];
			j = commands[num][1];
			k = commands[num][2];
			
			
			if(j > array.length) {
				j = j-1;
			}
			int[] copy = array.clone();
			 
			if( i-1 < 0 ) {
				copy = Arrays.copyOfRange(array, i, j);
			}else {
				copy = Arrays.copyOfRange(array, i-1, j);
			}
			Arrays.sort(copy);
			answer[num] = copy[k-1];
		}
		
	}

}
