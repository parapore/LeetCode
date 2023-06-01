package atcoder;

import java.util.Scanner;

public class CubicCake {

	public static void main(String[] args) {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			long aa = sc.nextLong();
			long bb = sc.nextLong();
			long cc = sc.nextLong();
			long a = aa;
			long b = bb;
			long c = cc;

			//ユークリッドの互除法1(引き算バージョン）
//			while (a != b) {
	//
//				
//				if (a >= b) {
//					a = a - b;
//				} else {
//					b = b - a;
//				}
//			}
//			long ans1 = a;
	//
//			while (c != ans1) {
	//
//				//ユークリッドの互除法
//				if (c >= ans1) {
//					c = c - ans1;
//				} else {
//					ans1 = ans1 - c;
//				}
//			}
	//
//			long ans2 = Math.max(ans1, c);
	//
//			long ans3 = (aa / ans2 - 1) + (bb / ans2 - 1) + (cc / ans2 - 1);
//			System.out.println(ans3);

		
			
			
			//ユークリッドの互除法2
			while (Math.min(a, b) > 0) {

				
				if (a >= b) {
					a = a % b;
				} else {
					b = b % a;
				}
			}
			long ans1 = Math.max(a, b);

			while (Math.min(c, ans1) > 0) {

				//ユークリッドの互除法
				if (c >= ans1) {
					c = c % ans1;
				} else {
					ans1 = ans1 % c;
				}
			}

			long ans2 = Math.max(ans1, c);

			long ans3 = (aa / ans2 - 1) + (bb / ans2 - 1) + (cc / ans2 - 1);
			System.out.println(ans3);

		}
	}
