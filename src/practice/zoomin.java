package practice;

import java.util.Scanner;

public class zoomin {

	public static void main(String[] args) {

		String num = null;
		int check[] = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		int total = 0;
		
		Scanner scan = new Scanner(System.in);
		num = scan.next();
		
		if(num.length()!= 14) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return;
		}else {
			System.out.println("�ֹε�Ϲ�ȣ �˻縦 �����մϴ�");
		}
		
		for(int i=0; i<check.length; i++) {
			if(i == 6) {
				continue;
			}
			total += check[i] * Integer.parseInt(num.substring(i,(i+1)));
		}
		
		int lastCheck = 0;
		if(total >0) {
			lastCheck = 11 - (total%11);
		}
		
		if(lastCheck == Integer.parseInt(num.substring(13))) {
			System.out.println("�������� ��й�ȣ�Դϴ�");
		}else {
			System.out.println("�߸��� ��й�ȣ�Դϴ�.");
		}
	}

}
