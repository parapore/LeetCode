package atcoder;

import java.util.Scanner;

public class SameMapintheRPGWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] sarr = new String[H*2];
		char[][] arr1 = new char[H][W];
		char[][] arr2 = new char[H][W];
		
		for(int i = 0; i < H*2; i++) {
			sarr[i] = sc.next();
		}
		
		for(int i = 0; i < H; i++) {
			 arr1[i] = sarr[i].toCharArray();
		}
		
		for(int i = 0; i < H; i++) {
			arr2[i] = sarr[i+H].toCharArray();
		}
		
		//シフト移動全探索
		for(int s = 0; s < H; s++) { //高さシフト数
			for(int t = 0; t < W; t++) { //横シフト数　
				boolean b = true;
				// 2次元配列全探索
				for(int i=0; i<H; i++) { //2次元配列の高さシフト前座標
					for(int j=0; j<W; j++){//2次元配列の横シフト前座標
						// シフト移動後のarr1とarr2が全一致するか判定
						// arr1[(i +s) % H] は (i(元座標) + s(シフト移動数)) % H（高さ）で
						// シフト移動ではみ出る（高さオーバー座標に)なった時用に、高さで割った余りをシフト移動後の座標にするため。
						// 例(高さ5・横幅３）：arr1[(4 +2) % 5][(0 + 2 % 3] =  arr1[1][2] になる
						if(arr1[(i +s) % H][(j +t) % W] != arr2[i][j]) {
							b = false;
							break;
						}
					}
				}
				if(b) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}

}
