package algosiki;

import java.io.IOException;
import java.util.Scanner;

//3章ビット演算の最後の問題
public class SwitchQuery2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int q = sc.nextInt();
		
		for (int j = 0; j < q; j++) {
			int x = sc.nextInt();
			
			//ON
			if(x == 0) {
				int num = 1 << sc.nextInt();
				s = s | num;
			
			// OFF
			}else if(x == 1) {
				int num = sc.nextInt();
				int num2 = 1 << num;//まずnum番目のスイッチのみONのものを作る
				int num3 = ~num2;//次にnum2にNOT演算子を用いてnum番目のOFFで他ONに変換する
				int num4 = num & num3;//最後にnumとnum3の論理積（AND)でnum番目だけOFFにする
				s = num4; // s & ~(1 << num)で1回で処理できる

			//num番目のスイッチON　OFF　を調べる
			} else {
				int num = 1 << sc.nextInt();
				if((s & num) == 0) {
					System.out.println("off");
				}else {
					System.out.println("on");
				}
			}
			
		}

	}
}