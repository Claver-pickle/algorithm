package practice;

import java.util.HashMap;
import java.util.Map;

public class Maraton {

	public static void main(String[] args) {

		String[] participant =  {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};		
		String answer = "";
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		for(int i=0; i<participant.length; i++) {
			map.put(i, participant[i]);
		}
		for(int i=0; i<completion.length; i++) {
			map2.put(i, completion[i]);
		}
		
		
		System.out.println(answer);
		
	}

}
