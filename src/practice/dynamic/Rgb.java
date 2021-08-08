package practice.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rgb {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		int pay[][] = new int[size][3];
		int sum = 0;
		int minPay = 0;
		//담기작업
		for(int i=0; i<size; i++) {
			String a = br.readLine();
			StringTokenizer st = new StringTokenizer(a);
			
			for(int j=0; j<3; j++) {
				pay[i][j] = Integer.parseInt(st.nextToken());
			}			
		}
		
		int min = Math.min(pay[0][0], pay[0][1]);
		min = Math.min(pay[0][2], min);
		System.out.println("min : "+ min);
		minPay += min;
		for(int i=0; i<size-1; i++) {
			if(i == 0) {
				if(min == pay[0][0]) {
					sum = Math.min(pay[i+1][1], pay[i+1][2]);
					System.out.println("R : "+sum);
					minPay += sum;
				}else if(min == pay[0][1]) {
					sum = Math.min(pay[i+1][0], pay[i+1][2]);
					System.out.println("G : "+sum);
					minPay += sum;
				}else if(min == pay[0][2]) {
					sum = Math.min(pay[i+1][0], pay[i+1][1]);
					System.out.println("B : "+sum);
					minPay += sum;
				}
			}else if(i+1 == size){
				if(sum == pay[i][0]) {
					sum = Math.min(pay[i][1], pay[i][2]);
					System.out.println("R : "+sum);
					minPay += sum;
				}else if(sum == pay[i][1]) {
					sum = Math.min(pay[i][0], pay[i][2]);
					System.out.println("G : "+sum);
					minPay += sum;
				}else if(sum == pay[i][2]) {
					sum = Math.min(pay[i][0], pay[i][1]);
					System.out.println("B : "+sum);
					minPay += sum;
				}
			}else {
				if(sum == pay[i][0]) {
					sum = Math.min(pay[i+1][1], pay[i+1][2]);
					System.out.println("R : "+sum);
					minPay += sum;
				}else if(sum == pay[i][1]) {
					sum = Math.min(pay[i+1][0], pay[i+1][2]);
					System.out.println("G : "+sum);
					minPay += sum;
				}else if(sum == pay[i][2]) {
					sum = Math.min(pay[i+1][0], pay[i+1][1]);
					System.out.println("B : "+sum);
					minPay += sum;
				}
			}
			
		}
		
		System.out.println(minPay);
		
	}

}
