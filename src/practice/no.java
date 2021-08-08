package practice;

public class no {

	public static void main(String[] args) {
System.out.println("시작");
		int total = 0;
		
		for(int i=1;i<=5;i++){
			System.out.println("시작2");
			for(int j=1;j<=i;j++){
				total++;	// 1 + 1+2 + 1+2+3 + 1+2+3+4 + 1+2+3+4+5
				System.out.println("total += "+ total);
			}
		}
		
		System.out.println("total : "+total);

	}

}
