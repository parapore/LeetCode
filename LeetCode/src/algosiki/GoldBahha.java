package algosiki;

import java.util.Scanner;

public class GoldBahha {

	//ゴールドバッハ予想２
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] arr = new boolean[n+1];

		for(int i = 2; i < n; i++) {
			if(arr[i]) {
				continue;
			}
			for(int j = 2; j*i <= n; j++) {
				arr[j*i] = true;
			}
		}
		
		//素数の中から素数組を探す
		int count = 0;
		for(int p = 2; p <= arr.length/2; p++ ) {
			int q = n - p;
			if(arr[q] == false && arr[p] == false) {
				count++;
			}
		}
		System.out.println(count);
	}
}