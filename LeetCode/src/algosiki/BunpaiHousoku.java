package algosiki;

import java.util.Scanner;

public class BunpaiHousoku {

	// アルゴ式。ループ文を減らす。Q4積の総和。
	// N個の数値から２つを選び積を出す（全組み合わせ分）
	// 積の結果全てを足す。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long answer = 0;
		long allAdd = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			allAdd += arr[i];// 全ての数値を足しておく
		}
		
		
		for(int i = 0; i < n; i++) {
			// arr[i]*(arr[0] + arr[1] arr[2]...arr[n-1])の分配法則
			answer += arr[i] * (allAdd);
		}
		System.out.println(answer);
	}

}
