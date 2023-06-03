package atcoder;

import java.util.Scanner;

public class SelectOne {
	private static int n;
	private static long k;
	private static long[] a;
	private static long[] b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextLong();
		a = new long[n];
		b = new long[n];
		long sanototal = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		for (int i = 0; i < n; i++) {
			b[i] = sc.nextLong();
		}

		//模範解答。差の合計と回数Kの偶奇が一致していればYes
		for (int i = 0; i < n; i++) {
			sanototal += Math.abs(a[i] - b[i]);
		}

		if (sanototal > k) {
			System.out.println("No");
			return;
		}

		//差合計が偶数なら偶数回数で変更可能
		//差合計が奇数なら奇数回数で変更可能
		if (k % 2 == sanototal % 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		//自分の解答
		//		for (int i = 0; i < n; i++) {
		//			a[i] = sc.nextLong();
		//		}
		//
		//		for (int i = 0; i < n; i++) {
		//			b[i] = sc.nextLong();
		//		}
		//
		//		//同じ数値なら次を探索
		//		//一致しないなら一致するまで足し引き
		//		int j = 0;
		//		for (int i = 0; i < n; i++) {
		//			if (a[i] == b[i]) {
		//				continue;
		//			}
		//
		//			while (j < k && a[i] != b[i]) {
		//				if (a[i] > b[i]) {
		//					a[i]--;
		//					j++;
		//				}
		//
		//				if (a[i] < b[i]) {
		//					a[i]++;
		//					j++;
		//				}
		//
		//			}
		//			if (a[i] != b[i]) {
		//				System.out.println("No");
		//				return;
		//			}
		//		}
		//		if (k - j == 0 || (k - j) % 2 == 0) {
		//			System.out.println("Yes");
		//		} else {
		//			System.out.println("No");
		//		}

	}
}
