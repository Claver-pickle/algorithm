package practice.recursiveFunc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class star10 {

	static char[][] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int num = Integer.parseInt(br.readLine());
		
		arr = new char[num][num];
		
		star(0,0,num,false);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< num; i++) {
			for(int j=0; j<num; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
	}

	
	static void star(int x, int y, int N, boolean blank) {
		
		//°ø¹éÀÏ¶§
		if(blank) {
			for(int i= x; i<x+N; i++) {
				for(int j= y; j< y+N; j++) {
					arr[i][j] = ' ';
				}
			}
			
			return;
		}
		
		//´õÀÌ»ó ¸øÂÉ°·
		if(N==1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = N/3;
		int count = 0;
		for(int i=x; i<x+N; i+= size) {
			for(int j=y; j<y+N; j+=size) {
				count++;
				if(count == 5) { //°ø¹é Ä­ÀÏ °æ¿ì
					star(i,j,size,true);
				}else {
					star(i,j,size,false);
				}
			}
		}
	}
}
