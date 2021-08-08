package practice;

import java.util.Scanner;

public class reverse {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int length = input.length();
		char[] reverse = new char[length];
		
		for(int i=0; i<length; i++) {
			reverse[i] = input.charAt(i);
		}
		
		for(int i= length-1; i>=0; i--) {
			System.out.print(reverse[i]);
		}
	}

}
