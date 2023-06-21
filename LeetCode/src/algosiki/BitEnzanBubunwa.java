package algosiki;

import java.io.IOException;
import java.util.Scanner;

//Q2. 部分和問題
public class BitEnzanBubunwa {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		/* N個の数字配列の中から、１つ以上選ぶ組合せを全探索したい。
		 * 全探索のパターン数は下記。
		 * 例：N=3 (1 << 3) = 8; ３個の数字の選択パターンは全部で８通り。
		 * 
		 * 問題に合わせて読み替えると
		 * N個の整数が与えられたので、全探索するには何通り調べればよいか知りたい。
		 * (1 << N)がパターン数。
		 * 
		 * 次に（1 << N)パターンで全探索する方法を考える。
		 * ３つの数字を選択するパターンは下記の通り。１が選択。０が選択しない。
		 * 
		 * {2, 1, 0}←選択される数字の集合
		 *  0  0  0 
		 *  0  0  1
		 *  0  1  0
		 *  0  1  1
		 *  1  0  0
		 *  1  0  1
		 *  1  1  0
		 *  1  1  1
		 *  
		 *  この８通り。これをビット演算で実現したい。
		 *  これは下記のAND演算で実現する。
		 *  index & (1 << 配列の添字番号) != 0
		 *  
		 *  例
		 *  index=1 & (1 << 配列の添字番号＝0) != 0が成立するので、配列(0)を選択
		 *  index=1 & (1 << 配列の添字番号＝1) != 0が成立しないので、配列（１）は選択しない
		 *  index=1 & (1 << 配列の添字番号＝2) != 0が成立しないので、配列（２）は選択しない
		 *  index=1 & (1 << 配列の添字番号＝3) != 0が成立しないので、配列（３）は選択しない
		 *  ・
		 *  index=2 & (1 << 配列の添字番号＝0) != 0が成立しないので、配列（0）は選択しない
		 *  index=2 & (1 << 配列の添字番号＝1) != 0が成立するので、配列（1）は選択
		 *  index=2 & (1 << 配列の添字番号＝2) != 0が成立しないので、配列（2）は選択しない
		 *  index=2 & (1 << 配列の添字番号＝3) != 0が成立しないので、配列（3）は選択しない
		 *  ・
		 *  ・
		 *  index=32 & (1 << 配列の添字番号＝0) != 0が成立するので、配列(0)を選択
		 *  index=32 & (1 << 配列の添字番号＝1) != 0が成立するので、配列(1)を選択 
		 *  index=32 & (1 << 配列の添字番号＝2) != 0が成立するので、配列(2)を選択 
		 *  index=32 & (1 << 配列の添字番号＝3) != 0が成立するので、配列(3)を選択 
		 *  こんな感じで全探索する。
		 *  
		 *  簡単に言うと、８通り全探索したいなら
		 *  0～8を順番に2進数に変換して、１になったとこだけ選択する。
		 *  
		 *  下記コードに読み替えると
		 *  for文1重目の　S = index
		 *  for文2重目の　i = 配列の添字番号
		 */


		for (int S = 0; S < (1 << n); S++) {
			int total = 0;
			
			for (int i = 0; i < n; i++) {
				if((S & (1 << i)) != 0) {// index & (1 << 配列の添字番号) != 0が成立するなら配列(n)を選択
					total += a[i];
				}
			}

			if(total == v) {
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");


	}
}