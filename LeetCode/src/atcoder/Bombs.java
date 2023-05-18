package atcoder;

import java.util.Scanner;

public class Bombs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		String[][] a = new String[r][c];

		for (int i = 0; i < r; i++) {
			String b = sc.next();
			a[i] = b.split("");
		}

		//上の２つのループで全探索。ボムを見つけたら
		//		下の２重ループへ移動
		//		最初から全探索でボムの場所とのマンハッタン距離を判定
		//		判定内で壁なら壁を消す
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				
				if (!a[i][j].equals("#") && !a[i][j].equals(".")) {
					int bomb = Integer.parseInt(a[i][j]) ;
					a[i][j] = ".";
					for (int k = 0; k < r; k++) {
						for (int l = 0; l < c; l++) {
							int distance = Math.abs(i - k) + Math.abs(j - l);
							if (distance <= bomb && a[k][l].equals("#")) {
								a[k][l] = ".";

							}
						}
					}
				}
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j]);
			}
			if(i != r-1) {
				System.out.println();
			}
			
		}

	}

}
