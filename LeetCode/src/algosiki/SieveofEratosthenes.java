package algosiki;

import java.util.Scanner;

public class SieveofEratosthenes {

	// エラトステネスのふるい
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] arr = new boolean[n+1];
		
		// 小さい順に合成数（倍数)を削除していく
		for (int i = 2; i < arr.length; i++) {
			if(arr[i] == true) {
				continue;
			}
			for(int j = 2; j * i <= n; j++) {
				arr[j * i] = true;
			}
		}
		int count = -2;
		for(boolean b : arr) {
			if(!b) count++;
		}
		System.out.println(count);
	}

}
