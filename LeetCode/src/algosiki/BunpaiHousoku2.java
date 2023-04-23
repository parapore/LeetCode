package algosiki;

import java.util.Scanner;

public class BunpaiHousoku2 {

	// アルゴ式。ループ文を減らす。Q5.積の総和2。
	// N個の数値から２つを選び積を出す（全組み合わせ分。重複なしなので組合せ）
	// 積の結果全てを足す。
	// 組合せ　＆　分配法則　バージョン。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long[] addArr = new long[n];
		long answer = 0;
		long addAll = 0;
		
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			addAll += arr[i];//全てを足しておく
		}
		
		/** 以下２つのfor文で
		 * 2(3+4+5) = 24
		 * 3(4+5)   = 27
		 * 4(5)     = 20
		 * ということをする
		 *  **/
		for(int i = 0; i < n; i++) {
			addAll -= arr[i];// 全合計から１要素ずつ引いていく
			addArr[i] = addAll;
		}
		
		
		for(int i = 0; i < n; i++) {
			// arr[i]*(arr[0] + arr[1] arr[2]...arr[n-1])の分配法則
			answer += arr[i] * addArr[i];
		}
		
		System.out.println(answer);
	}

}
