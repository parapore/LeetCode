package atcoder;

import java.util.Scanner;

public class Select5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long p = sc.nextLong();
		long q = sc.nextLong();

		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		//5重for文
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					for (int l = k + 1; l < n; l++) {
						for (int m = l + 1; m < n; m++) {
							// オーバーフロー対策
							long ans = a[i] % p * a[j] % p * a[k] % p * a[l] % p * a[m] % p;

							if (ans == q) {
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}