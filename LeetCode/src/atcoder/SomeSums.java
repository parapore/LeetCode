package atcoder;

import java.util.Scanner;

public class SomeSums {

	// 各桁の値を足す問題
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			//各桁の取得
			int n1 = i % 10;
			int n10 = i / 10 % 10;
			int n100 = i / 100 % 10;
			int n1000 = i / 1000 % 10;
			int n10000 = i / 10000 % 10;
			
			int add = n1 + n10 + n100 + n1000 + n10000;
			if(a <= add && add <= b) {
				answer += i;
			}
		}
		System.out.println(answer);
	}

}
