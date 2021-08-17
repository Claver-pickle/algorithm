package practice.arrangement;

import java.util.ArrayList;
import java.util.Collections;

public class TheMaximumNum {

	public static void main(String[] args) {
		
		int[] numbers = {6,10,2};
		String answer = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int i=0; i<numbers.length; i++) {
			StringBuilder sb = new StringBuilder();
			while(sb.length() < 4) {
				sb.append(String.valueOf(numbers[i]));
			}
			System.out.println(sb);
			list.add(Integer.parseInt(sb.toString()));
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		for(int i=0; i<list.size(); i++) {
			
		}
		System.out.println(list);
	}

}
