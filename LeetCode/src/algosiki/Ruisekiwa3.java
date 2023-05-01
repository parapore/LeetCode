package algosiki;

import java.util.Scanner;

public class Ruisekiwa3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] kyori = new int[n];
		int add = 0;
		kyori[0] = 0;
		
		for(int i = 1; i < n; i++) {
			add += sc.nextInt();
			kyori[i] = add;
		}
		
		int q = sc.nextInt();
		
		for(int i = 0; i < q; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			//答えは累積距離-start
			int answer = kyori[end] - kyori[start];
			System.out.println(answer);
		}

	}

}
