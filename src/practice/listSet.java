package practice;

import java.util.ArrayList;
import java.util.HashSet;

public class listSet {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();
				
		for(int i=0; i<2; i++) {
			list.add("������");
			set.add("������");
		}
		
		System.out.println("list : "+ list);
		System.out.println("set : "+ set);
		
	}

}
