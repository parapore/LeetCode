package atcoder;

import java.util.Scanner;

public class Otoshidama {

	//10000円札と5000円札1000円札を使って　N枚でY円になる組合せを１つみつける
	//10000円札と5000円札の枚数がわかれば1000円札の枚数は決まるのがポイント
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		int a10000 = 0;
		int a5000 = 0;
		int a1000 = 0;
		
		int count = 0;
		for(int i = 0; i <= n; i++) {
			if(count > 0) {
				break;
			}
			for(int j = 0; j <= n; j++) {
				
				// 10000円札＋5000円札でY円を超えていたら
				if(i*10000 + j*5000 > y) {
					continue;
				}
				
				// 10000円札の枚数 + 5000円札の枚数がN枚を超えていたら
				if(i + j > n) {
					continue;
				}
				
				if(i*10000 + j*5000 + (n-i-j)*1000 == y) {
					System.out.println(i + " " + j + " " + (n-i-j));
					count++;
					break;
				}
			}
		}
		if(count == 0) {
			System.out.println(-1 + " " + -1 + " " + -1);
		}
	}
}
